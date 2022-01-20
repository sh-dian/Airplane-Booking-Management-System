/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/** 
 * @Group 8 
 * 1. SHARIFAH LYDIEANNA BT SYED SHAMSUDDIN (CB20050)
 * 2. NURUL ATIKAH BT FADZIL HALMI (CB20133)
 * 3. AHMAD HILMAN BIN AHMAD BADRUDDIN (CB20093)
 * 4. WAN MUHAMMAD DZULKHAIRIE BIN WAN ZAHARI (CB20096)
 * 5. HANIS SYAFIQA BT KHAIRIL AZLI (CB20106)
 */ 
public class Database {
    private static String address = "localhost";
    private static String user = "root";
    private static String dbname = "trydatabase";
    private static Integer portNumber = 3307;
    private static String pass = "";
        
    public static Connection getConnection(){
        // TODO code application logic here
        
        Connection myConn = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
            datasource.setServerName(address);
            datasource.setUser(user);
            datasource.setPassword(pass);
            datasource.setPortNumber(portNumber);
            datasource.setDatabaseName(dbname);
            
            try {
                myConn = datasource.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger("Get Connection -> "+Database.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return myConn;
    }
}
