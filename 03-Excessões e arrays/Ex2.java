
package atv3;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();

        try {
            if (!usuario.equals("admin")) {
                throw new Exception("Usuário não encontrado");
            }

            System.out.println("Login realizado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Processo de login finalizado.");
        }

        scanner.close();
    }
}
