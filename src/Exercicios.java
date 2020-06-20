
public class Exercicios {
	
	/**
	 * 2. Crie, em uma classe qualquer, um método recursivo que recebe uma lista duplamente encadeada
	 * (DoublyLinkedList) de String e retorna uma pilha estática (StaticStack), na qual o topo da
	 * pilha é o primeiro elemento da lista. 
	 */
	
	public StaticStack<String> trocaRecursivaDeListaDuplaParaPilha(DoublyLinkedList<String> lista) {
		StaticStack<String> aux = new StaticStack<String>(lista.numElements);
		return trocaRecursivaDeListaDuplaParaPilha(lista, lista.numElements, aux);
	}
	
	private StaticStack<String> trocaRecursivaDeListaDuplaParaPilha(DoublyLinkedList<String> lista, int posicao, StaticStack<String> pilha) {
		if(posicao == 0) {
			return pilha;
		} else {
			String aux = lista.get(posicao - 1);
			pilha.push(aux);
			posicao--;
			return trocaRecursivaDeListaDuplaParaPilha(lista, posicao, pilha);
		}
	}
	
	/*
	 * 3. Crie, em uma classe qualquer, um método recursivo que recebe uma lista duplamente encadeada
	 * (DoublyLinkedList) de inteiros e retorna verdadeiro caso ela esteja ordenada e falso caso não
	 * esteja.
	 */
	
	public boolean estaOrdenada(DoublyLinkedList<Integer> lista) {
		return estaOrdenada(lista, 0);
	}
	
	private boolean estaOrdenada(DoublyLinkedList<Integer> lista, int posicao) {
		if((lista.numElements - 1) == posicao) {
			return true;
		} else {
			if(lista.get(posicao) > lista.get(posicao + 1)) {
				return false;
			}
			return estaOrdenada(lista, ++posicao);
		}
	}
	
	/*
	 * 4. Crie um método recursivo chamado pesquisaBinaria, que recebe uma lista duplamente encadeada
	 * (DoublyLinkedList) de inteiros e um inteiro qualquer por parâmetro. Caso a lista esteja ordenada, o
	 * método realiza o algoritmo de pesquisa binária na lista para encontrar o inteiro recebido por parâmetro.
	 * Caso o elemento não esteja na lista o método deve retornar -1. Caso a lista não esteja ordenada, lance
	 * uma exceção. Você pode usar o método do exercício 3 para ajudar.
	 */
	
	public Integer pesquisaBinaria(DoublyLinkedList<Integer> lista, Integer item) {
		if(estaOrdenada(lista)) {
			return pesquisaBinaria(lista, item, 0, lista.numElements - 1);
		} else {
			throw new IllegalArgumentException("Lista nao esta ordenada!");
		}
	}

	private Integer pesquisaBinaria(DoublyLinkedList<Integer> lista, Integer item, int inicio, int fim) {
		if(inicio > fim) {
			return - 1;
		} else {
			int aux = (inicio + fim) / 2;
			if(item == lista.get(aux)) {
				return aux;
			} else if (item < lista.get(aux)) {
				fim = aux - 1;
			} else {
				inicio = aux + 1;
			}
			return pesquisaBinaria(lista, item, inicio, fim);
		}
	}
}
