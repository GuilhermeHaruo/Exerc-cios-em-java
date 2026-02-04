
package atv2;


import java.util.Scanner;
public class Ex4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Tem autorização dos pais? (true/false): ");
        boolean temAutorizacaoDosPais = scanner.nextBoolean();

        System.out.print("Digite a altura em centímetros: ");
        int altura = scanner.nextInt();

        boolean podeEntrar = (idade >= 12 && altura >= 150) || (temAutorizacaoDosPais && altura >= 140);

        if (podeEntrar) {
            System.out.println("Pode entrar no brinquedo");
        } else {
            System.out.println("Não pode entrar no brinquedo");
        }

        scanner.close();
    }
}
