
package pizzaria;

public class CartaoCredito implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no Cartão de Crédito.");
    }
}
