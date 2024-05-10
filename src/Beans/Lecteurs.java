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
public class Lecteurs {
 private String nom, prenom,adress,mail,mdp;
 private int carte,idl;
     public Lecteurs() {
    }
     public Lecteurs(int id,String n,String  p,String a,String email, String psw,int c) {
        this.idl= id;
        this.nom = n;
        this.prenom = p;
        this.adress = a;
        this.mail = email;
        this.mdp = psw;
        this.carte = c;
    }

    public int getIdl() {
        return idl;
    }

    public void setIdl(int idl) {
        this.idl = idl;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getCarte() {
        return carte;
    }

    public void setCarte(int carte) {
        this.carte = carte;
    }
    
}
