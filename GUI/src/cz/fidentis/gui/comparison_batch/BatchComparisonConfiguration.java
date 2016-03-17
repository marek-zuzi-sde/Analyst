/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fidentis.gui.comparison_batch;

import cz.fidentis.comparison.ComparisonMethod;
import cz.fidentis.comparison.RegistrationMethod;
import cz.fidentis.comparison.procrustes.ProcrustesBatchProcessing;
import cz.fidentis.controller.BatchComparison;
import cz.fidentis.featurepoints.FacialPoint;
import cz.fidentis.gui.GUIController;
import cz.fidentis.gui.ProjectTopComponent;
import cz.fidentis.model.Model;
import cz.fidentis.model.ModelLoader;
import cz.fidentis.processing.comparison.surfaceComparison.SurfaceComparisonProcessing;
import cz.fidentis.processing.exportProcessing.ResultExports;
import cz.fidentis.utils.SortUtils;
import cz.fidentis.utilsException.FileManipulationException;
import cz.fidentis.visualisation.procrustes.PApainting;
import cz.fidentis.visualisation.procrustes.PApaintingInfo;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.util.Exceptions;
import cz.fidentis.visualisation.surfaceComparison.HDpainting;
import cz.fidentis.visualisation.surfaceComparison.HDpaintingInfo;

/**
 *
 * @author Katka
 */
@SuppressWarnings("rawtypes")
public class BatchComparisonConfiguration extends javax.swing.JPanel {

    JPanel activeColorPanel;

