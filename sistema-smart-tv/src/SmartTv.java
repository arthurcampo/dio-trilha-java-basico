public class SmartTv {
    boolean ligada=false;
    int volume=25;
    int canal=1;
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }

    public void dimoinuirCanal(){
        canal--;
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando o volume para: " + volume);
        //volume = volume + 1;
        
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo o volume para: " + volume);
        //volume = volume - 1;
        
    }
}
