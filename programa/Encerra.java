package programa;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Encerra {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        int num = 0;

        while(num != 10){
            System.out.println("Digite um número de 1 a 10: ");
            
            try {
                num = digita.nextInt();
                System.out.println("Número digitado: " + num);
                if(num<1 || num>10){
                    System.out.println("Número fora desse intervalo, digite novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Número digitado: " + digita.nextLine());
                System.out.println("Valor inválido, digite novamente.");
            }
       }
       System.out.println("Número 10! O programa será finalizado");
       digita.close();
    }
}
