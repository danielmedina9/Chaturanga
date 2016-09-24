/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;

/**
 *
 * @author samuelborjas
 */
public class PartidaNueva extends javax.swing.JFrame {

    /**
     * Creates new form PartidaNueva
     */
    public PartidaNueva() {
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

        combo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmdRegresar = new javax.swing.JLabel();
        cmdIniciarPartida1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboMousePressed(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 260, 20));

        jLabel1.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        jLabel1.setText("Seleccione el Segundo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 480, 60));

        jLabel2.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        jLabel2.setText("Player");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        cmdRegresar.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdRegresar.setText("Regresar a menu");
        cmdRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdRegresarMousePressed(evt);
            }
        });
        getContentPane().add(cmdRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        cmdIniciarPartida1.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdIniciarPartida1.setText("Iniciar Partida");
        cmdIniciarPartida1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdIniciarPartida1MousePressed(evt);
            }
        });
        getContentPane().add(cmdIniciarPartida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/partidanueva.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        
    }//GEN-LAST:event_comboActionPerformed

    private void comboMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMousePressed
   
    }//GEN-LAST:event_comboMousePressed

    private void cmdRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdRegresarMousePressed
        Chaturanga vw = new Chaturanga();
        this.dispose();
        vw.setVisible(true);
        
    }//GEN-LAST:event_cmdRegresarMousePressed

    private void cmdIniciarPartida1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdIniciarPartida1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdIniciarPartida1MousePressed

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
            java.util.logging.Logger.getLogger(PartidaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartidaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartidaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartidaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartidaNueva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cmdIniciarPartida1;
    private javax.swing.JLabel cmdRegresar;
    public javax.swing.JComboBox combo;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}