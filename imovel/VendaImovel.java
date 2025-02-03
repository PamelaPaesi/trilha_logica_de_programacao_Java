package imovel;

import java.util.Scanner;

public class VendaImovel {
    public static void main(String[] args) {
        int sair = 0;
        while (sair == 0) {
            Double total = 0.0;

            try (Scanner digita = new Scanner(System.in)) {
                System.out.println("Digite o nome do vendedor: ");
                String nome = digita.nextLine();
                System.out.println("Digite o valor do imóvel: ");
                float valor = digita.nextFloat();

                Double percent = 1.0;

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
            }
            break;
        }
    }
}