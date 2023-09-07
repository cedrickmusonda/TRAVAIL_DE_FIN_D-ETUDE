
package model;
public class Agent  extends Utilisateur{
    private  static String nom;
    private static String post_nom;
    private static String prenom;
    private  static String matricule;
    private static String departement;

    public static String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        Agent.nom = nom;
    }

    public static String getPost_nom() {
        return post_nom;
    }

    public static void setPost_nom(String post_nom) {
        Agent.post_nom = post_nom;
    }

    public static String getPrenom() {
        return prenom;
    }

    public static void setPrenom(String prenom) {
        Agent.prenom = prenom;
    }

    public static String getMatricule() {
        return matricule;
    }

    public static void setMatricule(String matricule) {
        Agent.matricule = matricule;
    }

    public static String getDepartement() {
        return departement;
    }

    // constructeur  par defaut
    public static void setDepartement(String departement) {
        Agent.departement = departement;
    }

    public Agent() {
    }

    
    
    
    }
    
   
    

