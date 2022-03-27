
package interfaces;

import objetos.Cliente;

/**
 *
 * @author 
 */
public class menuClientes extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menuClientes() {
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

        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRegistrar.png"))); // NOI18N
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRegistrar2.png"))); // NOI18N
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRegistrar2.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 23, 127));
        jLabel2.setText("Registrar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEliminarMenu.png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEliminarMenu2.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEliminarMenu2.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar.png"))); // NOI18N
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar2.png"))); // NOI18N
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar2.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 23, 127));
        jLabel4.setText("Actualizar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnConsultar.png"))); // NOI18N
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnConsultar2.png"))); // NOI18N
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnConsultar2.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAtras.png"))); // NOI18N
        btnAtras.setContentAreaFilled(false);
        btnAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAtras2.png"))); // NOI18N
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAtras2.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(63, 23, 127));
        jLabel5.setText("Consultar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 23, 127));
        jLabel3.setText("Eliminar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrarCliente abrir = new registrarCliente();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        consultaElimina abrir = new consultaElimina();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        consultaActualiza abrir = new consultaActualiza();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consultarClientes abrir = new consultarClientes();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        menu abrir = new menu();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}