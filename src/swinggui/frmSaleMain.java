/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swinggui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author HAKHENG
 */
public class frmSaleMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmSaleMain() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuUserManagement = new javax.swing.JMenuItem();
        menuGroupManagement = new javax.swing.JMenuItem();
        menuGroupManagement1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuLogout = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCustomer = new javax.swing.JMenuItem();
        menuSupplier = new javax.swing.JMenuItem();
        menuSupplier1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuCustomer1 = new javax.swing.JMenuItem();
        menuSupplier2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuUserManagement1 = new javax.swing.JMenuItem();
        menuGroupManagement2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Sale");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(803, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(483, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(50, 35));

        menuUserManagement.setLabel("New Sale");
        menuUserManagement.setPreferredSize(new java.awt.Dimension(145, 40));
        menuUserManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserManagementActionPerformed(evt);
            }
        });
        jMenu1.add(menuUserManagement);

        menuGroupManagement.setLabel("Open Sale");
        menuGroupManagement.setPreferredSize(new java.awt.Dimension(145, 40));
        jMenu1.add(menuGroupManagement);

        menuGroupManagement1.setText("Save Sale");
        menuGroupManagement1.setPreferredSize(new java.awt.Dimension(145, 40));
        jMenu1.add(menuGroupManagement1);
        jMenu1.add(jSeparator1);

        menuLogout.setText("Logout");
        menuLogout.setPreferredSize(new java.awt.Dimension(145, 40));
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(menuLogout);

        menuExit.setText("Exit");
        menuExit.setPreferredSize(new java.awt.Dimension(145, 40));
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(50, 35));

        menuCustomer.setText("Add Product");
        menuCustomer.setPreferredSize(new java.awt.Dimension(145, 40));
        jMenu2.add(menuCustomer);

        menuSupplier.setText("Remove Product");
        menuSupplier.setPreferredSize(new java.awt.Dimension(145, 40));
        menuSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSupplierActionPerformed(evt);
            }
        });
        jMenu2.add(menuSupplier);

        menuSupplier1.setText("Edit Sale Details");
        menuSupplier1.setPreferredSize(new java.awt.Dimension(145, 40));
        menuSupplier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSupplier1ActionPerformed(evt);
            }
        });
        jMenu2.add(menuSupplier1);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("View");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(50, 35));

        menuCustomer1.setText("View Sales History");
        menuCustomer1.setPreferredSize(new java.awt.Dimension(145, 45));
        jMenu5.add(menuCustomer1);

        menuSupplier2.setText("View Customer Information");
        menuSupplier2.setPreferredSize(new java.awt.Dimension(160, 40));
        menuSupplier2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSupplier2ActionPerformed(evt);
            }
        });
        jMenu5.add(menuSupplier2);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Help");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(50, 35));

        menuUserManagement1.setText("Help Topics");
        menuUserManagement1.setPreferredSize(new java.awt.Dimension(145, 40));
        menuUserManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserManagement1ActionPerformed(evt);
            }
        });
        jMenu4.add(menuUserManagement1);

        menuGroupManagement2.setText("About");
        menuGroupManagement2.setPreferredSize(new java.awt.Dimension(145, 40));
        jMenu4.add(menuGroupManagement2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserManagementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuUserManagementActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        // TODO add your handling code here:
        SwingUtilities.invokeLater(() -> {
        frmLogin login = new frmLogin();
        login.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = screenSize.width / 2;
        int centerY = screenSize.height / 2;
        login.setLocation(centerX - login.getWidth() / 2, centerY - login.getHeight() / 2);
    });

    // Close the current login form
    this.dispose();
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuUserManagement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserManagement1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuUserManagement1ActionPerformed

    private void menuSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSupplierActionPerformed

    private void menuSupplier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSupplier1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSupplier1ActionPerformed

    private void menuSupplier2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSupplier2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSupplier2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmSaleMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSaleMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSaleMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSaleMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSaleMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuCustomer;
    private javax.swing.JMenuItem menuCustomer1;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuGroupManagement;
    private javax.swing.JMenuItem menuGroupManagement1;
    private javax.swing.JMenuItem menuGroupManagement2;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuSupplier;
    private javax.swing.JMenuItem menuSupplier1;
    private javax.swing.JMenuItem menuSupplier2;
    private javax.swing.JMenuItem menuUserManagement;
    private javax.swing.JMenuItem menuUserManagement1;
    // End of variables declaration//GEN-END:variables
}
