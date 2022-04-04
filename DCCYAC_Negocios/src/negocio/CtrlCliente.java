/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import objetos.Cliente;
import repositorios.FabricaDatos;
import repositorios.RepCliente;

/**
 * Clase que genera el control del objeto Cliente
 *
 * @author Arguello, Encinas, García, Valdez
 */
public class CtrlCliente {

    public FabricaDatos f = new FabricaDatos();
    private RepCliente repCliente = f.getRepCliente();

    /**
     * Método que regresa una lista de todos los clientes
     *
     * @return regresa una lista de todos los clientes.
     */
    public List<Cliente> consultar() {
        return repCliente.consultar();
    }

    /**
     * Método que guarda un Cliente
     *
     * @param cliente Cliente a guardar
     */
    public void guardar(Cliente cliente) {
        repCliente.guardar(cliente);
    }

    /**
     * Método que elimina un Cliente.
     *
     * @param cliente Cliente a eliminar
     */
    public void eliminar(Cliente cliente) {
        repCliente.eliminar(cliente);
    }

    /**
     * Método que actualiza un cliente
     *
     * @param cliente
     */
    public void actualizar(Cliente cliente) {
        repCliente.actualizar(cliente);
    }
    
    /**
     * Método que busca clientes por nombre
     * @param nombre Nombre a buscar
     * @return regresa una lista de todos los clientes con nombre coincidente
     */
    public List<Cliente> buscarNombre(String nombre) {
        List<Cliente> clientesB = repCliente.buscarNombre(nombre);
        return clientesB;
    }

}
