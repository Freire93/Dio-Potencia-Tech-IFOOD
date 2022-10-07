package Loops;

import java.util.*;
public class Ex2 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int nota;
        
        System.out.println("Digite a nota: ");
        nota = in.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("nota invalida digeite novamente");
            nota = in.nextInt();
        }

        in.close();

    }
}
