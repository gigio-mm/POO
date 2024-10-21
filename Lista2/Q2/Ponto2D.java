package Q2;

public class Ponto2D{

    double x;
    double y;

    Ponto2D(){
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    Ponto2D(Ponto2D p1){
        this.x = p1.x;
        this.y = p1.y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public boolean VerificarIgualdade(Object OutroPonto){
        if(this == OutroPonto){
            return true;
        }
        if(OutroPonto == null){
            return false;
        }

        Ponto2D Ponto = (Ponto2D)OutroPonto;
        return (this.x == Ponto.getX() && this.y == Ponto.getY());
    }

    public double CalculoDistancia(Ponto2D OutroPonto){
        double dx = this.x - OutroPonto.x;
        double dy = this.y - OutroPonto.y;

        return Math.sqrt(dx*dx + dy*dy);
    }

}
