package interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import negocio.CtrlProducto;
import negocio.FabricaNegocios;
import objetos.Producto;

/**
 *
 * @author
 */
public class registrarProducto extends javax.swing.JFrame {

    private FabricaNegocios f = new FabricaNegocios();
    private CtrlProducto ctrlProducto = f.getCtrlProducto();

    /**
     * Creates new form registrarProducto
     */
    public registrarProducto() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * Este método verifica que los datos ingresados por el usuarios sean los
     * requeridos por el sistema.
     *
     * @return true si cumple con todos, false en caso contrario
     */
    private boolean verificarDatosCompletos() {
        String nombre = txtNombre.getText();
        float precio = Float.valueOf(txtPrecio.getText());
        String descripcion = txtDescripcion.getText();
        int stock = (Integer) spinStock.getValue();

        if (!nombre.isEmpty() && !descripcion.isEmpty() && stock != 0 && precio != 0.0f) {
            return true;
        }
        return false;
    }

    /**
     * Este método guarda a un producto
     */
    private void guardar() {
        String nombre = txtNombre.getText();
        float precio = Float.valueOf(txtPrecio.getText());
        String descripcion = txtDescripcion.getText();
        int stock = (Integer) spinStock.getValue();

        if (verificarDatosCompletos()) {
            Producto producto = new Producto(nombre, descripcion, precio, stock);
            ctrlProducto.guardar(producto);
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "DATOS INVÁLIDOS");
        }
    }

    private void limpiar() {
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMinimum(0);
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        spinStock.setModel(modeloSpinner);
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
        btnGuardar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        spinStock = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
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

        txtPrecio.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioFocusLost(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 140, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtNombre.setBorder(null);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 202, 300, 30));

        spinStock.setBorder(null);
        getContentPane().add(spinStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 160, 40));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(null);
        jScrollPane1.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 320, 130));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarProducto.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(0, 0, 657, 830);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        menuProductos abrir = new menuProductos();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusLost

    }//GEN-LAST:event_txtPrecioFocusLost

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinStock;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}