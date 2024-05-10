package Vue;

import Beans.Lecteurs;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Beans.*;
import Models.*;
import static Vue.Sabonner.tcarte;
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
 * @author ASUS
 */
public class Abonne extends javax.swing.JFrame {

    Connexion c = new Connexion();
    Statement st;
    PreparedStatement ps;

    DefaultTableModel dtm = new DefaultTableModel();
    DefaultTableModel dt = new DefaultTableModel();
    DefaultTableModel dm = new DefaultTableModel();
    public ResultSet rs;

    /**
     * Creates new form Abonne
     */
    public Abonne() {
        initComponents();
        ConnectionLecteurScientifique cp = new ConnectionLecteurScientifique();
        ConnexionLecteurSportive ce = new ConnexionLecteurSportive();
        ConnectionLecteuPolitique cs = new ConnectionLecteuPolitique();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Scientifique-------------------------------------------------------------------------------------------
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        try {
            ps = c.getCo().prepareStatement("SELECT datePublication, format, titre, site, prix FROM revue where genre='scientifique'");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Panier.class.getName()).log(Level.SEVERE, null, ex);
        }

        dtm.addColumn("Date Publication");
        dtm.addColumn("Format");
        dtm.addColumn("Titre");
        dtm.addColumn("Site");
        dtm.addColumn("Prix");
        try {
            while (cp.rs.next()) {
                dtm.addRow(new Object[]{cp.rs.getString("datePublication"), cp.rs.getString("format"), cp.rs.getString("titre"), cp.rs.getString("site"), cp.rs.getFloat("prix")});

            }
            tscientifique.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(Panier.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Politique-------------------------------------------------------------------------------
        dt.setColumnCount(0);
        dt.setRowCount(0);
        try {
            ps = c.getCo().prepareStatement("SELECT datePublication, format, titre, site, prix FROM revue where genre='politique'");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Panier.class.getName()).log(Level.SEVERE, null, ex);
        }

        dt.addColumn("Date Publication");
        dt.addColumn("Format");
        dt.addColumn("Titre");
        dt.addColumn("Site");
        dt.addColumn("Prix");

        try {
            while (cs.rs.next()) {
                dt.addRow(new Object[]{cs.rs.getString("datePublication"), cs.rs.getString("format"), cs.rs.getString("titre"), cs.rs.getString("site"), cs.rs.getFloat("prix")});

            }
            tpolitique.setModel(dt);
        } catch (SQLException ex) {
            Logger.getLogger(Panier.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Sportive-------------------------------------------------------------------------------------------
        dm.setColumnCount(0);
        dm.setRowCount(0);
        try {
            ps = c.getCo().prepareStatement("SELECT datePublication, format, titre, site, prix FROM revue where genre='sportive'");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Panier.class.getName()).log(Level.SEVERE, null, ex);
        }

        dm.addColumn("Date Publication");
        dm.addColumn("Format");
        dm.addColumn("Titre");
        dm.addColumn("Site");
        dm.addColumn("Prix");

        try {
            while (ce.rs.next()) {
                dm.addRow(new Object[]{ce.rs.getString("datePublication"), ce.rs.getString("format"), ce.rs.getString("titre"), ce.rs.getString("site"), ce.rs.getFloat("prix")});

            }
            tsportive.setModel(dm);
        } catch (SQLException ex) {
            Logger.getLogger(Panier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void validerScientifique(int ligne) {
        int choice = JOptionPane.showConfirmDialog(null, "Voulez-vous Commander cette article?", "Commande", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            try {
                ps = c.getCo().prepareStatement("INSERT INTO panierAbonne(nomrevue,prix)VALUES(?,?)");
                ps.setString(1, tscientifique.getValueAt(ligne, 2) + "");
                ps.setString(2, tscientifique.getValueAt(ligne, 4) + "");

                ps.execute(); // ou executeupdate()

            } catch (SQLException ex) {
                Logger.getLogger(Lecteur.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

        }
    }

    public void validerpolitique(int ligne) {
        int choice = JOptionPane.showConfirmDialog(null, "Voulez-vous Commander cette article?", "Commande", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            try {
                ps = c.getCo().prepareStatement("INSERT INTO panierAbonne(nomrevue,prix)VALUES(?,?)");
                ps.setString(1, tpolitique.getValueAt(ligne, 2) + "");
                ps.setFloat(2, Float.parseFloat(tpolitique.getValueAt(ligne, 4) + ""));

                ps.execute(); // ou executeupdate()

            } catch (SQLException ex) {
                Logger.getLogger(Lecteur.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

        }
    }

    public void validerSportive(int ligne) {
        int choice = JOptionPane.showConfirmDialog(null, "Voulez-vous Commander cette article?", "Commande", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            try {
                ps = c.getCo().prepareStatement("INSERT INTO panierAbonne(nomrevue,prix)VALUES(?,?)");
                ps.setString(1, tsportive.getValueAt(ligne, 2) + "");
                ps.setString(2, tsportive.getValueAt(ligne, 4) + "");

                ps.execute(); //executeupdate()

            } catch (SQLException ex) {
                Logger.getLogger(Lecteur.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LOGO = new javax.swing.JLabel();
        bcommande = new javax.swing.JButton();
        bdesabonne = new javax.swing.JButton();
        navbar = new javax.swing.JLabel();
        llisterevue = new javax.swing.JLabel();
        pscientifique = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tscientifique = new javax.swing.JTable();
        ppolitique = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpolitique = new javax.swing.JTable();
        psportive = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tsportive = new javax.swing.JTable();
        deconnection = new javax.swing.JButton();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-vertmin.png"))); // NOI18N
        getContentPane().add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 100, 60));

        bcommande.setBackground(new java.awt.Color(69, 98, 78));
        bcommande.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bcommande.setForeground(new java.awt.Color(216, 191, 159));
        bcommande.setText("Panier");
        bcommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcommandeActionPerformed(evt);
            }
        });
        getContentPane().add(bcommande, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 110, 30));

        bdesabonne.setBackground(new java.awt.Color(69, 98, 78));
        bdesabonne.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bdesabonne.setForeground(new java.awt.Color(216, 191, 159));
        bdesabonne.setText("Désabonner");
        bdesabonne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdesabonneActionPerformed(evt);
            }
        });
        getContentPane().add(bdesabonne, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 110, 30));

        navbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fond bege navbar.png"))); // NOI18N
        getContentPane().add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 60));

