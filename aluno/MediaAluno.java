package aluno;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int sair = 1;
        while (sair == 1) {
            float media = 0;
            System.out.println("Digite a primeira nota do aluno: ");
            float nota1 = teclado.nextFloat();
            System.out.println("Digite a segunda nota do aluno: ");
            float nota2 = teclado.nextFloat();

            media = (nota1 + nota2)/2;

            if(media >= 7){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }
            System.out.println("A média é: " + media);
            System.out.println(" --------------------------------------------- ");
            System.out.println("Deseja sair? 0 - Sim, 1 - Não : ");
            sair = teclado.nextInt();
        }
        teclado.close();
    }    
}
