import javax.swing.JOptionPane;
public class ex013 {
    public static void main(String[] args) throws Exception {
        String user = "academia-dos-devs";
        int senha = 40028922;
        String userLogin = JOptionPane.showInputDialog(null, "Nome de usuario:", "Login", JOptionPane.QUESTION_MESSAGE);
        int senhaLogin = Integer.parseInt(JOptionPane.showInputDialog(null, "Password:", "Login", JOptionPane.QUESTION_MESSAGE));
        boolean loginRealizado = user.contains(userLogin) && senha == senhaLogin;
        System.out.println(loginRealizado);
    }
}