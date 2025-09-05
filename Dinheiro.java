
package pizzaria;

public class Dinheiro implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado em Dinheiro.");
    }
}
