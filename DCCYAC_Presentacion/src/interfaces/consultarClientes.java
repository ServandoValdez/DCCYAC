/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import negocio.CtrlCliente;
import negocio.FabricaNegocios;
import objetos.Cliente;

/**
 *
 * @author palom
 */
public class consultarClientes extends javax.swing.JFrame {

    private FabricaNegocios f = new FabricaNegocios();
    private CtrlCliente ctrlCliente = f.getCtrlCliente();
    private ArrayList<Cliente> listaClientes = (ArrayList<Cliente>) ctrlCliente.consultar();

    /**
     * Creates new form registrarCliente
     */
    public consultarClientes() {
        initComponents();
        setLocationRelativeTo(this);
        actualizaTabla();
    }

    /**
     * Método que actualiza la tabla.
     */
    public void actualizaTabla() {
        DefaultTableModel modelo = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };

        modelo.addColumn("Nombre");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Domicilio");

        tablaConsulta.setModel(modelo);

        String[] datos = new String[3];
        for (Cliente a : listaClientes) {
            datos[0] = String.valueOf(a.getNombre()) + " " + String.valueOf(a.getApellido());
            datos[1] = String.valueOf(a.getTelefono());
            datos[2] = String.valueOf(a.getDomicilio());
            modelo.addRow(datos);
        }
        Font fuente = new Font("Microsoft JhengHei UI Light", Font.BOLD, 14);
        tablaConsulta.setFont(fuente);
        tablaConsulta.setModel(modelo);
    }

    /**
     * Método que regresa al cliente que se desea eliminar.
     *
     * @return devuelve al cliente seleccionado
     */
    public Cliente seleccionado() {
        int seleccion = tablaConsulta.getSelectedRow();
        Cliente cliente = new Cliente();
        cliente.setId(listaClientes.get(seleccion).getId());
        cliente.setNombre(listaClientes.get(seleccion).getNombre());
        cliente.setApellido(listaClientes.get(seleccion).getApellido());
        cliente.setFechaNacimiento(listaClientes.get(seleccion).getFechaNacimiento());
        cliente.setCorreo(listaClientes.get(seleccion).getCorreo());
        cliente.setTelefono(listaClientes.get(seleccion).getTelefono());
        cliente.setDomicilio(listaClientes.get(seleccion).getDomicilio());
        return cliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaConsulta.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Fecha", "Correo", "Telefono", "Domicilio"
            }
        ));
        tablaConsulta.setRequestFocusEnabled(false);
        tablaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaConsultaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaConsulta);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 510, 340));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCancelar.png"))); // NOI18N
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCancelar2.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCancelar2.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, -1, -1));

        txtBusqueda.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtBusqueda.setBorder(null);
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 250, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultar.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        menuClientes abrir = new menuClientes();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tablaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConsultaMouseClicked
        consultar c = new consultar(seleccionado());
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_tablaConsultaMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaConsulta;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
