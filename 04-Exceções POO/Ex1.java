package atv4;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        try {
            if (idade < 18) {
                throw new Exception("Idade insuficiente para entrar no evento.");
            }

            System.out.println("Bem-vindo ao evento!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
