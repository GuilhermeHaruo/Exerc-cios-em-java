
package Exercicio01;

import javax.swing.JOptionPane;
public class MatrizVIEW {
    
    public static void main(String [] args){
        try{
            MatrizDTO matrizDTO = new MatrizDTO();
            MatrizCTR matrizCTR = new MatrizCTR();
            
            for (int linha = 0; linha < 5; linha++) {
                for (int coluna = 0; coluna < 5; coluna++) {
                    String valor = JOptionPane.showInputDialog(null, 
                            "Digite o valor para a posição [" + linha + "][" + coluna + "]:");
                    matrizDTO.getN()[linha][coluna] = Integer.parseInt(valor);
                }
            }
            
            matrizCTR.mostrarMatriz(matrizDTO);
            
            String matrizString = matrizCTR.mostrarMatriz(matrizDTO);
            JOptionPane.showMessageDialog(null, "Matriz após modificações:\n" + matrizString);
            
  
            String diagonalString = matrizCTR.mostrarDiagonal(matrizDTO);
            JOptionPane.showMessageDialog(null, "Diagonal Principal:\n" + diagonalString);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
        }
    

