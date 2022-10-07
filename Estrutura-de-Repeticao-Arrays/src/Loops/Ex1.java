package Loops;
import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        
        Scanner in = new Scanner (System.in);

        String nome;
        int idade;

        while(true)
        {
            System.out.println("Digite o nome: ");
            nome = in.next();
            if(nome.equals("0")) break;

            System.out.println("Digite a iddade: ");
            idade = in.nextInt();            
        }
        
        System.out.println("fim da execução");
        in.close();


    }
}