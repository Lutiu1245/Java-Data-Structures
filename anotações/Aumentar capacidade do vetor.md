
Basicamente, a maneira de aumentar a capacidade de um vetor no java é criando um novo vetor e trazendo para ele os elementos do vetor original.

#### Resumo da opera:
- Verificar se tá cheio
- Caso esteja cheio, dobramos a capacidade
- Copiamos os dados do vetor original para o novo
- Trocamos o vetor original, pelo novo vetor.
---
- Quando vamos aumentar a capacidade do vetor? -> Sempre que tamanho do vetor for igual ao tamanho do vetor.
Digamos que o vetor chamado tem a capacidade para 3 elementos:
```java
public class Vetor {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {  
    this.elementos = new String[capacidade];  
    this.tamanho = 0;  
	}
}

public static void main(String[] args) {
	Vetor vetor = new Vetor(3); // [null, null, null]

	vetor.adiciona("elemento 1");  
	vetor.adiciona("elemento 2");  
	vetor.adiciona("elemento 3");
	vetor.adiciona("novo elemento");

	// restante do codigo
}
```
dessa forma o "novo elemento" não irá ser adicionado pois o tamanho do vetor é 3.

## criando função que aumenta a capacidade

Quando aumentamos a capacidade de um novo array, não faz sentido que ele aumente de um em um, fazemos com que caso ele fique cheio -> Dobre a capacidade [[Explicando o pq de dobrar a capacidade]]]()
```java
private void aumentaCapacidade() {
	if(this.elemento.length === this.tamanho) {
	  String novosElementos= new String[this.elemento.length*2];
	  for (i = 0; i<this.tamanho;i++) {
		novosElementos[i] = this.elemento[i];
	}
	  this.elemento = novosElementos;
	}
	
}
```

# Passando pente fino:
- caso o vetor esteja cheio ->
- crie um novo vetor com o dobro da capacidade do atual.
- passe de elemento em elemento, copiando de um vetor para o outro.
- depois atribua ao vetor original, o novo vetor com o dobro da capacidade.