import javax.swing.JOptionPane;
public class ex002 {
    public static void main(String[] args) throws Exception {
        double gastoMensal = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor gasto por mês com streaming: ", "Balanço de contas", JOptionPane.QUESTION_MESSAGE));
        double gastoAnual = gastoMensal * 12;
        String fortmatado = String.format("%.2f", gastoAnual);
        JOptionPane.showMessageDialog(null, "Em um ano você gasta R$" + fortmatado);
    }
}
