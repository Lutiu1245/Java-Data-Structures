# Adicionando elemento no final do vetor.

````java
public void adiciona(String elemento) {
    for (int i = 0; i < elementos.length; i++) {
        if (elementos[i] == null) {
            elementos[i] = elemento;
            break;
        }
    }
}
````

O problema desta solução é que e se nós tivessemos um array com 1000 elementos?
estariamos indo um de cada vez até achar a próxima posição.
Uma alternativa, seria guardar a última posição em que foi adionado um novo elemento,
usamos um elemento que se inicia em 0 e vai sendo incrementado a cada vez que um elemento for adicionado.

````java
public boolean adiciona(String elemento) {
    if (this.tamanho < this.elementos.length) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        return true;
    }
    return false;
}
````

Pronto, agora sim estamos adicionando ao último elemento.

# Retornando um elemento de acordo com sua uma posição dentro do array.

Vamos receber um número que equivale a posição a ser buscada dentro do array.

 ````java
public String busca(int posicao) {
    if (!(posicao < this.tamanho && posicao >= 0)) {
        return "dá não filho";
    }
    return this.elementos[posicao];
}
 `````

# Verificar se um elemento existe dentro do array.

Vamos receber o elemento a ser buscado dentro do array.

````java
public int busca(String elemento) {
    for (int i = 0; i < this.tamanho; i++) {
        if (this.elementos[i].equals(elemento)){
            return i;
        }
    }
    return -1;
}
````

