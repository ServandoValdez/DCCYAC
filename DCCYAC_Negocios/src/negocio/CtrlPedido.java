/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import java.util.List;
import objetos.Pedido;
import objetos.Producto;
import repositorios.FabricaDatos;
import repositorios.RepPedido;
/**
 *
 * @author servando
 */
public class CtrlPedido {
    private FabricaDatos f = new FabricaDatos();
    private RepPedido repPedido = f.getRepPedido();
    
    /**
     * Método que regresa una lista de todos los productos
     *
     * @return regresa una lista de todos los productos.
     */
    public List<Producto> consultar() {
        return (List) repPedido.consultar();
    }

    /**
     * Método que guarda un producto
     *
     * @param producto producto a guardar
     */
    public void guardar(Pedido pedido) {
        repPedido.guardar(pedido);
    }

    /**
     * Método que elimina un producto.
     *
     * @param producto producto a eliminar
     */
    public void eliminar(Pedido pedido) {
       repPedido.eliminar(pedido);
    }

    /**
     * Método que actualiza un producto
     *
     * @param producto
     */
    public void actualizar(Pedido pedido) {
        repPedido.actualizar(pedido);
    }
    
}
