/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chaker
 */
public class Etudiantdata {
    private int cin ;
    private String nom ;
    private String prenom ;
    private String adresse_mail ;
    private String telephone ;
    private String genre ;
    private String date_naissance ;
    private String niveaux ;


public Etudiantdata(int cin,String nom,String prenom,String adresse_mail,String telephone,String genre,String date_naissance,String niveaux){
 this.cin=cin ;
 this.nom=nom;
 this.prenom=prenom;
 this.adresse_mail=adresse_mail;
 this.telephone=telephone;
 this.genre=genre ;
 this.date_naissance=date_naissance;
 this.niveaux=niveaux;

}

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
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

    public String getAdresse_mail() {
        return adresse_mail;
    }

    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getNiveaux() {
        return niveaux;
    }

    public void setNiveaux(String niveaux) {
        this.niveaux = niveaux;
    }


}