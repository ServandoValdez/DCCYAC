/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import repositorios.FabricaDatos;
import objetos.Producto;
import repositorios.RepProducto;
/**
 * Clase que genera el control del objeto producto
 *
 * @author Arguello, Encinas, García, Valdez
 */
public class CtrlProducto {

    public FabricaDatos f = new FabricaDatos();
    private RepProducto repProducto = f.getRepProducto();

    /**
     * Método que regresa una lista de todos los productos
     *
     * @return regresa una lista de todos los productos.
     */
    public List<Producto> consultar() {
        return repProducto.consultar();
    }

    /**
     * Método que guarda un producto
     *
     * @param producto producto a guardar
     */
    public void guardar(Producto producto) {
        repProducto.guardar(producto);
    }

    /**
     * Método que elimina un producto.
     *
     * @param producto producto a eliminar
     */
    public void eliminar(Producto producto) {
        repProducto.eliminar(producto);
    }

    /**
     * Método que actualiza un producto
     *
     * @param producto
     */
    public void actualizar(Producto producto) {
        repProducto.actualizar(producto);
    }

    /**
     * Método que busca productos por nombre
     * 
     * @param nombre Nombre a buscar
     * @return regresa una lista de todos los productos con nombre coincidente
     */
    public List<Producto> buscarNombre(String nombre) {
        List<Producto> productosB = repProducto.buscarNombre(nombre);
        return productosB;
    }
    
}
