/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import objetos.Cliente;
import static repositorios.RepBase.baseDatos;

/**
 * Clase que genera el repositorio del Cliente implementando el repositorio base
 * @author Arguello, Encinas, García, Valdez
 */
public class RepCliente {
    
    MongoCollection<Cliente> clientes = baseDatos.getCollection("Cliente", Cliente.class);
    List<Cliente> clientesList = new ArrayList<>();
    
    /**
     * Método que regresa una lista de todos los clientes.
     * @return regresa una lista de todos los clientes
     */
    public List<Cliente> consultar() {
        clientes.find().into(clientesList);
        return clientesList;
    }

    /**
     * Método que guarda un Cliente
     * @param cliente Cliente a guardar
     */
    public void guardar(Cliente cliente) {
        clientes.insertOne(cliente);
    }

    /**
     * Método que elimina un Cliente
     * @param cliente Cliente a eliminar
     */
    public void eliminar(Cliente cliente) {
        clientes.deleteOne(Filters.eq("_id", cliente.getId()));
    }
    
    /**
     * Método que actualiza un Cliente
     * @param cliente Cliente a actualizar
     */
    public void actualizar(Cliente cliente){
        clientes.updateOne(Filters.eq("_id", cliente.getId()), 
                Updates.set("nombre",cliente.getNombre()));
        clientes.updateOne(Filters.eq("_id", cliente.getId()), 
                Updates.set("apellido",cliente.getApellido()));
        clientes.updateOne(Filters.eq("_id", cliente.getId()), 
                Updates.set("correo",cliente.getCorreo()));
        clientes.updateOne(Filters.eq("_id", cliente.getId()), 
                Updates.set("fechaNacimiento",cliente.getFechaNacimiento()));
        clientes.updateOne(Filters.eq("_id", cliente.getId()), 
                Updates.set("telefono",cliente.getTelefono()));
        clientes.updateOne(Filters.eq("_id", cliente.getId()), 
                Updates.set("domicilio",cliente.getDomicilio()));
    }
}
