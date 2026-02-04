
package atv3;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] diasDaSemana = {
            "Segunda-feira", "Terça-feira", "Quarta-feira", 
            "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"
        };

        System.out.print("Digite um número de 1 a 7 para o dia da semana: ");

        try {
            int dia = scanner.nextInt();
            System.out.println("Dia correspondente: " + diasDaSemana[dia - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Número inválido! Digite um número entre 1 e 7.");
        } catch (Exception e) {
            System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
        }

        scanner.close();
    }
}
