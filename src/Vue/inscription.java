/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Models.*;
import Beans.*;
import static Vue.MC.jpassword;
import static Vue.MC.temail;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Inscription extends javax.swing.JFrame {

    Connexion c = new Connexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel dt = new DefaultTableModel();

    /**
     * Creates new form inscriptions
     */
    public Inscription() {
        initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void reset() {
        tnom.setText(null);
        tprenom.setText(null);
        tadress.setText(null);
        temail.setText(null);
        jpassword.setText(null);
        //pour deooner a user la possibiliter d'inserer un nvx tuple directement sans mettre le corseur sur le jtextfeild
        tnom.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelinscription = new javax.swing.JPanel();
        connexionlabel = new javax.swing.JLabel();
        tnom = new javax.swing.JTextField();
        tprenom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        binscription = new java.awt.Button();
        jaipasdecompte = new javax.swing.JLabel();
        rediriger_connexion = new javax.swing.JButton();
        jpassword = new javax.swing.JPasswordField();
        tadress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 49, 9));
        jPanel1.setToolTipText("Inscription");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinscription.setBackground(new java.awt.Color(227, 202, 171));
        panelinscription.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelinscription.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        connexionlabel.setBackground(new java.awt.Color(255, 255, 255));
        connexionlabel.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        connexionlabel.setForeground(new java.awt.Color(69, 98, 78));
        connexionlabel.setText("Inscription");
        connexionlabel.setMaximumSize(new java.awt.Dimension(51, 18));
        panelinscription.add(connexionlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 33, -1, -1));

        tnom.setMargin(new java.awt.Insets(2, 6, 2, 6));
        panelinscription.add(tnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 107, 119, 29));
        panelinscription.add(tprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 107, 123, 29));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(69, 98, 78));
        jLabel1.setText("Nom");
        panelinscription.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 86, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 98, 78));
        jLabel2.setText("Prénom");
        panelinscription.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 86, -1, -1));

        temail.setMargin(new java.awt.Insets(2, 6, 2, 6));
        temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temailActionPerformed(evt);
            }
        });
        panelinscription.add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 255, 260, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 98, 78));
        jLabel3.setText("Adresse");
        panelinscription.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 159, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(69, 98, 78));
        jLabel4.setText("E-mail");
        panelinscription.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 232, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(69, 98, 78));
        jLabel5.setText("Mot de passe");
        panelinscription.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 304, -1, -1));

        binscription.setBackground(new java.awt.Color(20, 49, 9));
        binscription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        binscription.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        binscription.setForeground(new java.awt.Color(255, 255, 255));
        binscription.setLabel("Inscription\n");
        binscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binscriptionActionPerformed(evt);
            }
        });
        panelinscription.add(binscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 375, 165, 35));

        jaipasdecompte.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jaipasdecompte.setForeground(new java.awt.Color(255, 255, 255));
        jaipasdecompte.setText("Déjà un membre ?");
        panelinscription.add(jaipasdecompte, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 419, -1, -1));

        rediriger_connexion.setBackground(new java.awt.Color(227, 202, 171));
        rediriger_connexion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rediriger_connexion.setForeground(new java.awt.Color(20, 49, 9));
        rediriger_connexion.setText("Connexion");
        rediriger_connexion.setBorder(null);
        rediriger_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rediriger_connexionActionPerformed(evt);
            }
        });
        panelinscription.add(rediriger_connexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 419, -1, -1));

        jpassword.setMargin(new java.awt.Insets(2, 6, 2, 6));
        panelinscription.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 330, 260, 34));

        tadress.setMargin(new java.awt.Insets(2, 6, 2, 6));
        panelinscription.add(tadress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 260, 34));

        jPanel1.add(panelinscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 330, 460));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Créez un compte ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 340, 60));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("afin de devenir membre ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("et accéder aux centaines de revues ! ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/akh2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void temailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temailActionPerformed

    private void binscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binscriptionActionPerformed
        String nom = tnom.getText();
        String prenom = tprenom.getText();
        String adresse = tadress.getText();
        String email = temail.getText();
        String password = new String(jpassword.getPassword());
        // Regex pattern for nom et prenom validation
        String nameRegex = "^[a-zA-ZÀ-ÿ\\s]{2,}$";

        // Vérifie si le nom correspond au motif regex
        if (!nom.matches(nameRegex)) {
            JOptionPane.showMessageDialog(null, "Nom invalide ! Le nom doit contenir au moins 2 lettres et peut inclure des espaces.");
            return;
        }

        // Vérifie si le prénom correspond au motif regex
        if (!prenom.matches(nameRegex)) {
            JOptionPane.showMessageDialog(null, "Prénom invalide ! Le prénom doit contenir au moins 2 lettres et peut inclure des espaces.");
            return;
        }
        // Regex pattern for email validation
        String emailRegex = "^[a-zA-Z0-9+._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,7}$";

        // Regex pattern for password validation (minimum 8 caractères et au moins un chiffre)
        String passwordRegex = "^(?=.*[0-9]).{8,}$";

        // Vérifie si l'email correspond au motif regex
        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(null, "Adresse e-mail invalide !");
            return;
        }

// Vérifie si le mot de passe correspond au motif regex
        if (!password.matches(passwordRegex)) {
            JOptionPane.showMessageDialog(null, "Mot de passe invalide ! \nLe mot de passe doit contenir au moins 8 caractères, \ndont au moins un chiffre.");
            return;
        }
        Lecteurs lec = new Lecteurs();
        lec.setNom(nom);
        lec.setPrenom(prenom);
        lec.setAdress(adresse);
        lec.setMail(email);
        lec.setMdp(password);
        try {
            st = c.getCo().createStatement();
            st.executeUpdate("INSERT INTO lecteur(nom,prenom,adresse,email,mdp)VALUES('" + lec.getNom() + "','" + lec.getPrenom() + "','" + lec.getAdress() + "','" + lec.getMail() + "','" + lec.getMdp() + "')");
            JOptionPane.showMessageDialog(this, "Vous êtes ajouter avec succée");

            reset();
            Lecteur login = new Lecteur();
            login.setVisible(true);
            setVisible(false);
            login.pack();
            login.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Lecteurs.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_binscriptionActionPerformed

    private void rediriger_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rediriger_connexionActionPerformed
        MC login = new MC();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_rediriger_connexionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button binscription;
    private javax.swing.JLabel connexionlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jaipasdecompte;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JPanel panelinscription;
    private javax.swing.JButton rediriger_connexion;
    private javax.swing.JTextField tadress;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tnom;
    private javax.swing.JTextField tprenom;
    // End of variables declaration//GEN-END:variables
}
