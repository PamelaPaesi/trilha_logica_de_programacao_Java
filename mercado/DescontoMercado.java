package mercado;

import java.util.Scanner;

public class DescontoMercado {
    public static void main(String[] args) {
        int sair = 1;
        while (sair == 1) {
            float total = 0;

            try (Scanner digita = new Scanner(System.in)) {
                System.out.println("Digite o nome do produto: ");
                String produto = digita.nextLine();
                System.out.println("Digite o preço do " + produto + ":");
                float preco = digita.nextFloat();
                System.out.println("Digite a quantidade do " + produto + ":");
                float quant = digita.nextFloat();
                total = preco * quant;

                float percent = 1;

                if(quant <= 11){
                    percent = (float) (percent - 0.10);
                }
                else{
                    if(quant <=50){
                        percent = (float) (percent - 0.20);
                    }
                    else{
                        percent = (float) (percent - 0.25);
                    }
                }
                total = total * percent;
                System.out.printf("Total: %.2f\n ", total);
                System.out.println(" --------------------------------------------- ");
                System.out.println("Deseja sair? 0 - Sim, 1 - Não : ");
                sair = digita.nextInt();
            }
        }
    }
}
