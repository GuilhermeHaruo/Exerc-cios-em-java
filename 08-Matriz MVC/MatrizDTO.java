
package Exercicio01;


public class MatrizDTO {
     private int[][] matriz;

    public MatrizDTO() {
        matriz = new int[5][5];
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setElemento(int linha, int coluna, int valor) {
        matriz[linha][coluna] = valor;
    }

    public int getElemento(int linha, int coluna) {
        return matriz[linha][coluna];
    }
}
