/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Inicio;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Daniel Medina
 */
public class MiCuenta extends javax.swing.JFrame {

    /**
     * Creates new form MiCuenta
     */
    public MiCuenta() {
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

        lblUsuario = new javax.swing.JLabel();
        jlPuntos = new javax.swing.JLabel();
        jlUltimos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUltimosdiez = new javax.swing.JTextArea();
        txtUsuarioCuenta = new javax.swing.JTextField();
        txtPuntosCuenta = new javax.swing.JTextField();
        cmdCambiarPass = new javax.swing.JLabel();
        cmdEliminarUsuario = new javax.swing.JLabel();
        cmdConectarFb = new javax.swing.JLabel();
        cmdRegresarAPrincipal = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario:");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jlPuntos.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        jlPuntos.setForeground(new java.awt.Color(255, 255, 255));
        jlPuntos.setText("Puntos:");
        getContentPane().add(jlPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jlUltimos.setFont(new java.awt.Font("Luminari", 0, 48)); // NOI18N
        jlUltimos.setForeground(new java.awt.Color(255, 255, 255));
        jlUltimos.setText("Ulitmos Juegos:");
        getContentPane().add(jlUltimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtUltimosdiez.setColumns(20);
        txtUltimosdiez.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        txtUltimosdiez.setRows(5);
        txtUltimosdiez.setEnabled(false);
        jScrollPane1.setViewportView(txtUltimosdiez);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 740, 130));

        txtUsuarioCuenta.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        txtUsuarioCuenta.setEnabled(false);
        txtUsuarioCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuarioCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 200, 50));

        txtPuntosCuenta.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        txtPuntosCuenta.setEnabled(false);
        getContentPane().add(txtPuntosCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 200, 50));

        cmdCambiarPass.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        cmdCambiarPass.setForeground(new java.awt.Color(255, 255, 255));
        cmdCambiarPass.setText("Cambiar Contraseña");
        cmdCambiarPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdCambiarPassMousePressed(evt);
            }
        });
        getContentPane().add(cmdCambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        cmdEliminarUsuario.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        cmdEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        cmdEliminarUsuario.setText("Eliminar Usuario");
        cmdEliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdEliminarUsuarioMousePressed(evt);
            }
        });
        getContentPane().add(cmdEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        cmdConectarFb.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        cmdConectarFb.setForeground(new java.awt.Color(255, 255, 255));
        cmdConectarFb.setText("Conectar a FB");
        getContentPane().add(cmdConectarFb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        cmdRegresarAPrincipal.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        cmdRegresarAPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        cmdRegresarAPrincipal.setText("Regresar a Menu Principal");
        cmdRegresarAPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdRegresarAPrincipalMousePressed(evt);
            }
        });
        getContentPane().add(cmdRegresarAPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/micuenta.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        fondo.setMaximumSize(new java.awt.Dimension(800, 573));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 832, 508));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioCuentaActionPerformed

    private void cmdEliminarUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdEliminarUsuarioMousePressed
        Inicio i = new Inicio();
        
        
        int reply = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar el usuario?", "Eliminar Usuario", JOptionPane.YES_NO_OPTION); 
        if (reply == JOptionPane.YES_OPTION) {
            String contra = JOptionPane.showInputDialog(null, "Ingrese su contraseña");
            if(contra.equals(Player.current.getContra())){
                Player.current.usuario = null;
                Player.current.contra = null;
                Player.current.puntos = 0;
                Player.current.partidas = 0;
                JOptionPane.showMessageDialog(null, "Usuario Eliminado...Regresando al Menu de Inicio");
                this.dispose();
                i.setVisible(true);               
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se cambio nada!!");
            
        }
        
    }//GEN-LAST:event_cmdEliminarUsuarioMousePressed

    private void cmdCambiarPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdCambiarPassMousePressed
        int reply = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere cambiar la contraseña?", "Cambiar Contraseña", JOptionPane.YES_NO_OPTION); 
        if (reply == JOptionPane.YES_OPTION) {
            String contra = JOptionPane.showInputDialog(null, "Ingrese su antigua contraseña");
            if(contra.equals(Player.current.getContra())){
                String contraNueva = JOptionPane.showInputDialog(null, "Ingrese su nueva contraseña");
                    Player.current.setPass(contraNueva);
                JOptionPane.showMessageDialog(null, "Contraseña cambiada existosamente");
                return;
            }
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta...ingrese su antigua contraseña");
        }
    }//GEN-LAST:event_cmdCambiarPassMousePressed

    private void cmdRegresarAPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdRegresarAPrincipalMousePressed
        MenuPrincipal mp = new MenuPrincipal();
        this.dispose();
        mp.setVisible(true);
        
    }//GEN-LAST:event_cmdRegresarAPrincipalMousePressed

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
            java.util.logging.Logger.getLogger(MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cmdCambiarPass;
    private javax.swing.JLabel cmdConectarFb;
    private javax.swing.JLabel cmdEliminarUsuario;
    private javax.swing.JLabel cmdRegresarAPrincipal;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlPuntos;
    private javax.swing.JLabel jlUltimos;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JTextField txtPuntosCuenta;
    public javax.swing.JTextArea txtUltimosdiez;
    public javax.swing.JTextField txtUsuarioCuenta;
    // End of variables declaration//GEN-END:variables
}
