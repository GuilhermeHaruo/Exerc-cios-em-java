
package Exercicio01;


public class MatrizCTR {
    private MatrizDTO dto;
    private MatrizDAO dao;

    public MatrizCTR() {
        dto = new MatrizDTO();
        dao = new MatrizDAO();
    }

    public void adicionarElemento(int linha, int coluna, int valor) {
        dto.setElemento(linha, coluna, valor);
    }

    public int calcularSomaDiagonalPrincipal() {
        return dao.calcularSomaDiagonalPrincipal(dto);
    }

    public MatrizDTO getMatrixDTO() {
        return dto;
    }
}
}
