/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fidentis.gui.comparison_two_faces;

import cz.fidentis.comparison.hausdorffDistance.HausdorffDistance;
import cz.fidentis.controller.Viewer;
import cz.fidentis.gui.Canvas;
import cz.fidentis.gui.ConfigurationTopComponent;
import cz.fidentis.gui.GUIController;
import cz.fidentis.gui.ProjectTopComponent;
import cz.fidentis.gui.actions.ButtonHelper;
import cz.fidentis.model.Model;
import cz.fidentis.model.ModelLoader;
import cz.fidentis.processing.comparison.surfaceComparison.SurfaceComparisonProcessing;
import cz.fidentis.renderer.ComparisonGLEventListener;
import cz.fidentis.renderer.GeneralGLEventListener;
import cz.fidentis.visualisation.surfaceComparison.HDpaintingInfo;
import cz.fidentis.visualisation.surfaceComparison.VisualizationType;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.awt.StatusDisplayer;
import org.openide.util.Exceptions;

/**
 *
 * @author Katka
 */
public class ViewerPanel_2Faces extends javax.swing.JPanel {

    private ProjectTopComponent projectComponent;

    private float mouseDraggedX, mouseDraggedY;
    private ComparisonGLEventListener listener2;
    private ComparisonGLEventListener listener1;
    private boolean manipulatePoint;
    private int nextIndexOfSelectedPoint;
    private int indexOfSelectedPoint;
    private boolean showInfo = true;
    private boolean editablePoints = false;
    private boolean selection = false;

    /**
     * Creates new form ViewerPanel
     */
    public ViewerPanel_2Faces(ProjectTopComponent tc) {
        projectComponent = tc;
        initComponents();
        listener2 = new ComparisonGLEventListener();
        listener1 = new ComparisonGLEventListener();
        canvas2.addGLEventListener(listener2);
        canvas1.addGLEventListener(listener1);
        listener1.setCameraPosition(0, 0, 300);
        listener2.setCameraPosition(0, 0, 300);

        canvas1.setImportLabelVisible(true);
        canvas2.setImportLabelVisible(true);

    }

    public void setSelection(boolean selection) {
        this.selection = selection;
    }

    public ComparisonGLEventListener getListener2() {
        return listener2;
    }

    public ComparisonGLEventListener getListener1() {
        return listener1;
    }

    public void setModel1(Model model) {
        listener1.setModels(model);
    }

    public void setModel2(Model model) {
        listener2.setModels(model);
    }

    public void addModel2(Model model) {
        listener2.addModel(model);
    }
    /*
     public void setViewerData(Viewer viewerData) {
     listener1.setModels(viewerData.getModel1());
     listener2.setModels(viewerData.getModel2());

     }*/

    public void setResultButtonVisible(boolean b) {
        canvas2.setResultButtonVisible(b);
    }

    public Canvas getCanvas1() {
        return canvas1;
    }

    public Canvas getCanvas2() {
        return canvas2;
    }

    public void resizeCanvas() {
        canvas2.resizeCanvas(jSplitPane1.getLeftComponent().getSize());
        canvas1.resizeCanvas(jSplitPane1.getLeftComponent().getSize());
    }

    public void setTextureRendering(Boolean b) {
        listener1.setDrawTextures(b);
        listener1.reloadTextures();
        listener2.setDrawTextures(b);
        listener2.reloadTextures();
    }

    public void showInfo(boolean show) {
        showInfo = show;
        canvas1.setFeaturePointsPanelVisibility(showInfo && (listener1.getIndexOfSelectedPoint() != -1));
        canvas2.setFeaturePointsPanelVisibility(showInfo && (listener2.getIndexOfSelectedPoint() != -1));
    }

