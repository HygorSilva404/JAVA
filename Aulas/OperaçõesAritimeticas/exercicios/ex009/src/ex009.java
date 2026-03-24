import javax.swing.JOptionPane;

public class ex009 {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "Antes e Depois", JOptionPane.QUESTION_MESSAGE));

        int antes = num; 
        int antes2 = num; 
        int depois = num; 
        int depois2 = num; 

        System.out.format("%d %d %d %d %d", antes2 - 2 ,antes -1, num, depois + 1, depois2 + 2);
    }
}
