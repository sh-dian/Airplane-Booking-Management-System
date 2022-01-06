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
/**
 *
 * @author User
 */
public class BookingGUI extends javax.swing.JFrame {
    
    int totalPassenger;
    /**
     * Creates new form BookingGUI
     */
    public BookingGUI() {
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

        jLabel_Total = new javax.swing.JLabel();
        jLabel_Booking1 = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jTextField_PName = new javax.swing.JTextField();
        jLabel_Age = new javax.swing.JLabel();
        jTextField_PAge = new javax.swing.JTextField();
        jLabel_Destination = new javax.swing.JLabel();
        jTextField_Destination = new javax.swing.JTextField();
        jLabel_TravelType = new javax.swing.JLabel();
        jTextField_TravelType = new javax.swing.JTextField();
        jLabel_AirplaneType = new javax.swing.JLabel();
        jTextField_AirplaneType = new javax.swing.JTextField();
        jLabel_AirplaneCode = new javax.swing.JLabel();
        jTextField_AirplaneCode = new javax.swing.JTextField();
        jLabel_ClassType = new javax.swing.JLabel();
        jTextField_ClassType = new javax.swing.JTextField();
        jLabel_SeatNum = new javax.swing.JLabel();
        jTextField_SeatNum = new javax.swing.JTextField();
        jLabel_DateTravel = new javax.swing.JLabel();
        jTextField_DateTravel = new javax.swing.JTextField();
        jLabel_DateReturn = new javax.swing.JLabel();
        jTextField_DateReturn = new javax.swing.JTextField();
        jLabel_OKU = new javax.swing.JLabel();
        jLabel_Luggage = new javax.swing.JLabel();
        jTextField_Luggage = new javax.swing.JTextField();
        jLabel_Vaccinated = new javax.swing.JLabel();
        jTextField_Vaccinated = new javax.swing.JTextField();
        jLabel_VaccineType = new javax.swing.JLabel();
        jTextField_VaccineType = new javax.swing.JTextField();
        jLabel_SecondDose = new javax.swing.JLabel();
        jTextField_Vaccine1st = new javax.swing.JTextField();
        jTextField_Vaccine2nd = new javax.swing.JTextField();
        jLabel_Covid19 = new javax.swing.JLabel();
        jTextField_Covid19 = new javax.swing.JTextField();
        jLabel_FirstDose = new javax.swing.JLabel();
        jTextField_OKU = new javax.swing.JTextField();
        jButton_Book = new javax.swing.JButton();
        jTextField_TotalPassenger = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButtonAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Total.setText("Total Passenger");
        getContentPane().add(jLabel_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel_Booking1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Booking1.setText("BOOKING");
        getContentPane().add(jLabel_Booking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        jLabel_Name.setText("Passenger Name");
        getContentPane().add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));
        getContentPane().add(jTextField_PName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 250, -1));

