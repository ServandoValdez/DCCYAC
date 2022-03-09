/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import negocio.CtrlCliente;
import negocio.FabricaNegocios;
import objetos.Cliente;

/**
 * Esta se supone que ya está
 * @author palom
 */
public class registrarCliente extends javax.swing.JFrame {
    
    private FabricaNegocios f = new FabricaNegocios();
    private CtrlCliente ctrlCliente = f.getCtrlCliente();

    /**
     * Creates new form registrarCliente
     */
    public registrarCliente() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    /**
     * Este método verifica que los datos ingresados por el usuarios sean los
     * requeridos por el sistema.
     * @return true si cumple con todos, false en caso contrario
     */
    private boolean verificarDatosCompletos() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        Date fecha = txtFecha.getDate();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String domicilio = txtDomicilio.getText();

        if (!nombre.isEmpty() && !apellido.isEmpty()
                && !correo.isEmpty() && !telefono.isEmpty()
                && !domicilio.isEmpty() && fecha!=null) {
            return true;
        }

        return false;
    }
    
    /**
     * Este método guarda a un cliente
     */
    private void guardar() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        Date fecha = txtFecha.getDate();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String domicilio = txtDomicilio.getText();
        
        if(verificarDatosCompletos()){
            Cliente cliente = new Cliente(nombre, apellido, fecha, correo, telefono, domicilio);
            ctrlCliente.guardar(cliente);
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "DATOS INVÁLIDOS");
        }
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

        txtFecha = new com.toedter.calendar.JDateChooser();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtDomicilio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 260, 40));

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

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGuardar.png"))); // NOI18N
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGuardar2.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGuardar2.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, -1, -1));

        txtDomicilio.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtDomicilio.setBorder(null);
        getContentPane().add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 300, 30));

        txtTelefono.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 300, 30));

        txtCorreo.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 300, 30));

        txtApellido.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtApellido.setBorder(null);
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 300, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtNombre.setBorder(null);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 202, 300, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoFinalRegistrar.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(0, 0, 657, 830);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        menuClientes abrir = new menuClientes();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        String email = txtCorreo.getText().trim().toLowerCase();
        if (email.isEmpty()) {
            txtCorreo.setText("Correo Electrónico");
        }
        else {
            Pattern pattern = Pattern
                    .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

            Matcher mather = pattern.matcher(email);

            if (mather.find() == false) {
                JOptionPane.showMessageDialog(null, "El correo ingresado es inválido.",
                        "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                txtCorreo.setText("Correo Electrónico");
            }           
            
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        String tel = txtTelefono.getText().trim();
        if (tel.isEmpty()) {
            txtTelefono.setText("Número telefónico");
            JOptionPane.showMessageDialog(null, "El número ingresado es inválido.",
                        "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        }
        else if (txtTelefono.getText().length()!= 10) {
            txtTelefono.setText("Número telefónico");
            JOptionPane.showMessageDialog(null, "El número ingresado es inválido.",
                        "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDomicilio;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    
}