        llisterevue.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        llisterevue.setForeground(new java.awt.Color(240, 240, 240));
        llisterevue.setText("Listes De  Revues :");
        getContentPane().add(llisterevue, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        pscientifique.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scientifique :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        pscientifique.setForeground(new java.awt.Color(255, 255, 255));
        pscientifique.setOpaque(false);
        pscientifique.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tscientifique.setBackground(new java.awt.Color(216, 191, 159));
        tscientifique.setForeground(new java.awt.Color(255, 255, 255));
        tscientifique.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tscientifique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tscientifiqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tscientifique);

        pscientifique.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 860, 100));

        getContentPane().add(pscientifique, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 900, 150));

        ppolitique.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Politique :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        ppolitique.setOpaque(false);
        ppolitique.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tpolitique.setBackground(new java.awt.Color(216, 191, 159));
        tpolitique.setForeground(new java.awt.Color(255, 255, 255));
        tpolitique.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tpolitique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpolitiqueMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tpolitique);

        ppolitique.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 860, 110));

        getContentPane().add(ppolitique, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 900, 170));

        psportive.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sportive :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        psportive.setOpaque(false);
        psportive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tsportive.setBackground(new java.awt.Color(216, 191, 159));
        tsportive.setForeground(new java.awt.Color(255, 255, 255));
        tsportive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tsportive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tsportiveMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tsportive);

        psportive.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 860, 110));

        getContentPane().add(psportive, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 900, 150));

        deconnection.setBackground(new java.awt.Color(69, 98, 78));
        deconnection.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deconnection.setForeground(new java.awt.Color(216, 191, 159));
        deconnection.setText("Se deconnecter");
        deconnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnectionActionPerformed(evt);
            }
        });
        getContentPane().add(deconnection, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 643, -1, 30));

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Font verte.png"))); // NOI18N
        getContentPane().add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bdesabonneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdesabonneActionPerformed

        Lecteurs lec = new Lecteurs();
        try {
            st = c.getCo().createStatement();
            st.executeUpdate("UPDATE lecteur SET abonne = 0 WHERE email = '" + MC.temail.getText() + "'");

            JOptionPane.showMessageDialog(this, "Vous êtes desabonné ");
            Lecteur l = new Lecteur();
            l.setVisible(true);
            l.pack();
            l.setLocationRelativeTo(null);
            this.dispose();
            //actualiser();
            //reinistialiser();
        } catch (SQLException ex) {
            Logger.getLogger(Lecteurs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bdesabonneActionPerformed

    private void deconnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnectionActionPerformed
        this.setVisible(false);
        MC login = new MC();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_deconnectionActionPerformed

    private void tscientifiqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tscientifiqueMouseClicked
        validerScientifique(tscientifique.getSelectedRow());
    }//GEN-LAST:event_tscientifiqueMouseClicked

    private void bcommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcommandeActionPerformed
        this.setVisible(false);
        PanierAbonne p1 = new PanierAbonne();
        p1.setVisible(true);
        p1.pack();
        p1.setLocationRelativeTo(null);
    }//GEN-LAST:event_bcommandeActionPerformed

    private void tpolitiqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpolitiqueMouseClicked
        validerpolitique(tpolitique.getSelectedRow());
    }//GEN-LAST:event_tpolitiqueMouseClicked

    private void tsportiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tsportiveMouseClicked
        validerSportive(tsportive.getSelectedRow());
    }//GEN-LAST:event_tsportiveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton bcommande;
    private javax.swing.JButton bdesabonne;
    private javax.swing.JButton deconnection;
    private javax.swing.JLabel fond;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel llisterevue;
    private javax.swing.JLabel navbar;
    private javax.swing.JPanel ppolitique;
    private javax.swing.JPanel pscientifique;
    private javax.swing.JPanel psportive;
    private javax.swing.JTable tpolitique;
    private javax.swing.JTable tscientifique;
    private javax.swing.JTable tsportive;
    // End of variables declaration//GEN-END:variables
}
