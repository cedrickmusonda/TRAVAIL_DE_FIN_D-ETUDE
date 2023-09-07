
package vue;

import controleur.MesMethodes;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;



public class Gestion_demande_securite extends javax.swing.JFrame {
    // declaration de variable
         String nom=null;
         String post_nom=null;
         String prenom=null;
         String departement=null;
     public void search() {
       TableRowSorter< TableModel> trier = new TableRowSorter<>( tableau.getModel()) ;
      tableau.setRowSorter(trier);
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


   
    public Gestion_demande_securite() {
        initComponents();
        
        MesMethodes methode=new MesMethodes();
       tableau.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
       tableau.getTableHeader().setOpaque(false);
       tableau.getTableHeader().setBackground(new Color(0,102,170));
       tableau.getTableHeader().setForeground(new Color(255,255,255 ));
       tableau.setRowHeight(22);
       //afficher l'utilisateur connecter
       userconnecter.setText(Recupere.getNomutilisateur());
       // afficher le demande
        try {
            ResultSet resulta= methode.AfficherDemandeSecurite("Validee");
            ResultSet result=methode.SelectionnerNombreDemandesecurite("Validee");
             tableau.setModel(DbUtils.resultSetToTableModel(resulta));   
           while(result.next()){
               nombre.setText(result.getString("nombre"));
           }
            
        } catch (Exception e) {
            e.getMessage();
        }
        //rechercher les demandes
        search();
        
       
            
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Panelvalider = new javax.swing.JPanel();
        demandesvalide = new javax.swing.JLabel();
        Panelrejeter = new javax.swing.JPanel();
        demandesrejeter = new javax.swing.JLabel();
        Panelmesdemande = new javax.swing.JPanel();
        mesdemandes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        validerdemande = new javax.swing.JLabel();
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
        tableau = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        Rejeter = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        verifierlisteNoire = new javax.swing.JLabel();
        userconnecter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setPreferredSize(new java.awt.Dimension(1193, 693));

        jPanel3.setBackground(new java.awt.Color(0, 10, 25));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelvaliderLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(demandesvalide)
                .addGap(18, 18, 18))
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
            .addGroup(PanelrejeterLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(demandesrejeter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panelmesdemande.setBackground(new java.awt.Color(0, 102, 170));
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
                .addGap(15, 15, 15)
                .addComponent(mesdemandes)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 170));
        jLabel2.setText("Facom");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/icons8-utilisateur55.png"))); // NOI18N

        jLabel16.setBackground(new java.awt.Color(204, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Se deconnecter");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("S");

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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(Panelmesdemande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panelvalider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panelrejeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
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
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("GESTION DE DEMANDE");

        jPanel7.setBackground(new java.awt.Color(0, 102, 170));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 170), new java.awt.Color(0, 102, 170)));

        validerdemande.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        validerdemande.setForeground(new java.awt.Color(255, 255, 255));
        validerdemande.setText("Valider");
        validerdemande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                validerdemandeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(validerdemande)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(validerdemande)
                .addContainerGap())
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

        nombre.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("10");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(475, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        tableau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableau.setForeground(new java.awt.Color(0, 0, 0));
        tableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nom du visiteur", "Post-nom du visiteur", "Prénom du visiteur", "Département", "Etat_demande_manager", "Etat_demande_securite"
            }
        ));
        tableau.setDoubleBuffered(true);
        tableau.setSelectionBackground(new java.awt.Color(252, 57, 95));
        tableau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableauMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableau);

        jPanel8.setBackground(new java.awt.Color(204, 0, 0));
        jPanel8.setBorder(null);

        Rejeter.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Rejeter.setForeground(new java.awt.Color(255, 255, 255));
        Rejeter.setText("Rejeter");
        Rejeter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RejeterMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rejeter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Rejeter)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(102, 0, 51));
        jPanel9.setBorder(null);

        verifierlisteNoire.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        verifierlisteNoire.setForeground(new java.awt.Color(255, 255, 255));
        verifierlisteNoire.setText("Liste noire");
        verifierlisteNoire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifierlisteNoireMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verifierlisteNoire)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verifierlisteNoire)
                .addContainerGap())
        );

        userconnecter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userconnecter.setForeground(new java.awt.Color(0, 102, 170));

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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(132, 132, 132)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel15)
                                .addGap(32, 32, 32)
                                .addComponent(Exit))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void demandesvalideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demandesvalideMousePressed
        Panelvalider.setBackground(new Color(0,102,170));
        Panelmesdemande.setBackground(new Color(0,10,35 ));

        Panelrejeter.setBackground(new Color(0,10,35));

        new Demande_valide_securite().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_demandesvalideMousePressed

    private void demandesrejeterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demandesrejeterMousePressed
        Panelrejeter.setBackground(new Color(0,102,170));
        Panelmesdemande.setBackground(new Color(0,10,35 ));

        Panelvalider.setBackground(new Color(0,10,35));

       new Demande_rejeter_securite().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_demandesrejeterMousePressed

    private void mesdemandesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesdemandesMousePressed
        Panelmesdemande.setBackground(new Color(0,102,170 ));

        Panelrejeter.setBackground(new Color(0,10,35));
        Panelvalider.setBackground(new Color(0,10,35));

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

    private void ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_ExitMousePressed
