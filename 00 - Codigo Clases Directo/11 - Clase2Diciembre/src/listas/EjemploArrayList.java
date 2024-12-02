package listas;
import java.util.*;
public class EjemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ciudadesGallegas = new ArrayList<String>(10);
		//Añadir elementos a la lista en la primera posición vacía
		ciudadesGallegas.add("Vigo");
		ciudadesGallegas.add("Ourense");
		ciudadesGallegas.add("Lugo");
		ciudadesGallegas.add("Pontevedra");
		
		//añadir elementos en posiciones concretas que ya estén ocupadas
		ciudadesGallegas.add(0,"A Coruña");
		//ciudades.add(5,"Oviedo"); //Suelta excepción porque la posicion 4 está vacía
		
		//reemplazar un objeto --> set
		ciudadesGallegas.set(0, "La Coruña");
		
		ArrayList<String> ciudadesEspanha = new ArrayList<String>();
		ciudadesEspanha.add("Madrid");
		ciudadesEspanha.add("Oviedo");
		ciudadesEspanha.addAll(ciudadesGallegas);
		
		//Recuperar datos de un ArrayList
		String ciudad = ciudadesEspanha.get(0);
		int posicion = ciudadesEspanha.indexOf("Vigo");
		boolean encontrado = ciudadesEspanha.contains("Madrid");
		
		//Como recorrer un ArrayList
		System.out.println("Ciudades de España: ");
		for(String c : ciudadesEspanha) {
			
			System.out.println(c);
		}
		System.out.println();
		Iterator<String> it = ciudadesEspanha.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ciudadesEspanha.add("Leon");
		
		it = ciudadesEspanha.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Al utilizar el for no es necesario volver a generar el iterador
		
		ciudadesEspanha.add("Badajoz");
		System.out.println("********************************");
		for(String c : ciudadesEspanha) {
			System.out.println(c);
		}
		System.out.println("********************************");
		for(int i = 0;i<ciudadesEspanha.size();i++) {
			System.out.println(ciudadesEspanha.get(i));
		}
		
		//Eliminar objetos de una lista
		//Por índice
		ciudadesEspanha.remove(0);
		ciudadesEspanha.remove("Vigo");
		
		System.out.println("Ciudades gallegas actualmente: ");
		for(String c : ciudadesGallegas) {
			System.out.println(c);
		}
		
		
		System.out.println("---------------------------------------------------");
		for(String c : ciudadesEspanha) {
			System.out.println(c);
		}
		ciudadesEspanha.removeAll(ciudadesGallegas);
		
		System.out.println("---------------------------------------------------");
		for(String c : ciudadesEspanha) {
			System.out.println(c);
		}
		
		//Ajustar la capacidad
		ciudadesEspanha.trimToSize();
		
	}

}
