import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

//    public void adiciona(String elemento) {
//        for (int i = 0; i < elementos.length; i++) {
//            if (elementos[i] == null) {
//                elementos[i] = elemento;
//                break;
//            }
//        }
//    }
    public boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona1(int posicao, String elemento) {
        if (!(posicao < this.tamanho && posicao >= 0)) {
            return false;
        }
        // tamanho = 3 [2] => [1]
        // 0 1 2 3 4 // indicies
        // 1 2 3 + + // tamanho
        for (int i = this.tamanho - 1; i >= posicao ; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        tamanho++;
        return false;
    }

//    public String busca(int posicao) {
//        if (!(posicao < this.tamanho && posicao >= 0)) {
//            return "dá não filho";
//        }
//        return this.elementos[posicao];
//    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "elementos=" + Arrays.toString(elementos);

    }
}
