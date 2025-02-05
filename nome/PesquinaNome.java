package nome;

import java.util.Scanner;
import java.util.Vector;

public class PesquinaNome {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        Vector<String> nomes = new Vector<>();
        int sair = 1;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um nome: ");
            String nome = digita.nextLine();
            nomes.add(String.valueOf(nome));
        }

        while (sair == 1) {
            System.out.println("---------------------------------------------");
            System.out.println("Informe outro nome: ");
            String novo_nome = digita.nextLine();

            if(nomes.contains(novo_nome)){
                System.out.println("Achei");
            }
            else{
                System.out.println("Não achei");
            }
            System.out.println(" --------------------------------------------- ");
            System.out.println("Deseja sair? 0 - Sim, 1 - Não : ");
            sair = digita.nextInt();
            digita.nextLine();
        }
        digita.close();
    }
    
}