package Q7;

public class Principal {
    public static void main(String[] args) {

        Conjunto conjunto1 = new Conjunto();

        conjunto1.AddElement("A");
        conjunto1.AddElement("B");
        conjunto1.AddElement("C");

        Conjunto conjunto2 = new Conjunto();

        conjunto2.AddElement("B");
        conjunto2.AddElement("C");
        conjunto2.AddElement("D");

        Conjunto uniao = conjunto1.Uniao(conjunto2);
        System.out.println("União: " + uniao.conjunto);

        Conjunto interseccao = conjunto1.Interseccao(conjunto2);
        System.out.println("Interseção: " + interseccao.conjunto);

        Conjunto subtracao = conjunto1.Subtracao(conjunto2);
        System.out.println("Subtração: " + subtracao.conjunto);

        conjunto1.VerificarElementoPresente("A");
        conjunto2.VerificarElementoPresente("E");

    }
}
