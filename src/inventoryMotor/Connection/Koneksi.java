/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventoryMotor.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hanas_bp
 */
public class Koneksi {
    public static Connection open() {
        
        Connection con;
        try {
//            url database
            String url ="jdbc:mysql://localhost:3306/inventory";
//            user database
            String user = "root";
//            password database
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url, user, pass);
            System.out.println(con);
            return con;
        } catch (Exception e) {
            System.out.println("koneksi gagal"+e.getMessage());
            return null;
        }
    }
}
