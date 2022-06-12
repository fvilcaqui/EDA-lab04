
public class Node<E> {
	private E data;
	private Node<E> next;
	private Node<E> ant;
	public Node(E data, Node<E> next,Node<E> ant) {
		this.data = data;
		this.next = next;
		this.ant = ant;
	}
	public Node(E data) {
		this(data, null);
	}
	public Node ( E data , Node <E > nextNode ) {
	    this . data = data ;
	    this . next = nextNode ;
	    this . ant = null ;
	}
	public E getData() {
		return this.data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node<E> getNext(){
		return this.next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	public Node<E> getAnt(){
	    return this.ant;
	}
	public void setAnt(Node<E> ant) {
		this.ant = ant;
	}
	public String toString() {
		return this.getData().toString();
	}
}
