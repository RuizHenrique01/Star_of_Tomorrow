package Telas;




import javax.swing.ImageIcon;
import jogo.Game;
import jogo.Game2;
import jogo.Game3;
import jogo2.Game4;
import jogo2.Game5;
import jogo3.Game6;
import jogo3.Game7;
import jogo4.Game8;
import jogo4.Game9;

public class Tela_mapa extends javax.swing.JFrame {

    Tela_Inicio tn;
      private ImageIcon icon= new ImageIcon("img\\Nave4.png");
    public Tela_mapa() {
        initComponents();
        setVisible(true);
        setSize(600,630);
        setLocationRelativeTo(null);
       setTitle("Stars of Tomorrow");
       setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
                      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cadeado1 = new javax.swing.JLabel();
        cadeado2 = new javax.swing.JLabel();
        cadeado3 = new javax.swing.JLabel();
        cadeado4 = new javax.swing.JLabel();
        cadeado5 = new javax.swing.JLabel();
        cadeado6 = new javax.swing.JLabel();
        cadeado7 = new javax.swing.JLabel();
        cadeado8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        
        //imagem sol
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Sol 300x300.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 120, 300);

        //imagem mércurio
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Mercurio-1.png (3).png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 150, 110, 50);

        //cadeado 1
        cadeado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Cadeado-1.png.png")));
        jPanel1.add(cadeado1);
        cadeado1.setBounds(50, 160, 180, 140);
        
        //imagem vênus
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Venus-120x120.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 160, 180, 140);
        
         //cadeado 2
        cadeado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Cadeado-1.png.png")));
        jPanel1.add(cadeado2);
        cadeado2.setBounds(85, 282, 60, 60);

        //imagem terra
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Terra -123x123.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 250, 170, 130);
        
        //cadeado 3
        cadeado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Cadeado-1.png.png")));
        jPanel1.add(cadeado3);
        cadeado3.setBounds(134, 357, 60, 60);

        //imagem marte
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Marte 113x113.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 340, 170, 100);
        
        //cadeado 4
        cadeado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Cadeado-1.png.png")));
        jPanel1.add(cadeado4);
        cadeado4.setBounds(221, 419, 60, 60);

        //imagem jupiter
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Jupiter 200x200.png"))); 
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 360, 240, 170);
        
         //cadeado 5
        cadeado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Cadeado-1.png.png")));
        jPanel1.add(cadeado5);
        cadeado5.setBounds(352, 460, 60, 60);

        //imagem saturno
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Saturno 150x150.png")));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 410, 190, 150);
        
         //cadeado 6
        cadeado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Cadeado-1.png.png")));
        jPanel1.add(cadeado6);
        cadeado6.setBounds(455, 460, 60, 60);

        //imagem saturno
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Urano - 120x120.png")));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 440, 140, 110);
        
         //cadeado 7
        cadeado7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Cadeado-1.png.png")));
        jPanel1.add(cadeado7);
        cadeado7.setBounds(525, 432, 60, 60);

        //imagem netuno
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Netuno - 120x120.png.png"))); 
        jPanel1.add(jLabel10);
        jLabel10.setBounds(490, 420, 150, 90);
        
         //cadeado 8
        cadeado8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Cadeado-1.png.png")));
        jPanel1.add(cadeado8);
        cadeado8.setBounds(550, 370, 60, 60);

        //imagem plutão
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Plutao 96x96.png"))); 
        jPanel1.add(jLabel11);
        jLabel11.setBounds(530, 370, 70, 70);
        
        //escrita voltar
        jLabel12.setFont(new java.awt.Font("Wide Latin", 1, 13));
        jLabel12.setText("Voltar");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(466, 565, 150, 20);

        //Butão Terra
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(80, 290, 60, 50);

        //Butão mécurio
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        
        
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 170, 20, 20);

        //Butão Vênus
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(50, 220, 50, 30);

        //Butão Marte
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(140, 380, 40, 20);

        //Butão Jupíter
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(210, 400, 70, 80);

        //Butão saturno
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(350, 450, 60, 80);

        //Butão Urano
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton7MouseReleased(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(460, 480, 40, 30);

        //Butão Netuno
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton8MouseReleased(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(530, 450, 40, 30);

        //Butão Plutão
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton9MouseReleased(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(560, 390, 20, 20);
        
        //Butão Voltar
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); 
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton10MouseReleased(evt);
            }
        });
        
        jPanel1.add(jButton10);
        jButton10.setBounds(430, 560, 150, 30);

        //Tela Mapa
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/mapa em pixel 600x600.jpg")));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 600);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        
          jButton2.setVisible(false); //trava o Butão Vênus
          jButton3.setVisible(false); //trava o Butão Terra
          jButton4.setVisible(false); //trava o Butão Marte
          jButton5.setVisible(false); //trava o Butão Jupíter
          jButton6.setVisible(false); //trava o Butão Saturno
          jButton7.setVisible(false); //trava o Butão Urano
          jButton8.setVisible(false); //trava o Butão Netuno
          jButton9.setVisible(false); //trava o Butão Plutão
    }              
    

      //Método Butão terra
    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {                                      
       setVisible(false);
    	new Game3();
    }                                     

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {                                       
        
    }                                      

    //Método Butão Mécurio
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {    
    	setVisible(false);
    	new Game();
       
    }                                     

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {                                       
        
    }                                      

       //Método Butão Vênus
    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {                                      
       setVisible(false);
    	new Game2();
    }                                     

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {                                       
      
    }                                      

       //Método Butão Marte
    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {                                      
       setVisible(false);
    	new Game4();
    }                                     

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {                                       
      
    }                                      

       //Método Butão Jupíter
    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {                                      
        setVisible(false);
    	new Game5();
    }                                     

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {                                       
        
    }                        
    
       //Método Butão Saturno
    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {                                      
        setVisible(false);
    	new Game6();
    }                                     

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {                                       
        
    }                                      

       //Método Butão Urano
    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {                                      
        setVisible(false);
    	new Game7();
    }                                     

    private void jButton7MouseReleased(java.awt.event.MouseEvent evt) {                                       
       
    }                      
    
       //Método Butão Netuno
    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {                                      
        setVisible(false);
    	new Game8();
    }                                     

    private void jButton8MouseReleased(java.awt.event.MouseEvent evt) {                                       
        
    }                                      

       //Método Butão Plutão
    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {                                      
        setVisible(false);
    	new Game9();
    }                                     

    private void jButton9MouseReleased(java.awt.event.MouseEvent evt) {                                       
       
    }      
    
       //Método Butão Voltar
    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {                                      
        setVisible(false);
           
       new Tela_Inicio();
        
    }                                     

    private void jButton10MouseReleased(java.awt.event.MouseEvent evt) {                                       
        
    }    
    
    //Métodos butão travado até o cadeado sumir e destravamento
    void desbloqueioVenus(){
        
     cadeado1.setVisible(false);
     jButton2.setVisible(true);
      
        
    }
     public void desbloqueioTerra(){
        
        
     cadeado2.setVisible(false);
     jButton3.setVisible(true);
       
        
    }
     public void desbloqueioMarte(){
        
      
     cadeado3.setVisible(false);
     jButton4.setVisible(true);
           
       
    }
    public void desbloqueioJupiter(){
        
         
     cadeado4.setVisible(false);
     jButton5.setVisible(true);
        
               
    }
    public void desbloqueioSaturno(){
        
         
     cadeado5.setVisible(false);
     jButton6.setVisible(true);
        
        
       
    }
    public void desbloqueioUrano(){
        
         
     cadeado6.setVisible(false);
     jButton7.setVisible(true);
        
        
    }
    public void desbloqueioNetuno(){
        
        
     cadeado7.setVisible(false);
     jButton8.setVisible(true);
        
           
    }
    public void desbloqueioPutao(){
        
         
     cadeado8.setVisible(false);
     jButton9.setVisible(true);
        
           
       
    }
   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_mapa().setVisible(true);
            }
        });
    }

                       
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel cadeado1;
    private javax.swing.JLabel cadeado2;
    private javax.swing.JLabel cadeado3;
    private javax.swing.JLabel cadeado4;
    private javax.swing.JLabel cadeado5;
    private javax.swing.JLabel cadeado6;
    private javax.swing.JLabel cadeado7;
    private javax.swing.JLabel cadeado8;
                   
}

