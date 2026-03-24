import javax.swing.JOptionPane;

public class ex011 {
    public static void main(String[] args) throws Exception {
        int valorTab = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Valor da casa: ", "TABUADA", JOptionPane.QUESTION_MESSAGE)
        );

        int mult = valorTab;

        String tabuadaa = String.format("%d x 1 = %d\n%d x 2 = %d\n%d x 3 = %d\n%d x 4 = %d\n%d x 5 = %d\n%d x 6 = %d\n%d x 7 = %d\n%d x 8 = %d\n%d x 9 = %d\n%d x 10 = %d", valorTab, mult * 1, valorTab, mult * 2, valorTab, mult * 3, valorTab, mult * 4, valorTab, mult * 5, valorTab, mult * 6, valorTab, mult * 7, valorTab, mult * 8, valorTab, mult * 9, valorTab, mult * 10);

        JOptionPane.showMessageDialog(null, tabuadaa);
    }
}
