/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.ArrayList;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author servando
 */
public class Pedido {

    private ObjectId id;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Date fechaPedido;
    private Date fechaEntregado;
    private String estado;
    private float precioFinal;

    public Pedido(Cliente cliente, ArrayList<Producto> productos, Date fechaPedido, Date fechaEntregado, String estado, float precioFinal) {
        this.cliente = cliente;
        this.productos = productos;
        this.fechaPedido = fechaPedido;
        this.fechaEntregado = fechaEntregado;
        this.estado = estado;
        this.precioFinal = precioFinal;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(Date fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", cliente=" + cliente + ", productos=" + productos + ", fechaPedido=" + fechaPedido + ", fechaEntregado=" + fechaEntregado + ", estado=" + estado + ", precioFinal=" + precioFinal + '}';
    }

}
