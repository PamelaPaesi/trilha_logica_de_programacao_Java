package imovel;

import java.util.Scanner;

public class VendaImovel {
    public static void main(String[] args) {
        int sair = 1;
        Scanner digita = new Scanner(System.in);
        while (sair == 1) {
            double total = 0.0;
            System.out.println("Digite o nome do vendedor: ");
            String nome = digita.nextLine();
            System.out.println("Digite o valor do imóvel: ");
            float valor = digita.nextFloat();

            double percent = 1.0;

            if(valor >= 50000){
                percent = 0.20;
            }
            else{
                if(valor >= 30000){
                    percent = 0.15;
                }
                else{
                    percent = 0.10;
                }
            }
            total = valor * percent;
            System.out.printf("Vendedor: " + nome + " Valor do Imóvel: " + valor + " Valor da comissão %.2f\n", total);
            System.out.println(" --------------------------------------------- ");
            System.out.println("Deseja sair? 0 - Sim, 1 - Não : ");
            sair = digita.nextInt();
            digita.nextLine();
        }
    }
}