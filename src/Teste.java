
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList<Integer> numeros = new DoublyLinkedList<Integer>();
		
		numeros.insert(1, 0);
		numeros.insert(2, 1);
		numeros.insertLast(3);
		numeros.insertLast(4);
		
		System.out.println(numeros.toString());
		
		numeros.swap(1, 3);
		System.out.println(numeros.toString());

	}

}
