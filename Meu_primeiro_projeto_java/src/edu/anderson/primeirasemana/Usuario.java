package edu.anderson.primeirasemana;

public class Usuario {
    public static void main(String[] args) {
        ProjetoTv projetoTv = new ProjetoTv();

        System.out.println("A TV esta " + projetoTv.ligada);
        System.out.println("O canal esta em " + projetoTv.canal);
        System.out.println("O volume esta em " + projetoTv.volume);

        projetoTv.ligar();
        System.out.println("A TV esta " + projetoTv.ligada);

        projetoTv.aumentarVolume();
        projetoTv.aumentarVolume();
        projetoTv.aumentarVolume();
        projetoTv.diminuirVolume();

        System.out.println("O volume esta em " + projetoTv.volume);
        
    }
}
