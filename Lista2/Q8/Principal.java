package Q8;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz 1: ");
        int linhas1 = teclado.nextInt();
        System.out.print("Digite o número de colunas da matriz 1: ");
        int colunas1 = teclado.nextInt();
        Matriz matriz1 = new Matriz(linhas1, colunas1);

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "] da matriz 1: ");
                matriz1.setElemento(i, j, teclado.nextDouble());
            }
        }

        System.out.print("Digite o número de linhas da matriz 2: ");
        int linhas2 = teclado.nextInt();
        System.out.print("Digite o número de colunas da matriz 2: ");
        int colunas2 = teclado.nextInt();
        Matriz matriz2 = new Matriz(linhas2, colunas2);

        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "] da matriz 2: ");
                matriz2.setElemento(i, j, teclado.nextDouble());
            }
        }

        System.out.println("Matriz 1:");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                System.out.print(matriz1.getElemento(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2:");
        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.print(matriz2.getElemento(i, j) + " ");
            }
            System.out.println();
        }

        Matriz soma = matriz1.adicionar(matriz2);
        if (soma != null) {
            System.out.println("Soma das Matrizes:");
            for (int i = 0; i < soma.linhas; i++) {
                for (int j = 0; j < soma.colunas; j++) {
                    System.out.print(soma.getElemento(i, j) + " ");
                }
                System.out.println();
            }
        }

        boolean iguais = matriz1.comparar(matriz2);
        System.out.println("As matrizes são iguais? " + iguais);

        Matriz transposta = matriz1.transposta();
        System.out.println("Transposta da Matriz 1:");
        for (int i = 0; i < transposta.linhas; i++) {
            for (int j = 0; j < transposta.colunas; j++) {
                System.out.print(transposta.getElemento(i, j) + " ");
            }
            System.out.println();
        }

        Matriz oposta = matriz1.oposta();
        System.out.println("Oposta da Matriz 1:");
        for (int i = 0; i < oposta.linhas; i++) {
            for (int j = 0; j < oposta.colunas; j++) {
                System.out.print(oposta.getElemento(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("A Matriz 1 é identidade? " + matriz1.identidade());
        System.out.println("A Matriz 1 é diagonal? " + matriz1.diagonal());
        System.out.println("A Matriz 1 é singular? " + matriz1.singular());
        System.out.println("A Matriz 1 é simétrica? " + matriz1.simetrica());
        System.out.println("A Matriz 1 é anti-simétrica? " + matriz1.antiSimetrica());

        Matriz subtracao = matriz1.subtrair(matriz2);
        if (subtracao != null) {
            System.out.println("Subtração das Matrizes:");
            for (int i = 0; i < subtracao.linhas; i++) {
                for (int j = 0; j < subtracao.colunas; j++) {
                    System.out.print(subtracao.getElemento(i, j) + " ");
                }
                System.out.println();
            }
        }

        Matriz multiplicacao = matriz1.multiplicar(matriz2);
        if (multiplicacao != null) {
            System.out.println("Multiplicação das Matrizes:");
            for (int i = 0; i < multiplicacao.linhas; i++) {
                for (int j = 0; j < multiplicacao.colunas; j++) {
                    System.out.print(multiplicacao.getElemento(i, j) + " ");
                }
                System.out.println();
            }
        }

        Matriz copia = matriz1.copia();
        System.out.println("Cópia da Matriz 1:");
        for (int i = 0; i < copia.linhas; i++) {
            for (int j = 0; j < copia.colunas; j++) {
                System.out.print(copia.getElemento(i, j) + " ");
            }
            System.out.println();
        }


    }



}
