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

/** 
 * @Group 8 
 * 1. SHARIFAH LYDIEANNA BT SYED SHAMSUDDIN (CB20050)
 * 2. NURUL ATIKAH BT FADZIL HALMI (CB20133)
 * 3. AHMAD HILMAN BIN AHMAD BADRUDDIN (CB20093)
 * 4. WAN MUHAMMAD DZULKHAIRIE BIN WAN ZAHARI (CB20096)
 * 5. HANIS SYAFIQA BT KHAIRIL AZLI (CB20106)
 */ 
public class Person {
    protected String P_Name;
    protected String P_Email;
    protected String P_icNum;
    protected String P_phoneNum;
    protected int P_Age;
    protected String password;//new variable
    
    Person(){
        P_Name = null;
        P_Age = 0;
    }
    
    //parameter update - password
    Person(String P_Name,String P_Email, String P_icNum, String P_phoneNum, int P_Age, String password){
        this.P_Name = P_Name;
        this.P_Email = P_Email;
        this.P_icNum = P_icNum;
        this.P_phoneNum = P_phoneNum;
        this.P_Age = P_Age;
        this.password = password;
    }
    
    //new constructor
    Person(String P_Email, String password){
        this.P_Email = P_Email;
        this.password = password;
    }

    /**
     * @return the P_Name
     */
    public String getP_Name() {
        return P_Name;
    }

    /**
     * @param P_Name the P_Name to set
     */
    public void setP_Name(String P_Name) {
        this.P_Name = P_Name;
    }

    /**
     * @return the P_Email
     */
    public String getP_Email() {
        return P_Email;
    }

    /**
     * @param P_Email the P_Email to set
     */
    public void setP_Email(String P_Email) {
        this.P_Email = P_Email;
    }

    /**
     * @return the P_icNum
     */
    public String getP_icNum() {
        return P_icNum;
    }

    /**
     * @param P_icNum the P_icNum to set
     */
    public void setP_icNum(String P_icNum) {
        this.P_icNum = P_icNum;
    }

    /**
     * @return the P_phoneNum
     */
    public String getP_phoneNum() {
        return P_phoneNum;
    }

    /**
     * @param P_phoneNum the P_phoneNum to set
     */
    public void setP_phoneNum(String P_phoneNum) {
        this.P_phoneNum = P_phoneNum;
    }

    /**
     * @return the P_Age
     */
    public int getP_Age() {
        return P_Age;
    }

    /**
     * @param P_Age the P_Age to set
     */
    public void setP_Age(int P_Age) {
        this.P_Age = P_Age;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    //Database
        public boolean Register(){
            Database conn = new Database();
            PreparedStatement ps;
            String registerAccQuery = "INSERT INTO `accountregistration`(`Name`, `Email`, `IC Number`, `Phone Number`,`Age`, `Password`) VALUES (?,?,?,?,?,?)";

            try {
                ps = conn.getConnection().prepareStatement(registerAccQuery);
                ps.setString(1, P_Name);
                ps.setString(2,P_Email);
                ps.setString(3,P_icNum);
                ps.setString(4,P_phoneNum);
                ps.setInt(5,P_Age);
                ps.setString(6,password);
                
                if(ps.executeUpdate() > 0) {
                    return true;
                } else {
                    return false;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(RegistrationGUI.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
       
        public boolean Login(){
            PreparedStatement pt;
            ResultSet rs;

            String query = "SELECT * FROM trydatabase.accountregistration WHERE  (`Email` = ?) AND (`Password` = ?);";

            try {
                pt = Database.getConnection().prepareStatement(query);
                pt.setString(1, P_Email);
                pt.setString(2, password);
                rs = pt.executeQuery();

                if(rs.next()){
                    return true;
                }
                else{
                    return false;
                }

            } catch (SQLException ex) {
                Logger.getLogger(RegistrationGUI.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
}
