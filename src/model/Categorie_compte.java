
package model;


public class Categorie_compte {
     private String categorie;
     private int id_compte;
// constructeur par defaut
    public Categorie_compte() {
    }
    
  // constructeur initialisant

    public Categorie_compte(String categorie, int id_compte) {
        this.categorie = categorie;
        this.id_compte = id_compte;
    }
  // getter et setter

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getId_compte() {
        return id_compte;
    }

    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }
    
     
}
