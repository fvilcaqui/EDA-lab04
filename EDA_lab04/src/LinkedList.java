
public class LinkedList<E> implements TDAList<E> {
private Node<E> first;
private Node<E> tail;	
	public LinkedList() {
		this.first = null;
	}
	public boolean isEmpty() {
		return this.first == null;
	}
	public void insertFirst(E x) {	
		this.first = new Node<E>(x, this.first);
	}
	public void insertLast(E x) {
		if(isEmpty()) 
			insertFirst(x);
		else {
			Node<E> aux = this.first;
			for(; aux.getNext() != null; aux = aux.getNext()); 
				aux.setNext(new Node<E>(x));
		}	
	}
	public void inserLastDoble(E x) {
		Node<E> nuevo = new Node<E>(x);
		if(isEmpty()) 
			insertFirst(x);
		else {
			Node<E> aux = this.first;
			while(aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(nuevo);
			nuevo.setAnt(aux);
		}	
	}
	public long OrdenarInsercionSimple() {
		Node<E> cont2 = this.first;
		long nano_startTime = System.nanoTime(); 
		while(cont2.getNext() !=null) {
			E key= null;
			Node<E> cont = this.first;
			Node<E> aux = this.first;
			for(; cont.getNext() != null && aux.getNext() != null && (int)aux.getData() > (int)aux.getNext().getData() ; cont = cont.getNext()) {
				key = aux.getNext().getData();
				while((int)aux.getData() > (int)aux.getNext().getData()) {
	                aux.getNext().setData(aux.getData());
				}
	            aux.setData(key);
	            aux = aux.getNext();
	            System.out.println(toString());
			}
			cont2 = cont2.getNext();
		}
		long nano_endTime = System.nanoTime();		
		return nano_endTime - nano_startTime;	
	}		
	
	public void OrdenarInsercionDoble() {
		E key= null;
		Node<E> a = this.first;
		Node<E> cont;
		Node<E> aux = this.first;
		aux = aux.getNext();
		for(;a.getNext() != null; a = a.getNext()) {
			key = aux.getData();
			cont = aux;
			System.out.println(key);
			while(cont.getAnt() != null) {
				cont.getNext().setData(cont.getData());
				cont = cont.getAnt();
			}
			aux = aux.getNext();
			cont.getNext().setData(key);
			System.out.println(toString());
		}
	     		
	}
		
	public String toString() {
		String str = "";
		for(Node<E> aux = this.first; aux != null; aux = aux.getNext()) {
			str += aux.getData() + ", ";
		}
		return str;	
	}
}
