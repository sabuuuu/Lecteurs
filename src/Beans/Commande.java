/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author ASUS
 */
public class Commande {
    String nom,prenom,carte,cvv;
 
    public Commande() {
    }

    public Commande(String nom, String prenom, String carte, String cvv) {
        this.nom = nom;
        this.prenom = prenom;
        this.carte = carte;
        this.cvv = cvv;
    }

    public String getCarte() {
        return carte;
    }

    public void setCarte(String carte) {
        this.carte = carte;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

   
}
