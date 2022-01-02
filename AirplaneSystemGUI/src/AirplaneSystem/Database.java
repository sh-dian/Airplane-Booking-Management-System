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
 *
 * @author User
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
