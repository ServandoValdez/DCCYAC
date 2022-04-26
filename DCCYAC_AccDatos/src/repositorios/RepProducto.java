package repositorios;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import objetos.Producto;
import org.bson.Document;
import static repositorios.RepBase.baseDatos;

/**
 *
 * @author Arguello, Encinas, García, Valdez
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
    
    /**
     * Método que busca productos por nombre
     * @param nombre Nombre a buscar
     * @return regresa una lista de todos los productos con nombre coincidente
     */
    public List<Producto> buscarNombre(String nombre) {
        List<Producto> productosB = new ArrayList<>();
        
        Document regQuery = new Document();
        regQuery.append("$regex", "(?)" + Pattern.quote(nombre));
        regQuery.append("$options", "i");
        
        Document findQuery = new Document();
        findQuery.append("nombre", regQuery);
        
        FindIterable<Document> iterable = baseDatos.getCollection("Producto").find(findQuery);
        MongoCursor<Document> cursor = iterable.iterator();
        
        while (cursor.hasNext()) {
            Document document = cursor.next();
            String n = document.getString("nombre");
            
            Producto busqueda = productos.find(Filters.eq("nombre", n)).first();
            
            productosB.add(busqueda);
        }
        
        return productosB;
    }

}
