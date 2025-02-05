package nome;

import java.util.Scanner;
import java.util.Vector;

public class ExcluiNome {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        Vector<String> nomes = new Vector<>();

        for(int i = 0; i < 20; i++){
            System.out.println("Digite um nome: ");
            String nome = digita.nextLine();
            nomes.add(String.valueOf(nome));
        }
        System.out.println("---------------------------------------------");
        System.out.println("Digite o nome para ser excluído: ");
        String remove = digita.nextLine();
        System.out.println("---------------------------------------------");

        nomes.removeIf(nome -> nome.equalsIgnoreCase(remove));
        if (!nomes.isEmpty()) {
            String name = String.join(", ", nomes);
            System.out.println(name);
        } else {
            System.out.println("Nenhum nome restante.");
        }
        digita.close();
    }
}
