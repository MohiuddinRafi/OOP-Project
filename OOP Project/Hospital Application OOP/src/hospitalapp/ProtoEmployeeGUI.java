/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author peter
 */
public class ProtoEmployeeGUI extends javax.swing.JFrame {
    private ArrayList<ProtoEmployee> employees;
    /**
     * Creates new form HospitalGUI
     */
    public ProtoEmployeeGUI() {
        initComponents();
        /*NameLbl.setVisible(true);
        roleLbl.setVisible(true);
        IDLbl.setVisible(true);
        employees = new ArrayList<>();*/
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
        NameLbl = new javax.swing.JLabel();
        roleLbl = new javax.swing.JLabel();
        IDLbl = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        roleTf = new javax.swing.JTextField();
        IDTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        menu3Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Employee Details");

        NameLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        NameLbl.setText("Doctor Name:");

        roleLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        roleLbl.setText("Doctor Role:");

        IDLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        IDLbl.setText("Doctor ID:");

        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        displayBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayBtn.setText("display");

        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        searchBtn.setText("Search");

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        deleteBtn.setText("Delete");

        menu3Btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menu3Btn.setText("Menu");
        menu3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu3BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameLbl)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(addBtn)
                                        .addComponent(roleLbl)
                                        .addComponent(menu3Btn)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(roleTf)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDLbl)
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(displayBtn)
                                        .addGap(28, 28, 28)
                                        .addComponent(searchBtn))
                                    .addComponent(IDTf, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLbl)
                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLbl)
                    .addComponent(roleTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLbl)
                    .addComponent(IDTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(menu3Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(displayBtn)
                    .addComponent(searchBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
         Doctor d= new Doctor();
           
            d.setName(nameTf.getText());
            d.setEmpId(IDTf.getText());
            d.setRole(roleTf.getText());
            //clearFields();
    }//GEN-LAST:event_addBtnActionPerformed

    private void menu3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu3BtnActionPerformed
        // TODO add your handling code here:
        MenuGUI myGUI = new MenuGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu3BtnActionPerformed
    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
         if(employees.isEmpty()){
            JOptionPane.showMessageDialog(null,"No employees in this system");
        }
        else{
            //traversing an ArrayList
            for(int i = 0; i < employees.size();i++){
                JOptionPane.showMessageDialog(null,employees.get(i).getDetails());
            }
        }
    }   
private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(employees.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sorry, there are no employees in the system");
        }
        else{
            String searchTerm = IDTf.getText();
            //traverse an ArrayList
            for(ProtoEmployee d:employees){//for each Employee object e in the employees Array
                if(d.getEmpId().equalsIgnoreCase(searchTerm)){//check if the id of object e matches the searchterm
                    JOptionPane.showMessageDialog(null,d.getDetails());//if it matches, print the details of that object
                }
            }
        }    
}
private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(employees.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sorry, there are no employees in the system");
        }
        else{
            String searchTerm = IDTf.getText();
            for(int i = 0; i < employees.size();i++){
                ProtoEmployee d = employees.get(i);
                if(d.getEmpId().equalsIgnoreCase(searchTerm)){
                    employees.remove(d);
                }
            }
        }}
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
            java.util.logging.Logger.getLogger(ProtoEmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProtoEmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProtoEmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProtoEmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProtoEmployeeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLbl;
    private javax.swing.JTextField IDTf;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton menu3Btn;
    private javax.swing.JTextField nameTf;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JTextField roleTf;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
