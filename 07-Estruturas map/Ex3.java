package atv7;

import java.util.LinkedHashMap;
import java.util.Map;
public class Ex3 {
    public static void main(String[] args) {

        Map<String, Double> produtos = new LinkedHashMap<>();

        produtos.put("Notebook", 3500.00);
        produtos.put("Mouse", 80.00);
        produtos.put("Teclado", 150.00);

        System.out.println("Lista de produtos e seus preços:");
        for (Map.Entry<String, Double> entrada : produtos.entrySet()) {
            String nome = entrada.getKey();
            Double preco = entrada.getValue();
            System.out.println(nome + ": R$ " + preco);
        }
    }
}
