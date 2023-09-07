
package controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Agent;


public class MesMethodes {
    

    // methode de connection à la base de données
    public  Connection MaConnection(){
    Connection connection=null;
      try {
          
         String url = "jdbc:sqlserver://192.168.0.100:1433;databaseName=FrontierVisiteurs;encrypt=true;trustServerCertificate=true;";
         String user = "cd";
         String password ="scott";
          connection = DriverManager.getConnection(url, user, password);
             
    } catch (SQLException e) {
        e.getMessage();
      } 
     return  connection;
    
  }
    
    // methodes pour recuperer les demandes de l'utilisateur connecter
    public ResultSet Afficherlesdemandes( int idagent) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select Nom,Post_nom,Prenom,Departement,Etat_manager from Demande where Id_Agent= ?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setInt(1,idagent); 
           resulta=statement.executeQuery();
         
    return resulta;
    }
  
   // methodes qui compte le nombre de demandes
   
    public ResultSet NombreDemandes( int idagent) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select count(*) as nombre from Demande where Id_Agent= ?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setInt(1,idagent); 
           resulta=statement.executeQuery();
         
    return resulta;
    }
    
    
    // methodes rechercher de demande  valider
     public ResultSet Afficherdemandevalide( int idagent,String etat) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select Nom,Post_nom,Prenom,Departement,Etat_manager from Demande where Id_Agent= ? and Etat_manager=?";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setInt(1,idagent); 
           statement.setString(2,etat);
           resulta=statement.executeQuery();
         
    return resulta;
    }
  // methode nombre demande valider
     public ResultSet NombreDemandevalider( int idagent, String etat) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select count(*) as nombre from Demande where Id_Agent= ? AND Etat_manager=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setInt(1,idagent); 
           statement.setString(2,etat);
           resulta=statement.executeQuery();
         
    return resulta;
     }
     
     // afficher les demandes rejeter
    
     public ResultSet Afficherdemanderejeter( int idagent,String etat) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select Nom,Post_nom,Prenom,Departement,Etat_manager from Demande where Id_Agent= ? and Etat_manager=?";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setInt(1,idagent); 
           statement.setString(2,etat);
           resulta=statement.executeQuery();
         
    return resulta;}
     //afficher les nombre de demande rejeter
     public ResultSet NombreDemanderejeter( int idagent, String etat) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select count(*) as nombre from Demande where Id_Agent= ? AND Etat_manager=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setInt(1,idagent); 
           statement.setString(2,etat);
           resulta=statement.executeQuery();
         
    return resulta;
     }
     
   // methode de selection de toutes les demandes
     public ResultSet AfficherDemandeManager( String departement) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select Nom,Post_nom,Prenom,Departement,Etat_manager from Demande where Departement=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,departement);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
  //selectioner le nombre de demades 
      public ResultSet SelectionnerNombreDemandeManager( String departement) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select count(*) as nombre from Demande where Departement=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,departement);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
      
// traiter la demande par le manager
       public void TraiterDemande(String etat,String departement,String Nom,String Post_nom,String Prenom) throws SQLException{
    
     
           String  requete ="update Demande set Etat_manager=? where Departement=? and Nom=? and Post_nom=? and Prenom=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,etat);
           statement.setString(2,departement);
           statement.setString(3,Nom);
            statement.setString(4,Post_nom);
             statement.setString(5,Prenom);
          
           statement.executeUpdate();
           statement.close();
   
     }
       
       // afficher les demandes valider
       public ResultSet  DemandeManagerValideretRejetter( String departement,String etat) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select Nom,Post_nom,Prenom,Departement,Etat_manager from Demande where Departement=? and Etat_manager=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,departement);
           statement.setString(2,etat);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
       // afficher nombre demande validee manager
       public ResultSet NombredemandevaliderManager( String departement,String etat) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select count(*) as nombre from [FrontierVisiteurs].[dbo].[Demande] where Departement=? and Etat_manager=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,departement);
           statement.setString(2,etat);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
      // afficher demande securité
          public ResultSet AfficherDemandeSecurite( String etat) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select Nom,Post_nom,Prenom,Departement,Etat_manager ,Etat_securite from Demande where Etat_manager=? ;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1, etat);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
      
     // afficher nombre demande securite
          public ResultSet SelectionnerNombreDemandesecurite( String etat) throws SQLException{
          ResultSet resulta=null;
     
           String  requete ="select count(*) as nombre from Demande where Etat_manager=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,etat);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
// verifier la liste noire
          public ResultSet VerifierLIsteNoire( String nom,String postnom,String prenom,String departement) throws SQLException{
          ResultSet resulta=null;
     
           String  requete ="select * from ListeNoire where Nom=? and Postnom=? and Prenom=? and Departement=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,nom);
           statement.setString(2,postnom);
           statement.setString(3,prenom);
           statement.setString(4,departement);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
   // traiter demande securité
        public void TraiterDemandeSecurite(String etat,String Nom,String Post_nom, String Prenom,String departement) throws SQLException{
    
     
           String  requete ="update Demande set Etat_securite=? where  Nom=? and Post_nom=? and Prenom=? and Departement=? ;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,etat); 
           statement.setString(2,Nom);
           statement.setString(3,Post_nom);
           statement.setString(4,Prenom);
           statement.setString(5,departement);
           statement.executeUpdate();
           statement.close();
   
     }
     // afficher demande securite valider
        public ResultSet AfficherDemandeSecuriteValider( String etat) throws SQLException{
        ResultSet resulta=null;
     
           String  requete ="select Nom,Post_nom,Prenom,Departement,Etat_securite from Demande where Etat_securite=? ;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1, etat);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
      
    // afficher demande securité rejeter
          public ResultSet AfficherDemandeSecuriteRejeter( String etat) throws SQLException{
      ResultSet resulta=null;
     
           String  requete ="select Nom,Post_nom,Prenom,Departement,Etat_securite from Demande where Etat_securite=? ;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1, etat);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
          // afficher nombre de demande rejeter et valider
          public ResultSet SelectionnerNombreDemandesecuriteVetR( String etat) throws SQLException{
          ResultSet resulta=null;
     
           String  requete ="select count(*) as nombre from Demande where Etat_securite=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,etat);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
          
          // selectionner les demandes valider par la securité
            public ResultSet Selectionnerdemandevalideracceuil( String etat) throws SQLException{
          ResultSet resulta=null;
     
           String  requete ="select Nom,Post_nom,Prenom,Departement,Etat_securite,Port_entree from Demande where Etat_securite=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,etat);
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
       // selectionner les demandes à envoyer
            public ResultSet Selectionnerdemandeacceuil( String etat,Agent agent) throws SQLException{
          ResultSet resulta=null;
     
           String  requete ="select *  from Demande where Etat_securite=? and Nom=? and Post_nom=? and Prenom=? and Departement=?;";
           PreparedStatement statement  =MaConnection().prepareStatement( requete);
           statement.setString(1,etat);
           statement.setString(2,agent.getNom());
           statement.setString(3,agent.getPost_nom());
            statement.setString(4,agent.getPrenom());
            statement.setString(5,agent.getDepartement());
          
           resulta=statement.executeQuery();
         
    return resulta;
     }
}