    public void setEditablePoints(boolean b) {
        editablePoints = b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        canvas1 = new cz.fidentis.gui.Canvas(projectComponent, true);
        canvas2 = new cz.fidentis.gui.Canvas(projectComponent);

        jSplitPane1.setResizeWeight(0.5);

        canvas1.setMinimumSize(new java.awt.Dimension(300, 0));
        canvas1.setPreferredSize(new java.awt.Dimension(300, 0));
        canvas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvas1MouseDragged(evt);
            }
        });
        canvas1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                canvas1MouseWheelMoved(evt);
            }
        });
        canvas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvas1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                canvas1MouseReleased(evt);
            }
        });
        jSplitPane1.setLeftComponent(canvas1);

        canvas2.setMinimumSize(new java.awt.Dimension(300, 0));
        canvas2.setPreferredSize(new java.awt.Dimension(300, 0));
        canvas2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvas2MouseDragged(evt);
            }
        });
        canvas2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                canvas2MouseWheelMoved(evt);
            }
        });
        canvas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvas2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                canvas2MouseReleased(evt);
            }
        });
        jSplitPane1.setRightComponent(canvas2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void canvas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MousePressed
        mouseDraggedX = evt.getX();
        mouseDraggedY = evt.getY();

        manipulatePoint = listener1.selectPoint(evt.getX(), evt.getY());
        if (manipulatePoint) {
            nextIndexOfSelectedPoint = listener1.getIndexOfSelectedPoint();
            if (indexOfSelectedPoint != nextIndexOfSelectedPoint) {
                indexOfSelectedPoint = nextIndexOfSelectedPoint;
            }
            canvas1.setInfo(listener1.getFacialPoint(indexOfSelectedPoint));
            if (showInfo) {
                canvas1.setFeaturePointsPanelVisibility(true);

            }
        } else if (listener1.getModel() != null && listener1.checkPointInMesh(evt.getX(), evt.getY()) == null) {
            listener1.setIndexOfSelectedPoint(indexOfSelectedPoint = -1);
            if (showInfo) {
                canvas1.setFeaturePointsPanelVisibility(false);
            }
        }


    }//GEN-LAST:event_canvas1MousePressed

    private void canvas2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas2MousePressed
        mouseDraggedX = evt.getX();
        mouseDraggedY = evt.getY();
        
        
        manipulatePoint = listener2.selectPoint(evt.getX(), evt.getY());
        if (manipulatePoint) {
            nextIndexOfSelectedPoint = listener2.getIndexOfSelectedPoint();
            if (indexOfSelectedPoint != nextIndexOfSelectedPoint) {
                indexOfSelectedPoint = nextIndexOfSelectedPoint;
            }
            canvas2.setInfo(listener2.getFacialPoint(indexOfSelectedPoint));
            if (showInfo) {
                canvas2.setFeaturePointsPanelVisibility(true);

            }
        } else if (listener2.getModel() != null && listener2.checkPointInMesh(evt.getX(), evt.getY()) == null && !selection) {
            listener2.setIndexOfSelectedPoint(indexOfSelectedPoint = -1);
            if (showInfo) {
                canvas2.setFeaturePointsPanelVisibility(false);
            }
        } else if (selection && SwingUtilities.isLeftMouseButton(evt)) {
            clearSelection();
            listener2.setSelectionStart(evt.getPoint());
        }
        

    }//GEN-LAST:event_canvas2MousePressed

    private void canvas1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseDragged
      
        if (manipulatePoint && editablePoints) {
            if (listener1.editSelectedPoint(listener1.checkPointInMesh(evt.getX(), evt.getY()))) {
                canvas1.setCoordInfo(listener1.getFacialPoint(indexOfSelectedPoint));
            }
        } else if (SwingUtilities.isLeftMouseButton(evt)) {
            float x = evt.getX();
            float y = evt.getY();
            Dimension size = evt.getComponent().getSize();
            float thetaY = 360.0f * ((x - mouseDraggedX) / (float) size.width);
            float thetaX = 360.0f * ((mouseDraggedY - y) / (float) size.height);

            listener1.rotate(-thetaX, -thetaY);

            mouseDraggedX = x;
            mouseDraggedY = y;
        } else if (SwingUtilities.isRightMouseButton(evt)) {
            float x = evt.getX();
            float y = evt.getY();
            Dimension size = evt.getComponent().getSize();
            float thetaX = 360.0f * ((x - mouseDraggedX) / (float) size.width);
            float thetaY = 360.0f * ((mouseDraggedY - y) / (float) size.height);

            listener1.move(thetaX, -thetaY);

            mouseDraggedX = x;
            mouseDraggedY = y;
        }


    }//GEN-LAST:event_canvas1MouseDragged

    private void canvas2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas2MouseDragged
        if (manipulatePoint && editablePoints) {
            if (listener2.editSelectedPoint(listener2.checkPointInMesh(evt.getX(), evt.getY()))) {
                canvas2.setCoordInfo(listener2.getFacialPoint(indexOfSelectedPoint));
            }
        } else if (SwingUtilities.isLeftMouseButton(evt)) {
            if (selection) {
                listener2.setSelectionEnd(evt.getPoint(), canvas2.getWidth(), canvas2.getHeight());
            } else {
                float x = evt.getX();
                float y = evt.getY();
                Dimension size = evt.getComponent().getSize();
                float thetaY = 360.0f * ((x - mouseDraggedX) / (float) size.width);
                float thetaX = 360.0f * ((mouseDraggedY - y) / (float) size.height);

                listener2.rotate(-thetaX, -thetaY);

                mouseDraggedX = x;
                mouseDraggedY = y;
            }
        } else if (SwingUtilities.isRightMouseButton(evt)) {

            float x = evt.getX();
            float y = evt.getY();
            Dimension size = evt.getComponent().getSize();
            float thetaX = 360.0f * ((x - mouseDraggedX) / (float) size.width);
            float thetaY = 360.0f * ((mouseDraggedY - y) / (float) size.height);

            listener2.move(thetaX, -thetaY);

            mouseDraggedX = x;
            mouseDraggedY = y;

        }


    }//GEN-LAST:event_canvas2MouseDragged

    private void canvas1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_canvas1MouseWheelMoved
        if (evt.getWheelRotation() > 0) {
            listener1.zoomIn(-5 * evt.getWheelRotation());
        } else {
            listener1.zoomOut(5 * evt.getWheelRotation());

        }
    }//GEN-LAST:event_canvas1MouseWheelMoved

    private void canvas2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_canvas2MouseWheelMoved
        if (evt.getWheelRotation() > 0) {
            listener2.zoomIn(-5 * evt.getWheelRotation());
        } else {
            listener2.zoomOut(5 * evt.getWheelRotation());

        }
    }//GEN-LAST:event_canvas2MouseWheelMoved

    private void canvas2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas2MouseReleased
        manipulatePoint = false;
        if (selection && SwingUtilities.isLeftMouseButton(evt)) {
            listener2.setSelectionEnd(evt.getPoint(), canvas2.getWidth(), canvas2.getHeight());
            listener2.setSelectionFinished(true);
            final ConfigurationTopComponent tc = GUIController.getConfigurationTopComponent();
            TimerTask tt = new TimerTask() {
                @Override
                public void run() {
                    tc.getPairComparisonResults().updateHistograms();
                    tc.getPairComparisonResults().getHistogram1().resetSlider();
                }
            };
            Timer t = new Timer();
            t.schedule(tt, 500);           
        }
    }//GEN-LAST:event_canvas2MouseReleased

    public void clearSelection(){
        listener2.clearSelection();
        GUIController.getConfigurationTopComponent().getPairComparisonResults().updateHistograms();
         GUIController.getConfigurationTopComponent().getPairComparisonResults().getHistogram1().resetSlider();
        
    }
    
    private void canvas1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseReleased
        manipulatePoint = false;

    }//GEN-LAST:event_canvas1MouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cz.fidentis.gui.Canvas canvas1;
    private cz.fidentis.gui.Canvas canvas2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
