
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandhya
 */
public class SqlConnect {
    Connection con;
    
    public Connection getCon()
    {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Petcetera [Sandhya on SANDHYA]", "Sandhya", "Sandhya");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Class not found");
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Sql exception");
        }
        
        return con;
    }
    
    
    
}
