/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;




/**
 *
 * @author 59399
 */
public class JFRcronometro extends javax.swing.JFrame {
    int contador;
    int segundos;
    int minutos;
    int horas;
    int decimas;
    int total;
    int aciertos;
    Timer temporizador = new Timer(100, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            decimas+=1;
            if (decimas==10)
            {
                segundos+=1;
                decimas=0;
            }
            if(segundos==60)
            {
                minutos+=1;
                segundos=0;
            }
            
            
            lblDecimas.setText(String.valueOf(decimas));
            if (segundos<10)    
            {
               lblMinutos.setText("0"+String.valueOf(segundos)); 
            }
            else 
            {
                lblMinutos.setText(String.valueOf(segundos));
            }
            if ( minutos<10)
            {
                lblHoras.setText("0"+String.valueOf(minutos));
            }
            else
            {
                lblHoras.setText(String.valueOf(minutos));
            }
            
            
        }
    });
    /**
     * Creates new form JFRcronometro
     */
    public JFRcronometro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnStart = new javax.swing.JToggleButton();
        btnStop = new javax.swing.JToggleButton();
        btnReset = new javax.swing.JToggleButton();
        lblWins = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDecimas = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cronometro/reloj.jpg"))); // NOI18N

        jLabel6.setText("jLabel6");

        jLabel5.setText("jLabel5");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 73, 193));
        jLabel8.setText(":");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 0, 330, 290);

        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart);
        btnStart.setBounds(10, 60, 110, 23);

        btnStop.setText("STOP");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop);
        btnStop.setBounds(10, 90, 110, 23);

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(10, 120, 110, 23);

        lblWins.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblWins.setForeground(new java.awt.Color(0, 0, 204));
        lblWins.setText("0");
        getContentPane().add(lblWins);
        lblWins.setBounds(250, 20, 30, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("/");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(284, 10, 30, 50);

        lblTotal.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 153));
        lblTotal.setText("0");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(320, 10, 30, 60);

        lblHoras.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHoras.setForeground(new java.awt.Color(0, 204, 204));
        lblHoras.setText("0");
        getContentPane().add(lblHoras);
        lblHoras.setBounds(180, 80, 40, 40);

        jLabel7.setText(":");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(224, 100, 0, 14);

        lblMinutos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMinutos.setForeground(new java.awt.Color(51, 255, 0));
        lblMinutos.setText("00");
        getContentPane().add(lblMinutos);
        lblMinutos.setBounds(240, 70, 40, 60);

        jLabel9.setText(":");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(244, 100, 10, 14);

        lblDecimas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblDecimas.setForeground(new java.awt.Color(204, 0, 0));
        lblDecimas.setText("0");
        getContentPane().add(lblDecimas);
        lblDecimas.setBounds(310, 80, 40, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 73, 193));
        jLabel10.setText(":");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 50, 13, 90);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 255));
        jLabel11.setText(":");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 70, 30, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cronometro/reloj.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 380, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        temporizador.start();
            
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
     temporizador.stop();
     total+=1;
     if(decimas ==0)
     {
         aciertos+=1;
     }              
     
    lblTotal.setText(String.valueOf(total));
    lblWins.setText(String.valueOf(aciertos));
    
                                           
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
aciertos=0;
decimas=0;
minutos=0;
segundos=0;
total=0;
horas=0;
lblTotal.setText(String.valueOf(total));
lblWins.setText(String.valueOf(aciertos));
lblDecimas.setText(String.valueOf(decimas));
lblMinutos.setText(String.valueOf(segundos));
lblHoras.setText(String.valueOf(minutos));
            

    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(JFRcronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRcronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRcronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRcronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRcronometro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnReset;
    private javax.swing.JToggleButton btnStart;
    private javax.swing.JToggleButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDecimas;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblWins;
    // End of variables declaration//GEN-END:variables
}
