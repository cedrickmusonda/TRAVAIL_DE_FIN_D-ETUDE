
package model;


public class Demande extends Visiteur{
    private int numero_demande;
// constructeur par defaut
    public Demande() {
    }
    public Demande(int numero_demande) {
        this.numero_demande = numero_demande;
    }

    // constructeur initialisant
    public Demande(int numero_demande, String nom, String post_nom, String prenom, String numero_telephone, String plaque_immatriculation, String departement, String but_visite, String date_arrive, String date_de_dapart, String porte_entree, String numero_badge) {  
        super(nom, post_nom, prenom, numero_telephone, plaque_immatriculation, departement, but_visite, date_arrive, date_de_dapart, porte_entree, numero_badge);
        this.numero_demande = numero_demande;
    }

// getters et setter
    public int getNumero_demande() {
        return numero_demande;
    }

    public void setNumero_demande(int numero_demande) {
        this.numero_demande = numero_demande;
    }
    
    
}
