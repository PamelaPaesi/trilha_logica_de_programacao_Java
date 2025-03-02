package math;

import java.util.Scanner;

public class ValoresImpares {
    public static void main(String[] args) {
        int valores[] = {1,2,3,4,5,6,7,8,9,10};
        int impares = 0;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] %2 != 0){
                impares++;
            }
        }
        System.out.println("Quantidade de números impares: " + impares);
    }

}