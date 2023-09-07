
package model;


public class Utilisateur {
    
   private String nom_utilisateur;
   private String mot_de_passe;
   private Categorie_compte cat;
 // constructeur  par defaut
    public Utilisateur() {
    }
    
 // constructeur initialisant

    public Utilisateur(String nom_utilisateur, String mot_de_passe, Categorie_compte cat) {
        this.nom_utilisateur = nom_utilisateur;
        this.mot_de_passe = mot_de_passe;
        this.cat = cat;
    }
// getter et setter 

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public Categorie_compte getCat() {
        return cat;
    }

    public void setCat(Categorie_compte cat) {
        this.cat = cat;
    }
    
    
   
}
