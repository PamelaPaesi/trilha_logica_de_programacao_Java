package math;

import java.util.Scanner;

public class DivisaoValores {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int x = digita.nextInt();
        System.out.println("Digite o segundo número: ");
        int y = digita.nextInt();

        if(y == 0){
            while (y==0) {
                System.out.println("Número inválido");
                System.out.println("Digite o segundo número: ");
                y = digita.nextInt();
            }
        }
        int remainder = x / y;
        System.out.println("O resultado da divisão entre " + x + " e " + y + " é " + remainder);
        digita.close();
    }
}
