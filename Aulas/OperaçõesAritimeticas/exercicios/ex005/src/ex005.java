import javax.swing.JOptionPane;

public class ex005 {
    public static void main(String[] args) throws Exception {
        int userValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:", "2x - 3x", JOptionPane.QUESTION_MESSAGE));
        int dobro = userValue * 2;
        int triplo = userValue * 3;
        String res = String.format("O valor: %d tem:\nDobro: %d\nTriplo:%d", userValue, dobro, triplo);
        JOptionPane.showMessageDialog(null, res);
    }
}
