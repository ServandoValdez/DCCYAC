package negocio;

/**
 * Fabrica de negocios para los controladores
 *
 * @author Arguello, Encinas, García, Valdez
 */
public class FabricaNegocios {

    private CtrlCliente cliente;
    private CtrlProducto producto;
    private CtrlPedido pedido;

    /**
     * Método que permite recuperar el controlador de Cliente
     *
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

    /**
     * Método que permite recuperar el controlador de producto
     *
     * @return Controlador producto
     */
    public CtrlProducto getCtrlProducto() {
        if (producto != null) {
            return producto;
        } else {
            producto = new CtrlProducto();
            return producto;
        }
    }

    /**
     * Método que permite recuperar el controlador de producto
     * 
     * @return Controlador pedido
     */
    public CtrlPedido getCtrlPedido(){
        if(pedido != null){
            return pedido;
        }else{
            pedido = new CtrlPedido();
            return pedido;
        }
    }
}
