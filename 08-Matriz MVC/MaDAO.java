
package Exercicio01;

public class MatrizDAO {
    String resposta = "  ";
    
    public String mostrarMatriz(MatrizDTO matrizDTO){
        int n [][]= matrizDTO.getN();
        for (int linha = 0; linha <5;linha++){
            for (int coluna = 0; coluna < 5; coluna++){
                this.resposta += n [linha][coluna] + " ";               
            }
            this.resposta += "\n";
        }
        return this.resposta;
    }
    public String mostrarDiagonal(MatrizDTO matrizDTO){
        int[][] n = matrizDTO.getN(); 
        this.resposta = ""; 
        for (int linha = 0; linha <5;linha++){
            for (int coluna = 0; coluna < 5; coluna++){
        if (linha==coluna){
             this.resposta += n [linha][coluna] + " ";    
        }
    }
   }         
    return this.resposta;
}
}
