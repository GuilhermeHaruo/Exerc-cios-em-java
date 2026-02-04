
package atv7;

import java.util.Map;
import java.util.TreeMap;
public class Ex2 {
    public static void main(String[] args) {
        Map<String, String> paisesCapitais = new TreeMap<>();

        paisesCapitais.put("Brasil", "Brasília");
        paisesCapitais.put("Alemanha", "Berlim");
        paisesCapitais.put("Canadá", "Ottawa");

        System.out.println("Lista de países e suas capitais:");
        for (Map.Entry<String, String> entrada : paisesCapitais.entrySet()) {
            String pais = entrada.getKey();
            String capital = entrada.getValue();
            System.out.println(pais + " - " + capital);
        }
    }
}
