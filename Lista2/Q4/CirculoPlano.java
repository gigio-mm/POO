package Q4;
import Q2.Ponto2D;


public class CirculoPlano {

    double raio;
    Ponto2D Centro;
    double pi = 3.14;


    public CirculoPlano(double raio, Ponto2D Centro){
        this.raio = raio;
        this.Centro = Centro;
    }

    public CirculoPlano(double raio){
        this.raio = raio;
        this.Centro = new Ponto2D(0,0);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto2D getCentro() {
        return Centro;
    }

    public void setCentro(Ponto2D centro) {
        Centro = centro;
    }

    public void Inflar(double valor){
        if(valor > 0){
            this.raio += valor;
        }
        else{
            System.out.println("Dê um valor positivo para inflar");
        }
    }

    public void Desinflar(double valor){
        if(valor > 0){
            if(this.raio - valor >= 0){
                this.raio -= valor;
            }
            else{
                System.out.println("O raio não pode ser negativo");
            }
        }
        else{
            System.out.println("Dê um valor positivo para desinflar");
        }
    }

    public double AreaCirculo(){
        return pi * (raio * raio);
    }

}
