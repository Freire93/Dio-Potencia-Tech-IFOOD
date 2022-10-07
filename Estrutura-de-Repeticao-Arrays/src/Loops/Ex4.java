package Loops;
import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fatorial, multiplicacao=1;

        System.out.println("Fatorial de: ");
        fatorial= in.nextInt();

        System.out.print(fatorial + "! = ");

        for (int i = fatorial ; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.print(multiplicacao);
        in.close();


    }
}
