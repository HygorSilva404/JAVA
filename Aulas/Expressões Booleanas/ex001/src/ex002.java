import javax.swing.JOptionPane;

public class ex002 {
    public static void main(String[] args) throws Exception {
        int maiorIdade = 18;
        int userIdade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade","Verificador de idade", JOptionPane.QUESTION_MESSAGE));
        boolean resp = userIdade >= maiorIdade; 

        JOptionPane.showMessageDialog(null, "Maior de idade: " + resp);
    }
}
