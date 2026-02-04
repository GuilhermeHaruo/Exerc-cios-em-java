
package atv1;

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("Negativo");
        } else if (numero > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Zero");
        }
        scanner.close();
    }
}
