public class ex002 {
    public static void main(String[] args) throws Exception {
        String nomeFilme = "O Labirinto do Fauno";
        int anoLancamento = 2006;
        int duracao = 119;
        float notaCritica = 8.2f;
        char inicialFilme = 'l';
        boolean sucessoBilheteria = true;

        System.out.format("O filme: %s\nAno de lancamento: %d\nDuracao em minutos: %d\nNota media:%.1f\nLetra inicial: %c\nFoi sucesso de bilheteria: %b", nomeFilme, anoLancamento, duracao, notaCritica, inicialFilme, sucessoBilheteria);
    }
}
