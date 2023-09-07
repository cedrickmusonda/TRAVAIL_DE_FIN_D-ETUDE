
package vue;

import controleur.MesMethodes;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


public class Demande_rejeter extends javax.swing.JFrame {
 public void search() {
       TableRowSorter< TableModel> trier = new TableRowSorter<>(tabdemanderejeter.getModel()) ;
     tabdemanderejeter.setRowSorter(trier);
       recherche.getDocument().addDocumentListener(new DocumentListener(){
           @Override
           public void insertUpdate(DocumentEvent e) {
         String str = recherche.getText();
         if ( str.trim().length()==0){
               trier.setRowFilter(null);
               }
         else{
               // rechercher insensible a la casse
               trier.setRowFilter(RowFilter.regexFilter("(?i)"+str));
               
               }
         
           }

           @Override
           public void removeUpdate(DocumentEvent de) {
              String str= recherche.getText();
              if( str.trim().length()==0){
               trier.setRowFilter(null);
               
               }
              else{
               trier.setRowFilter(RowFilter.regexFilter("(?i)"+str));
               }
           }

           @Override
           public void changedUpdate(DocumentEvent de) {
               
           } });
 
 }
  
    public Demande_rejeter() {
        initComponents();
        
        // masquer les fonctionnaliters non autoriser
        if ( Recupere.getNomcat().equals("Agent simple")){
              PaneldemandeRecu.setBackground(new Color(0,10,25));
              demanderecu.setForeground(new Color(0,10,25));
              Panelenvoye.setBackground(new Color(0,10,25));
              demande_envoyer.setForeground(new Color(0,10,25));
}
         tabdemanderejeter.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
       tabdemanderejeter.getTableHeader().setOpaque(false);
       tabdemanderejeter.getTableHeader().setBackground(new Color(0,102,170));
       tabdemanderejeter.getTableHeader().setForeground(new Color(255,255,255 ));
       tabdemanderejeter.setRowHeight(25);
       
       //afficher les demandes rejetter
       MesMethodes methode=new MesMethodes();
        try {
           //afficher les demandes dans le tableau
              ResultSet resulta= methode.Afficherdemandevalide(Recupere.getId_agent(),"Rejetee");
              tabdemanderejeter.setModel(DbUtils.resultSetToTableModel(resulta));   
              //afficher les nombre de demande
               ResultSet result=methode.NombreDemandevalider(Recupere.getId_agent(),"Rejetee");
               while( result.next()){
               nombre.setText(result.getString("nombre"));
            
              }
        } catch (Exception e) 
        {
            
        }
    // appelle de la methode pour rechercher les demandes rejeter    
          search();
      //  afficher l'utilisateur connecter
      utilisateurconnecter.setText(Recupere.getNomutilisateur());
      // afficher le nombre de demandes rejeter
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        recherche = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabdemanderejeter = new javax.swing.JTable();
        utilisateurconnecter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setPreferredSize(new java.awt.Dimension(1193, 693));

        jPanel3.setBackground(new java.awt.Color(0, 10, 25));

        Panelnouvelle.setBackground(new java.awt.Color(0, 10, 35));
        Panelnouvelle.setBorder(null);
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

        Panelrejeter.setBackground(new java.awt.Color(0, 102, 170));

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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PaneldemandeRecu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
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

        jLabel1.setBackground(new java.awt.Color(0, 10, 35));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 10, 35));
        jLabel1.setText("GESTION DE DEMANDE");

        jPanel7.setBackground(new java.awt.Color(0, 102, 170));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 170), new java.awt.Color(0, 102, 170)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Facom");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Exit.setFont(new java.awt.Font("Arial Black", 1, 25)); // NOI18N
        Exit.setForeground(new java.awt.Color(204, 0, 0));
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitMousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/icons8-utilisateur-48.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 10, 35));

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("FRONTIER SA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );

        jPanel4.setBackground(new java.awt.Color(0, 10, 25));

        jPanel5.setBackground(new java.awt.Color(0, 102, 170));

        recherche.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jLabel3.setBackground(new java.awt.Color(0, 102, 170));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/recherch.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recherche)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 170));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        tabdemanderejeter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabdemanderejeter.setForeground(new java.awt.Color(0, 0, 0));
        tabdemanderejeter.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nom du visiteur", "Post-nom du visiteur", "Prénom du visiteur", "Département"
            }
        ));
        tabdemanderejeter.setDoubleBuffered(true);
        tabdemanderejeter.setSelectionBackground(new java.awt.Color(252, 57, 95));
        tabdemanderejeter.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabdemanderejeter);

        utilisateurconnecter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        utilisateurconnecter.setForeground(new java.awt.Color(0, 102, 170));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(244, 244, 244)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(Exit))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(utilisateurconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(utilisateurconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1266, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        PaneldemandeRecu.setBackground(new Color(0,10,35));
        new Demande_envoyer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_demande_envoyerMousePressed

    private void demandesvalideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demandesvalideMousePressed
        Panelvalider.setBackground(new Color(0,102,170));
        Panelmesdemande.setBackground(new Color(0,10,35 ));
        Panelenvoye.setBackground(new Color(0,10,35));
        Panelrejeter.setBackground(new Color(0,10,35));
        Panelnouvelle.setBackground(new Color(0,10,35));
        PaneldemandeRecu.setBackground(new Color(0,10,35));
        new Demande_valider().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_demandesvalideMousePressed

    private void demandesrejeterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demandesrejeterMousePressed
        Panelrejeter.setBackground(new Color(0,102,170));
        Panelmesdemande.setBackground(new Color(0,10,35 ));
        Panelenvoye.setBackground(new Color(0,10,35));
        Panelvalider.setBackground(new Color(0,10,35));
        Panelnouvelle.setBackground(new Color(0,10,35));
        PaneldemandeRecu.setBackground(new Color(0,10,35));
        
    }//GEN-LAST:event_demandesrejeterMousePressed

    private void mesdemandesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesdemandesMousePressed
        Panelmesdemande.setBackground(new Color(0,102,170 ));
        Panelenvoye.setBackground(new Color(0,10,35));
        Panelrejeter.setBackground(new Color(0,10,35));
        Panelvalider.setBackground(new Color(0,10,35));
        Panelnouvelle.setBackground(new Color(0,10,35));
        PaneldemandeRecu.setBackground(new Color(0,10,35));
         new mes_demandes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesdemandesMousePressed

    private void mesdemandesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesdemandesKeyPressed

    }//GEN-LAST:event_mesdemandesKeyPressed

    private void PanelmesdemandeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelmesdemandeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelmesdemandeKeyPressed

    private void ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_ExitMousePressed

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

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Demande_rejeter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demande_rejeter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demande_rejeter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demande_rejeter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demande_rejeter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel PaneldemandeRecu;
    private javax.swing.JPanel Panelenvoye;
    private javax.swing.JPanel Panelmesdemande;
    private javax.swing.JPanel Panelnouvelle;
    private javax.swing.JPanel Panelrejeter;
    private javax.swing.JPanel Panelvalider;
    private javax.swing.JLabel demande_envoyer;
    private javax.swing.JLabel demanderecu;
    private javax.swing.JLabel demandesrejeter;
    private javax.swing.JLabel demandesvalide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesdemandes;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nouvelledemande;
    private javax.swing.JTextField recherche;
    private javax.swing.JTable tabdemanderejeter;
    private javax.swing.JLabel utilisateurconnecter;
    // End of variables declaration//GEN-END:variables
}
