
package atv6;

import java.util.LinkedHashSet;
import java.util.Set;
public class Ex3 {
    public static void main(String[] args) {
        Set<String> frutas = new LinkedHashSet<>();

        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");

        if (frutas.contains("uva")) {
            System.out.println("A fruta 'uva' está presente no conjunto.");
        } else {
            System.out.println("A fruta 'uva' NÃO está presente no conjunto.");
        }
        frutas.remove("banana");

        System.out.println("\nFrutas no conjunto após remoção:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
