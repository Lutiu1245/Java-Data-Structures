#### Resumo da opera:
- Irá receber o elemento a ser excluído
- Criar um novo vetor com o tamanho lógico do vetor anterior
- Criar um ponteiro
- Copiar os elementos de um para o outro, menos o elemento a ser excluído
- Substitui o antigo vetor pelo novo
- Diminuímos a capacidade do vetor atual
---
### Código

```java
public void removeDeFatoUmElemento(String elementoRemover) {  
    String[] novosElementos = new String[this.tamanho];  
    int ponteiro = 0;  

    for (int i = 0; i < this.tamanho; i++) {  
	  if(!this.elementos[i].equalsIgnoreCase(elementoRemover)){  
        novosElementos[index] = this.elementos[i];  
        index++;  
    }  
	}  
    this.elementos = novosElementos;  
    tamanho--;  
}
```

Também podemos passar o método de busca para achar o índice do elemento a ser removido ->

```java
public void removeDeFatoUmElemento(String elementoRemover) {  
    String[] novosElementos = new String[this.tamanho];  
    int ponteiro = 0;  
    int posicaoBuscada = busca(elementoRemover);

    for (int i = 0; i < this.tamanho; i++) {  
	    if(this.elementos[i] != posicaoBuscada){  
        novosElementos[index] = this.elementos[i];  
        index++;  
	    }  
	}  
    this.elementos = novosElementos;  
    tamanho--;  
}
```

