package clases;

import java.util.Arrays;

public class Biblioteca {

	private String nombre;
	private Libro[] libros;
	
	
	//Constructores
	public Biblioteca() {
		libros = new Libro[5];
	}
	
	public Biblioteca(String biblioteca,int capacidad) {
		this.nombre = nombre;
		libros = new Libro[capacidad];
	}
	
	public Biblioteca(String nombre, Libro[] libros) {
		super(); //Llamada al constructor de la clase base
		this.nombre = nombre;
		this.libros = libros;
	}
	
	//Método que devuelve posiciòn de un libro a partir del ISBN
	public int getLibroByIsbn(String isbn) {
		
		for(int i = 0;i<libros.length;i++) {
			if(this.libros[i].getISBN().equals(isbn)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public Libro getLibroByTitulo(String titulo) {
		for(int i = 0;i<libros.length;i++) {
			if(this.libros[i].getTitulo().equals(titulo)) {
				return libros[i];
			}
		}
		return null;
		
		}
	
	//Método que devuelve libro a partir de la posición
	public Libro getLibroByIndex(int index) {
		if(index>=0 && index <libros.length) {
			return libros[index];
			}
		return null;
	}
	
	//AlquilarLibro
	public boolean alquilarLibro(String titulo) {
		
		Libro l = getLibroByTitulo(titulo);
		
		/*if(l!=null) {
			if(! l.isAlquilado()) {
				l.setAlquilado(true);
				return true;
			}
		}*/
		
		if(l!=null && ! l.isAlquilado()) {
			l.setAlquilado(true);
			return true;
		}
		return false;
		
	}
	
	public void devolverLibro(String isbn) {
		int pos = getLibroByIsbn(isbn);
		if(pos!=-1) {
			libros[pos].setAlquilado(false);
		}		
		/*for(int i = 0;i<libros.length;i++) {
			if(libros[i].getISBN().equals(isbn)) {
				libros[i].setAlquilado(false);
				break;
			}
		}/*/
	}
	public void printarBiblioteca() {
		for(Libro l : libros) {
			System.out.println(l);
		}
	}	
	public boolean addLibro(Libro l) {
		for(int i = 0;i<libros.length;i++) {
			if(libros[i]==null) {
				libros[i] = l;
				return true;
			}
		}
		//Redimensional la matriz de libros
		redimension(this.libros.length*2);
		//Volvemos a añadir el libro
		addLibro(l); //Recursividad
		
		return false;
	}	
	
	//Redimensionado de la capacidad de la biblioteca
	private void redimension(int newCapacity) {
		Libro[] copia;
		//Volcamos los libros a la copia
		copia = Arrays.copyOf(this.libros, newCapacity);
		this.libros= copia;
		
	}
	
	
	
	
	
	
	
}
