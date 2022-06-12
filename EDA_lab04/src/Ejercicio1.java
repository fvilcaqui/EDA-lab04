import java.util.*;
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TDAList<Integer> link = new LinkedList<Integer>();
		System.out.println("Ingresar la cantidad de elementos que desea: ");
		int tam = 100;
		IngresarDatos(link,tam);
		System.out.println(link);
		link.OrdenarInsercionSimple();
	}
	
	
	public static void IngresarDatos(TDAList<Integer> a, int b) {
		int cantidadMax=b;
		for(int i=0;i<b;i++) {
			a.insertLast(cantidadMax);
			cantidadMax--;
		}
	}
	
	public static void Imprimir(TDAList<Integer> a) {
		while(a.isEmpty()==false) {
			System.out.println("a");
		}
	}

}
