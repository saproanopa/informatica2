/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tragamonedassp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class JFRtragamonedas extends javax.swing.JFrame {
     int aleatorio1, aleatorio2, aleatorio3,condicion1,condicion2,aleatorio,x=0;
    Timer temporizador = new Timer(100, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
                aleatorio1=(int)(Math.random()*10+1);
                aleatorio2=(int)(Math.random()*10+1);
                aleatorio3=(int)(Math.random()*10+1);                   
                    switch(aleatorio1)
                    {
                        case 1: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("amarillo.png")));
                            break;
                        case 2: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("azul.png")));
                            break;
                        case 3: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("azulrayada.png")));
                            break;
                        case 4: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("cereza.png")));
                            break;
                        case 5: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("dona.png")));
                            break;
                        case 6: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("morado.png")));
                            break;
                        case 7: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("rojarayada.png")));
                            break;
                        case 8: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("rojo.png")));
                            break;
                        case 9: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("tomate.png")));
                            break;
                        case 10: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("verde.png")));
                            break;


                        }
                    condicion1+=1;

                    if (condicion1==5)
                    {
                        switch (aleatorio2)
                        {
                        case 1: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("amarillo.png")));
                            break;
                        case 2: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("azul.png")));
                            break;
                        case 3: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("azulrayada.png")));
                            break;
                        case 4: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("cereza.png")));
                            break;
                        case 5: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("dona.png")));
                            break;
                        case 6: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("morado.png")));
                            break;
                        case 7: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("rojarayada.png")));
                            break;
                        case 8: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("rojo.png")));
                            break;
                        case 9: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("tomate.png")));
                            break;
                        case 10: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("verde.png")));
                            break;

                        }
                    condicion1=0;
                    condicion2+=1;
                    }

                    if (condicion2==5)
                    {
                        switch (aleatorio3)
                        {
                        case 1: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("amarillo.png")));
                            break;
                        case 2: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("azul.png")));
                            break;
                        case 3: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("azulrayada.png")));
                            break;
                        case 4: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("cereza.png")));
                            break;
                        case 5: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("dona.png")));
                            break;
                        case 6: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("morado.png")));
                            break;
                        case 7: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("rojarayada.png")));
                            break;
                        case 8: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("rojo.png")));
                            break;
                        case 9: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("tomate.png")));
                            break;
                        case 10: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("verde.png")));
                            break;
                        }
                     condicion2=0;
                    }
                    
                    x+=1;
                    if (x==aleatorio)
                        {
                            temporizador.stop();
                            x=0;
                        }
                    
                    
                               
                
                
            } 
            
        });
    

    /**
     * Creates new form JFRtragamonedas
     */
    public JFRtragamonedas() {
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

        lblimagen1 = new javax.swing.JLabel();
        lblimagen2 = new javax.swing.JLabel();
        lblimagen3 = new javax.swing.JLabel();
        cbxApuesta = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        btmStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblimagen1.setBackground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblimagen1);
        lblimagen1.setBounds(10, 11, 160, 170);

        lblimagen2.setBackground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblimagen2);
        lblimagen2.setBounds(180, 10, 140, 170);
        getContentPane().add(lblimagen3);
        lblimagen3.setBounds(330, 10, 150, 170);

        cbxApuesta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5$", "10$", "20$", "50$", "100$" }));
        getContentPane().add(cbxApuesta);
        cbxApuesta.setBounds(250, 240, 100, 20);

        jLabel4.setText("APUESTA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 240, 80, 14);

        jLabel5.setText("SALDO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 280, 60, 14);

        txtSaldo.setText("100");
        getContentPane().add(txtSaldo);
        txtSaldo.setBounds(250, 270, 100, 20);

        btmStart.setText("Start");
        btmStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmStartActionPerformed(evt);
            }
        });
        getContentPane().add(btmStart);
        btmStart.setBounds(250, 300, 100, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmStartActionPerformed
    temporizador.start();
    aleatorio=(int)(Math.random()*99+1);
    
    System.out.print(aleatorio);
    
    
    }//GEN-LAST:event_btmStartActionPerformed

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
            java.util.logging.Logger.getLogger(JFRtragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRtragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRtragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRtragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRtragamonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmStart;
    private javax.swing.JComboBox cbxApuesta;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblimagen1;
    private javax.swing.JLabel lblimagen2;
    private javax.swing.JLabel lblimagen3;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
