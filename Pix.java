
package pizzaria;

public class Pix implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }
}
