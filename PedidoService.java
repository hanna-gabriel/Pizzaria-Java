
package pizzaria;



public class PedidoService {
    private static PedidoService instance;

    private PedidoService() {}

    public static PedidoService getInstance() {
        if (instance == null) {
            instance = new PedidoService();
        }
        return instance;
    }

    public void registrarPedido(Pizza pizza) {
        System.out.println("Pedido registrado: " + pizza.getNome());
    }