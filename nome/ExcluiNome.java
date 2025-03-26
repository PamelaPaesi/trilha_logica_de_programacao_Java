package nome;

import java.util.Scanner;

public class ExcluiNome {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        String[] nomesUnicos = new String[20];
        int countUnicos = 0;
        String[] nomes = {
                "Luana", "Diogo", "Ceci", "Marley", "Mel", "Nelson", "Nair", "Elaine", "Jorge", "Rita", "Diogo",
                "Marley", "Mel", "Ceci", "Maria", "Andrea", "Carmen", "Joana", "Luana", "Rita"
        };
        System.out.println("---------------------------------------------");

        for (String nome : nomes) {
            boolean repetido = false;
            for (int i = 0; i < countUnicos; i++) {
                if (nomesUnicos[i].equalsIgnoreCase(nome)) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                nomesUnicos[countUnicos] = nome;
                countUnicos++;
            }
        }
        if (countUnicos > 0) {
            for (int i = 0; i < countUnicos; i++) {
                System.out.println(nomesUnicos[i]);
            }
        } else {
            System.out.println("Nenhum nome repetido.");
        }
    }
}
