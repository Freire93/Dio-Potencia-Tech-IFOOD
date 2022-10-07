package Loops;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        int numero, count=0, maiorNumero=0, soma=0;  
        double media;

        do{
            System.out.println("Digite o nuemro: ");
            numero = in.nextInt();
            soma = soma + numero;
            if(numero > maiorNumero) maiorNumero = numero;

            count++;
        }while(count < 5);

        media = soma / 5;

        System.out.println("Maior: " + maiorNumero);
        System.out.println("Media: " + media);
        in.close();
    }
}
