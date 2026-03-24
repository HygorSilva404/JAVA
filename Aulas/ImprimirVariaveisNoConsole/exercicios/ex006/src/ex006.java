public class ex006 {
    public static void main(String[] args) throws Exception {
        String nome = "Hygor";
        int horasPorDia = 2;
        String motivo = "poder trabalhar com o que gosto, viajar o mundo e ser o tio rico legal";
        boolean sucesso = true;

        String frase = String.format("Eu sou %s, estudo Java %d horas por dia para %s. Vou conseguir? %b", nome, horasPorDia, motivo, sucesso);
        System.out.println(frase);
    }
}
