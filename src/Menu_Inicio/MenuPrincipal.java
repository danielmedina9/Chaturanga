/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Medina
 */
public class MenuPrincipal extends javax.swing.JFrame {
    public Inicio inicio = new Inicio();
    public static fondo sonido = new fondo();
        
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        cmdCerrarSesion = new javax.swing.JLabel();
        cmdJugar = new javax.swing.JLabel();
        cmdMiCuenta = new javax.swing.JLabel();
        cmdReportes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCerrarSesion.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdCerrarSesion.setForeground(new java.awt.Color(51, 51, 255));
        cmdCerrarSesion.setText("Cerrar Sesion");
        cmdCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdCerrarSesionMousePressed(evt);
            }
        });
        getContentPane().add(cmdCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        cmdJugar.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdJugar.setForeground(new java.awt.Color(51, 51, 255));
        cmdJugar.setText("Jugar Chaturanga con woof ");
        cmdJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdJugarMousePressed(evt);
            }
        });
        getContentPane().add(cmdJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 460, 90));

        cmdMiCuenta.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdMiCuenta.setForeground(new java.awt.Color(51, 51, 255));
        cmdMiCuenta.setText("Mi Cuenta");
        cmdMiCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdMiCuentaMousePressed(evt);
            }
        });
        getContentPane().add(cmdMiCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        cmdReportes.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        cmdReportes.setForeground(new java.awt.Color(51, 51, 255));
        cmdReportes.setText("Reportes");
        cmdReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdReportesMousePressed(evt);
            }
        });
        getContentPane().add(cmdReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/menuprincipal.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(900, 575));
        jLabel1.setMinimumSize(new java.awt.Dimension(900, 575));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdCerrarSesionMousePressed
        Player.current = null;        
        this.dispose();
        
        JOptionPane.showMessageDialog(null, "Cerro Sesion exitosamente");
        inicio.setVisible(true);
        
    }//GEN-LAST:event_cmdCerrarSesionMousePressed

    private void cmdMiCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdMiCuentaMousePressed
        this.dispose();
        MiCuenta mc = new MiCuenta();
        mc.setVisible(true);
        mc.txtUsuarioCuenta.setText(Player.current.getUsuario());
        mc.txtPuntosCuenta.setText(String.valueOf(Player.current.getPuntos()));
        mc.txtUltimosdiez.setText(String.valueOf(Player.current.getPartidas()));
 
    }//GEN-LAST:event_cmdMiCuentaMousePressed

    private void cmdJugarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdJugarMousePressed
        this.dispose();
        Chaturanga vp = new Chaturanga();
        vp.setVisible(true);
    }//GEN-LAST:event_cmdJugarMousePressed

    private void cmdReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdReportesMousePressed
        this.dispose();
        Reportes r = new Reportes();
        r.setVisible(true);
        
    }//GEN-LAST:event_cmdReportesMousePressed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cmdCerrarSesion;
    private javax.swing.JLabel cmdJugar;
    private javax.swing.JLabel cmdMiCuenta;
    private javax.swing.JLabel cmdReportes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
