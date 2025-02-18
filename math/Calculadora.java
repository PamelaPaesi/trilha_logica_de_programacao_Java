package math;

import java.util.Scanner;

public class Calculadora {
    public static float primeiroNro(float UltNro, Scanner digita){
        int sair = 0;
        while (sair == 0) {
            if (UltNro > 0) {
                System.out.printf("Deseja manter o último resultado %.2f ? 0 - Sim, 1 - Não : \n", UltNro);
                sair = digita.nextInt();
            } else {
                System.out.println("Insira o primeiro número: ");
                sair = 1;
            }
            switch (sair) {
                case 0:
                    return UltNro;
                case 1:
                    float n1 = digita.nextFloat();
                    return n1;
                default:
                    System.out.println("Operação inválida!");
                    System.out.println("---------------------");
                    System.out.println("Deseja sair? 0 - Sim, 1 - Não :");
                    sair = digita.nextInt();
                    break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        float total = 0;
        int sair = 0;
        
        while (sair == 0) {
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println();
            System.out.println("5 - Sair");
            System.out.println("Escolha uma das opções acima: ");
            int operacao = teclado.nextInt();

            if (operacao == 5) {
                sair = 1;
                break;
            }

            float n1 = primeiroNro(total, teclado);  
            System.out.println("Insira o segundo número: ");
            float n2 = teclado.nextFloat();

            switch (operacao) {
                case 1:
                    total = n1 + n2;
                    break;
                case 2:
                    total = n1 - n2;
                    break;
                case 3:
                    total = n1 * n2;
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("O denominador não pode ser 0");
                        total = 0;
                    } else {
                        total = n1 / n2;
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
            System.out.println("----------------------------------------------");
            System.out.printf("Total: %.2f\n", total);
            System.out.println("----------------------------------------------");
        }
    }
}
