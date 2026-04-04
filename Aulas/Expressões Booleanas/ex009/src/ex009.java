import javax.swing.JOptionPane;
public class ex009 {
    public static void main(String[] args) throws Exception {
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:", "Verificador de valor", JOptionPane.QUESTION_MESSAGE));
        boolean espaco = valor >= 10 && valor <= 99;
        System.out.println(espaco);
    }
}