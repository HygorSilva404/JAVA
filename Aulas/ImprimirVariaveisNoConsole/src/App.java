public class App {
    public static void main(String[] args) throws Exception {
        String nomeFilme = "Coraline e o Mundo Secreto"; //%s
        int anoLancamento = 2009; //%d
        int tempoDuracao = 120;
        float valorCritica = 7.8f; //%f
        char letraInicial = 'C'; //%c
        boolean sucessoBilheteria = true; //%b

        //forma geral
        //System.out.println("O filme " + nomeFilme);
        //System.out.println("Tempo de duracao " + tempoDuracao);
        //System.out.println("Ano de lancamento: " + anoLancamento);
        //System.out.println("Nota media: " + valorCritica);
        //System.out.println("Letra inicial: " + letraInicial);
        //System.out.println("Foi sucesso de bilheteria? " + sucessoBilheteria);

        //forma formatada
        //System.out.format(" O filme %s lancado em %d tem uma duracao de %d minutos", nomeFilme, anoLancamento, tempoDuracao);

        //mensagem do tipo erro
        //System.err.println(nomeFilme);

        //concatenação
        //String texto = "O filme " + nomeFilme + " lancado em " + anoLancamento + " tem duracao de " + tempoDuracao + " minutos";
        //System.out.println(texto + "\nAproveite o filme!");

        String texto2 = String.format(" O filme %s lancado em %d tem uma duracao de %d minutos\n Media da critica: %b\n Letra inicial: %c\n Sucesso de bilheteria: %b", nomeFilme, anoLancamento, tempoDuracao, valorCritica, letraInicial, sucessoBilheteria);
        System.out.println(texto2);
    }
}
