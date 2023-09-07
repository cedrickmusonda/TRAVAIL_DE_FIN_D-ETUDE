
package vue;

import controleur.MesMethodes;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


public class Gestion_de_demande_manager extends javax.swing.JFrame {
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

  
    public Gestion_de_demande_manager() {
        MesMethodes methode=new MesMethodes();
        initComponents();
        
         
        
        // mise en forme du tableau
        tableau.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
       tableau.getTableHeader().setOpaque(false);
       tableau.getTableHeader().setBackground(new Color(0,102,170));
       tableau.getTableHeader().setForeground(new Color(255,255,255 ));
       tableau.setRowHeight(22);
       // affichage de l'utilisateur connecter
      userconnecter.setText(Recupere.getNomutilisateur());
    
        try {
            //mise en forme du joptionpane
           
            UIManager.put("OptionPane.background",new ColorUIResource(0,10,25));
            UIManager.put("Pane.background",new ColorUIResource(0,10,25));
            UIManager.setLookAndFeel(new MetalLookAndFeel());
            
              //affichage de demande
            ResultSet resulta= methode.AfficherDemandeManager(Recupere.getDepartement());
            ResultSet result=methode.SelectionnerNombreDemandeManager(Recupere.getDepartement());
           tableau.setModel(DbUtils.resultSetToTableModel(resulta));   
           while(result.next()){
               nombre.setText(result.getString("nombre"));
           }
           
        } catch (Exception e) {
            
        }

     // appelle de methode de recher
        search() ;
       
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
        userconnecter = new javax.swing.JLabel();
        essaie = new javax.swing.JLabel();
        Validee = new javax.swing.JLabel();
        Rejeter = new javax.swing.JLabel();

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
                .addContainerGap(22, Short.MAX_VALUE))
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("M");

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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
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
                .addGap(46, 46, 46)
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
        jLabel1.setForeground(new java.awt.Color(0, 10, 35));
        jLabel1.setText("GESTION DE DEMANDE");

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
            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableau.setForeground(new java.awt.Color(0, 0, 0));
        tableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nom du visiteur", "Post-nom du visiteur", "Prénom du visiteur", "Département", "Etat_de_la_demande"
            }
        ));
        tableau.setDoubleBuffered(true);
        tableau.setSelectionBackground(new java.awt.Color(252, 57, 95));
        tableau.getTableHeader().setReorderingAllowed(false);
        tableau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableauMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableauMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableau);

        userconnecter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userconnecter.setForeground(new java.awt.Color(0, 102, 170));

        essaie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        Validee.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Validee.setForeground(new java.awt.Color(255, 255, 255));
        Validee.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cedrick\\Desktop\\TFE\\IMAGE\\aprouver.jpg")); // NOI18N
        Validee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ValideeMousePressed(evt);
            }
        });

        Rejeter.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Rejeter.setForeground(new java.awt.Color(255, 255, 255));
        Rejeter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/rejeter.jpg"))); // NOI18N
        Rejeter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RejeterMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Rejeter)
                                .addGap(59, 59, 59)
                                .addComponent(Validee)
                                .addGap(118, 118, 118))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(essaie, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(494, 494, 494)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(Exit))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(userconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(essaie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(Validee))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Rejeter)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(17, 17, 17)
                                                    .addComponent(jLabel1)))
                                            .addGap(3, 3, 3)
                                            .addComponent(userconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1279, Short.MAX_VALUE)
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
        
        new Demande_valider_manager().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_demandesvalideMousePressed

    private void demandesrejeterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demandesrejeterMousePressed
        Panelrejeter.setBackground(new Color(0,102,170));
        Panelmesdemande.setBackground(new Color(0,10,35 ));
        
        Panelvalider.setBackground(new Color(0,10,35));
        
      new Demande_rejeter_manager().setVisible(true);
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
// traitment de la demande
    private void tableauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableauMousePressed
       
    }//GEN-LAST:event_tableauMousePressed
// valider la demande
    private void ValideeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValideeMousePressed
     
        MesMethodes methode=new MesMethodes();
        try {
            String etat="Validee";
            methode.TraiterDemande(etat,departement,nom,post_nom,prenom);
            JOptionPane.showMessageDialog(this,"Erreur: modifier avec succe" );
            //affichage de demande
            try {
            ResultSet resulta= methode.AfficherDemandeManager(Recupere.getDepartement());
            ResultSet result=methode.SelectionnerNombreDemandeManager(Recupere.getDepartement());
           tableau.setModel(DbUtils.resultSetToTableModel(resulta));   
           while(result.next()){
               nombre.setText(result.getString("nombre"));
           }
           
        } catch (Exception e) {
            
        }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage() );
        }
        
    }//GEN-LAST:event_ValideeMousePressed

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
     // rejeter la demande
    private void RejeterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RejeterMousePressed
        MesMethodes methode=new MesMethodes();
        try {
            String etat="Rejeter";
            methode.TraiterDemande(etat,departement,nom,post_nom,prenom);
            JOptionPane.showMessageDialog(this,"Erreur: rejeter avec succe" );
            UIManager.put("OptionPane.background",new ColorUIResource(0,10,25));
            UIManager.put("Pane.background",new ColorUIResource(0,10,25));
            UIManager.setLookAndFeel(new MetalLookAndFeel());
            //affichage de demande
            try {
            ResultSet resulta= methode.AfficherDemandeManager(Recupere.getDepartement());
            ResultSet result=methode.SelectionnerNombreDemandeManager(Recupere.getDepartement());
           tableau.setModel(DbUtils.resultSetToTableModel(resulta));   
           while(result.next()){
               nombre.setText(result.getString("nombre"));
           }
           
        } catch (Exception e) {
            
        }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage() );
            UIManager.put("JOptionPane",new Color(153,0,0));
        }
        
    }//GEN-LAST:event_RejeterMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gestion_de_demande_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_de_demande_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_de_demande_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_de_demande_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_de_demande_manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Panelmesdemande;
    private javax.swing.JPanel Panelrejeter;
    private javax.swing.JPanel Panelvalider;
    private javax.swing.JLabel Rejeter;
    private javax.swing.JLabel Validee;
    private javax.swing.JLabel demandesrejeter;
    private javax.swing.JLabel demandesvalide;
    private javax.swing.JLabel essaie;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesdemandes;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField recherche;
    private javax.swing.JTable tableau;
    private javax.swing.JLabel userconnecter;
    // End of variables declaration//GEN-END:variables
}
