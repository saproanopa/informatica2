/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

/**
 *
 * @author Mesa7
 */
public class frmPacman extends javax.swing.JFrame implements KeyListener{

    /**
     * Creates new form frmPacman
     */
    public frmPacman() {
        initComponents();
        addKeyListener(this);
        this.getContentPane().setBackground(Color.WHITE);

    }
    
    int posX, posY, lastPosX;
           
    int filas,columnas;
    static int x=new Color(255,255,0).getRGB();
    static int t=new Color(255,255,255).getRGB();
    
    static int n = new Color(0,0,0).getRGB();
    static int b = new Color(255,255,255).getRGB();
    static int a = new Color(24,139,222).getRGB();
    static int c = new Color(0,255,255).getRGB();
    static int p = new Color(255,204,153).getRGB();
    public static int Y=new Color(255,255,0).getRGB();
    public static int o=new Color(255,255,255).getRGB();
    public static int A=new Color(38,206,255).getRGB();
    public static int R=new Color(255,0,0).getRGB();    
    public static int B=new Color(0,0,0).getRGB();
    public static int G=new Color(55,55,55).getRGB();
    
    int decimas, ContadorCinco, ContadorDiez, ContadorTiempo;
    
    
    int sprite = 1;
    int Direccion = 1;
    
    int aux;
    
