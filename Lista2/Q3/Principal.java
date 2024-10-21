package Q3;

import Q2.Ponto2D;

public class Principal {
    public static void main(String[] args) {

        Ponto2D p1 = new Ponto2D(20,10);
        Ponto2D p2 = new Ponto2D(15,30);

        Reta Primeira = new Reta(5.0,10.0);
        Reta Segunda = new Reta(p1,p2);

        System.out.println("A equação da primeira reta é: " + Primeira.EquacaoReta());
        System.out.println("A equação da segunda reta é: " + Segunda.EquacaoReta());

        Primeira.setCoefAngular(5);
        Primeira.setCoefLinear(15);

        System.out.println("Os novos coeficientes da primeira reta são: " + Primeira.getCoefAngular() + " e " + Primeira.getCoefLinear());

        Ponto2D p3 = new Ponto2D(10,10);
        Ponto2D p4 = new Ponto2D(2,25);

        if(Primeira.VerificadorPontoReta(p4)){
            System.out.println("O ponto pertence a reta");
        }
        else{
            System.out.println("O ponto não pertence a reta");
        }

        if(Primeira.VerificadorPontoReta(p3)){
            System.out.println("O ponto pertence a reta");
        }
        else{
            System.out.println("O ponto não pertence a reta");
        }

        Ponto2D PontoIntersecao = Primeira.PontoInterseccao(Segunda);

        System.out.printf("O ponto de interseção das retas Primeira e Segunda é: (%.2f,%.2f)", PontoIntersecao.getX(), PontoIntersecao.getY());


    }
}
