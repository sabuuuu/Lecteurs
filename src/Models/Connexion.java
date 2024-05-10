/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Connexion {
    Connection co;
    public Connexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
           // JOptionPane.showMessageDialog(null, "connexion au serveur faite avec succées");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "echec de connexion au serveur" + e.getMessage());
        }

        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/dzvues", "root", "");
          //  JOptionPane.showMessageDialog(null, "connexion a la bdd faite avec succées");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "echec de connexion a la bdd" + e.getMessage());
        }

    }
     public Connection getCo(){
        return co;
    }
    
    public static void main(String[] args) {
        Connexion c=new Connexion();
        c.getCo();
    }
}
