/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fidentis.gui.comparison_one_to_many;

import cz.fidentis.comparison.ComparisonMethod;
import cz.fidentis.comparison.ICPmetric;
import cz.fidentis.comparison.RegistrationMethod;
import cz.fidentis.visualisation.surfaceComparison.HDpainting;
import cz.fidentis.comparison.icp.KdTree;
import cz.fidentis.comparison.icp.KdTreeFaces;
import cz.fidentis.comparison.icp.KdTreeIndexed;
import cz.fidentis.comparison.procrustes.Procrustes1ToMany;
import cz.fidentis.controller.OneToManyComparison;
import cz.fidentis.featurepoints.FacialPoint;
import cz.fidentis.featurepoints.curvature.CurvatureType;
import cz.fidentis.featurepoints.curvature.Curvature_jv;
import cz.fidentis.gui.GUIController;
import cz.fidentis.gui.ProjectTopComponent;
import cz.fidentis.model.Model;
import cz.fidentis.model.ModelLoader;
import cz.fidentis.processing.comparison.surfaceComparison.SurfaceComparisonProcessing;
import cz.fidentis.processing.exportProcessing.ResultExports;
import cz.fidentis.utils.SortUtils;
import cz.fidentis.visualisation.procrustes.PApainting;
import cz.fidentis.visualisation.procrustes.PApaintingInfo;
import cz.fidentis.visualisation.surfaceComparison.HDpaintingInfo;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.util.Exceptions;

/**
 *
 * @author Katka
 */
@SuppressWarnings("rawtypes")
public class OneToManyComparisonConfiguration extends javax.swing.JPanel {

    JPanel activeColorPanel;

