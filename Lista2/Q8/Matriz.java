package Q8;

public class Matriz {

    public int linhas;
    public int colunas;
    public double[][] matriz;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = new double[linhas][colunas];
    }

    public double getElemento(int linha, int coluna) {
        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            System.out.println("Índice fora dos limites");
            return 0;
        }
        return matriz[linha][coluna];
    }

    public void setElemento(int linha, int coluna, double valor) {
        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            System.out.println("Índice fora dos limites ");
            return;
        }
        matriz[linha][coluna] = valor;
    }

    public Matriz adicionar(Matriz outra) {
        if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
            System.out.println("Matrizes com dimensões diferentes.");
            return null;
        }
        Matriz resultado = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(i, j, this.getElemento(i, j) + outra.getElemento(i, j));
            }
        }
        return resultado;
    }

    public boolean comparar(Matriz outra) {
        if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (this.getElemento(i, j) != outra.getElemento(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public Matriz transposta() {
        Matriz resultado = new Matriz(colunas, linhas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(j, i, this.getElemento(i, j));
            }
        }
        return resultado;
    }

    public Matriz oposta() {
        Matriz resultado = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(i, j, -this.getElemento(i, j));
            }
        }
        return resultado;
    }

    public static Matriz matrizNula(int linhas, int colunas) {
        return new Matriz(linhas, colunas);
    }

    public boolean identidade() {
        if (linhas != colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j && this.getElemento(i, j) != 1) {
                    return false;
                }
                if (i != j && this.getElemento(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean diagonal() {
        if (linhas != colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i != j && this.getElemento(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean singular() {
        if (!diagonal()) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            if (this.getElemento(i, i) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean simetrica() {
        if (linhas != colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (this.getElemento(i, j) != this.getElemento(j, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean antiSimetrica() {
        if (linhas != colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (this.getElemento(i, j) != -this.getElemento(j, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public Matriz subtrair(Matriz outra) {
        if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
            System.out.println("Matrizes com dimensões diferentes.");
            return null;
        }
        Matriz resultado = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(i, j, this.getElemento(i, j) - outra.getElemento(i, j));
            }
        }
        return resultado;
    }

    public Matriz multiplicar(Matriz outra) {
        if (this.colunas != outra.linhas) {
            System.out.println("Matrizes incompatíveis para multiplicação.");
            return null;
        }
        Matriz resultado = new Matriz(this.linhas, outra.colunas);
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < outra.colunas; j++) {
                double soma = 0;
                for (int k = 0; k < this.colunas; k++) {
                    soma += this.getElemento(i, k) * outra.getElemento(k, j);
                }
                resultado.setElemento(i, j, soma);
            }
        }
        return resultado;
    }

    public Matriz copia() {
        Matriz nova = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                nova.setElemento(i, j, this.getElemento(i, j));
            }
        }
        return nova;
    }
}

