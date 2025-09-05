
package pizzaria;

public class PizzaFactory {
    public static Pizza criarPizza(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "calabresa" -> new Calabresa();
            case "mussarela" -> new Mussarela();
            default -> throw new IllegalArgumentException("Tipo de pizza inválido!");
        };
    }

    static Pizza criarPizza(String calabresa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}