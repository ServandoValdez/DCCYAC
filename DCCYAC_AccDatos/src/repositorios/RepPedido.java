/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorios;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import objetos.Cliente;
import objetos.Pedido;
import java.util.regex.Pattern;
import org.bson.Document;
import org.bson.types.ObjectId;
import static repositorios.RepBase.baseDatos;

/**
 *
 * @author servando
 */
public class RepPedido {
    MongoCollection<Pedido> pedidos = baseDatos.getCollection("Pedido", Pedido.class);
    List<Pedido> pedidoList = new ArrayList<>();
    
    /**
     * Método que regresa una lista de todos los pedidos.
     *
     * @return regresa una lista de todos los pedidos
     */
    public List<Pedido> consultar() {
        pedidos.find().into(pedidoList);
        return pedidoList;
    }
    
    /**
     * Método que guarda un pedido
     *
     * @param pedido pedido a guardar
     */
    public void guardar(Pedido pedido) {
        pedidos.insertOne(pedido);
    }

    /**
     * Método que elimina un pedido
     *
     * @param pedido pedido a eliminar
     */
    public void eliminar(Pedido pedido) {
        pedidos.deleteOne(Filters.eq("_id", pedido.getId()));
    }

    /**
     * Método que actualiza un producto
     *
     * @param pedido pedido a actualizar
     */
    public void actualizar(Pedido pedido) {
        pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("cliente", pedido.getCliente()));
        pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("estado", pedido.getEstado()));
        pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("fechaEntregado", pedido.getFechaEntregado()));
        pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("fechaPedido", pedido.getFechaPedido()));
        pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("precioFinal", pedido.getPrecioFinal()));
        pedidos.updateOne(Filters.eq("_id", pedido.getId()),
                Updates.set("productos", pedido.getProductos()));
    }
    
    /**
     * Método que busca pedidos por cliente
     * @param cliente Cliente a buscar
     * @return regresa una lista de todos los productos con cliente coincidente
     */
    public List<Pedido> buscarNombre(Cliente cliente) {
        String nombre = cliente.getNombre();
        List<Pedido> pedidoB = new ArrayList<>();
        
        Document regQuery = new Document();
        regQuery.append("$regex", "(?)" + Pattern.quote(nombre));
        regQuery.append("$options", "i");

        Document findQuery = new Document();
        findQuery.append("cliente.nombre", regQuery);
        
        FindIterable<Document> iterable = baseDatos.getCollection("Pedido").find(findQuery);
        MongoCursor<Document> cursor = iterable.iterator();
        
        while (cursor.hasNext()) {
            Document document = cursor.next();
            System.out.println(document);
            ObjectId n =(ObjectId) document.get("_id");
            
            Pedido busqueda = pedidos.find(Filters.eq("_id", n)).first();

            pedidoB.add(busqueda);
        }
        
        return pedidoB;
    }
    
    
}
