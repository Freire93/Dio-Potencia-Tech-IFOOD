public class SmartTv{
    boolean ligada = false;
    int canal =1 ;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Volume atual: "+ volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume atual: "+ volume);
    }

    public void mudarCanal(int novoCanal){
        System.out.println("canal antigo e: "+ canal);
        canal = novoCanal;
        System.out.println("o novo canal e : "+canal);
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarCanal(){
        canal++;
    }

}