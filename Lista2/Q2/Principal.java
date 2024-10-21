package Q2;

public class Principal {
    public static void main(String[] args) {

        Ponto2D p1 = new Ponto2D();
        Ponto2D p2 = new Ponto2D(10,20);
        Ponto2D p3 = new Ponto2D(p2);

        System.out.println("Coordenadas do ponto 1: (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("Coordenadas do ponto 2: (" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("Coordenadas do ponto 3: (" + p3.getX() + "," + p3.getY() + ")");

        p1.setX(15.5);
        p1.setY(20.4);

        System.out.println("Novas coordenadas do ponto 1: (" + p1.getX() + "," + p1.getY() + ")");

        if(p1.VerificarIgualdade(p2)){
            System.out.println("Ponto 1 é igual ao ponto 2");
        }
        else{
            System.out.println("Ponto 1 é diferente do ponto 2");
        }

        if(p2.VerificarIgualdade(p3)){
            System.out.println("Ponto 2 é igual ao ponto 3");
        }
        else{
            System.out.println("Ponto 2 é diferente do ponto 3");
        }

        if(p3.VerificarIgualdade(p1)){
            System.out.println("Ponto 3 é igual ao ponto 1");
        }
        else{
            System.out.println("Ponto 3 é diferente do ponto 1");
        }

        double distancia = p1.CalculoDistancia(p2);
        System.out.printf("A distância entre p1 e p2 é: %.2f", distancia);

    }
}
