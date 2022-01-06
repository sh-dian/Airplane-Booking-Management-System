/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/** 
 * @Group 8 
 * 1. SHARIFAH LYDIEANNA BT SYED SHAMSUDDIN (CB20050)
 * 2. NURUL ATIKAH BT FADZIL HALMI (CB20133)
 * 3. AHMAD HILMAN BIN AHMAD BADRUDDIN (CB20093)
 * 4. WAN MUHAMMAD DZULKHAIRIE BIN WAN ZAHARI (CB20096)
 * 5. HANIS SYAFIQA BT KHAIRIL AZLI (CB20106)
 */ 
public class Passenger extends Person{
    private int luggage;
    private int okuDeclaration;
    private Vaccine vaccine;
    private BookTicket ticket;
    
    public float LPrice;
    public float Discount;
    
    Passenger(){
        luggage = 0;
        okuDeclaration = 0;
        LPrice = 0;
        vaccine = new Vaccine();
        ticket = new BookTicket();
    }
    
    float LuggagePrice(int luggage){
        return LPrice = (float) (getLuggage() * 30.0);
    }
    
    float Discount(int P_Age, int okuDeclaration){
        float discP = 0;//new variable
        
        if(getP_Age() <=12){
            discP = (float) 0.10;
            
        }
        else if(getP_Age() >=60){
            discP = (float) 0.15;
        }
        else if(getP_Age() > 12 && getP_Age() < 60){
            discP = 0;
        }
        
            if(getOkuDeclaration() != 2){
                Discount = (float) (discP + 0.20);
            }
            else{
                Discount = discP;
            }
        
        return Discount;
    }
    
    //New method
    String AreOku(int okuDeclaration){
        String declaration;//new variable
        
        if(getOkuDeclaration() == 1){
            declaration = "Yes";
        }
        else if(getOkuDeclaration() == 2){
            declaration = "No";
        }
        else{
            declaration = null;
        }
        
        return declaration;
    }
    
    void VaccineDate(){
        System.out.println("First Dose Date: "+vaccine.getFirstDose_Date());
        System.out.println("Second Dose Date: "+vaccine.getSecondDose_Date());
        System.out.println("Covid-19 Result: "+vaccine.getCovid19_Result());
    }
    
    /**
     * @return the luggage
     */
    public int getLuggage() {
        return luggage;
    }

    /**
     * @param luggage the luggage to set
     */
    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    /**
     * @return the okuDeclaration
     */
    public int getOkuDeclaration() {
        return okuDeclaration;
    }

    /**
     * @param okuDeclaration the okuDeclaration to set
     */
    public void setOkuDeclaration(int okuDeclaration) {
        this.okuDeclaration = okuDeclaration;
    }

    /**
     * @return the vaccine
     */
    public Vaccine getVaccine() {
        return vaccine;
    }

    /**
     * @param vaccine the vaccine to set
     */
    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    /**
     * @return the ticket
     */
    public BookTicket getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(BookTicket ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the LPrice
     */
    public float getLPrice() {
        return LPrice;
    }

    /**
     * @return the Discount
     */
    public float getDiscount() {
        return Discount;
    }
    
        //Database
        //add / insert
        public boolean Booking(){
            Database conn = new Database();
            BusinessClass bc = new BusinessClass();
            
            PreparedStatement ps;
            String bookQuery = "INSERT INTO `airplanebookingticket`(`Name`, `Age`, `Destination`, `Travel Type`,`Class Type`,`Seat Number`, `Date Travel`, `Date Return`, "
                    + "`Total Luggage`,`OKU`,`Vaccinated`, `Vaccine Type`, `Vaccine 1st Dose Date`, `Vaccine 2nd Dose Date`, `Covid-19 Result Code`) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            try {
                ps = conn.getConnection().prepareStatement(bookQuery);
                ps.setString(1, P_Name);
                ps.setInt(2,P_Age);
                
                ps.setString(3, ticket.FlightDestination(ticket.getDestination()));
                ps.setString(4, ticket.Type(ticket.getTravelType()));
                ps.setString(5, ticket.FClass(ticket.getFlightClass()));
                
                ps.setInt(6,bc.getSeatNum());
                    
                ps.setString(7, ticket.getDateTravel());
                
                if(ticket.getDateReturn().equals("")){
                    ps.setString(8, "NULL");
                }
                else{
                    ps.setString(8, ticket.getDateReturn());
                }
                   
                ps.setInt(9,luggage);
                ps.setString(10, AreOku(okuDeclaration));
                
                if(vaccine.getVaccineDeclaration() == 1){
                    ps.setString(11, "Yes");
                }
                else{
                    ps.setString(11, "No");
                }
                
                ps.setString(12, vaccine.DisplayVaccineType(vaccine.getVaccineType()));
                ps.setString(13, vaccine.getFirstDose_Date());
                ps.setString(14, vaccine.getSecondDose_Date());
                ps.setString(15, vaccine.getCovid19_Result());
                
                if(ps.executeUpdate() > 0) {
                    return true;
                } else {
                    return false;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(BookingGUI.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        //search
        public void searchTicket(JTable table, String keyword){
            Database conn = new Database();
            PreparedStatement ps;
            ResultSet rs;

            try{
                ps = conn.getConnection().prepareStatement("SELECT * FROM `airplanebookingticket` WHERE Name LIKE ?");
                ps.setString(1,  "%"+keyword+"%");
                rs = ps.executeQuery();

                while(rs.next()){
                    String name = rs.getString("Name");
                    String destination = rs.getString("Destination");
                    String travel = rs.getString("Travel Type");
                    String airplaneType = rs.getString("Airplane Type");
                    String airplaneCode = rs.getString("Airplane Code");
                    String flightClass = rs.getString("Class Type");
                    String seat = rs.getString("Seat Number");
                    String dateTravel = rs.getString("Date Travel");
                    String dateReturn = rs.getString("Date Return");
                    String covidCode = rs.getString("Covid-19 Result Code");

                    String tbData[] = {name,destination,travel,airplaneType,airplaneCode,flightClass,seat,dateTravel,dateReturn,covidCode};
                    DefaultTableModel tblModel = (DefaultTableModel)table.getModel();

                    tblModel.addRow(tbData);
                }
            }
            catch(SQLException ex){
                Logger.getLogger(Passenger.class.getName()).log(Level.SEVERE, null, ex);

            }
    }   
        //delete
        public void DeleteTicket(JTable jTable1){
            Database conn = new Database();
            PreparedStatement ps;
            ResultSet rs;
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            try{
                int row = jTable1.getSelectedRow();
                String Table_Click = (jTable1.getModel().getValueAt(row, 0).toString());
                ps = conn.getConnection().prepareStatement("DELETE FROM `airplanebookingticket` WHERE `Name` = '"+Table_Click+"'");
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
                tblModel.removeRow(jTable1.getSelectedRow());
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                Logger.getLogger(Passenger.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
       //update
        public void UpdateTicket(JTable jTable1, String value1,String value2, String value3, String value4){
            Database conn = new Database();
            PreparedStatement ps;
            ResultSet rs;
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            try{
                int row = jTable1.getSelectedRow();
                String Table_Click = (jTable1.getModel().getValueAt(row, 0).toString());

                ps = conn.getConnection().prepareStatement("UPDATE `airplanebookingticket` SET `Name`= '"+value1+"',`Date Travel`='"+value2+"', `Date Return`='"+value3+"', `Covid-19 Result Code`='"+value4+"' WHERE `Name`= '"+Table_Click+"'");
                ps.execute();
                JOptionPane.showMessageDialog(null, "Updated");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
}
