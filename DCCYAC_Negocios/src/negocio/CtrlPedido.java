/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import java.util.List;
import objetos.Cliente;
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
     * Método que regresa una lista de todos los pedidos
     *
     * @return regresa una lista de todos los pedidos.
     */
    public List<Pedido> consultar() {
        return (List) repPedido.consultar();
    }

    /**
     * Método que guarda un pedidos
     *
     * @param pedido pedido a guardar
     */
    public void guardar(Pedido pedido) {
        repPedido.guardar(pedido);
    }

    /**
     * Método que elimina un producto.
     *
     * @param pedido pedido a eliminar
     */
    public void eliminar(Pedido pedido) {
       repPedido.eliminar(pedido);
    }

    /**
     * Método que actualiza un pedido
     *
     * @param pedido
     */
    public void actualizar(Pedido pedido) {
        repPedido.actualizar(pedido);
    }
    
    /**
     * Método que busca productos por nombre
     * 
     * @param nombre Nombre a buscar
     * @return regresa una lista de todos los productos con nombre coincidente
     */
    public List<Pedido> buscarNombre(Cliente cliente) {
        List<Pedido> pedidosB = repPedido.buscarNombre(cliente);
        return pedidosB;
    }
    
}
