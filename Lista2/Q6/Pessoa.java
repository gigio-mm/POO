package Q6;

public class Pessoa {

    public String nome;
    public Pessoa pai;
    public Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public boolean equals(Pessoa outraPessoa) {
        if (outraPessoa == null) {
            return false;
        }
        return this.nome.equals(outraPessoa.nome) && this.mae == outraPessoa.mae;
    }


}

