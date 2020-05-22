/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class ConnectionUtil {
    static String hostName = "localhost";//mặc định

    static String dbName = "doan";//tên database
    static String Username = "root";//mặc định
    static String Password = "48ab00603";//mặc định

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        //String connectionURL = "jdbc:mysql://localhost:3306/vidu1";

        Connection conn = DriverManager.getConnection(connectionURL, Username, Password);
        return conn;
    }
    
    

}
