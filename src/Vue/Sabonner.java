/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Beans.*;
import Models.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NIS
 */
public class Sabonner extends javax.swing.JFrame {

    Connexion c = new Connexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel dt = new DefaultTableModel();

    /**
     * Creates new form Sabonner
     */
    public Sabonner() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tcarte = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        tcvv = new javax.swing.JPasswordField();
        navbar = new javax.swing.JPanel();
        jaipasdecompte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(20, 49, 9));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 222, 212));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 49, 9));
        jLabel2.setText("Souhaitez vous vous");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 32, 286, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 49, 9));
        jLabel3.setText("abonner ?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 65, 219, 27));

        jLabel1.setBackground(new java.awt.Color(69, 98, 78));
        jLabel1.setForeground(new java.awt.Color(69, 98, 78));
        jLabel1.setText("Abonnement a 500 DA/mois , bénéficiez de 10% de réduction  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(69, 98, 78));
        jLabel4.setForeground(new java.awt.Color(69, 98, 78));
        jLabel4.setText("lors de vos commandes !");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 130, -1, -1));

        tcarte.setBackground(new java.awt.Color(227, 202, 171));
        tcarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcarteActionPerformed(evt);
            }
        });
        jPanel1.add(tcarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 201, 300, 42));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(69, 98, 78));
        jLabel5.setText("Numéro de carte EDAHABIA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(69, 98, 78));
        jLabel6.setText("Code CVV");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 262, -1, -1));

        button1.setBackground(new java.awt.Color(20, 49, 9));
        button1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Je m'abonne");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 360, 189, 36));

        tcvv.setBackground(new java.awt.Color(227, 202, 171));
        tcvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcvvActionPerformed(evt);
            }
        });
        jPanel1.add(tcvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 283, 300, 41));

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 370, 420));

        navbar.setBackground(new java.awt.Color(227, 202, 171));

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        background.add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        jaipasdecompte.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jaipasdecompte.setForeground(new java.awt.Color(255, 255, 255));
        jaipasdecompte.setText("Je n'ai pas de compte ?");
        background.add(jaipasdecompte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tcarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcarteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcarteActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String carte = tcarte.getText();
        int cvv=Integer.parseInt(tcvv.getText());
        Lecteurs lec = new Lecteurs();
        try {
            st = c.getCo().createStatement();
            st.executeUpdate("UPDATE lecteur SET abonne = 1, carteBancaire = '" + carte + "',cvv ='"+cvv+"'WHERE email = '" + MC.temail.getText() + "'");

            JOptionPane.showMessageDialog(this, "Félicitations Vous êtes abonné ");
            Abonne a = new Abonne();
            a.setVisible(true);
            a.pack();
            a.setLocationRelativeTo(null);
            this.dispose();
            //actualiser();
            //reinistialiser();
        } catch (SQLException ex) {
            Logger.getLogger(Lecteurs.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_button1ActionPerformed

    private void tcvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcvvActionPerformed

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
            java.util.logging.Logger.getLogger(Sabonner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sabonner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sabonner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sabonner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sabonner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jaipasdecompte;
    private javax.swing.JPanel navbar;
    public static javax.swing.JTextField tcarte;
    private javax.swing.JPasswordField tcvv;
    // End of variables declaration//GEN-END:variables
}
