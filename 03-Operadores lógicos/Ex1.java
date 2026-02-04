
package atv2;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("O cliente tem o cartão da loja? ");
        boolean temCartaoLoja = scanner.nextBoolean();

        System.out.print("A compra foi acima de 100 reais? (true/false): ");
        boolean compraAcimaDeCemReais = scanner.nextBoolean();

        if (temCartaoLoja && compraAcimaDeCemReais) {
            System.out.println("Pode parcelar a compra sem juros");
        } else {
            System.out.println("Não pode parcelar sem juros");
        }

        scanner.close();
    }
}
