
package model;

public class Visiteur {
    
    private String nom;
    private String post_nom;
    private String prenom;
    private String numero_telephone;
    private String plaque_immatriculation;
    private String  departement;
    private String but_visite;
    private String date_arrive;
    private String date_de_dapart;
    private String porte_entree;
    private String numero_badge;
    
    // constructeur par defaut

    public Visiteur() {
    }
    
    //constucteur initialisant

    public Visiteur( String nom, String post_nom, String prenom, String numero_telephone, String plaque_immatriculation, String departement, String but_visite, String date_arrive, String date_de_dapart, String porte_entree, String numero_badge) {
      
        this.nom = nom;
        this.post_nom = post_nom;
        this.prenom = prenom;
        this.numero_telephone = numero_telephone;
        this.plaque_immatriculation = plaque_immatriculation;
        this.departement = departement;
        this.but_visite = but_visite;
        this.date_arrive = date_arrive;
        this.date_de_dapart = date_de_dapart;
        this.porte_entree = porte_entree;
        this.numero_badge = numero_badge;
    }
    // getter et setters

   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPost_nom() {
        return post_nom;
    }

    public void setPost_nom(String post_nom) {
        this.post_nom = post_nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumero_telephone() {
        return numero_telephone;
    }

    public void setNumero_telephone(String numero_telephone) {
        this.numero_telephone = numero_telephone;
    }

    public String getPlaque_immatriculation() {
        return plaque_immatriculation;
    }

    public void setPlaque_immatriculation(String plaque_immatriculation) {
        this.plaque_immatriculation = plaque_immatriculation;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getBut_visite() {
        return but_visite;
    }

    public void setBut_visite(String but_visite) {
        this.but_visite = but_visite;
    }

    public String getDate_arrive() {
        return date_arrive;
    }

    public void setDate_arrive(String date_arrive) {
        this.date_arrive = date_arrive;
    }

    public String getDate_de_dapart() {
        return date_de_dapart;
    }

    public void setDate_de_dapart(String date_de_dapart) {
        this.date_de_dapart = date_de_dapart;
    }

    public String getPorte_entree() {
        return porte_entree;
    }

    public void setPorte_entree(String porte_entree) {
        this.porte_entree = porte_entree;
    }

    public String getNumero_badge() {
        return numero_badge;
    }

    public void setNumero_badge(String numero_badge) {
        this.numero_badge = numero_badge;
    }
 
    
}
