package edu.anderson.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 8;
         if (mediaFinal < 6)
            System.out.print("REPROVADO"); 
        else if (mediaFinal == 6)
            System.out.println("EM EXAMES");
        else
            System.out.println("APROVADO");
    }
    
}