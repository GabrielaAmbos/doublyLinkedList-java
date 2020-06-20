
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercicios e = new Exercicios();
		DoublyLinkedList<Integer> numeros = new DoublyLinkedList<Integer>();
		
		numeros.insert(1, 0);
		numeros.insert(2, 1);
		numeros.insertLast(3);
		numeros.insertLast(4);
		
		System.out.println(numeros.toString());
		
		//numeros.swap(3, 1);
		//System.out.println(numeros.toString());

	//	StaticStack<Integer> pilha = e.trocaRecursivaDeListaDuplaParaPilha(numeros);
		System.out.println(e.pesquisaBinaria(numeros, 6));
		
		
	}

}
