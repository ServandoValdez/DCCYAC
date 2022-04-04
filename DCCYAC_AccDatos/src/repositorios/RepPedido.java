/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorios;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import objetos.Pedido;
import static repositorios.RepBase.baseDatos;

/**
 *
 * @author servando
 */
public class RepPedido {
    MongoCollection<Pedido> Pedidos = baseDatos.getCollection("Pedido", Pedido.class);
    List<Pedido> pedidoList = new ArrayList<>();
    
    /**
     * Método que regresa una lista de todos los pedidos.
     *
     * @return regresa una lista de todos los pedidos
     */
    public List<Pedido> consultar() {
        Pedidos.find().into(pedidoList);
        return pedidoList;
    }
    
    /**
     * Método que guarda un pedido
     *
     * @param pedido pedido a guardar
     */
    public void guardar(Pedido pedido) {
        Pedidos.insertOne(pedido);
    }

    /**
     * Método que elimina un pedido
     *
     * @param pedido pedido a eliminar
     */
    public void eliminar(Pedido pedido) {
        Pedidos.deleteOne(Filters.eq("_id", pedido.getId()));
    }

    /**
     * Método que actualiza un producto
     *
     * @param pedido pedido a actualizar
     */
    public void actualizar(Pedido pedido) {
        Pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("cliente", pedido.getCliente()));
        Pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("estado", pedido.getEstado()));
        Pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("fechaEntregado", pedido.getFechaEntregado()));
        Pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("fechaPedido", pedido.getFechaPedido()));
        Pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("precioFinal", pedido.getPrecioFinal()));
        Pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("productos", pedido.getProductos()));
    }
    
    
}
