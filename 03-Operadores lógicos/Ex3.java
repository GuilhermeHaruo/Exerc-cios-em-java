package atv2;

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("O usuário está em avaliação gratuita? (true/false): ");
        boolean emAvaliacaoGratuita = scanner.nextBoolean();
        if (!emAvaliacaoGratuita) {
            System.out.println("Acesso permitido ao conteúdo exclusivo");
        } else {
            System.out.println("Acesso restrito durante o período de avaliação gratuita");
        }

        scanner.close();
    }
}
