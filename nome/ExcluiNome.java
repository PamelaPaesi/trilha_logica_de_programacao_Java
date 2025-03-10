package nome;

import java.util.Scanner;
import java.util.Vector;

public class ExcluiNome {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        Vector<String> nomes = new Vector<>();
        Vector<String> nomesUnicos = new Vector<>();

        for(int i = 0; i < 20; i++){
            System.out.println("Digite um nome: ");
            String nome = digita.nextLine();
            nomes.add(String.valueOf(nome));
        }
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 20; i++) {
            if (!nomesUnicos.contains(nomes.get(i))) {
                nomesUnicos.add(nomes.get(i));
            }
        }
        if (!nomesUnicos.isEmpty()) {
            String name = String.join(", ", nomesUnicos);
            System.out.println(name);
        } else {
            System.out.println("Nenhum nome restante.");
        }
        digita.close();
    }
}