    /**
     * Creates new form ComparisonConfiguration
     */
    public BatchComparisonConfiguration() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        procrustesPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jSlider3 = new javax.swing.JSlider();
        processComparisonButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(BatchComparisonConfiguration.class, "BatchComparisonConfiguration.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(BatchComparisonConfiguration.class, "BatchComparisonConfiguration.jLabel3.text")); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hausdorff Distance", "Procrustes Analysis" }));
        jComboBox1.setMinimumSize(new java.awt.Dimension(182, 20));
        jComboBox1.setPreferredSize(new java.awt.Dimension(182, 20));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        procrustesPanel.setVisible(false);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(BatchComparisonConfiguration.class, "BatchComparisonConfiguration.jLabel8.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox2, org.openide.util.NbBundle.getMessage(BatchComparisonConfiguration.class, "BatchComparisonConfiguration.jCheckBox2.text")); // NOI18N
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, org.openide.util.NbBundle.getMessage(BatchComparisonConfiguration.class, "BatchComparisonConfiguration.jLabel12.text")); // NOI18N

        jSlider3.setMajorTickSpacing(20);
        jSlider3.setMinorTickSpacing(5);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setSnapToTicks(true);
        jSlider3.setValue(30);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });

        javax.swing.GroupLayout procrustesPanelLayout = new javax.swing.GroupLayout(procrustesPanel);
        procrustesPanel.setLayout(procrustesPanelLayout);
        procrustesPanelLayout.setHorizontalGroup(
            procrustesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(procrustesPanelLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(procrustesPanelLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        procrustesPanelLayout.setVerticalGroup(
            procrustesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(procrustesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(procrustesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(procrustesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Hashtable tresholdTable = new Hashtable();
        tresholdTable.put(new Integer(0), new JLabel("0"));
        tresholdTable.put(new Integer(20), new JLabel("0,2"));
        tresholdTable.put(new Integer(40), new JLabel("0,4"));
        tresholdTable.put(new Integer(60), new JLabel("0,6"));
        tresholdTable.put(new Integer(80), new JLabel("0,8"));
        tresholdTable.put(new Integer(100), new JLabel("1"));
        jSlider3.setLabelTable(tresholdTable);

        org.openide.awt.Mnemonics.setLocalizedText(processComparisonButton, org.openide.util.NbBundle.getMessage(BatchComparisonConfiguration.class, "BatchComparisonConfiguration.processComparisonButton.text")); // NOI18N
        processComparisonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processComparisonButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(BatchComparisonConfiguration.class, "BatchComparisonConfiguration.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(BatchComparisonConfiguration.class, "BatchComparisonConfiguration.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton10, org.openide.util.NbBundle.getMessage(BatchComparisonConfiguration.class, "BatchComparisonConfiguration.jButton10.text")); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(procrustesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processComparisonButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(procrustesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(processComparisonButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void computeComparison(final ProjectTopComponent tc) {
        //        final Model mainFace = GUIController.getSelectedProjectTopComponent().getViewerPanel_2Faces().getListener1().getModel(); //hlavny model v lavom panele
        //        final Model compareFace = GUIController.getSelectedProjectTopComponent().getViewerPanel_2Faces().getListener2().getModel(); //vedlajsi model v pravom panele
        //
        //        if (mainFace == null || compareFace == null) {
        //            System.out.print("Some models were not loaded.");
        //            return;
        //        }

        Runnable run;
        run = new Runnable() {

            @Override
            public void run() {
                processComparisonButton.setEnabled(false);
                tc.getProject().getSelectedBatchComparison().setCompareButtonEnabled(false);
                ProgressHandle p;

                p = ProgressHandleFactory.createHandle("Computing comparison...");

                try {
                    GUIController.setPauseButtonVisible(true);
                    p.start();

                    //Computing Hausdorff Distance
                    if (((ComparisonMethod) jComboBox1.getSelectedItem()) == ComparisonMethod.HAUSDORFF_DIST
                            || ((ComparisonMethod) jComboBox1.getSelectedItem()) == ComparisonMethod.HAUSDORFF_CURV) {
                        p.setDisplayName("Computing comparison...");
                        SurfaceComparisonProcessing.setP(p);

                        ArrayList<ArrayList<Float>> results;
                        ArrayList<ArrayList<Float>> numResults;
                        List<Float> variance;
                        List<File> originalModels = tc.getProject().getSelectedBatchComparison().getModels();
                        List<File> models = tc.getProject().getSelectedBatchComparison().getRegistrationResults();
                        if (models == null) {
                            models = tc.getProject().getSelectedBatchComparison().getModels();
                        }
                        ModelLoader ml = new ModelLoader();
                        Model template = ml.loadModel(models.get(tc.getProject().getSelectedBatchComparison().getTemplateIndex()), false, false);

                        tc.getViewerPanel_Batch().getListener().getModels().set(0, template);

                        try {
                            //visual results
                            results = SurfaceComparisonProcessing.instance().compareFaces(template, models, true, (ComparisonMethod) jComboBox1.getSelectedItem(),
                                    tc.getProject().getSelectedBatchComparison().getIcpMetric());
                            tc.getProject().getSelectedBatchComparison().setHdVisualResults(results);

                            tc.getProject().getSelectedBatchComparison().setAverageFace(template);

                            variance = SurfaceComparisonProcessing.instance().computeVariation(results, 0, true);

                            tc.getProject().getSelectedBatchComparison().setHd(variance);

                            //check
                            float[] minColor = {0.298f, 0.0f, 0.898f};
                            Color minCol = new Color(76, 0, 229);
                            float[] maxColor = {0.898f, 0.1f, 0.133f};
                            Color maxCol = new Color(229, 0, 34);

                            HDpaintingInfo info = new HDpaintingInfo(variance, template, true);
                            info.setMinColor(minColor);
                            info.setMaxColor(maxColor);

                            HDpainting paintMain = new HDpainting(info);

                            GUIController.getSelectedProjectTopComponent().getProject().getSelectedBatchComparison().setHdColor1(minCol);
                            GUIController.getSelectedProjectTopComponent().getProject().getSelectedBatchComparison().setHdColor2(maxCol);

                            tc.getViewerPanel_Batch().getListener().setHdPaint(paintMain);
                            tc.getViewerPanel_Batch().getListener().setHdInfo(info);
                            tc.getProject().getSelectedBatchComparison().setHDP(paintMain);
                            tc.getProject().getSelectedBatchComparison().setHDinfo(info);
                            tc.getViewerPanel_Batch().getListener().drawHD(true);

                            //numerical results
                            numResults = SurfaceComparisonProcessing.instance().batchCompareNumericalResults(models, 0, true,
                                    (Integer) 100 / 100f, (ComparisonMethod) jComboBox1.getSelectedItem(), tc.getProject().getSelectedBatchComparison());

                            List<Float> sortedHd = SortUtils.instance().sortValues(variance);

                            tc.getProject().getSelectedBatchComparison().setNumericalResults(SurfaceComparisonProcessing.instance().batchCompareNumericalResultsTable(numResults, 0, originalModels));
                            tc.getProject().getSelectedBatchComparison().setSortedHd(sortedHd);

                        } catch (FileManipulationException ex) {
                            //osefuj error
                        }

                    } else if (((ComparisonMethod) jComboBox1.getSelectedItem()) == ComparisonMethod.PROCRUSTES) {

                        //Starting procrustes comparison
                        List<List<FacialPoint>> list = new ArrayList();
                        int size = tc.getProject().getSelectedBatchComparison().getModels().size();
                        for (int i = 0; i < size; i++) {
                            List<FacialPoint> facialPoints = tc.getProject().getSelectedBatchComparison().getFacialPoints(
                                    tc.getProject().getSelectedBatchComparison().getModels().get(i).getName());
                            list.add(facialPoints);
                        }

                        //List of points was created
                        ProcrustesBatchProcessing procrustes = new ProcrustesBatchProcessing(list, jCheckBox2.isSelected());

                        //String result = procrustes.doBatchProcessing(jSlider3.getValue() / 100f);
                        String result = procrustes.compareBatch(tc.getProject().getSelectedBatchComparison().getModels());
                        tc.getProject().getSelectedBatchComparison().setDistanceToMeanConfiguration(procrustes.distanceToMean());

                        //GPA done
                        //GUIController.getConfigurationTopComponent().getBatchComparisonResults().setNumericalResult(result);
                        tc.getProject().getSelectedBatchComparison().setNumericalResults(result);

                        //GUIController.getSelectedProjectTopComponent().getViewerPanel_Batch().getCanvas1().setDescriptionText(result);
                        tc.getViewerPanel_Batch().getListener().setProcrustes(true);

                        PApaintingInfo paInfo = new PApaintingInfo(procrustes.getGpa(), null, 2);

                        /*tc.getViewerPanel_Batch().getListener().setTypePA(2);
                    tc.getViewerPanel_Batch().getListener().setGpa(procrustes.getGpa());
                    tc.getViewerPanel_Batch().getListener().setEnhance(0);*/
                        if (jCheckBox2.isSelected()) {
                            tc.getViewerPanel_Batch().getListener().setCameraPosition(0, 0, 700);
                            paInfo.setPointSize(30 * 3);
                            //paInfo.setPointSize(30 / (float) (30));
                            //tc.getViewerPanel_Batch().getListener().setFpSize(30 / (float) (30));
                        } else {
                            tc.getViewerPanel_Batch().getListener().setCameraPosition(0, 0, 700);
                            paInfo.setPointSize(30 * 3);
                            //tc.getViewerPanel_Batch().getListener().setFpSize(30 * 3);
                        }

                        tc.getViewerPanel_Batch().getListener().setPaInfo(paInfo);
                        tc.getViewerPanel_Batch().getListener().setPaPainting(new PApainting(paInfo));

                        repaint();
                    }

                    processComparisonButton.setEnabled(true);
                    tc.getProject().getSelectedBatchComparison().setCompareButtonEnabled(true);
                    p.finish();

                    tc.getProject().getSelectedBatchComparison().setState(3);
                    tc.getProject().getSelectedBatchComparison().setComparisonMethod((ComparisonMethod) jComboBox1.getSelectedItem());

                    /*if (((ComparisonMethod)jComboBox1.getSelectedItem()) == ComparisonMethod.PROCRUSTES) {
                    tc.getProject().getSelectedBatchComparison().setResults(0);
                } else {
                    tc.getProject().getSelectedBatchComparison().setResults(1);

                }*/
                    if (GUIController.getSelectedProjectTopComponent() == tc) {
                        GUIController.getConfigurationTopComponent().addBatchComparisonResults();
                    }
                    GUIController.setPauseButtonVisible(false);
                    GUIController.updateNavigator();
                } catch (Exception ex) {
                   Exceptions.printStackTrace(ex);
                   processComparisonButton.setEnabled(true);
                }finally{
                    p.finish();
                }
            }

        };
        Thread t = new Thread(run);
        t.start(); // start the task and progress visualisation
    }

    private void processComparisonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processComparisonButtonActionPerformed
        computeComparison(GUIController.getSelectedProjectTopComponent());
    }//GEN-LAST:event_processComparisonButtonActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        GUIController.getSelectedProjectTopComponent().getProject().getSelectedBatchComparison().setFpScaling(jCheckBox2.isSelected());
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (((ComparisonMethod) jComboBox1.getSelectedItem()) == ComparisonMethod.PROCRUSTES) {
            procrustesPanel.setVisible(true);
        }
        if (((ComparisonMethod) jComboBox1.getSelectedItem()) == ComparisonMethod.HAUSDORFF_DIST) {
            procrustesPanel.setVisible(false);

        }
        GUIController.getSelectedProjectTopComponent().getProject().getSelectedBatchComparison().setComparisonMethod((ComparisonMethod) jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
        GUIController.getSelectedProjectTopComponent().getProject().getSelectedBatchComparison().setFpTreshold(jSlider3.getValue());
    }//GEN-LAST:event_jSlider3StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        GUIController.getSelectedProjectTopComponent().getProject().getSelectedBatchComparison().setState(1);
        GUIController.getConfigurationTopComponent().addBatchRegistrationComponent();
        ModelLoader ml = new ModelLoader();
        Model m = ml.loadModel(GUIController.getSelectedProjectTopComponent().getProject().getSelectedBatchComparison().getModel(0), false, true);
        GUIController.getSelectedProjectTopComponent().getViewerPanel_Batch().setModel(m);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        final ProjectTopComponent tc = GUIController.getSelectedProjectTopComponent();
        ResultExports.instance().saveAvgFace(tc, tc.getProject().getSelectedBatchComparison().getAverageFace(),
                "_batch");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        final ProjectTopComponent tc = GUIController.getSelectedProjectTopComponent();
        ResultExports.instance().saveRegisteredModelsBatch(tc, tc.getProject().getSelectedBatchComparison().getRegistrationResults(),
                tc.getProject().getSelectedBatchComparison().getModels(), "_batch");
    }//GEN-LAST:event_jButton10ActionPerformed

    public Boolean getScaleEnabled() {
        return jCheckBox2.isSelected();
    }

    public void setProcessComparisonEnabled(boolean en) {
        processComparisonButton.setEnabled(en);
        GUIController.getSelectedProjectTopComponent().getProject().getSelectedBatchComparison().setCompareButtonEnabled(en);
    }

    private void setupComparisonMethods(BatchComparison c) {
        jComboBox1.removeAllItems();
        for (int i = 0; i < ComparisonMethod.values().length; i++) {
            jComboBox1.addItem(ComparisonMethod.values()[i]);
            if (c.getComparisonMethod() == ComparisonMethod.values()[i]) {
                jComboBox1.setSelectedIndex(i);
            }
        }
        /*  if((c.getRegistrationMethod() == 0)){
            jComboBox1.removeItemAt(0);
        }*/
        if ((c.getRegistrationMethod() != RegistrationMethod.PROCRUSTES)) {
            jComboBox1.removeItemAt(1);
        }

    }

    public void setConfiguration() {
        BatchComparison c = GUIController.getSelectedProjectTopComponent().getProject().getSelectedBatchComparison();
        jCheckBox2.setSelected(c.isFpScaling());
        setupComparisonMethods(c);
        jButton2.setVisible((c.getRegistrationMethod() == RegistrationMethod.HAUSDORFF));
        jSlider3.setValue(c.getFpTreshold());
        processComparisonButton.setEnabled(c.isCompareButtonEnabled());
    }

    /* private String setValues(List<Float> hdDistance) {
     return ("Min: " + HausdorffDistance.instance().findMinDistance(hdDistance) + "\n"
     + "Max: " + HausdorffDistance.instance().findMaxDistance(hdDistance) + "\n"
     + "RSM: " + HausdorffDistance.instance().rootMeanSqr(hdDistance) + "\n"
     + "Arithmetic Mean: " + HausdorffDistance.instance().aritmeticMean(hdDistance) + "\n"
     + "Geomertic Mean: " + HausdorffDistance.instance().geometricMean(hdDistance));
     }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JButton processComparisonButton;
    private javax.swing.JPanel procrustesPanel;
    // End of variables declaration//GEN-END:variables
}
