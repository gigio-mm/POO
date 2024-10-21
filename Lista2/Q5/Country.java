package Q5;
import java.util.ArrayList;

public class Country{

    String codigoIso;
    String nome;
    int populacao;
    Double dimensao;
    ArrayList<String> fronteiras;

    public Country(String codigoIso, String nome, Double dimensao) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public Double getDimensao() {
        return dimensao;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public void setDimensao(Double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean equals(Country outraCountry) {
        if (outraCountry == null) {
            return false;
        }
        return codigoIso.equals(outraCountry.getCodigoIso());
    }

    public double densidadePopulacional() {
        return populacao / dimensao;
    }

    public void adicionarFronteira(String fronteira) {
        if (!fronteiras.contains(fronteira)) {
            fronteiras.add(fronteira);
        }
    }

    public void listarFronteiras() {
        System.out.println("Fronteiras do país " + nome + ": " + fronteiras);
    }
}


