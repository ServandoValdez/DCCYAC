package negocio;

/**
 * Fabrica de negocios para los controladores
 * @author Arguello, Encinas, García, Valdez
 */
public class FabricaNegocios {

    private CtrlCliente cliente;

    /**
     * Método que permite recuperar el controlador de Cliente
     * @return Controlador Cliente
     */
    public CtrlCliente getCtrlCliente() {
        if (cliente != null) {
            return cliente;
        } else {
            cliente = new CtrlCliente();
            return cliente;
        }
    }
}
