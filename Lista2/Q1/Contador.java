package Q1;
import java.util.Scanner;

public class Contador {
    Scanner teclado = new Scanner(System.in);

    int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void zerar(){
        this.valor = 0;
    }

    public void incrementar(){
        this.valor++;
    }

}
