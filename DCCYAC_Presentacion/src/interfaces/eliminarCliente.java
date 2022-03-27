/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;
import negocio.CtrlCliente;
import negocio.FabricaNegocios;
import objetos.Cliente;

/**
 * Esta se supone que ya está
 * @author palom
 */
public class eliminarCliente extends javax.swing.JFrame {

    private Cliente cliente;
    private FabricaNegocios f = new FabricaNegocios();
    private CtrlCliente ctrlCliente = f.getCtrlCliente();
    
    /**
     * Creates new form registrarCliente
     */
    public eliminarCliente() {
        initComponents();
    }
    
    /**
     * Creates new form registrarCliente
     * @param cliente
     */
    public eliminarCliente(Cliente cliente) {
        initComponents();
        this.cliente=cliente;
        llenarCampos(cliente);
    }
    
    /**
     * Método que llena los campos del cliente que fue recibido
     *
     * @param cliente
     */
    public void llenarCampos(Cliente cliente) {
        txtNombre.setText(cliente.getNombre());
        txtApellido.setText(cliente.getApellido());
        txtFecha.setDate(cliente.getFechaNacimiento());
        txtCorreo.setText(cliente.getCorreo());
        txtTelefono.setText(cliente.getTelefono());
        txtDomicilio.setText(cliente.getDomicilio());
    }
    
    /**
     * Este método elimina a un cliente
     */
    private void eliminar() {
        ctrlCliente.eliminar(cliente);
        JOptionPane.showMessageDialog(null, "CLIENTE ELIMINADO");
        limpiar();
    }
    
        private void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtDomicilio.setText("");
        txtFecha.setCalendar(null);
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        btnEliminar = new javax.swing.JButton();
        txtDomicilio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCancelar.png"))); // NOI18N
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCancelar2.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCancelar2.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, -1, -1));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setEnabled(false);
        txtFecha.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 250, 30));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEliminar.png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEliminar2.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEliminar2.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, -1, -1));

        txtDomicilio.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtDomicilio.setBorder(null);
        txtDomicilio.setEnabled(false);
        getContentPane().add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 300, 30));

        txtTelefono.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.setEnabled(false);
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 300, 30));

        txtCorreo.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.setEnabled(false);
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 300, 30));

        txtApellido.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtApellido.setBorder(null);
        txtApellido.setEnabled(false);
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 300, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 202, 300, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoEliminarCliente.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        consultaElimina c = new consultaElimina();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        consultaElimina c = new consultaElimina();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDomicilio;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
