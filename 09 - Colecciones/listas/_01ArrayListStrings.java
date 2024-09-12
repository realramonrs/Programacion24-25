package listas;

import java.util.ArrayList;
import java.util.Iterator;

public class _01ArrayListStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> libros = new ArrayList<String>();
		libros.add("Los pilares de la Tierra");
		libros.add("Sinuhe , el egipcio");
		libros.add("La conjura de los necios");
		libros.add("El m�dico");
		
		//Mostrar n�mero de elementos
		System.out.println("En la colecci�n hay " + libros.size() + " libros");
		
		//El m�todo add permite indicar una posici�n para insertar un elemento
		libros.add(2, "El resplandor");
		//Esto pude soltar excepci�n si la posici�n no existe
		try {
		libros.add(9,"El hijo del C�nsul");
		}
		catch(Exception e) {
			System.out.println("No se ha podido almacenar el libro");
		}
		
		//El m�todo addAll permite guardar una lista en otra
		ArrayList<String> otrosLibros = new ArrayList<String>();
		otrosLibros.addAll(libros);
		
		//M�todo set permite reemplazar un elemento por otro
		otrosLibros.set(0, "Piensa en Java");
		
		//Para recuperar un elemento o saber en qu� posici�n est�
		String libro = libros.get(0);
		int posicion = libros.indexOf("El resplandor");
		
		//Eliminar elementos : remove
		libros.remove("El resplandor");
		libros.remove(0);
		otrosLibros.removeAll(libros);
		
		//Recorrer listas con un for each
		
		for(String s : libros) {
			System.out.println(s);
		}
		
		//Recorrer listas con iterator
		Iterator<String> it = libros.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Eliminar elemetos con iterator : con for each no se debe
		it=libros.iterator(); //Tenemos que volver a generar el iterator
		while(it.hasNext()) {
			if(it.next().startsWith("E")) {
				it.remove();
			}
		}
		System.out.println("Libros despu�s de eliminar con iterator");
		it = libros.iterator(); //Tenemos que volver a generar el iterator
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
