package atv7;

import java.util.HashMap;
import java.util.Map;
public class Ex1 {
    public static void main(String[] args) {
    
        Map<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Ana", 8.5);
        notasAlunos.put("Bruno", 7.0);
        notasAlunos.put("Carlos", 9.2);

        System.out.println("Notas dos Alunos:");
        for (Map.Entry<String, Double> entrada : notasAlunos.entrySet()) {
            String nome = entrada.getKey();
            Double nota = entrada.getValue();
            System.out.println(nome + ": " + nota);
        }
    }
}