        jLabel_Age.setText("Age");
        getContentPane().add(jLabel_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));
        getContentPane().add(jTextField_PAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 60, -1));

        jLabel_Destination.setText("Destination");
        getContentPane().add(jLabel_Destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));
        getContentPane().add(jTextField_Destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 90, -1));

        jLabel_TravelType.setText("Travel Type");
        getContentPane().add(jLabel_TravelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));
        getContentPane().add(jTextField_TravelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 90, -1));

        jLabel_AirplaneType.setText("Airplane Type");
        getContentPane().add(jLabel_AirplaneType, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));
        getContentPane().add(jTextField_AirplaneType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 90, -1));

        jLabel_AirplaneCode.setText("Airplane Code");
        getContentPane().add(jLabel_AirplaneCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));
        getContentPane().add(jTextField_AirplaneCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 90, -1));

        jLabel_ClassType.setText("Class Type");
        getContentPane().add(jLabel_ClassType, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jTextField_ClassType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ClassTypeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_ClassType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 90, -1));

        jLabel_SeatNum.setText("Seat Num");
        getContentPane().add(jLabel_SeatNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        jTextField_SeatNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SeatNumActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_SeatNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 90, -1));

        jLabel_DateTravel.setText("Date Travel");
        getContentPane().add(jLabel_DateTravel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jTextField_DateTravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DateTravelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_DateTravel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 90, -1));

        jLabel_DateReturn.setText("Date Return");
        getContentPane().add(jLabel_DateReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        jTextField_DateReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DateReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_DateReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 90, -1));

        jLabel_OKU.setText("OKU");
        getContentPane().add(jLabel_OKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel_Luggage.setText("Total Luggage");
        getContentPane().add(jLabel_Luggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        jTextField_Luggage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LuggageActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Luggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 90, -1));

        jLabel_Vaccinated.setText("Vaccine Declaration");
        getContentPane().add(jLabel_Vaccinated, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jTextField_Vaccinated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_VaccinatedActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Vaccinated, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 90, -1));

        jLabel_VaccineType.setText("Vaccine Type");
        getContentPane().add(jLabel_VaccineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, -1));

        jTextField_VaccineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_VaccineTypeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_VaccineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 90, -1));

        jLabel_SecondDose.setText("Vaccine 2nd Dose Date");
        getContentPane().add(jLabel_SecondDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        jTextField_Vaccine1st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Vaccine1stActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Vaccine1st, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 90, -1));
        getContentPane().add(jTextField_Vaccine2nd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 90, -1));

        jLabel_Covid19.setText("Covid-19 Result Code");
        getContentPane().add(jLabel_Covid19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, -1, -1));

        jTextField_Covid19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Covid19ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Covid19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 90, -1));

        jLabel_FirstDose.setText("Vaccine 1st Dose Date");
        getContentPane().add(jLabel_FirstDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));
        getContentPane().add(jTextField_OKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 60, -1));

        jButton_Book.setText("BOOK");
        jButton_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BookActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 130, 40));

        jTextField_TotalPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TotalPassengerActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_TotalPassenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 60, -1));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 390, 590));

        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 130, 40));

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Covid19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Covid19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Covid19ActionPerformed

    private void jTextField_Vaccine1stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Vaccine1stActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Vaccine1stActionPerformed

    private void jTextField_VaccineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_VaccineTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_VaccineTypeActionPerformed

    private void jTextField_VaccinatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_VaccinatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_VaccinatedActionPerformed

    private void jTextField_LuggageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LuggageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LuggageActionPerformed

    private void jTextField_DateReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DateReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DateReturnActionPerformed

    private void jTextField_DateTravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DateTravelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DateTravelActionPerformed

    private void jTextField_SeatNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SeatNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SeatNumActionPerformed

    private void jTextField_ClassTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ClassTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ClassTypeActionPerformed
    
    private void jButton_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BookActionPerformed
        // TODO add your handling code here:
        Passenger myP = new Passenger();
        BusinessClass bc = new BusinessClass();
        FirstClass fc = new FirstClass();
        EconomyClass ec = new EconomyClass();
        
        PreparedStatement ps;
        
        totalPassenger = Integer.valueOf(jTextField_TotalPassenger.getText());
        myP.setP_Name(jTextField_PName.getText()); 
        myP.setP_Age(Integer.valueOf(jTextField_PAge.getText()));
        myP.getTicket().setDestination(Integer.valueOf(jTextField_Destination.getText()));
        myP.getTicket().setTravelType(Integer.valueOf(jTextField_TravelType.getText()));
        myP.getTicket().setFlightClass(Integer.valueOf(jTextField_ClassType.getText()));
        myP.getTicket().setDateTravel(jTextField_DateTravel.getText());
        myP.getTicket().setDateReturn(jTextField_DateReturn.getText());
        myP.setLuggage(Integer.valueOf(jTextField_Luggage.getText()));
        bc.setSeatNum(Integer.valueOf(jTextField_SeatNum.getText()));
        myP.getVaccine().setVaccineDeclaration(Integer.valueOf(jTextField_Vaccinated.getText()));
        myP.getVaccine().setVaccineType(Integer.valueOf(jTextField_VaccineType.getText()));
        myP.getVaccine().setFirstDose_Date(jTextField_Vaccine1st.getText());
        myP.getVaccine().setSecondDose_Date(jTextField_Vaccine2nd.getText());
        myP.getVaccine().setCovid19_Result(jTextField_Covid19.getText());
        
        myP.setOkuDeclaration(Integer.valueOf(jTextField_OKU.getText()));
        
        if(myP.Booking()){
            area.setText("===============================================================\n");
            area.setText(area.getText()+"\t\tBOOKING\n");
            area.setText(area.getText()+"===============================================================\n");

            area.setText(area.getText()+"Name: "+jTextField_PName.getText());
            area.setText(area.getText()+"Destination: "+jTextField_Destination.getText());
            area.setText(area.getText()+"Travel Type : "+jTextField_TravelType.getText());
            area.setText(area.getText()+"Flight Class: "+jTextField_ClassType.getText());
            area.setText(area.getText()+"Date Travel: "+jTextField_DateTravel.getText());
            area.setText(area.getText()+"Date Return: "+jTextField_DateReturn.getText());
            area.setText(area.getText()+"Total Luggage: "+jTextField_Luggage.getText());
            area.setText(area.getText()+"OKU: "+jTextField_OKU.getText());
            area.setText(area.getText()+"Seat Num: "+jTextField_SeatNum.getText());
            area.setText(area.getText()+"Vaccine Type: "+jTextField_VaccineType.getText());
            area.setText(area.getText()+"First Dose Date: "+jTextField_Vaccine1st.getText());
            area.setText(area.getText()+"Second Dose Date: "+jTextField_Vaccine2nd.getText());
            area.setText(area.getText()+"Covid-19 Result Code: "+jTextField_Covid19.getText());
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Booking Failed");
        }
        
        JOptionPane.showMessageDialog(rootPane, "Booking Complete, You May view your receipt");
    }//GEN-LAST:event_jButton_BookActionPerformed

    private void jTextField_TotalPassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TotalPassengerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TotalPassengerActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        
            jTextField_TotalPassenger.setText(jTextField_TotalPassenger.getText());
            jTextField_PName.setText("");
            jTextField_PAge.setText("");
            jTextField_Destination.setText("");
            jTextField_TravelType.setText("");
            jTextField_ClassType.setText("");
            jTextField_DateTravel.setText("");
            jTextField_DateReturn.setText("");
            jTextField_Luggage.setText("");
            jTextField_SeatNum.setText("");
            jTextField_Vaccinated.setText("");
            jTextField_VaccineType.setText("");
            jTextField_Vaccine1st.setText("");
            jTextField_Vaccine2nd.setText("");
            jTextField_Covid19.setText("");
            jTextField_OKU.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to EXIT", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButton_Book;
    private javax.swing.JLabel jLabel_Age;
    private javax.swing.JLabel jLabel_AirplaneCode;
    private javax.swing.JLabel jLabel_AirplaneType;
    private javax.swing.JLabel jLabel_Booking1;
    private javax.swing.JLabel jLabel_ClassType;
    private javax.swing.JLabel jLabel_Covid19;
    private javax.swing.JLabel jLabel_DateReturn;
    private javax.swing.JLabel jLabel_DateTravel;
    private javax.swing.JLabel jLabel_Destination;
    private javax.swing.JLabel jLabel_FirstDose;
    private javax.swing.JLabel jLabel_Luggage;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_OKU;
    private javax.swing.JLabel jLabel_SeatNum;
    private javax.swing.JLabel jLabel_SecondDose;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JLabel jLabel_TravelType;
    private javax.swing.JLabel jLabel_Vaccinated;
    private javax.swing.JLabel jLabel_VaccineType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_AirplaneCode;
    private javax.swing.JTextField jTextField_AirplaneType;
    private javax.swing.JTextField jTextField_ClassType;
    private javax.swing.JTextField jTextField_Covid19;
    private javax.swing.JTextField jTextField_DateReturn;
    private javax.swing.JTextField jTextField_DateTravel;
    private javax.swing.JTextField jTextField_Destination;
    private javax.swing.JTextField jTextField_Luggage;
    private javax.swing.JTextField jTextField_OKU;
    private javax.swing.JTextField jTextField_PAge;
    private javax.swing.JTextField jTextField_PName;
    private javax.swing.JTextField jTextField_SeatNum;
    private javax.swing.JTextField jTextField_TotalPassenger;
    private javax.swing.JTextField jTextField_TravelType;
    private javax.swing.JTextField jTextField_Vaccinated;
    private javax.swing.JTextField jTextField_Vaccine1st;
    private javax.swing.JTextField jTextField_Vaccine2nd;
    private javax.swing.JTextField jTextField_VaccineType;
    // End of variables declaration//GEN-END:variables
}
