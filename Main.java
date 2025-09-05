
package pizzaria;


public class Main {
    public static void main(String[] args) {
        // Singleton - apenas uma instância do serviço
        PedidoService pedidoService = PedidoService.getInstance();

        // Factory Method - criando pizzas sem expor lógica
        Pizza pizza1 = PizzaFactory.criarPizza("calabresa");
        Pizza pizza2 = PizzaFactory.criarPizza("mussarela");

        pedidoService.registrarPedido(pizza1);
        pedidoService.registrarPedido(pizza2);

        // Strategy - escolhendo forma de pagamento em tempo de execução
        PagamentoStrategy pagamento = new Pix();
        pagamento.pagar(59.90);

        pagamento = new CartaoCredito();
        pagamento.pagar(42.50);

        pagamento = new Dinheiro();
        pagamento.pagar(30.00);
    }
}

