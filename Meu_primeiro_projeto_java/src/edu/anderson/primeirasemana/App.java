package edu.anderson.primeirasemana;
public class App {
    public static void main(String[] args) {
        String primeiroNome = "Anderson";
        String segundoNome = "da Luz";

        String nomecompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomecompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Rsultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
