package Q5;

public class Principal {
    public static void main(String[] args) {

        Country nacao1 = new Country("BRA", "Brasil", 8514876.0);
        nacao1.setPopulacao(212600000);
        nacao1.adicionarFronteira("Argentina");
        nacao1.adicionarFronteira("Paraguai");
        nacao1.adicionarFronteira("Uruguai");
        nacao1.adicionarFronteira("Venezuela");
        nacao1.adicionarFronteira("Bolívia");
        nacao1.adicionarFronteira("Colômbia");
        nacao1.adicionarFronteira("Guiana");
        nacao1.adicionarFronteira("Suriname");
        nacao1.adicionarFronteira("Guiana Francesa");

        Country nacao2 = new Country("CHL", "Chile", 756102.0);
        nacao2.setPopulacao(19000000);
        nacao2.adicionarFronteira("Argentina");
        nacao2.adicionarFronteira("Peru");

        System.out.println("Nome do país: " + nacao1.getNome());
        System.out.println("Código ISO: " + nacao1.getCodigoIso());
        System.out.println("Dimensão do país: " + nacao1.getDimensao());
        System.out.println("População do país: " + nacao1.getPopulacao());
        nacao1.listarFronteiras();

        System.out.println("Nome do país: " + nacao2.getNome());
        System.out.println("Código ISO: " + nacao2.getCodigoIso());
        System.out.println("Dimensão do país: " + nacao2.getDimensao());
        System.out.println("População do país: " + nacao2.getPopulacao());
        nacao2.listarFronteiras();

    }
}