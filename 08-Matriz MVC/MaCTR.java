
package Exercicio01;

public class MatrizCTR {
    MatrizDAO matrizDAO = new MatrizDAO();
    public String mostrarMatriz (MatrizDTO matrizDTO){
        matrizDAO.mostrarMatriz(matrizDTO);
    }
    public String mostrarDiagonal(MatrizDTO matrizDTO){
        return matrizDAO.mostrarDiagonal(matrizDTO);
    }
}
