package aluno;

import java.util.Scanner;

public class MediaFinal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float n3 = teclado.nextFloat();
        float media = (n1 + n2 + n3) / 3;

        if(media >= 7){
            System.out.println("Aprovado");
        }
        else{
            if(media >= 5){
                System.out.println("Recuperação");
            }
            else{
                System.out.println("Reprovado");
            }
        }
        teclado.close();
    }
}