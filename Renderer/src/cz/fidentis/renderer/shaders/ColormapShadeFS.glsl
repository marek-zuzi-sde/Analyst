#version 420 compatibility
uniform int colorScheme;
uniform float minDistance;
uniform float maxDistance;
uniform float maxThreshDistance;
layout(origin_upper_left) in vec4 gl_FragCoord;


// The per-pixel image containing the head pointers
layout (binding = 1, r32ui) uniform uimage2D head_pointer_image;
// Buffer containing linked lists of fragments
layout (binding = 2, rgba32ui) uniform uimageBuffer list_buffer;

// This is the maximum number of overlapping fragments allowed
#define MAX_FRAGMENTS 15

// Temporary array used for sorting fragments
uvec4 fragment_list[MAX_FRAGMENTS];
uint fragment_pointer[MAX_FRAGMENTS];

 vec3 chooseRainbowColor(float minv, float maxv, float value) {
        vec3 c1 = vec3(0, 0, 255);
        vec3 c2 = vec3(0, 255, 255);
        vec3 c3 = vec3(0, 255, 0);
        vec3 c4 = vec3(255, 255, 0);
        vec3 c5 = vec3(255,0, 0);
        float span = maxv - minv;
        float pos = (value - minv) / span;

              vec3 a;
        vec3 b;
        float param;
         if (pos < 1 / 4f) {
                a = c1;
                b = c2;
                param =  pos / (1 / 4f);
        } else if (pos < 2 / 4f) {
                a = c2;
                b = c3;
                param = (pos - (1 / 4f)) / (1 / 4f);
        } else if (pos < 3 / 4f) {
                a = c3;
                b = c4;
                param =  (pos - (2 / 4f)) / (1 / 4f);
        } else {
                a = c4;
                b = c5;
                param =  (pos - (3 / 4f)) / (1 / 4f);       
        }

        a = a/255f;
        b = b/255f;

        vec3 col = clamp(mix(a,b,param),0,1);

        return col;
    }

    vec3 chooseSequentialColor(float minv, float maxv, float value) {
        vec3 c1 = vec3(255,255,204);
        vec3 c2 = vec3(161,218,180);
        vec3 c3 = vec3(65,182,196);
        vec3 c4 = vec3(44,127,184);
        vec3 c5 = vec3(37,52,148);
        float span = maxv - minv;
        float pos = (value - minv) / span;

               vec3 a;
        vec3 b;
        float param;
         if (pos < 1 / 4f) {
                a = c1;
                b = c2;
                param =  pos / (1 / 4f);
        } else if (pos < 2 / 4f) {
                a = c2;
                b = c3;
                param = (pos - (1 / 4f)) / (1 / 4f);
        } else if (pos < 3 / 4f) {
                a = c3;
                b = c4;
                param =  (pos - (2 / 4f)) / (1 / 4f);
        } else {
                a = c4;
                b = c5;
                param =  (pos - (3 / 4f)) / (1 / 4f);       
        }

        a = a/255f;
        b = b/255f;

        vec3 col = clamp(mix(a,b,param),0,1);

        return col;
    }

    vec3 chooseDivergingColor(float minv, float maxv, float value) {
        vec3 c1 = vec3(44, 123, 182);
        vec3 c2 = vec3(171, 217, 233);
        vec3 c3 = vec3(255, 255, 191);
        vec3 c4 = vec3(253, 174, 97);
        vec3 c5 = vec3(215, 25, 28);
        float span = maxv - minv;
        float pos = (value - minv) / span;

        vec3 a;
        vec3 b;
        float param;
         if (pos < 1 / 4f) {
                a = c1;
                b = c2;
                param =  pos / (1 / 4f);
        } else if (pos < 2 / 4f) {
                a = c2;
                b = c3;
                param = (pos - (1 / 4f)) / (1 / 4f);
        } else if (pos < 3 / 4f) {
                a = c3;
                b = c4;
                param =  (pos - (2 / 4f)) / (1 / 4f);
        } else {
                a = c4;
                b = c5;
                param =  (pos - (3 / 4f)) / (1 / 4f);       
        }

        a = a/255f;
        b = b/255f;

        vec3 col = clamp(mix(a,b,param),0,1);

        return col;
 }



void main(void)
{

//*************************find closest fragment belonging to current position**************************************************  
   uvec4 frag;
   float z=2;

    uint current_index;
    uint fragment_count = 0;

    current_index = imageLoad(head_pointer_image, ivec2(gl_FragCoord).xy).x;


    while (current_index != 0 && fragment_count < 20)
    {
        uvec4 fragment = imageLoad(list_buffer, int(current_index));
        float depth = uintBitsToFloat(fragment.z);
        if(depth<z){
            z = depth;
            frag = fragment;
                       
        }
        current_index = fragment.x; 
        fragment_count++;
    }

    if(fragment_count==0){
        discard;
    }

//*************************shade fragment**************************************************

   vec4 shade = vec4((unpackUnorm4x8(frag.w)).xyz,1);
   vec4 color = shade;
   float currentDistance = uintBitsToFloat(frag.y);
    if((unpackUnorm4x8(frag.w)).w == 1 && (currentDistance<maxThreshDistance)){           
           if(colorScheme == 1){
                color = shade * vec4(chooseDivergingColor(minDistance,maxThreshDistance,currentDistance),1);
            }
            if(colorScheme == 0){
                color = shade * vec4(chooseSequentialColor(minDistance,maxThreshDistance,currentDistance),1);
            }
            if(colorScheme == 2){
                color = shade * vec4(chooseRainbowColor(minDistance,maxThreshDistance,currentDistance),1);
            }
    }else{
            color = shade/2;
    }
    gl_FragDepth =  uintBitsToFloat(frag.z);
    gl_FragColor = color ;
}



