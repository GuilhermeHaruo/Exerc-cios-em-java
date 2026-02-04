package atv6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.TreeSet;

class Compromisso implements Comparable<Compromisso> {
    private LocalDate data;
    private LocalTime horario;
    private String descricao;

    public Compromisso(LocalDate data, LocalTime horario, String descricao) {
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public int compareTo(Compromisso outro) {
        int comparacaoData = this.data.compareTo(outro.data);
        if (comparacaoData != 0) return comparacaoData;
        return this.horario.compareTo(outro.horario);
    }

    @Override
    public String toString() {
        return data + " às " + horario + " - " + descricao;
    }
}
public class Ex2 {
    public static void main(String[] args) {
        TreeSet<Compromisso> agenda = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        agenda.add(new Compromisso(LocalDate.of(2025, 5, 10), LocalTime.of(9, 0), "Consulta médica"));
        agenda.add(new Compromisso(LocalDate.of(2025, 5, 10), LocalTime.of(14, 0), "Reunião com cliente"));
        agenda.add(new Compromisso(LocalDate.of(2025, 5, 11), LocalTime.of(11, 30), "Aula de LPG1"));
        agenda.add(new Compromisso(LocalDate.of(2025, 5, 12), LocalTime.of(16, 0), "Academia"));

        System.out.print("Digite a data para buscar compromissos (yyyy-MM-dd): ");
        String dataStr = scanner.nextLine();
        LocalDate dataBusca = LocalDate.parse(dataStr);

        boolean encontrou = false;
        for (Compromisso c : agenda) {
            if (c.getData().equals(dataBusca)) {
                System.out.println("Compromisso encontrado: " + c);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum compromisso encontrado para esta data.");
        }

        System.out.print("Digite a data para remover compromissos (yyyy-MM-dd): ");
        String dataRemoverStr = scanner.nextLine();
        LocalDate dataRemover = LocalDate.parse(dataRemoverStr);

        agenda.removeIf(c -> c.getData().equals(dataRemover));
        System.out.println("Compromissos para a data " + dataRemover + " foram removidos.");

        System.out.println("\nCompromissos restantes:");
        for (Compromisso c : agenda) {
            System.out.println(c);
        }

        scanner.close();
    }
}
