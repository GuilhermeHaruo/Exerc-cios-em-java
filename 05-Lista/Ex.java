
package atv5;

import java.util.ArrayList;
import java.util.Collections;
public class Ex {
    public static void main(String[] args) {

        // Adicionar Elementos:
        System.out.println("== Adicionando Elementos ==");
        ArrayList<String> frutas = new ArrayList<>(); 
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Laranja");
        System.out.println("Lista de frutas: " + frutas); 

        // Remover Elementos:
        System.out.println("\n== Removendo Elemento 'Pera' ==");
        frutas.remove("Pera");
        System.out.println("Lista após remoção: " + frutas);

        // Manipular Elementos:
        System.out.println("\n== Substituindo 'Banana' por 'Abacaxi' ==");
        int indexBanana = frutas.indexOf("Banana");
        if (indexBanana != -1) {
            frutas.set(indexBanana, "Abacaxi");
        }
        System.out.println("Lista após substituição: " + frutas);

        // Ordenação de Números:
        System.out.println("\n== Ordenação de Números ==");
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(30);
        numeros.add(10);
        numeros.add(50);
        numeros.add(20);
        numeros.add(40);
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);

        // Busca e Remoção:
        System.out.println("\n== Busca e Remoção do número 50 ==");
        if (numeros.contains(50)) {
            numeros.remove(Integer.valueOf(50)); 
            System.out.println("Número 50 removido.");
        }
        System.out.println("Lista após remoção: " + numeros);

        // Método shuffle:
        System.out.println("\n== Embaralhando a lista de números ==");
        Collections.shuffle(numeros);
        System.out.println("Lista embaralhada: " + numeros);

        // Método reverse:
        System.out.println("\n== Revertendo a lista de frutas ==");
        Collections.reverse(frutas);
        System.out.println("Lista reversa: " + frutas);
    }
}
