/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypack;

import java.util.StringJoiner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author administrator
 */
public class DemoMain5 extends javax.swing.JFrame {

 DefaultListModel dlm = null;
 /**
  * Creates new form DemoMain5
  */
 public DemoMain5() {
  initComponents();
  dlm = new DefaultListModel();
 }

 /**
  * This method is called from within the constructor to initialize the form.
  * WARNING: Do NOT modify this code. The content of this method is always
  * regenerated by the Form Editor.
  */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  jTextField1 = new javax.swing.JTextField();
  jButton1 = new javax.swing.JButton();
  jScrollPane1 = new javax.swing.JScrollPane();
  jList1 = new javax.swing.JList<>();
  jButton2 = new javax.swing.JButton();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

  jButton1.setText("Add City");
  jButton1.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton1ActionPerformed(evt);
   }
  });

  jScrollPane1.setViewportView(jList1);

  jButton2.setText("Get City");
  jButton2.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton2ActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGap(53, 53, 53)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(125, 125, 125)
      .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(layout.createSequentialGroup()
      .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(84, 84, 84)
      .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addContainerGap(152, Short.MAX_VALUE))
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGap(34, 34, 34)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGap(18, 18, 18)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(layout.createSequentialGroup()
      .addGap(122, 122, 122)
      .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addContainerGap(23, Short.MAX_VALUE))
  );

  pack();
 }// </editor-fold>//GEN-END:initComponents

 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
  String data = jTextField1.getText();
  dlm.addElement(data);
  jList1.setModel(dlm);
 }//GEN-LAST:event_jButton1ActionPerformed

 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
   Object items[] = jList1.getSelectedValues();
        StringJoiner sj = new StringJoiner(",");
        for(Object x : items)
        {
           sj.add(x.toString());
        }
        JOptionPane.showMessageDialog(this,sj);
  
  
 }//GEN-LAST:event_jButton2ActionPerformed

 /**
  * @param args the command line arguments
  */
 public static void main(String args[]) {
  /* Set the Nimbus look and feel */
  //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
  /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
   */
  try {
   for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
    }
   }
  } catch (ClassNotFoundException ex) {
   java.util.logging.Logger.getLogger(DemoMain5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(DemoMain5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(DemoMain5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(DemoMain5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new DemoMain5().setVisible(true);
   }
  });
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JList<String> jList1;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JTextField jTextField1;
 // End of variables declaration//GEN-END:variables
}