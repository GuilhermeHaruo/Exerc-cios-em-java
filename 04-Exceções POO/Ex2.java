package atv4;

import java.util.Scanner;


class AcessoNegadoException extends Exception {
    public AcessoNegadoException(String mensagem) {
        super(mensagem);
    }
}
public class Ex2 {
     public static void verificarAcesso(String usuario) throws AcessoNegadoException {
        if (!usuario.equals("admin")) {
            throw new AcessoNegadoException("Acesso negado para o usuário: " + usuario);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();

        try {
            verificarAcesso(usuario);
            System.out.println("Acesso autorizado. Bem-vindo, admin!");
        } catch (AcessoNegadoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Verificação de acesso finalizada.");
        }

        scanner.close();
    }
}
