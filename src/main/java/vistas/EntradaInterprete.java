/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package vistas;

import Controlador.ControladorNuevosIngresos;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class EntradaInterprete extends javax.swing.JFrame
{
    private ControladorNuevosIngresos controladorInterprete;
    
    
    
    public EntradaInterprete()
    {
        controladorInterprete= new ControladorNuevosIngresos();
        initComponents();
        this.setTitle("MUNDULERY ~ Entrada Interprete");
        this.setMinimumSize(new Dimension(748, 540));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setIconImage(new ImageIcon(getClass().getResource("/icono.png")).getImage());
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresarButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(regresarButton);
        regresarButton.setBounds(12, 11, 100, 23);

        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 280, 100, 23);

        jTextField1.setText("Nuevo Interprete");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 230, 110, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre Interprete");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 230, 110, 30);

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Entrada Nuevo INTERPRETE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 70, 730, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Copyright © 2018 by MUNDULERY");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 460, 730, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("All rights reserved");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-1, 470, 730, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controladorInterprete.ingresarInterprete(jTextField1.getText());
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        MenuEntrada ventana = new MenuEntrada();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(EntradaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new EntradaInterprete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton regresarButton;
    // End of variables declaration//GEN-END:variables
    
}