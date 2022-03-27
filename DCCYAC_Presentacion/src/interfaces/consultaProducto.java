package interfaces;

import javax.swing.SpinnerNumberModel;
import negocio.CtrlProducto;
import negocio.FabricaNegocios;
import objetos.Producto;

/**
 *
 * @author
 */
public class consultaProducto extends javax.swing.JFrame {

    private Producto producto;
    private FabricaNegocios f = new FabricaNegocios();
    private CtrlProducto ctrlProducto = f.getCtrlProducto();

    public consultaProducto() {
        initComponents();
    }

    /**
     * Creates new form consultarProducto
     *
     * @param producto
     */
    public consultaProducto(Producto producto) {
        initComponents();
        this.producto = producto;
        llenarCampos(producto);
    }

    /**
     * Método que llena los campos del producto que fue recibido
     *
     * @param producto
     */
    public void llenarCampos(Producto producto) {
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setValue(producto.getStock());
        txtNombre.setText(producto.getNombre());
        txtDescripcion.setText(producto.getDescripcion());
        txtPrecio.setText(String.valueOf(producto.getPrecio()));
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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.setEnabled(false);
        txtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioFocusLost(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 140, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 202, 300, 30));

        spinStock.setBorder(null);
        spinStock.setEnabled(false);
        getContentPane().add(spinStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 160, 40));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(null);
        txtDescripcion.setEnabled(false);
        jScrollPane1.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 320, 130));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultarProducto.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        consultarProductos c = new consultarProductos();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusLost

    }//GEN-LAST:event_txtPrecioFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinStock;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
