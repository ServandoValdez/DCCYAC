/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.CtrlCliente;
import negocio.CtrlPedido;
import negocio.CtrlProducto;
import negocio.FabricaNegocios;
import objetos.Cliente;
import objetos.Pedido;
import objetos.Producto;
import org.bson.types.ObjectId;

public class actualizarPedido extends javax.swing.JFrame {

    private Pedido pedido;
    private FabricaNegocios f = new FabricaNegocios();
    private CtrlPedido ctrlPedido = f.getCtrlPedido();
    boolean confirmacion = false;
    
    private CtrlCliente ctrlCliente = f.getCtrlCliente();
    private ArrayList<Cliente> listaClientes = (ArrayList<Cliente>) ctrlCliente.consultar();
    private CtrlProducto ctrlProducto = f.getCtrlProducto();
    private ArrayList<Producto> listaProductos =(ArrayList<Producto>) ctrlProducto.consultar();
    private ArrayList<Producto> productosSeleccionados = new ArrayList<>();
    
    /**
     * Creates new form registrarCliente
     *
     * @param cliente
     */
    public actualizarPedido(Pedido pedido) {
        initComponents();
        setLocationRelativeTo(this);
        this.pedido = pedido;
        this.cargarClientes();
        this.cargarProductos();
        llenarCampos(pedido);
    }

    private boolean verificarDatosCompletos() {
        Date fechaE = txtFechaE.getDate();
        Date fechaP = txtFechaP.getDate();
        if(txtEstado.getText().isEmpty() || tableProductos.getModel().getRowCount()==0
                || txtTotal.getText().equalsIgnoreCase("0.0") || fechaE== null
                || fechaP== null){
            JOptionPane.showMessageDialog(null, "LlENE TODOS LOS CAMPOS");
            return false;
        }
        return true;
    }

    /**
     * Método que llena los campos del cliente que fue recibido
     *
     * @param cliente
     */
    public void llenarCampos(Pedido pedido) {
        txtFechaP.setDate(pedido.getFechaPedido());
        txtFechaE.setDate(pedido.getFechaEntregado());
        txtEstado.setText(pedido.getEstado());
        String cliente = pedido.getCliente().getNombre();
        for (int i = 0; i < listaClientes.size(); i++) {
            if (cliente.equals(cbCliente.getItemAt(i))) {
                cbCliente.setSelectedIndex(i);
                break;
            }
        }

        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        
        tableProductos.setModel(modelo);
        
        String[] a2 = new String[2];
        ArrayList<Producto> productos = pedido.getProductos();
        
        for (Producto pro : productos) {
            a2[0] = String.valueOf(pro.getNombre());
            a2[1] = String.valueOf(pro.getPrecio());
            modelo.addRow(a2);
        }
        Font fuente = new Font("Microsoft JhengHei UI Light", Font.BOLD, 14);
        tableProductos.setFont(fuente);
        tableProductos.setModel(modelo);

        txtTotal.setText(String.valueOf(pedido.getPrecioFinal()));
    }

    public void actualizar() {
        String estado = txtEstado.getText().toUpperCase();
        Date fechaP = txtFechaP.getDate();
        Date fechaE = txtFechaE.getDate();
        float total = Float.parseFloat(txtTotal.getText());
        Cliente cliente = listaClientes.get(cbCliente.getSelectedIndex());
        if (verificarDatosCompletos()) {
            pedido.setCliente(cliente);
            pedido.setEstado(estado);
            pedido.setFechaEntregado(fechaE);
            pedido.setFechaPedido(fechaP);
            pedido.setPrecioFinal(total);
            pedido.setProductos(listaProductos);
            ctrlPedido.actualizar(pedido);
            JOptionPane.showMessageDialog(null, "PEDIDO ACTUALIZADO");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "DATOS INVÁLIDOS");
        }
    }
    
    private void cargarClientes() {
        for (Cliente e : listaClientes) {
            this.cbCliente.addItem(e.getNombre());
        }
    }

    private void cargarProductos() {
       this.cbProducto.removeAllItems();
        //this.listaProductos = (ArrayList<Producto>) ctrlProducto.consultar();
        for (Producto p : listaProductos) {
            if (p.getStock() > 0) {
                String item = p.getNombre() + " | stock:" + p.getStock() + " | $" + p.getPrecio();
                this.cbProducto.addItem(item);
//                this.cbProducto.addItem(p.getNombre());
            }
        }
    }

    private void limpiar(){
        this.txtEstado.setText("");
        this.txtCantidad.setText("");
        this.txtFechaE.setCalendar(null);
        this.cbCliente.setSelectedIndex(0);
        this.cbProducto.setSelectedIndex(0);
        this.txtTotal.setText("0.0");
        DefaultTableModel modelo = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        this.tableProductos.setModel(modelo);
    }
    
    private void salir() {
        consultaActualizaPedido c = new consultaActualizaPedido();
        c.setVisible(true);
        dispose();
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
        txtFechaP = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        cbCliente = new javax.swing.JComboBox<>();
        cbProducto = new javax.swing.JComboBox<>();
        txtFechaE = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        txtFechaP.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaP.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtFechaP.setMinimumSize(new java.awt.Dimension(82, 30));
        txtFechaP.setPreferredSize(new java.awt.Dimension(85, 23));
        getContentPane().add(txtFechaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 190, 30));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGuardar.png"))); // NOI18N
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGuardar2.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGuardar2.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtTotal.setBorder(null);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 475, 310, 25));

        txtEstado.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtEstado.setBorder(null);
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 320, 25));

        txtCantidad.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtCantidad.setBorder(null);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 55, 25));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAtras.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 40, 40));

        getContentPane().add(cbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 273, 350, 30));

        getContentPane().add(cbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 130, 30));

        txtFechaE.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaE.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtFechaE.setMinimumSize(new java.awt.Dimension(82, 30));
        txtFechaE.setPreferredSize(new java.awt.Dimension(85, 23));
        getContentPane().add(txtFechaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 190, 30));

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 350, 90));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoActualizarPedidos.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.salir();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.actualizar();
        this.salir();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!txtCantidad.getText().isEmpty()) {
            DefaultTableModel modelo = new DefaultTableModel() {

                @Override
                public boolean isCellEditable(int row, int colum) {
                    return false;
                }
            };
            modelo.addColumn("Producto");
            modelo.addColumn("Precio");

            int cantidad = Integer.parseInt(txtCantidad.getText());

            String[] a2 = new String[2];
            for (int i = 0; i < cantidad; i++) {
                productosSeleccionados.add(listaProductos.get(this.cbProducto.getSelectedIndex()));
            }

            //se elimina un stock del producto
            int stock = listaProductos.get(this.cbProducto.getSelectedIndex()).getStock();
            stock -= cantidad;
            listaProductos.get(this.cbProducto.getSelectedIndex()).setStock(stock);
            //Se actualiza el producto con el nuevo stock
            //ctrlProducto.actualizar(listaProductos.get(this.cbProducto.getSelectedIndex()));

            for (Producto pro : productosSeleccionados) {
                a2[0] = pro.getNombre();
                a2[1] = String.valueOf(pro.getPrecio());
                modelo.addRow(a2);
            }

            float total = Float.parseFloat(txtTotal.getText()) + (listaProductos.get(this.cbProducto.getSelectedIndex()).getPrecio() * cantidad);
            this.txtTotal.setText(String.valueOf(total));
            tableProductos.setModel(modelo);

            this.cargarProductos();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbProducto;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtEstado;
    private com.toedter.calendar.JDateChooser txtFechaE;
    private com.toedter.calendar.JDateChooser txtFechaP;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
