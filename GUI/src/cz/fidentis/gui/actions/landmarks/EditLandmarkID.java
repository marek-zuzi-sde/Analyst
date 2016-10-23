/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fidentis.gui.actions.landmarks;

import cz.fidentis.featurepoints.FacialPoint;
import cz.fidentis.featurepoints.FpTexter;
import cz.fidentis.gui.Canvas;
import cz.fidentis.visualisation.ComparisonListenerInfo;
import javax.swing.JOptionPane;

/**
 *
 * @author ex3me
 */
public class EditLandmarkID extends javax.swing.JFrame {

    private FacialPoint fp;
    private ComparisonListenerInfo info;
    private Canvas canvas;
    private boolean active;
    
    /**
     * Creates new form EditLandmarkID
     */
    public EditLandmarkID(FacialPoint fp, ComparisonListenerInfo info, Canvas canvas) {
        initComponents();
        
        this.fp = fp;
        this.info = info;
        this.canvas = canvas;
        this.active = fp.isActive();
        
        setConfiguration();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        landmarkIDSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        landmarkInfoTextArea = new javax.swing.JTextArea();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        toggleActiveButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(EditLandmarkID.class, "EditLandmarkID.jLabel1.text")); // NOI18N

        landmarkIDSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        landmarkIDSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                landmarkIDSpinnerStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(EditLandmarkID.class, "EditLandmarkID.jLabel2.text")); // NOI18N

        landmarkInfoTextArea.setEditable(false);
        landmarkInfoTextArea.setColumns(20);
        landmarkInfoTextArea.setLineWrap(true);
        landmarkInfoTextArea.setRows(5);
        jScrollPane1.setViewportView(landmarkInfoTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, org.openide.util.NbBundle.getMessage(EditLandmarkID.class, "EditLandmarkID.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(okButton, org.openide.util.NbBundle.getMessage(EditLandmarkID.class, "EditLandmarkID.okButton.text")); // NOI18N
        okButton.setMaximumSize(new java.awt.Dimension(71, 25));
        okButton.setMinimumSize(new java.awt.Dimension(71, 25));
        okButton.setPreferredSize(new java.awt.Dimension(71, 25));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(toggleActiveButton, org.openide.util.NbBundle.getMessage(EditLandmarkID.class, "EditLandmarkID.toggleActiveButton.text")); // NOI18N
        toggleActiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleActiveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(landmarkIDSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelButton))
                            .addComponent(toggleActiveButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(landmarkIDSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toggleActiveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void landmarkIDSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_landmarkIDSpinnerStateChanged
        landmarkDesc((Integer)landmarkIDSpinner.getValue());
    }//GEN-LAST:event_landmarkIDSpinnerStateChanged

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
       int id = (Integer)landmarkIDSpinner.getValue();
       boolean contains = info.containsFP(id);
       
       if(id != fp.getType() && contains){
           int result = JOptionPane.showConfirmDialog(this, "Landmark with this ID already exists. Do you want to rewrite it?", "Landmark exists", JOptionPane.YES_NO_OPTION);
           
           if(result == JOptionPane.YES_OPTION){
               info.removeFacialPoint(id);
               setFPInfo(id);
               this.dispose();
           }
       }else{
           setFPInfo(id);
           this.dispose();
       }         
    }//GEN-LAST:event_okButtonActionPerformed

    private void toggleActiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleActiveButtonActionPerformed
        //only change state locally, fp state will change if user clicks OK button
        this.active = !this.active;
        landmarkDesc(fp.getType());
    }//GEN-LAST:event_toggleActiveButtonActionPerformed

    private void setFPInfo(int id) {
        fp.setType(id);
        fp.setActive(active);
        canvas.setInfo(fp);
    }

    private void setConfiguration(){
        int id = fp.getType();
        landmarkIDSpinner.setValue(id);  
        
        landmarkDesc(id);
    }

    private void landmarkDesc(int id) {
        String landmarkName = FpTexter.getInstance().getFPname(id);
        String landmarkDesc = FpTexter.getInstance().getFPinfo(id);
        
        landmarkInfoTextArea.setText("Landmark Name: " + landmarkName + System.lineSeparator() + "Active: " + this.active + 
                System.lineSeparator() + System.lineSeparator() +
                landmarkDesc);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner landmarkIDSpinner;
    private javax.swing.JTextArea landmarkInfoTextArea;
    private javax.swing.JButton okButton;
    private javax.swing.JButton toggleActiveButton;
    // End of variables declaration//GEN-END:variables
}
