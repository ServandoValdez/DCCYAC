/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

/**
 * Fabrica de datos para los repositorios de las clases
 * @author Arguello, Encinas, García, Valdez
 */
public class FabricaDatos {
    
    private RepCliente rC;

    /**
     * Método que permite recuperar el repositorio de Cliente
     * @return Repositorio Cliente
     */
    public RepCliente getRepCliente() {
        if (rC != null) {
            return rC;
        } else {
            rC = new RepCliente();
            return rC;
        }
    }
}
