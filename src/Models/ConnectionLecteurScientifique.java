/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class ConnectionLecteurScientifique {
    Connexion c=new Connexion();
    PreparedStatement ps;
    public ResultSet rs;
    public ConnectionLecteurScientifique() {
        try {
            ps=c.getCo().prepareStatement("SELECT * FROM revue where genre='scientifique'");
            rs=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLecteurScientifique.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
