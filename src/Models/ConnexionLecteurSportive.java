/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ConnexionLecteurSportive {
    Connexion c=new Connexion();
    PreparedStatement ps;
    public ResultSet rs;
    public ConnexionLecteurSportive() {
        try {
            ps=c.getCo().prepareStatement("SELECT * FROM revue where genre='sportive'");
            rs=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionLecteurScientifique.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
