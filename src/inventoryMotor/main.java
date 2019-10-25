package inventoryMotor;

import inventoryMotor.Connection.Koneksi;
import inventoryMotor.Frame.MainFrame;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanas_bp
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
//        Koneksi koneksi = new Koneksi();
//        koneksi.open();
        
        MainFrame frame = new MainFrame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }
    
}
