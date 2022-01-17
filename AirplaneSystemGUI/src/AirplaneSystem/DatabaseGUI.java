/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AirplaneSystem;

import java.awt.Color;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class DatabaseGUI extends javax.swing.JFrame {

    /**
     * Creates new form SearchGUI
     */
    public DatabaseGUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Name1 = new javax.swing.JLabel();
        jButton_Delete = new javax.swing.JButton();
        SelectName = new javax.swing.JTextField();
        SelectCovid = new javax.swing.JTextField();
        jButton_Update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SelectTotalPrice = new javax.swing.JTextField();
        SelectTicketPrice = new javax.swing.JTextField();
        SelectTravelTypePrice = new javax.swing.JTextField();
        SelectFlightClassPrice = new javax.swing.JTextField();
        SelectLuggagePrice = new javax.swing.JTextField();
        SelectDiscount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passenger Name", "Destination", "Travel Type", "Airplane Type", "Airplane Code", "Class Type", "Seat Number", "Date Travel", "Date Return", "Covid-19 Result Code"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1300, 190));

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, -1, -1));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 230, -1));

        jLabel2.setText("HI, ITS YOUR TICKET");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        jLabel_Name1.setText("Name");
        getContentPane().add(jLabel_Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 50, -1));

        jButton_Delete.setText("DELETE");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 130, 40));
        getContentPane().add(SelectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 260, -1));
        getContentPane().add(SelectCovid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 260, -1));

        jButton_Update.setText("UPDATE");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 100, 30));

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 130, 40));

        jLabel3.setText("Covid-19 Result Code");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel5.setText("YOUR TICKET PRICE: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel7.setText("**Note: You may update your name and Coivd-19 Result");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));
        getContentPane().add(SelectTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 430, 180, -1));

        SelectTicketPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectTicketPriceActionPerformed(evt);
            }
        });
        getContentPane().add(SelectTicketPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 180, -1));
        getContentPane().add(SelectTravelTypePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 180, -1));
        getContentPane().add(SelectFlightClassPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 180, -1));
        getContentPane().add(SelectLuggagePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 180, -1));

        SelectDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectDiscountActionPerformed(evt);
            }
        });
        getContentPane().add(SelectDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 400, 180, -1));

        jLabel1.setText("Ticket Price");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        jLabel4.setText("TravelType Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        jLabel8.setText("FlightClass Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        jLabel9.setText("Luggage Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        jLabel10.setText("Discount");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, -1, -1));

        jLabel11.setText("Total Price");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
       Passenger myP = new Passenger();
        String name = jTextFieldName.getText();
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        int r = jTable1.getRowCount();
        
        while(r-->0){
            tblModel.removeRow(r);
        }
        
        ((Passenger)myP).searchTicket(jTable1,jTextFieldName.getText());

    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        Passenger myP = new Passenger();
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            //tblModel.removeRow(jTable1.getSelectedRow());
                
            ((Passenger)myP).DeleteTicket(jTable1);
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        Database conn = new Database();
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            int row = jTable1.getSelectedRow();
            String Table_Click = (jTable1.getModel().getValueAt(row, 0).toString());
            
            ps = conn.getConnection().prepareStatement("SELECT * FROM `airplanebookingticket` WHERE `Name` = '"+Table_Click+"'");
            rs = ps.executeQuery();
            
            if(rs.next()){
                String add1 = rs.getString("Name");
                SelectName.setText(add1);
                String add2 = rs.getString("Covid-19 Result Code");
                SelectCovid.setText(add2);
                
                String add3 = rs.getString("Flight Class Price");
                SelectFlightClassPrice.setText(add3);
                String add4 = rs.getString("Ticket Price");
                SelectTicketPrice.setText(add4);
                String add5 = rs.getString("Travel Type Price");
                SelectTravelTypePrice.setText(add5);
                String add6 = rs.getString("Luggage Charge");
                SelectLuggagePrice.setText(add6);
                String add7 = rs.getString("Discount");
                SelectDiscount.setText(add7);
                String add8 = rs.getString("Total Price");
                SelectTotalPrice.setText(add8);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        Passenger myP = new Passenger();
        
        String value1 = SelectName.getText();
        String value2 = SelectCovid.getText();
        
        ((Passenger)myP).UpdateTicket(jTable1, SelectName.getText(),SelectCovid.getText());
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to EXIT", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SelectTicketPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectTicketPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectTicketPriceActionPerformed

    private void SelectDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectDiscountActionPerformed

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
            java.util.logging.Logger.getLogger(DatabaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatabaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatabaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatabaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatabaseGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SelectCovid;
    private javax.swing.JTextField SelectDiscount;
    private javax.swing.JTextField SelectFlightClassPrice;
    private javax.swing.JTextField SelectLuggagePrice;
    private javax.swing.JTextField SelectName;
    private javax.swing.JTextField SelectTicketPrice;
    private javax.swing.JTextField SelectTotalPrice;
    private javax.swing.JTextField SelectTravelTypePrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Name1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}