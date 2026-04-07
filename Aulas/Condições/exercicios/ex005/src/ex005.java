import java.util.Scanner;
public class ex005 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Receba sua recompensa - digite o número ganho:");
        int valor = leitor.nextInt();
        if (valor == 1) {
            System.out.println("Você desbloqueou a conquista: ‘Primeiro código compilado!");
        } else if (valor == 2){
            System.out.println("Conquista: ‘Aprendiz do Debug’");
        } else if (valor == 3){
            System.out.println("XP+10: Você sobreviveu ao erro de sintaxe.");
        } else if (valor == 4){
            System.out.println("Você aprendeu a usar if. Agora já pode julgar as decisões da vida.");
        } else if (valor == 5){
            System.out.println("Conquista épica: você terminou esta lista.");
        } else {
            System.out.println("INFORME UM VALOR VÁLIDO!");
        }
    }
}
