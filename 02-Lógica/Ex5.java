
package atv1;

import java.util.Scanner;
public class Ex5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de pontos do time: ");
        int pontos = scanner.nextInt();

        if (pontos >= 30) {
            System.out.println("Classificado para a próxima fase");
        } else {
            System.out.println("Não classificado");
        }

        scanner.close();
    }
}
