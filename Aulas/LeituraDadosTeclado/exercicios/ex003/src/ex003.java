import javax.swing.JOptionPane;

public class ex003 {
    public static void main(String[] args) throws Exception {
        String cadastroNome = JOptionPane.showInputDialog(null,"Nome:", "Cadastro de persona", JOptionPane.QUESTION_MESSAGE );
        String cadastroIdade = JOptionPane.showInputDialog(null,"Idade:", "Cadastro de persona", JOptionPane.QUESTION_MESSAGE );
        String cadastroProfissao = JOptionPane.showInputDialog(null,"Profissão:", "Cadastro de persona", JOptionPane.QUESTION_MESSAGE );

        System.out.println("CADASTRO CONCLUIDO");
        System.out.format("Nome: %s\nIdade: %d\nProfissao: %s", cadastroNome, Integer.parseInt(cadastroIdade), cadastroProfissao);
    }
}
