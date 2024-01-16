#### Resumo da opera:

- O método recebe a posição a ser removida
- Confere se essa posição é valida
- Começa da posição recebida e permanece enquanto a posição não for menor que o tamanho lógico - 1
- Passa os valores da direita para esquerda (o valor do i se torna i + 1)
- Decrementamos o tamanho lógico do vetor.
----
#### Código
```java
public void removeUmElemento(int posicao) {
	if(!(posicao >= 0 && posicao < this.tamanho)) {
		throw new IllegalArgumentException("Posição invalida");
	}
	for(i=posicao; i < this.tamanho - 1; i++){
		this.elementos[i] = this.elementos[i + 1];
	}
	this.tamanho--;
}
```

---
### Explicação
Não está sendo removido fisicamente o elemento do array e sim apenas colocamos ele para a ultima posição do vetor e diminuímos o tamanho lógico do vetor, dessa forma ele será ignorado em operações futuras.