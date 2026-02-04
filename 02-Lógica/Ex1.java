
package atv1;

import java.util.Scanner;
public class Ex1 {
  
    public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor de a: ");
            int a = scanner.nextInt();
            
            System.out.print("Digite o valor de b: ");
            int b = scanner.nextInt();
            
            if (a == b) {
                System.out.println("Iguais");
            } else {
                System.out.println("Diferentes");
            }
        }
    }    
}
