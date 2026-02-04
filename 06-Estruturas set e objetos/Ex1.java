package atv6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produto)) return false;
        Produto outro = (Produto) obj;
        return this.codigo == outro.codigo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: R$" + preco;
    }
}
public class Ex1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Produto> produtos = new HashSet<>();

        produtos.add(new Produto(101, "Camiseta", 59.90));
        produtos.add(new Produto(102, "Calça Jeans", 120.00));
        produtos.add(new Produto(103, "Tênis", 250.00));

        System.out.print("Digite o código do produto para verificar: ");
        int codigoVerificar = scanner.nextInt();
        Produto prodBusca = new Produto(codigoVerificar, "", 0); 
        if (produtos.contains(prodBusca)) {
            System.out.println("Produto com código " + codigoVerificar + " está cadastrado.");
        } else {
            System.out.println("Produto com código " + codigoVerificar + " NÃO encontrado.");
        }

        System.out.print("Digite o código do produto para remover: ");
        int codigoRemover = scanner.nextInt();
        Produto prodRemover = new Produto(codigoRemover, "", 0);
        if (produtos.remove(prodRemover)) {
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado para remoção.");
        }

        System.out.println("\nProdutos cadastrados:");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        scanner.close();
    }
}

