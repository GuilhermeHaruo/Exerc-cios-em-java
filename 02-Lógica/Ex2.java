
package atv1;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhaCorreta = "1234";

        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

 
        if (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha incorreta");
        } else {
            System.out.println("Acesso concedido");
        }
        scanner.close();
    }
}
