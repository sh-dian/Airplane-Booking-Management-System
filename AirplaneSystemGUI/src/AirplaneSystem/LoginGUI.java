/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AirplaneSystem;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginLabel = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jButton_Login = new javax.swing.JButton();
        jTextField_Email = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(0, 0, 0));
        LoginLabel.setText("LOGIN");
        getContentPane().add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel_Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Password.setText("    PASSWORD");
        getContentPane().add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 127, 25));

        jButton_Login.setBackground(new java.awt.Color(255, 153, 153));
        jButton_Login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirplaneSystem/icons8-login-25.png"))); // NOI18N
        jButton_Login.setText("LOGIN");
        jButton_Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseExited(evt);
            }
        });
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 380, 32));

        jTextField_Email.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Email.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 210, -1));

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 210, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Don't have an Account? Register here!");
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        jLabel_Email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Email.setText("    EMAIL");
        getContentPane().add(jLabel_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 91, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseEntered
        // TODO add your handling code here:
        jButton_Login.setBackground(new Color(153,255,255));
    }//GEN-LAST:event_jButton_LoginMouseEntered

    private void jButton_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseExited
        // TODO add your handling code here:
        jButton_Login.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_jButton_LoginMouseExited

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        // TODO add your handling code here:
        String email = jTextField_Email.getText();
        String password = String.valueOf(jPasswordField1.getPassword());

        if(email.trim().equals("") || password.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Fill the blank fields", "Blank Fields", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Person p = new Person(email, password);
            
            if(p.Login()) {
                MenuGUI m = new MenuGUI();
                m.setVisible(true);
                m.pack();
                m.setLocationRelativeTo(null);
                m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Wrong username or password!", "Wrong credential!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        RegistrationGUI rg = new RegistrationGUI();
        rg.setVisible(true);
        rg.pack();
        rg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black);
        jLabel1.setBorder(label_border);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setBorder(null);
    }//GEN-LAST:event_jLabel1MouseExited

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_Email;
    // End of variables declaration//GEN-END:variables
}
