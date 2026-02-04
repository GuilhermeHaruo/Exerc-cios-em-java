
package atv1;

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura atual (°C): ");
        double temperatura = scanner.nextDouble();
        if (temperatura <= 0) {
            System.out.println("Possibilidade de neve");
        } else {
            System.out.println("Sem previsão de neve");
        }

        scanner.close();
    }
}
