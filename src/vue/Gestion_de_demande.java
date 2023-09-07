
package vue;

import controleur.MesMethodes;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Gestion_de_demande extends javax.swing.JFrame {

    MesMethodes methodes = new MesMethodes();
    public Gestion_de_demande() {
        initComponents();
        // masquer les panel
        if ( Recupere.getNomcat().equals("Agent simple")){
       PaneldemandeRecu.setBackground(new Color(0,10,25));
       demanderecu.setForeground(new Color(0,10,25));
       Panelenvoye.setBackground(new Color(0,10,25));
      demande_envoyer.setForeground(new Color(0,10,25));
}
        
        // afficher l'utilisateur connecter
        utilisateur.setText(Recupere.getNomutilisateur());
       // la mise  en forme du tableau
       Annulerdemande.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
       Annulerdemande.getTableHeader().setOpaque(false);
       Annulerdemande.getTableHeader().setBackground(new Color(0,102,170));
       Annulerdemande.getTableHeader().setForeground(new Color(255,255,255 ));
       Annulerdemande.setRowHeight(22);
      
       // afficher les element dans le choice
        try{ 
           String  requete ="select * from Departement;";
           PreparedStatement statement  = methodes.MaConnection().prepareStatement( requete);
           ResultSet resulta=statement.executeQuery();
          
           while( resulta.next()) {
               
               //recuperation de valeur
                String lesdepartement;
                lesdepartement=resulta.getString("Nomdepartement");
                // ajout des departement dans le choice
                departement.add(lesdepartement);
            }
           
          
     }catch (SQLException e) {
         JOptionPane.showMessageDialog(this,e.getMessage());
      } 
        
       
        
     
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        postnom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        but = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        plaque = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        datedepart = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        datearrive = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        porte = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        departement = new java.awt.Choice();
        jPanel3 = new javax.swing.JPanel();
        Panelnouvelle = new javax.swing.JPanel();
        nouvelledemande = new javax.swing.JLabel();
        Panelenvoye = new javax.swing.JPanel();
        demande_envoyer = new javax.swing.JLabel();
        Panelvalider = new javax.swing.JPanel();
        demandesvalide = new javax.swing.JLabel();
        Panelrejeter = new javax.swing.JPanel();
        demandesrejeter = new javax.swing.JLabel();
        Panelmesdemande = new javax.swing.JPanel();
        mesdemandes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PaneldemandeRecu = new javax.swing.JPanel();
        demanderecu = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Annulerdemande = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Annuler = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Envoyer = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        utilisateur = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(1273, 632));

        jPanel2.setBackground(new java.awt.Color(0, 10, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entrez les informations du visiteur");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom :");

        prenom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prenom.setForeground(new java.awt.Color(0, 102, 170));
        prenom.setToolTipText("");
        prenom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Post-nom :");

        nom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nom.setForeground(new java.awt.Color(0, 102, 170));
        nom.setToolTipText("");
        nom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Plaque d'immatriculation :");

        postnom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        postnom.setForeground(new java.awt.Color(0, 102, 170));
        postnom.setToolTipText("");
        postnom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prenom :");

        but.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        but.setForeground(new java.awt.Color(0, 102, 170));
        but.setToolTipText("");
        but.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("But de la visite :");

        plaque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        plaque.setForeground(new java.awt.Color(0, 102, 170));
        plaque.setToolTipText("");
        plaque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Porte d'entrée :");

        datedepart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        datedepart.setForeground(new java.awt.Color(0, 102, 170));
        datedepart.setToolTipText("");
        datedepart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Num telephone :");

        num.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        num.setForeground(new java.awt.Color(0, 102, 170));
        num.setToolTipText("");
        num.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date d'arrivée :");

        datearrive.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        datearrive.setForeground(new java.awt.Color(0, 102, 170));
        datearrive.setToolTipText("");
        datearrive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date depart :");

        porte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        porte.setForeground(new java.awt.Color(0, 102, 170));
        porte.setToolTipText("");
        porte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Departement :");

        departement.setBackground(new java.awt.Color(0, 102, 170));
        departement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(plaque, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(but, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(postnom, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(datearrive, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(datedepart, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(porte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(departement, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(131, 131, 131))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datearrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datedepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(but, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 10, 25));

        Panelnouvelle.setBackground(new java.awt.Color(0, 102, 170));
        Panelnouvelle.setBorder(null);
        Panelnouvelle.setForeground(new java.awt.Color(0, 102, 170));
        Panelnouvelle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PanelnouvelleKeyPressed(evt);
            }
        });

        nouvelledemande.setBackground(new java.awt.Color(255, 255, 255));
        nouvelledemande.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nouvelledemande.setForeground(new java.awt.Color(255, 255, 255));
        nouvelledemande.setText("Nouvelle démande");
        nouvelledemande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nouvelledemandeMousePressed(evt);
            }
        });
        nouvelledemande.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nouvelledemandeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PanelnouvelleLayout = new javax.swing.GroupLayout(Panelnouvelle);
        Panelnouvelle.setLayout(PanelnouvelleLayout);
        PanelnouvelleLayout.setHorizontalGroup(
            PanelnouvelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelnouvelleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nouvelledemande)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelnouvelleLayout.setVerticalGroup(
            PanelnouvelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelnouvelleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nouvelledemande)
                .addContainerGap())
        );

        Panelenvoye.setBackground(new java.awt.Color(0, 10, 35));
        Panelenvoye.setBorder(null);

        demande_envoyer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        demande_envoyer.setForeground(new java.awt.Color(255, 255, 255));
        demande_envoyer.setText("Demandes envoyées");
        demande_envoyer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                demande_envoyerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelenvoyeLayout = new javax.swing.GroupLayout(Panelenvoye);
        Panelenvoye.setLayout(PanelenvoyeLayout);
        PanelenvoyeLayout.setHorizontalGroup(
            PanelenvoyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelenvoyeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demande_envoyer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelenvoyeLayout.setVerticalGroup(
            PanelenvoyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelenvoyeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demande_envoyer)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        Panelvalider.setBackground(new java.awt.Color(0, 10, 35));

        demandesvalide.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        demandesvalide.setForeground(new java.awt.Color(255, 255, 255));
        demandesvalide.setText("Demandes Validées");
        demandesvalide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                demandesvalideMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelvaliderLayout = new javax.swing.GroupLayout(Panelvalider);
        Panelvalider.setLayout(PanelvaliderLayout);
        PanelvaliderLayout.setHorizontalGroup(
            PanelvaliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelvaliderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demandesvalide)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelvaliderLayout.setVerticalGroup(
            PanelvaliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelvaliderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demandesvalide)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        Panelrejeter.setBackground(new java.awt.Color(0, 10, 35));

        demandesrejeter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        demandesrejeter.setForeground(new java.awt.Color(255, 255, 255));
        demandesrejeter.setText("Demandes Rejetées");
        demandesrejeter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                demandesrejeterMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelrejeterLayout = new javax.swing.GroupLayout(Panelrejeter);
        Panelrejeter.setLayout(PanelrejeterLayout);
        PanelrejeterLayout.setHorizontalGroup(
            PanelrejeterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelrejeterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demandesrejeter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelrejeterLayout.setVerticalGroup(
            PanelrejeterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelrejeterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(demandesrejeter)
                .addGap(14, 14, 14))
        );

        Panelmesdemande.setBackground(new java.awt.Color(0, 10, 35));
        Panelmesdemande.setToolTipText("");
        Panelmesdemande.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PanelmesdemandeKeyPressed(evt);
            }
        });

        mesdemandes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mesdemandes.setForeground(new java.awt.Color(255, 255, 255));
        mesdemandes.setText("Mes demandes");
        mesdemandes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mesdemandesMousePressed(evt);
            }
        });
        mesdemandes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mesdemandesKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PanelmesdemandeLayout = new javax.swing.GroupLayout(Panelmesdemande);
        Panelmesdemande.setLayout(PanelmesdemandeLayout);
        PanelmesdemandeLayout.setHorizontalGroup(
            PanelmesdemandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelmesdemandeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mesdemandes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelmesdemandeLayout.setVerticalGroup(
            PanelmesdemandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelmesdemandeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mesdemandes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Facom");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/icons8-utilisateur55.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Se deconnecter");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        PaneldemandeRecu.setBackground(new java.awt.Color(0, 10, 35));

        demanderecu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        demanderecu.setForeground(new java.awt.Color(255, 255, 255));
        demanderecu.setText("Démandes réçues");
        demanderecu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                demanderecuMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PaneldemandeRecuLayout = new javax.swing.GroupLayout(PaneldemandeRecu);
        PaneldemandeRecu.setLayout(PaneldemandeRecuLayout);
        PaneldemandeRecuLayout.setHorizontalGroup(
            PaneldemandeRecuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldemandeRecuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demanderecu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaneldemandeRecuLayout.setVerticalGroup(
            PaneldemandeRecuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldemandeRecuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demanderecu)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panelvalider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panelrejeter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panelmesdemande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addComponent(Panelnouvelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panelenvoye, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaneldemandeRecu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Panelnouvelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panelmesdemande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panelvalider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panelrejeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PaneldemandeRecu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panelenvoye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(26, 26, 26))))
        );

        Exit.setFont(new java.awt.Font("Arial Black", 1, 25)); // NOI18N
        Exit.setForeground(new java.awt.Color(204, 0, 0));
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitMousePressed(evt);
            }
        });

        Annulerdemande.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nom", "Post-nom", " Prénom", " Département"
            }
        ));
        Annulerdemande.setSelectionBackground(new java.awt.Color(252, 57, 95));
        jScrollPane1.setViewportView(Annulerdemande);

        jLabel13.setBackground(new java.awt.Color(0, 10, 35));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 10, 35));
        jLabel13.setText("GESTION DE DEMANDE");

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 170), new java.awt.Color(0, 102, 170)));
        jPanel7.setForeground(new java.awt.Color(153, 0, 0));

        Annuler.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Annuler.setForeground(new java.awt.Color(255, 255, 255));
        Annuler.setText("Annuler");
        Annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AnnulerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Annuler)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Annuler)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 170));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 170), new java.awt.Color(0, 102, 170)));

        Envoyer.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Envoyer.setForeground(new java.awt.Color(255, 255, 255));
        Envoyer.setText("Envoyer");
        Envoyer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnvoyerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Envoyer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Envoyer)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 10, 25));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("FRONTIER SA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/icons8-utilisateur-48.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(0, 10, 25));

        jPanel6.setBackground(new java.awt.Color(0, 102, 170));

        jLabel20.setBackground(new java.awt.Color(0, 102, 170));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/recherch.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1261, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        utilisateur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        utilisateur.setForeground(new java.awt.Color(0, 102, 170));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(255, 255, 255)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(40, 40, 40)
                        .addComponent(Exit)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1294, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nouvelledemandeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouvelledemandeMousePressed
        Panelnouvelle.setBackground(new Color(0,102,170 ));
        Panelenvoye.setBackground(new Color(0,10,35));
        Panelrejeter.setBackground(new Color(0,10,35));
        Panelvalider.setBackground(new Color(0,10,35));
        Panelmesdemande.setBackground(new Color(0,10,35));
        new Gestion_de_demande().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nouvelledemandeMousePressed

    private void nouvelledemandeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nouvelledemandeKeyPressed

    }//GEN-LAST:event_nouvelledemandeKeyPressed

    private void PanelnouvelleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelnouvelleKeyPressed

    }//GEN-LAST:event_PanelnouvelleKeyPressed

    private void demande_envoyerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demande_envoyerMousePressed
        Panelenvoye.setBackground(new Color(0,102,170));
        Panelmesdemande.setBackground(new Color(0,10,35 ));
        Panelrejeter.setBackground(new Color(0,10,35));
        Panelvalider.setBackground(new Color(0,10,35));
        Panelnouvelle.setBackground(new Color(0,10,35));
        new Demande_envoyer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_demande_envoyerMousePressed

    private void demandesvalideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demandesvalideMousePressed
        Panelvalider.setBackground(new Color(0,102,170));
        Panelmesdemande.setBackground(new Color(0,10,35 ));
        Panelenvoye.setBackground(new Color(0,10,35));
        Panelrejeter.setBackground(new Color(0,10,35));
        Panelnouvelle.setBackground(new Color(0,10,35));
        new Demande_valider().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_demandesvalideMousePressed

    private void demandesrejeterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demandesrejeterMousePressed
        Panelrejeter.setBackground(new Color(0,102,170));
        Panelmesdemande.setBackground(new Color(0,10,35 ));
        Panelenvoye.setBackground(new Color(0,10,35));
        Panelvalider.setBackground(new Color(0,10,35));
        Panelnouvelle.setBackground(new Color(0,10,35));
        new Demande_rejeter().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_demandesrejeterMousePressed

    private void mesdemandesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesdemandesMousePressed
        Panelmesdemande.setBackground(new Color(0,102,170 ));
        Panelenvoye.setBackground(new Color(0,10,35));
        Panelrejeter.setBackground(new Color(0,10,35));
        Panelvalider.setBackground(new Color(0,10,35));
        Panelnouvelle.setBackground(new Color(0,10,35));
        new mes_demandes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesdemandesMousePressed

    private void mesdemandesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesdemandesKeyPressed

    }//GEN-LAST:event_mesdemandesKeyPressed

    private void PanelmesdemandeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelmesdemandeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelmesdemandeKeyPressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        new Authentification().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MousePressed

    private void demanderecuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demanderecuMousePressed
        PaneldemandeRecu.setBackground(new Color(0,102,170));
        Panelmesdemande.setBackground(new Color(0,10,35 ));
        Panelenvoye.setBackground(new Color(0,10,35));
        Panelvalider.setBackground(new Color(0,10,35));
        Panelnouvelle.setBackground(new Color(0,10,35));
        Panelrejeter.setBackground(new Color(0,10,35));
        new DemandeRecu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_demanderecuMousePressed

    private void ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_ExitMousePressed
   // bouton envoyer
    private void EnvoyerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnvoyerMousePressed
        try{ 
           String  requet =" insert into Demande(Nom,Post_nom,Prenom,Num_telephone,Plaque_immatriculation,Departement,but_visite,date_arriver,date_depart,Port_entree,Etat_manager,Etat_securite,Etat_hr,Etat_clinique,Id_agent) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
           PreparedStatement state = methodes.MaConnection().prepareStatement( requet);
           state.setString(1,nom.getText());
           state.setString(2,postnom.getText());
           state.setString(3,prenom.getText());
           state.setString(4,num.getText());
           state.setString(5,plaque.getText());
           state.setString(6,departement.getSelectedItem());
           state.setString(7,but.getText());
           state.setString(8, datearrive.getText());
           state.setString(9,datedepart.getText());
           state.setString(10,porte.getText());
           state.setString(11,"Nom validee");
           state.setString(12,"Nom validee");
           state.setString(13,"Nom traitee");
           state.setString(14,"Nom traitee");
           state.setInt(15,Recupere.getId_agent());
           state.executeUpdate();
           state.close();  
           JOptionPane.showMessageDialog(this,"Envoyer avec succès");
           //remise de champs vide
           nom.setText("");
           postnom.setText("");
           prenom.setText("");
           num.setText("");
           plaque.setText("");
           but.setText("");
           datearrive.setText("");
           datedepart.setText("");
           porte.setText("");
           
           
           
     }catch (SQLException e) {
         JOptionPane.showMessageDialog(this,e.getMessage());
      } 
     
    }//GEN-LAST:event_EnvoyerMousePressed

    private void AnnulerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnulerMousePressed
           
        //remise de valeur a zero
           nom.setText("");
           postnom.setText("");
           prenom.setText("");
           num.setText("");
           plaque.setText("");
           but.setText("");
           datearrive.setText("");
           datedepart.setText("");
           porte.setText("");
    }//GEN-LAST:event_AnnulerMousePressed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_de_demande().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Annuler;
    private javax.swing.JTable Annulerdemande;
    private javax.swing.JLabel Envoyer;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel PaneldemandeRecu;
    private javax.swing.JPanel Panelenvoye;
    private javax.swing.JPanel Panelmesdemande;
    private javax.swing.JPanel Panelnouvelle;
    private javax.swing.JPanel Panelrejeter;
    private javax.swing.JPanel Panelvalider;
    private javax.swing.JTextField but;
    private javax.swing.JTextField datearrive;
    private javax.swing.JTextField datedepart;
    private javax.swing.JLabel demande_envoyer;
    private javax.swing.JLabel demanderecu;
    private javax.swing.JLabel demandesrejeter;
    private javax.swing.JLabel demandesvalide;
    private java.awt.Choice departement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JLabel mesdemandes;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel nouvelledemande;
    private javax.swing.JTextField num;
    private javax.swing.JTextField plaque;
    private javax.swing.JTextField porte;
    private javax.swing.JTextField postnom;
    private javax.swing.JTextField prenom;
    private javax.swing.JLabel utilisateur;
    // End of variables declaration//GEN-END:variables
}
