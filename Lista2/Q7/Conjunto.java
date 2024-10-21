package Q7;
import java.util.ArrayList;

public class Conjunto {

    ArrayList<String> conjunto = new ArrayList<>();


    public void AddElement(String NovoElemento) {
        if (!conjunto.contains(NovoElemento)) {
            conjunto.add(NovoElemento);
        } else {
            System.out.println("O elemento já existe");
        }
    }

    public void VerificarElementoPresente(String NovoElemento) {
        if(conjunto.contains(NovoElemento)) {
            System.out.println("O elemento pertence ao conjunto.");
        }
        else{
            System.out.println("O elemento não pertence ao conjunto.");
        }
    }

    public Conjunto Uniao(Conjunto OutroConjunto) {
        Conjunto ConjuntoUniao = new Conjunto();

        for(String elemento : conjunto) {
            ConjuntoUniao.AddElement(elemento);
        }

        for(String elemento : OutroConjunto.conjunto){
            if(!ConjuntoUniao.conjunto.contains(elemento)){
                ConjuntoUniao.AddElement(elemento);
            }
        }
        return ConjuntoUniao;
    }

    public Conjunto Interseccao(Conjunto OutroConjunto) {
        Conjunto ConjuntoInterseccao = new Conjunto();

        for(String elemento : conjunto) {
            if(OutroConjunto.conjunto.contains(elemento)) {
                ConjuntoInterseccao.AddElement(elemento);
            }
        }
        return ConjuntoInterseccao;
    }

    public Conjunto Subtracao(Conjunto OutroConjunto) {
        Conjunto ConjuntoSubtracao = new Conjunto();

        for(String elemento : conjunto) {
            if(!OutroConjunto.conjunto.contains(elemento)) {
                ConjuntoSubtracao.AddElement(elemento);
            }
        }
        return ConjuntoSubtracao;
    }

}