package Q1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Contador X = new Contador();

        X.setValor(20);
        System.out.println(X.getValor());
        X.incrementar();
        System.out.println(X.getValor());
        X.zerar();
        System.out.println(X.getValor());

    }
}
