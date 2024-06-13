package edu.anderson.primeirasemana;

public class Operadores {
     public static void main(String[] args) {
        String concatenacao = "Java" + "Anderson";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+"1"+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1+1);
        System.out.println(concatenacao);
     }    
}
