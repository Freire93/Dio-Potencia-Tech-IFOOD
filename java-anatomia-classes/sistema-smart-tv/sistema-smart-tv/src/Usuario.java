import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner (System.in);

        int novoCanal = 0;
        SmartTv smartTv = new SmartTv();

        System.out.println("TV LIGADA? " +smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume Atual: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("TV LIGADA? " +smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Digite o canal desejado");
        novoCanal = in.nextInt();
        
        smartTv.mudarCanal(novoCanal);
        
        in.close();

    }
}
