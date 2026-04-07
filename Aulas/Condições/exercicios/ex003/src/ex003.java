import java.util.Scanner;
public class ex003 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("[1 - 4] ESCOLHA SEU TREINO");
        int value = leitor.nextInt();
        if (value == 1) {
            System.out.println("[1] FULL BODY - TREINO COMPLETO, FORÇA TOTAL!");
        } else if (value == 2) {
            System.out.println("[2] PULL - HORA DE PUXAR COSTAS E BICEPS");
        } else if (value == 3) {
            System.out.println("[3] PUSH - PEITO, OMBRO E TRICEPS NA MISSAO");     
        } else if (value == 4) {
            System.out.println("[4] LEGS - CHAME O AGACHAMENTO!");
        } else {
            System.out.println("INFORME UM VALOR VALIDO!");
        }
    }
}
