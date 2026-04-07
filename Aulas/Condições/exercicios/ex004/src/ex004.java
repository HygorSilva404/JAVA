import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 5 para receber uma super dica de estudo em Java");
        int value = leitor.nextInt();
        if(value == 1 ){
            System.out.println("“Copiar código ajuda, mas entender transforma.”");
        } else if ( value == 2){
            System.out.println("“Leia os erros com calma. Eles são professores.”");
        } else if (value == 3){
            System.err.println("“Voltar ao básico é sinal de inteligência, não de fracasso.”");
        } else if (value == 4){
            System.out.println(" “System.out.println é seu melhor amigo.”");
        } else if (value == 5){
            System.out.println("“Ninguém nasce pronto. Continue praticando.”");
        } else {
            System.out.println("INFORME UM VALOR VALIDO");
        }
    }
}
