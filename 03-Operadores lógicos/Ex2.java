
package atv2;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        System.out.print("Está acompanhada por um adulto? (true/false): ");
        boolean acompanhadaPorAdulto = scanner.nextBoolean();

        if (idade >= 18 || acompanhadaPorAdulto) {
            System.out.println("Permissão concedida");
        } else {
            System.out.println("Permissão negada");
        }
        scanner.close();
    }
}
