package Q3;
import Q2.Ponto2D;

public class Reta {

    double CoefAngular;
    double CoefLinear;

    public Reta(double CoefAngular, double CoefLinear){
        this.CoefAngular = CoefAngular;
        this.CoefLinear = CoefLinear;
    }

    public Reta(Ponto2D P1, Ponto2D P2){
        this.CoefAngular = (P2.getY() - P1.getY()) / (P2.getX() - P1.getX());
        this.CoefLinear = P1.getY() - this.CoefAngular * P1.getX();
    }

    public String EquacaoReta(){
        return "y = " + CoefAngular + "x + " + CoefLinear;
    }

    public double getCoefAngular() {
        return CoefAngular;
    }

    public void setCoefAngular(double CoefAngular) {
        this.CoefAngular = CoefAngular;
    }

    public double getCoefLinear() {
        return CoefLinear;
    }

    public void setCoefLinear(double CoefLinear) {
        this.CoefLinear = CoefLinear;
    }

    public boolean VerificadorPontoReta(Ponto2D PontoQualquer){
        if(PontoQualquer.getY() == CoefAngular * PontoQualquer.getX() + CoefLinear){
            return true;
        }
        return false;
    }

    public Ponto2D PontoInterseccao(Reta OutraReta){

        if (this.CoefAngular == OutraReta.CoefAngular){
            return null;
        }
        double xInterseccao = (OutraReta.CoefLinear - this.CoefLinear) / (this.CoefAngular - OutraReta.CoefAngular);
        double yInterseccao = this.CoefAngular * xInterseccao + this.CoefLinear;


        return new Ponto2D(xInterseccao, yInterseccao);
    }

}
