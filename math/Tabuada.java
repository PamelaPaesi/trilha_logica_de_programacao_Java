package math;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Tabuada {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        int tabuada = 0;

        while (tabuada != 10) {
            System.out.println("Digite um número: ");
            try {
                tabuada = digita.nextInt();
                if (tabuada < 1 || tabuada > 10) {
                    System.out.println("Digite um número entre 1 e 10");
                } else {
                    System.out.println("Tabuada do " + tabuada);
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Número digitado: " + digita.nextLine());
                System.out.println("Valor inválido!");
            }
        }
        digita.close();
    }
}
