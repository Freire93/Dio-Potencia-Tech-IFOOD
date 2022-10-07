package Arrays;
import java.util.*;
public class Consoantes {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        String consoantes [] = new String [6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do{
            System.out.println("Digite a letra: ");
            String letra = in.next();

            if(!(letra.equalsIgnoreCase("a")||
               letra.equalsIgnoreCase("e")||
               letra.equalsIgnoreCase("i")||
               letra.equalsIgnoreCase("o")||
               letra.equalsIgnoreCase("u")))
            {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        }while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for(String consoante : consoantes ){
            if( consoante != null)
            System.out.print(consoante + " ");
        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

        in.close();
    }
}