    boolean MovLateral = false;
    boolean Salto = false;
    boolean encerarDecimas = false;
    


private int [][] Ironman={
                    {o,o,o,o,o,o,o,o,o,o,B,B,B,B,B,B,B,o,o,o,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,o,o,B,R,R,R,R,R,R,R,B,o,o,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,o,B,R,R,R,R,R,R,R,R,R,B,o,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,B,R,R,R,R,Y,Y,R,R,R,Y,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,B,R,R,R,Y,Y,Y,Y,Y,Y,Y,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,B,R,R,Y,Y,Y,Y,Y,Y,Y,Y,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,B,R,R,Y,Y,Y,Y,A,A,Y,A,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,B,R,R,G,Y,Y,Y,A,A,Y,A,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,o,B,R,R,Y,Y,Y,Y,Y,Y,Y,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,B,B,B,B,B,R,G,Y,B,B,B,B,Y,B,B,B,o,o,o,o,o,o,o,o},
                    {o,o,o,o,B,R,R,R,Y,Y,B,R,Y,Y,Y,Y,Y,B,R,R,R,B,o,o,o,o,o,o,o},
                    {o,o,o,o,B,G,R,R,Y,R,R,B,B,B,B,B,B,Y,R,R,G,B,o,o,o,o,o,o,o},
                    {o,o,o,B,R,R,Y,Y,B,R,R,R,R,R,R,R,R,B,Y,Y,R,R,B,o,o,o,o,o,o},
                    {o,o,o,B,Y,Y,B,B,B,Y,R,A,A,A,A,R,Y,B,B,B,Y,Y,B,o,o,o,o,o,o},
                    {o,o,o,B,G,R,R,B,B,R,Y,R,A,A,R,Y,R,B,B,R,R,G,B,o,o,o,o,o,o},
                    {o,o,o,B,Y,R,R,B,B,R,G,R,R,R,R,G,R,B,B,R,R,Y,B,o,o,o,o,o,o},
                    {o,o,o,o,B,B,B,o,B,R,Y,R,R,R,R,Y,R,B,o,B,B,B,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,B,Y,R,R,R,R,R,R,R,R,Y,B,o,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,B,R,R,G,R,R,B,B,R,R,G,R,R,B,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,B,B,G,R,R,R,B,o,o,B,R,R,R,G,B,B,o,o,o,o,o,o,o,o},
                    {o,o,o,B,B,R,R,R,G,R,B,o,o,o,o,B,R,G,R,R,R,B,B,o,o,o,o,o,o},
                    {o,o,B,R,R,R,R,R,R,R,B,o,o,o,o,B,R,R,R,R,R,R,R,B,o,o,o,o,o},
                    {o,o,B,B,B,B,B,B,B,B,o,o,o,o,o,o,B,B,B,B,B,B,B,B,o,o,o,o,o},};



private int [][] Ironmanwalk1={
                    {o,o,o,o,o,o,o,o,o,o,B,B,B,B,B,B,B,o,o,o,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,o,o,B,R,R,R,R,R,R,R,B,o,o,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,o,B,R,R,R,Y,R,R,R,R,R,B,o,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,B,R,R,R,R,Y,Y,R,R,R,Y,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,B,R,R,R,Y,Y,Y,Y,Y,Y,Y,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,B,B,B,R,R,Y,Y,Y,Y,Y,Y,Y,Y,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,o,o,B,B,R,R,B,R,R,Y,Y,Y,Y,A,A,Y,A,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,o,B,R,R,R,R,B,R,R,G,Y,Y,Y,A,A,Y,A,Y,B,o,o,o,o,o,o,o,o,o},
                    {o,B,R,R,R,G,Y,Y,B,R,R,Y,Y,Y,Y,Y,Y,Y,Y,B,o,B,B,B,o,o,o,o,o},
                    {B,R,Y,Y,Y,B,R,Y,Y,B,R,G,Y,B,B,B,B,Y,B,o,B,R,R,Y,B,o,o,o,o},
                    {B,G,Y,R,B,o,B,R,R,R,B,B,R,Y,Y,Y,Y,B,B,o,B,R,G,Y,B,o,o,o,o},
                    {B,Y,R,R,B,o,B,R,R,R,Y,B,B,B,B,B,B,R,B,B,B,Y,Y,R,B,o,o,o,o},
                    {o,B,B,B,o,o,B,R,R,Y,R,R,R,R,R,Y,B,R,G,Y,Y,R,R,B,o,o,o,o,o},
                    {o,o,o,B,B,o,B,R,R,G,R,R,A,A,Y,R,B,R,R,R,R,R,B,o,o,o,o,o,o},
                    {o,o,B,R,R,B,B,R,Y,R,R,R,R,A,G,B,o,B,R,R,R,B,o,o,o,o,o,o,o},
                    {o,B,R,R,G,R,B,B,R,R,R,R,R,Y,B,o,o,o,B,B,B,o,o,o,o,o,o,o,o},
                    {B,R,R,R,G,R,B,B,B,R,R,R,R,R,Y,B,o,o,o,o,o,o,o,o,o,o,o,o,o},
                    {B,R,R,B,R,R,R,G,Y,B,B,G,R,R,R,Y,B,o,o,o,o,o,o,o,o,o,o,o,o},
                    {o,B,B,B,B,R,Y,Y,B,o,B,R,R,R,G,Y,B,o,o,o,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,B,B,B,o,o,B,R,R,G,R,B,B,B,o,o,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,o,o,B,R,R,R,R,R,R,R,R,B,o,o,o,o,o,o,o,o,o,o},
                    {o,o,o,o,o,o,o,o,o,B,B,B,B,B,B,B,B,B,B,o,o,o,o,o,o,o,o,o,o},};

//imagen para j
private int [][] jump={
                        {o,o,o,o,o,o,o,o,o,o,o,o,B,B,B,B,B,o,o,o,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,o,o,B,Y,R,R,R,Y,B,o,o,o,o,o,o,o,o,o,o,o}, 
                        {o,o,o,o,o,o,o,o,o,o,B,Y,Y,Y,R,Y,Y,Y,B,o,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,o,B,R,Y,Y,Y,Y,Y,R,B,o,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,B,R,R,B,B,Y,B,B,R,R,B,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,B,R,Y,A,A,B,A,A,Y,R,B,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,B,R,Y,Y,Y,Y,Y,Y,Y,R,B,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,B,R,Y,Y,Y,Y,Y,Y,Y,R,B,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,o,B,R,Y,Y,Y,Y,Y,R,B,o,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,B,B,B,R,Y,Y,Y,Y,Y,R,B,B,B,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,B,B,B,R,R,B,R,R,Y,B,Y,R,R,B,R,R,B,B,B,B,o,o,o,o},
                        {B,B,B,B,B,Y,R,R,Y,Y,R,B,R,B,Y,B,R,B,R,Y,Y,R,R,Y,Y,B,B,B,B},
                        {B,R,R,R,B,Y,Y,R,Y,Y,R,R,B,R,R,R,B,R,R,R,Y,R,Y,Y,R,B,R,R,B},
                        {o,B,B,B,B,B,B,B,B,R,R,R,R,B,B,B,R,R,R,R,R,B,B,B,B,B,B,B,A},
                        {o,A,A,A,o,o,o,o,o,B,R,R,B,A,A,A,B,R,R,B,B,o,o,o,o,o,A,A,A},
                        {o,o,A,o,o,o,o,o,o,o,B,R,R,B,A,B,R,R,B,o,o,o,o,o,o,o,o,A,o},
                        {o,o,A,o,o,o,o,o,o,o,B,R,R,R,B,R,R,R,B,o,o,o,o,o,o,o,o,A,o},
                        {o,o,o,o,o,o,o,o,o,o,o,B,R,R,R,R,R,B,o,o,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,o,o,B,R,R,R,R,R,B,o,o,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,o,o,B,Y,R,R,R,Y,B,o,o,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,o,B,Y,Y,Y,R,Y,Y,Y,B,o,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,B,Y,Y,Y,Y,B,Y,Y,Y,Y,B,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,B,R,Y,Y,B,o,B,Y,Y,Y,B,o,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,B,R,R,R,Y,B,o,o,B,Y,R,R,B,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,B,B,R,R,R,R,B,o,o,o,B,R,R,R,R,B,B,o,o,o,o,o,o},
                        {o,o,o,o,o,B,R,R,R,R,R,R,B,o,o,o,B,R,R,R,R,R,R,B,o,o,o,o,o},
                        {o,o,o,o,o,B,B,B,B,B,B,B,B,o,o,o,B,B,B,B,B,B,B,B,o,o,o,o,o},
                        {o,o,o,o,o,o,o,A,A,A,A,o,o,o,o,o,o,o,A,A,A,A,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,A,A,o,o,o,o,o,o,o,o,o,A,A,o,o,o,o,o,o,o,o},
                        {o,o,o,o,o,o,o,o,o,A,o,o,o,o,o,o,o,o,o,A,o,o,o,o,o,o,o,o,o},
                        
};
    

private void VoltearMatrizEnX(int[][] matriz)
{
    for(filas = 0; filas<25; filas++)
    {
        for(columnas = 0; columnas<14; columnas++)
        {
            
            
            aux = matriz[filas][columnas];
            matriz[filas][columnas] = matriz[filas][28-columnas];
            matriz[filas][28-columnas] = aux;
        }
    }
}

public void paint(Graphics g)
    {
       
        
        super.paint(g);
        
        
                
                for(filas=posY;filas<posY+(26);filas++)
                    {
                        for(columnas=posX;columnas<posX+(29);columnas++)
                        {
                            if(sprite == 1)
                            {
                                    g.setColor(new Color(Ironman[filas-posY][columnas-posX]));                                                      
                            }
                            if(sprite == -1)
                            {                        
                                    g.setColor(new Color(Ironmanwalk1[filas-posY][columnas-posX]));                                        
                            }
                            if(sprite == 2)
                            {
                                g.setColor(new Color(jump[filas-posY][columnas-posX]));
                            }
                            g.fillRect(columnas*11,(filas*11)+500,11,11);
                        }
                        
                    }
                        
                   
                    
                
                
                
               
            
        
    }

