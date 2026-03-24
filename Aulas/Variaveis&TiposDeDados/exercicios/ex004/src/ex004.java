public class ex004 {
    public static void main(String[] args) throws Exception {
        String nomePizzaria = "JK Pizzaria";
        String saborDoMomento = "Nordestina";
        char tamanhoPequeno = 'P';
        char tamanhoMedio = 'M';
        char tamanhoGrande = 'G';
        float taxaEntrega = 6.00f;
        boolean recheioBorda = false; 

        System.out.println(nomePizzaria + "\nAproveite o SABOR DO MOMENTO\n" + saborDoMomento +"\nNOS TEMOS OS TAMANHOS\n" + tamanhoGrande + " " + tamanhoMedio + " " + tamanhoPequeno + "\nTaxa de entrega: R$" + taxaEntrega + "\nAs bordas recheadas no momento sao " + recheioBorda);
    }
}
