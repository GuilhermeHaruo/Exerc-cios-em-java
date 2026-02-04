package Exercicio01;

import javax.swing.JOptionPane;

public class MatrizVIEW {

    public static void main(String[] args) {
        MatrizCTR ctr = new MatrizCTR();

        // Entrada de dados para a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int valor = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Digite o valor para a posição [" + i + "][" + j + "]:",
                    "Entrada de Dados",
                    JOptionPane.QUESTION_MESSAGE
                ));
                ctr.adicionarElemento(i, j, valor);
            }
        }

        // Cálculo e exibição da soma da diagonal principal
        int somaDiagonal = ctr.calcularSomaDiagonalPrincipal();
        JOptionPane.showMessageDialog(
            null,
            "A soma da diagonal principal é: " + somaDiagonal,
            "Resultado",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}