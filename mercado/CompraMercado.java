package mercado;

import java.util.Scanner;

public class CompraMercado {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        System.out.print("Qual bebida deseja comprar: ");
        System.out.println("1 - Água 2 - Refrigerante 3 - Cerveja");
        int bebida = digita.nextInt();
        if(bebida > 3 || bebida < 1){
            System.out.println("Opção inválida!");
            digita.close();
            return;
        }
        if (bebida == 3){
            System.out.println("Qual a sua idade: ");
            int idade = digita.nextInt(); 
            if (idade < 18){
                System.out.println("Compra negada.");
                digita.close();
                return;
            }
        }
        System.out.println("Compra efetuada com sucesso.");
        digita.close();
    }
}
