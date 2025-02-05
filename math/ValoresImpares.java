package math;

import java.util.Scanner;
import java.util.Vector;

public class ValoresImpares {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        Vector<String> valores = new Vector<>();

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            int num = digita.nextInt();

            if(num %2 != 0){
                valores.add(String.valueOf(num));
            }
        }

        if(valores.size() == 0){
            System.out.println("Nenhum número ímpar.");
        }
        else{
            System.out.println("Números ímpares:" + String.join( "," , valores));
            System.out.println("Quantidade de números impares: " + valores.size());
        }
        digita.close();
    }
    
}