 Timer temporizador = new Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
                decimas++;
              
                ContadorCinco++;
                ContadorDiez++;
                
                if(ContadorCinco == 5)
                {   
                    
                    repaint();
                    ContadorCinco = 0;
                    
                    lastPosX = posX;
                  
                    
                    if(MovLateral) sprite = sprite*-1;
                    
                    
                    
                }
                
                if(ContadorDiez == 10)
                {
                   ContadorDiez = 0;
                   if(lastPosX == posX)
                   {
                       sprite = 1; 
                       MovLateral = false;
                   }
                }
                
                if(Salto)
                    {
                        sprite = 2;
                        if(encerarDecimas == false)
                        {
                            decimas = 0;
                            encerarDecimas = true;
                        }
                        
                        if(decimas < 10)
                        {
                            posY-=5;
                        }
                        else if(decimas >=10 && decimas<20)
                        {
                            posY+=5;
                        }
                        else if(decimas == 20)
                        {
                            Salto = false;
                        }
                    }
                
                
                
                
                
                
                
                
                
                
                

            
                
        }
        
    });
 
 
 public void keyTyped(KeyEvent e) {}
 public void keyReleased(KeyEvent e) {}
    
    public void keyPressed(KeyEvent e)
    {
      
       
           
           
           if(e.getKeyCode() == 38)
           {
               
               if(!Salto) encerarDecimas = false;
               Salto = true;
               sprite = 2;
               
               
               
           }

           if(e.getKeyCode() == 37)
           {               
               MovLateral = true;
               
               if(Direccion == 1)
               {
                   Direccion = -1;
                   VoltearMatrizEnX(Ironmanwalk1);
                   VoltearMatrizEnX(Ironman);
                   VoltearMatrizEnX(jump);
               }
               
               posX-=10;
           }
           
           if(e.getKeyCode() == 39)
           {
               
               MovLateral = true;
               
               if(Direccion == -1)
               {
                  Direccion = 1;
                  VoltearMatrizEnX(Ironmanwalk1);
                  VoltearMatrizEnX(Ironman);
                  VoltearMatrizEnX(jump);
               }
                              
               posX+=10;
           }  
           
               
           
           

    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2600, 1000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        temporizador.start();
    }//GEN-LAST:event_formWindowActivated

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmPacman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPacman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPacman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPacman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPacman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
