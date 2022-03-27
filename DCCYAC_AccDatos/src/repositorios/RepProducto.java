package repositorios;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import objetos.Producto;
import static repositorios.RepBase.baseDatos;

/**
 *
 * @author palom
 */
public class RepProducto {

    MongoCollection<Producto> productos = baseDatos.getCollection("Producto", Producto.class);
    List<Producto> productoList = new ArrayList<>();

    /**
     * Método que regresa una lista de todos los productos.
     *
     * @return regresa una lista de todos los productos
     */
    public List<Producto> consultar() {
        productos.find().into(productoList);
        return productoList;
    }

    /**
     * Método que guarda un producto
     *
     * @param producto producto a guardar
     */
    public void guardar(Producto producto) {
        productos.insertOne(producto);
    }

    /**
     * Método que elimina un producto
     *
     * @param producto producto a eliminar
     */
    public void eliminar(Producto producto) {
        productos.deleteOne(Filters.eq("_id", producto.getId()));
    }

    /**
     * Método que actualiza un producto
     *
     * @param producto producto a actualizar
     */
    public void actualizar(Producto producto) {
        productos.updateOne(Filters.eq("_id", producto.getId()),
                Updates.set("nombre", producto.getNombre()));
        productos.updateOne(Filters.eq("_id", producto.getId()),
                Updates.set("descripcion", producto.getDescripcion()));
        productos.updateOne(Filters.eq("_id", producto.getId()),
                Updates.set("precio", producto.getPrecio()));
        productos.updateOne(Filters.eq("_id", producto.getId()),
                Updates.set("stock", producto.getStock()));
    }

}
