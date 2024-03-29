/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;

/**
 *
 * @author Daniel Medina
 */
public class Chaturanga extends javax.swing.JFrame {

    /**
     * Creates new form Chaturanga
     */
    public Chaturanga() {
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

        cmdNuevaPartida = new javax.swing.JLabel();
        cmdCargarPartida = new javax.swing.JLabel();
        cmdRegresar = new javax.swing.JLabel();
        cmdEliminarPartida1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdNuevaPartida.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdNuevaPartida.setForeground(new java.awt.Color(255, 255, 255));
        cmdNuevaPartida.setText("Partida Nueva");
        cmdNuevaPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdNuevaPartidaMousePressed(evt);
            }
        });
        getContentPane().add(cmdNuevaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        cmdCargarPartida.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdCargarPartida.setForeground(new java.awt.Color(255, 255, 255));
        cmdCargarPartida.setText("Cargar Partida");
        getContentPane().add(cmdCargarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        cmdRegresar.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdRegresar.setForeground(new java.awt.Color(255, 255, 255));
        cmdRegresar.setText("Regresar al Menu Principal");
        cmdRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdRegresarMousePressed(evt);
            }
        });
        getContentPane().add(cmdRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        cmdEliminarPartida1.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdEliminarPartida1.setForeground(new java.awt.Color(255, 255, 255));
        cmdEliminarPartida1.setText("Eliminar Partida");
        getContentPane().add(cmdEliminarPartida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/jugar.jpg"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(1800, 900));
        fondo.setMinimumSize(new java.awt.Dimension(1800, 900));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdRegresarMousePressed
        MenuPrincipal mp = new MenuPrincipal();              
        this.dispose();
        mp.setVisible(true);
        
        
    }//GEN-LAST:event_cmdRegresarMousePressed

    private void cmdNuevaPartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdNuevaPartidaMousePressed
        PartidaNueva pn = new PartidaNueva(); 
        tablero n = new tablero();
        //pn.combo.addItem("");
        for(Player players: Player.Usuarios){
            pn.combo.addItem(players.usuario);
        }
        this.dispose();  
        n.setVisible(true);
                 
        
        
    }//GEN-LAST:event_cmdNuevaPartidaMousePressed

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
            java.util.logging.Logger.getLogger(Chaturanga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chaturanga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chaturanga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chaturanga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chaturanga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cmdCargarPartida;
    private javax.swing.JLabel cmdEliminarPartida1;
    private javax.swing.JLabel cmdNuevaPartida;
    private javax.swing.JLabel cmdRegresar;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
