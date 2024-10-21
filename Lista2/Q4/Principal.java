package Q4;

import Q2.Ponto2D;

public class Principal {
    public static void main(String[] args) {

        Ponto2D ponto1 = new Ponto2D(20,-2);

        
        CirculoPlano Circulo1 = new CirculoPlano(15, ponto1);
        CirculoPlano Circulo2 = new CirculoPlano(21);

        System.out.println("O raio do Círculo 1 é: " + Circulo1.getRaio() + " e o centro se localiza em: (" + Circulo1.Centro.getX() + "," + Circulo1.Centro.getY() + ")");
        System.out.println("O raio do Círculo 2 é: " + Circulo2.getRaio() + " e o centro se localiza em: ((" + Circulo2.Centro.getX() + "," + Circulo2.Centro.getY() + ")");

        Circulo1.setRaio(10);
        System.out.println("O novo raio do Círculo 1 é: " + Circulo1.getRaio());

        Circulo1.Inflar(10);
        Circulo2.Desinflar(10);

        System.out.println("O valor do Círculo 1 inflado é: " + Circulo1.getRaio());
        System.out.println("O valor do Círculo 2 desinflado é : " + Circulo2.getRaio());

        System.out.println("A área do Círculo 1 é: " + Circulo1.AreaCirculo());
        System.out.println("A área do Círculo 2 é: " + Circulo2.AreaCirculo());


    }
}
