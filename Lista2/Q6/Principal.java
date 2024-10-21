package Q6;

public class Principal {
    public static void main(String[] args) {

        Pessoa mae = new Pessoa("Raimunda");
        Pessoa pai = new Pessoa("José");
        Pessoa filho = new Pessoa("Júnior", mae, pai);

        System.out.println("Filho: " + filho.getNome());
        System.out.println("Mãe: " + filho.getMae().getNome());
        System.out.println("Pai: " + filho.getPai().getNome());

        Pessoa filho2 = new Pessoa("Júnior", mae, pai);
        if (filho.equals(filho2)) {
            System.out.println("As pessoas são iguais.");
        } else {
            System.out.println("As pessoas são diferentes.");
        }


    }
}
