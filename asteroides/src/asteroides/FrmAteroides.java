/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroides;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;


/**
 *
 * @author 59399
 */
public class FrmAteroides extends javax.swing.JFrame implements KeyListener {
        public void keyTyped(KeyEvent e) {}
        public void keyReleased(KeyEvent e) {}
        public void keyPressed(KeyEvent e)
    {
       System.out.println(e.getKeyCode());
      
    
    }

    int coordX1,coordX2,PosAlAsx,PosAlAsy;
    
    int coordsX1=0;
    int coordsX2=-600;
    int ship;   
    
    
     Timer temporizador = new Timer(1000, new ActionListener()
     {  
         public void actionPerformed (ActionEvent e)
         {
             
             
             coordX1+=2;
             coordX2+=1;
             
             System.out.println(coordsX1+"fuera");
             
             if (coordX1>=800)
             {
                 coordsX1=0;
                 System.out.println(coordsX1+"dentro");
             }
             if (coordX2>=800)
             {
                 coordsX2=0;
             }
             
             
         }

        
     });

    /**
     * Creates new form FrmAteroides
     */
    public FrmAteroides()
            {
        initComponents();
        addKeyListener(this);
    }
        
        public void paint(Graphics g)
    {
        
        BufferedImage imgNebula=null;
        BufferedImage imgDebris=null;
        BufferedImage imgDebris2=null;
        BufferedImage imgAsteroid=null;
        BufferedImage imgShip=null;
        BufferedImage imgShot=null;
        BufferedImage imgExplosion=null;
        BufferedImage imgNave1=null;
        BufferedImage imgNave2=null;
              
        try {
            imgNebula = ImageIO.read(new File("C:\\Users\\59399\\Documents\\Segundo\\Informatica ll\\Asteroids\\nebula_blue.png"));
            imgDebris = ImageIO.read(new File("C:\\Users\\59399\\Documents\\Segundo\\Informatica ll\\Asteroids\\debris2_blue.png"));
            imgDebris2 = ImageIO.read(new File("C:\\Users\\59399\\Documents\\Segundo\\Informatica ll\\Asteroids\\debris2_blue.png"));
            imgNave1 = ImageIO.read(new File("C:\\Users\\59399\\Documents\\Segundo\\Informatica ll\\Asteroids\\nave1.png"));
            imgNave2 = ImageIO.read(new File("C:\\Users\\59399\\Documents\\Segundo\\Informatica ll\\Asteroids\\nave2.png"));
            imgAsteroid = ImageIO.read(new File("C:\\Users\\59399\\Documents\\Segundo\\Informatica ll\\Asteroids\\asteroid_blue.png"));
            
            //imgNebula = ImageIO.read(new File(this.getClass().getResource(nebula_blue.png)));//codigo que se desa ejecutar 
        } catch (IOException ex) {
            Logger.getLogger(FrmAteroides.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        super.paint(g);
        
            g.drawImage(imgNebula,0,0,800,600,this);
            g.drawImage(imgDebris,0,coordX1,800,600,this);
            g.drawImage(imgDebris2,0,coordX2,400,300 ,this);
            g.drawImage(imgNave1,PosAlAsy=(int)(Math.random()*500+1),PosAlAsx=(int)(Math.random()*700+1),80,60 ,this);
            g.drawImage(imgAsteroid,PosAlAsx=(int)(Math.random()*700+1),PosAlAsy=(int)(Math.random()*500+1),100,100 ,this);
            
          
            
            
            
            repaint();
        

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

                // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     temporizador.start();   // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmAteroides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAteroides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAteroides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAteroides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAteroides().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}