// tableau
    private void tableauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableauMouseClicked
     DefaultTableModel model=(DefaultTableModel)tableau.getModel();
       // recuperation  de l'indexde la ligne selectionnée
      int index= tableau.getSelectedRow();
      // recuperation de la valeur a l'index donné
      nom=String.valueOf(model.getValueAt(index, 0));
      post_nom= String.valueOf(model.getValueAt(index,1));
      prenom=String.valueOf(model.getValueAt(index,2));
      departement=String.valueOf(model.getValueAt(index,3));  
    }//GEN-LAST:event_tableauMouseClicked
  // verifier la liste noire
    private void verifierlisteNoireMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifierlisteNoireMousePressed
         MesMethodes methode=new MesMethodes();
         try {
             ResultSet resultat=null;
              resultat=methode.VerifierLIsteNoire(nom, post_nom, prenom, departement);
              if ( resultat.next()){
                JOptionPane.showMessageDialog(this,"interdit d'accerder sur le site");
              }
              else{
               JOptionPane.showMessageDialog(this,"pas d'interdiction");
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }//GEN-LAST:event_verifierlisteNoireMousePressed
// valider la demande
    private void validerdemandeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerdemandeMousePressed
           MesMethodes methode=new MesMethodes();
           
            
        try {
            if (nom ==null){
              JOptionPane.showMessageDialog(this,"désolé, verifier d'abord la liste noire avant de valider cette démande");
            
            }
            else{
            
             ResultSet resultat=null;
              resultat=methode.VerifierLIsteNoire(nom, post_nom, prenom, departement);
              if ( resultat.next()){
                JOptionPane.showMessageDialog(this,"désolé !! ce visiteur est interdit d'accerder sur le site de Frontier");
              }
              else{
                  String etat="Validee";
               methode.TraiterDemandeSecurite(etat, nom, post_nom, prenom, departement);
               JOptionPane.showMessageDialog(this,"Validée avec succès");
               ResultSet resulta= methode.AfficherDemandeSecurite("Validee");
               tableau.setModel(DbUtils.resultSetToTableModel(resulta));   
              
               
              }
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_validerdemandeMousePressed
      // rejeter la demande
    private void RejeterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RejeterMousePressed
       MesMethodes methode=new MesMethodes();
       String etat="Rejetee";
        try {
               methode.TraiterDemandeSecurite(etat, nom, post_nom, prenom, departement);
               JOptionPane.showMessageDialog(this,"Rejetee avec succès");
               ResultSet resulta= methode.AfficherDemandeSecurite("Validee");
               tableau.setModel(DbUtils.resultSetToTableModel(resulta));   
        } catch (Exception e) {
        }
             
              
    }//GEN-LAST:event_RejeterMousePressed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_demande_securite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Panelmesdemande;
    private javax.swing.JPanel Panelrejeter;
    private javax.swing.JPanel Panelvalider;
    private javax.swing.JLabel Rejeter;
    private javax.swing.JLabel demandesrejeter;
    private javax.swing.JLabel demandesvalide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel mesdemandes;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField recherche;
    private javax.swing.JTable tableau;
    private javax.swing.JLabel userconnecter;
    private javax.swing.JLabel validerdemande;
    private javax.swing.JLabel verifierlisteNoire;
    // End of variables declaration//GEN-END:variables
}
