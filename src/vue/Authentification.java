
package vue;

import controleur.MesMethodes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 

public class Authentification extends javax.swing.JFrame {

      MesMethodes methodes = new MesMethodes();
    public Authentification() {
        initComponents();
         } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        motdepasse = new javax.swing.JPasswordField();
        essaie = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 321));
        setMinimumSize(new java.awt.Dimension(650, 321));
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,150));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign In");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User  name");

        username.setBackground(new java.awt.Color(51, 51, 51));
        username.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pass word");

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sign In");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Exit");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pas de compte? Contacter l'admin");

        motdepasse.setBackground(new java.awt.Color(51, 51, 51));
        motdepasse.setForeground(new java.awt.Color(255, 255, 255));
        motdepasse.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        essaie.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        essaie.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(motdepasse)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(essaie, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(essaie, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(motdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(350, 0, 280, 300);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bienvenu et Bon Travail");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 280, 280, 32);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Frontier  SA");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 250, 180, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cedrick\\Desktop\\TFE\\IMAGE\\login.jpg")); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 10, 70, 60);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("F");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 90, 30, 30);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("A");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 120, 20, 20);

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("C");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 140, 20, 20);

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("O");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 160, 21, 20);

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("M");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 180, 24, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cedrick\\Desktop\\TFE\\IMAGE\\acceuil.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 750, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
     
        try{ 
           String  requete ="select c.Nom_utilisateur, c.Mot_de_passe, c.Id_compte,cat.Nom_categorie,c.id_Agent, a.departement from Compte as c inner join Categorie_compte as cat on(c.Id_compte=cat.Id_compte)  inner join Agent  as a on (c.Id_agent=a.Id_agent) where c.Nom_utilisateur=? ;";
           PreparedStatement statement  = methodes.MaConnection().prepareStatement( requete);
           statement.setString(1,username.getText());
           ResultSet resulta=statement.executeQuery();
          
           while( resulta.next()) {
               
               //recuperation de valeur
                  String nomutilisateur= resulta.getString("Nom_utilisateur");
                  String motpasse= resulta.getString("Mot_de_passe");
                  String nomcat=resulta.getString("Nom_categorie");
                  String departement=resulta.getString("departement");
                  int idcompte =resulta.getInt("Id_compte");
                  int idagent=resulta.getInt("Id_Agent");
            
               // verification de champs
               if (motdepasse.getText().isEmpty() & username.getText().isEmpty()){
                   JOptionPane.showMessageDialog(this,"Erreur: remplisez tout les champs " );
               } else{
                           if( motdepasse.getText().equals(motpasse)  & username.getText().equals(nomutilisateur)){
                                Recupere.setIdcompte(idcompte);
                                Recupere.setNomcat(nomcat);
                                Recupere.setNomutilisateur(nomutilisateur);
                                Recupere.setId_agent(idagent);
                                Recupere.setDepartement(departement);
                               // verification du type de compte
                               switch (nomcat) {
                                   case "Agent simple":
                                   case "hr":
                                   case "clinique":
                                       new Gestion_de_demande().setVisible(true);
                                       this.dispose();
                                       break;
                                   case "Manager":
                                       new Gestion_de_demande_manager().setVisible(true);
                                       this.dispose();
                                       break;
                                   case "securite":
                                       new Gestion_demande_securite().setVisible(true);
                                       this.dispose();
                                       break;
                                   case "Accueuil":
                                       new Accueuil().setVisible(true);
                                       this.dispose();
                                       break;
                                   default:
                                       break;
                               }
                                  
                           }else{
                           JOptionPane.showMessageDialog(this,"Erreur: nom utilisateur ou mot de passe incorrect " );
                           }
                           
               }
               
           }
          
     }catch (SQLException e) {
         JOptionPane.showMessageDialog(this,e.getMessage());
      } 
     
        
        
        
        
        
        
    }//GEN-LAST:event_jLabel5MousePressed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(() -> {
            new Authentification().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel essaie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField motdepasse;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
