
package Exercicio01;
public int calcularSomaDiagonalPrincipal(MatrizDTO matrizDTO) {
        int soma = 0;
        int[][] matriz = dto.getMatriz();
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }
public class MatrizDAO {
    
}