    /**
     * Creates new form ComparisonConfiguration
     */
    public OneToManyComparisonConfiguration() {
        initComponents();
        activeColorPanel = new JPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jSlider3 = new javax.swing.JSlider();
        jLabel12 = new javax.swing.JLabel();
        processComparisonButton = new javax.swing.JButton();
        createAvgLabel = new javax.swing.JLabel();
        createAvgCheckBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton10 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(OneToManyComparisonConfiguration.class, "OneToManyComparisonConfiguration.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(OneToManyComparisonConfiguration.class, "OneToManyComparisonConfiguration.jLabel3.text")); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hausdorff Distance", "Procrustes Analysis" }));
        jComboBox1.setMinimumSize(new java.awt.Dimension(187, 20));
        jComboBox1.setPreferredSize(new java.awt.Dimension(187, 20));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel2.setVisible(false);

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox2, org.openide.util.NbBundle.getMessage(OneToManyComparisonConfiguration.class, "OneToManyComparisonConfiguration.jCheckBox2.text")); // NOI18N
        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(OneToManyComparisonConfiguration.class, "OneToManyComparisonConfiguration.jLabel8.text")); // NOI18N

        jSlider3.setMajorTickSpacing(20);
        jSlider3.setMinorTickSpacing(5);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setValue(30);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, org.openide.util.NbBundle.getMessage(OneToManyComparisonConfiguration.class, "OneToManyComparisonConfiguration.jLabel12.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Hashtable tresholdTable = new Hashtable();
        tresholdTable.put(new Integer(0), new JLabel("0"));
        tresholdTable.put(new Integer(20), new JLabel("0,2"));
        tresholdTable.put(new Integer(40), new JLabel("0,4"));
        tresholdTable.put(new Integer(60), new JLabel("0,6"));
        tresholdTable.put(new Integer(80), new JLabel("0,8"));
        tresholdTable.put(new Integer(100), new JLabel("1"));
        jSlider3.setLabelTable(tresholdTable);

        org.openide.awt.Mnemonics.setLocalizedText(processComparisonButton, org.openide.util.NbBundle.getMessage(OneToManyComparisonConfiguration.class, "OneToManyComparisonConfiguration.processComparisonButton.text")); // NOI18N
        processComparisonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processComparisonButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(createAvgLabel, org.openide.util.NbBundle.getMessage(OneToManyComparisonConfiguration.class, "OneToManyComparisonConfiguration.createAvgLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(createAvgCheckBox, org.openide.util.NbBundle.getMessage(OneToManyComparisonConfiguration.class, "OneToManyComparisonConfiguration.createAvgCheckBox.text")); // NOI18N
        createAvgCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                createAvgCheckBoxStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(processComparisonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(createAvgLabel)
                .addGap(18, 18, 18)
                .addComponent(createAvgCheckBox)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createAvgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAvgCheckBox))
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(processComparisonButton)
                .addContainerGap())
        );

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(OneToManyComparisonConfiguration.class, "OneToManyComparisonConfiguration.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton10, org.openide.util.NbBundle.getMessage(OneToManyComparisonConfiguration.class, "OneToManyComparisonConfiguration.jButton10.text")); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
        GUIController.getSelectedProjectTopComponent().getProject().getSelectedOneToManyComparison().setFpTreshold(jSlider3.getValue());
    }//GEN-LAST:event_jSlider3StateChanged

    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox2StateChanged
        GUIController.getSelectedProjectTopComponent().getProject().getSelectedOneToManyComparison().setFpScaling(jCheckBox2.isSelected());
    }//GEN-LAST:event_jCheckBox2StateChanged

    public void computeComparison(final ProjectTopComponent tc){
        Runnable run = new Runnable() {

            @Override
            public void run() {
                if (((ComparisonMethod) jComboBox1.getSelectedItem()) == ComparisonMethod.HAUSDORFF_DIST
                        || ((ComparisonMethod) jComboBox1.getSelectedItem()) == ComparisonMethod.HAUSDORFF_CURV) {
                    //Computing Hausdorff Distance

                    ProgressHandle p;

                    p = ProgressHandleFactory.createHandle("Computing comparison...");
                    p.start();

                    try {
                        SurfaceComparisonProcessing.setP(p);

                        List<Float> results;
                        List<ArrayList<Float>> numResults;
                        List<File> models = tc.getProject().getSelectedOneToManyComparison().getRegisteredModels();
                        List<File> origModels = tc.getProject().getSelectedOneToManyComparison().getModels();

                        if (models == null) {
                            models = tc.getProject().getSelectedOneToManyComparison().getModels();
                        }

                        Model mainF = tc.getOneToManyViewerPanel().getListener1().getModel();
                        ModelLoader ml = new ModelLoader();
                        if (tc.getProject().getSelectedOneToManyComparison().getRegistrationMethod() == RegistrationMethod.NO_REGISTRATION) {
                            mainF = ml.loadModel(tc.getProject().getSelectedOneToManyComparison().getPrimaryModel().getFile(), false, false);
                        }

                        boolean createAvg = createAvgCheckBox.isSelected();
                        tc.getProject().getSelectedOneToManyComparison().setCreateAvgFace(createAvg);                        
                        
                        //TODO: pick which model is template?
                        Model template = ml.loadModel(models.get(0), Boolean.FALSE, false);

                        tc.getOneToManyViewerPanel().getListener2().removeModel();
                        tc.getOneToManyViewerPanel().getListener2().setModels(template);

                        ICPmetric metric = tc.getProject().getSelectedOneToManyComparison().getIcpMetric();
                        if (metric == null) {
                            metric = ICPmetric.VERTEX_TO_VERTEX;
                        }

                        if(createAvg){
                            SurfaceComparisonProcessing.instance().computeAverage(template, models, metric);
                        }
                        KdTree templateTree;
                        List<Float> var;
                        tc.getProject().getSelectedOneToManyComparison().setAvgFace(template);

                        if (((ComparisonMethod) jComboBox1.getSelectedItem()) == ComparisonMethod.HAUSDORFF_DIST) {

                            if (metric == ICPmetric.VERTEX_TO_VERTEX) {
                                templateTree = new KdTreeIndexed(template.getVerts());
                            } else {
                                templateTree = new KdTreeFaces(template.getVerts(), template.getFaces());
                            }

                            results = SurfaceComparisonProcessing.instance().compareOneToMany(templateTree, mainF, true, null, ComparisonMethod.HAUSDORFF_DIST);
                            numResults = SurfaceComparisonProcessing.instance().compareOneToManyNumeric(mainF, models, true, ComparisonMethod.HAUSDORFF_DIST);
                        } else {
                            templateTree = new KdTreeIndexed(template.getVerts());
                            metric = ICPmetric.VERTEX_TO_VERTEX;

                            Curvature_jv mainCurv = new Curvature_jv(mainF);
                            results = SurfaceComparisonProcessing.instance().compareOneToMany(templateTree, mainF, true,
                                    mainCurv.getCurvature(CurvatureType.Gaussian), ComparisonMethod.HAUSDORFF_CURV);
                            numResults = SurfaceComparisonProcessing.instance().compareOneToManyNumeric(mainF, models, true, ComparisonMethod.HAUSDORFF_CURV);

                        }

                        var = SurfaceComparisonProcessing.instance().compareOneToManyVariation(numResults, 1.f, 0, true);
                        List<Float> sortedResRes = SortUtils.instance().sortValues(results);
                        List<Float> sortedResAbs;
                        List<Float> absVal = new LinkedList<>();

                        for (Float f : results) {
                            absVal.add(Math.abs(f));
                        }

                        sortedResAbs = SortUtils.instance().sortValues(absVal);

                        tc.getProject().getSelectedOneToManyComparison().setSortedHdAbs(sortedResAbs);
                        tc.getProject().getSelectedOneToManyComparison().setSortedHdRel(sortedResRes);

                        String strRes = setValues(var, origModels, mainF.getName(), 0);

                        tc.getProject().getSelectedOneToManyComparison().setNumResults(numResults);
                        tc.getProject().getSelectedOneToManyComparison().setNumericalResults(strRes);

                        tc.getProject().getSelectedOneToManyComparison().setHd(results);

                        HDpaintingInfo info = new HDpaintingInfo(results, tc.getOneToManyViewerPanel().getListener1().getModel(), true);
                        float[] minColor = {0.298f, 0.0f, 0.898f};
                        Color minCol = new Color(76, 0, 229);
                        float[] maxColor = {0.898f, 0.1f, 0.133f};
                        Color maxCol = new Color(229, 0, 34);
                        info.setMinColor(minColor);
                        info.setMaxColor(maxColor);

                        HDpainting hd = new HDpainting(info);

                        GUIController.getSelectedProjectTopComponent().getProject().getSelectedOneToManyComparison().setHdColor1(minCol);
                        GUIController.getSelectedProjectTopComponent().getProject().getSelectedOneToManyComparison().setHdColor2(maxCol);

                        tc.getOneToManyViewerPanel().getListener1().drawHD(true);
                        tc.getOneToManyViewerPanel().getListener1().setHdPaint(hd);
                        tc.getOneToManyViewerPanel().getListener1().setHdInfo(info);
                        tc.getProject().getSelectedOneToManyComparison().setHDP(hd);
                        tc.getProject().getSelectedOneToManyComparison().setHdPaintingInfo(info);

                        p.finish();
                    } catch (Exception ex) {
                        Exceptions.printStackTrace(ex);
                        
                    }finally{
                        p.finish();
                    }

                } else {

                    //Starting Procrustes Comparison
                    List<List<FacialPoint>> list = new ArrayList();
                    int size = tc.getProject().getSelectedOneToManyComparison().getModels().size();
                    for (int i = 0; i < size; i++) {
                        List<FacialPoint> facialPoints = tc.getProject().getSelectedOneToManyComparison().getFacialPoints(
                                tc.getProject().getSelectedOneToManyComparison().getModels().get(i).getName());
                        list.add(facialPoints);
                    }

                    //Created list of points
                    Procrustes1ToMany procrustes = new Procrustes1ToMany(tc.getOneToManyViewerPanel().getListener1().getFpUniverse().getFacialPoints(),
                            list, jCheckBox2.isSelected());

                    //String result = procrustes.compare1WithN(jSlider3.getValue() / 100f);
                    String result = procrustes.compare1toN(jSlider3.getValue() / 100f, tc.getOneToManyViewerPanel().getListener1().getModel().getName(),
                            tc.getProject().getSelectedOneToManyComparison().getModels());
                    tc.getProject().getSelectedOneToManyComparison().setNumericalResults(result);

                    // GUIController.getSelectedProjectTopComponent().getOneToManyViewerPanel().getCanvas2().setDescriptionText(result);
                    tc.getOneToManyViewerPanel().getListener2().setProcrustes(true);

                    PApaintingInfo paInfo = new PApaintingInfo(procrustes.getGpa(), procrustes.getPa(), 1);
                    /*tc.getOneToManyViewerPanel().getListener2().setTypePA(1);
                    tc.getOneToManyViewerPanel().getListener2().setPa(procrustes.getPa());
                    tc.getOneToManyViewerPanel().getListener2().setGpa(procrustes.getGpa());
                    tc.getOneToManyViewerPanel().getListener2().setEnhance(0);*/

                    if (jCheckBox2.isSelected()) {
                        tc.getOneToManyViewerPanel().getListener2().setCameraPosition(0, 0, 700);
                        paInfo.setPointSize(30 * 3);
                        //paInfo.setPointSize(30 / (float) (30));
                        //tc.getOneToManyViewerPanel().getListener2().setFpSize(30 / (float) (30));
                    } else {
                        tc.getOneToManyViewerPanel().getListener2().setCameraPosition(0, 0, 700);
                        paInfo.setPointSize(30 * 3);
                        //tc.getOneToManyViewerPanel().getListener2().setFpSize(30 * 3);
                    }

                    tc.getOneToManyViewerPanel().getListener2().setPaInfo(paInfo);
                    tc.getOneToManyViewerPanel().getListener2().setPaPainting(new PApainting(paInfo));

                    repaint();
                }

                tc.getProject().getSelectedOneToManyComparison().setState(3);
                tc.getProject().getSelectedOneToManyComparison().setComparisonMethod((ComparisonMethod) jComboBox1.getSelectedItem());

                /*if (((ComparisonMethod)jComboBox1.getSelectedItem()) == ComparisonMethod.PROCRUSTES) {
                    tc.getProject().getSelectedOneToManyComparison().setResults(0);
                } else if (((ComparisonMethod)jComboBox1.getSelectedItem()) == ComparisonMethod.HAUSDORFF_DIST) {
                    tc.getProject().getSelectedOneToManyComparison().setResults(1);
                }else{
                    tc.getProject().getSelectedOneToManyComparison().setResults(2);
                }*/
                if (GUIController.getSelectedProjectTopComponent() == tc) {
                    GUIController.getConfigurationTopComponent().addOneToManyComparisonResults();
                }
                GUIController.updateNavigator();
            }
        };

        Thread t = new Thread(run);
        t.start();

    }

    private void processComparisonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processComparisonButtonActionPerformed
        computeComparison(GUIController.getSelectedProjectTopComponent());
        
    }//GEN-LAST:event_processComparisonButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (((ComparisonMethod)jComboBox1.getSelectedItem()) == ComparisonMethod.PROCRUSTES) {
            jPanel2.setVisible(true);
            
            createAvgCheckBox.setVisible(false);
            createAvgLabel.setVisible(false);
        }
        if (((ComparisonMethod)jComboBox1.getSelectedItem()) == ComparisonMethod.HAUSDORFF_DIST) {
            jPanel2.setVisible(false);
            
            createAvgCheckBox.setVisible(true);
            createAvgLabel.setVisible(true);
        }

        GUIController.getSelectedProjectTopComponent().getProject().getSelectedOneToManyComparison().setComparisonMethod((ComparisonMethod)jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        ModelLoader ml = new ModelLoader();
        Model model = ml.loadModel(GUIController.getSelectedProjectTopComponent().getOneToManyViewerPanel().getListener2().getModel().getFile(), false, true);

        GUIController.getSelectedProjectTopComponent().getOneToManyViewerPanel().getListener2().setModels(model);

        model = ml.loadModel(GUIController.getSelectedProjectTopComponent().getOneToManyViewerPanel().getListener1().getModel().getFile(), false, true);
        GUIController.getSelectedProjectTopComponent().getOneToManyViewerPanel().getListener1().setModels(model);
        GUIController.getSelectedProjectTopComponent().getProject().getSelectedOneToManyComparison().setState(1);
        GUIController.getConfigurationTopComponent().addOneToManyRegistrationComponent();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        final ProjectTopComponent tc = GUIController.getSelectedProjectTopComponent();
        ResultExports.instance().saveRegisteredModelsOneToMany(tc, tc.getProject().getSelectedOneToManyComparison().getRegisteredModels(),
                tc.getProject().getSelectedOneToManyComparison().getModels(), 
                tc.getProject().getSelectedOneToManyComparison().getPrimaryModel(), "_1n");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void createAvgCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_createAvgCheckBoxStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_createAvgCheckBoxStateChanged

    public boolean getScaleEnabled() {
        return jCheckBox2.isSelected();
    }

    public void setProcessComparisonEnabled(boolean en) {
        processComparisonButton.setEnabled(en);
        GUIController.getSelectedProjectTopComponent().getProject().getSelectedOneToManyComparison().setCompareButtonEnabled(en);
    }

    private String setValues(List<Float> hdDistance, List<File> models, String mainFace, int varianceMethod) {
        StringBuilder strResults = new StringBuilder(SurfaceComparisonProcessing.instance().getNameOfVarianceMethod(varianceMethod) + " 100% treshold;");
        
        for(int i = 0; i < hdDistance.size(); i++){
            strResults.append(models.get(i).getName()).append(';');
        }
        
        strResults.append("\n" + mainFace + ";");
        
        for(Float f : hdDistance){
            strResults.append(f).append(';');    
        }
        
        return strResults.toString();
    }
    
      private void setupComparisonMethods(OneToManyComparison c){
        jComboBox1.removeAllItems();
        for (int i = 0; i < ComparisonMethod.values().length; i++) {
            jComboBox1.addItem(ComparisonMethod.values()[i]);
            if(c.getComparisonMethod()==ComparisonMethod.values()[i]){
                jComboBox1.setSelectedIndex(i);
            }
        }
        
        createAvgCheckBox.setSelected(c.isCreateAvgFace());
      /*  if((c.getRegistrationMethod() == 0)){
            jComboBox1.removeItemAt(0);
        }*/
        if((c.getRegistrationMethod() != RegistrationMethod.PROCRUSTES)){
            jComboBox1.removeItemAt(1);
        }
        
    }

    public void setConfiguration() {
        OneToManyComparison c = GUIController.getSelectedProjectTopComponent().getProject().getSelectedOneToManyComparison();
        jCheckBox2.setSelected(c.isFpScaling());
        setupComparisonMethods(c);
        jSlider3.setValue(c.getFpTreshold());
        processComparisonButton.setEnabled(c.isCompareButtonEnabled());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox createAvgCheckBox;
    private javax.swing.JLabel createAvgLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JButton processComparisonButton;
    // End of variables declaration//GEN-END:variables
}
