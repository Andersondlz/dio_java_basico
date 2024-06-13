package edu.anderson.primeirasemana;

public class ProjetoTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCabal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Estou aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("EStou diminuindo o volume para: "+volume);
    }
    
    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

}
