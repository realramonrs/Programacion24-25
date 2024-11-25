package clases;

public class Libro {

	//Atributos de instancia: Cada objeto tiene su copia y su valor
	private String ISBN;
	private String titulo;
	private Autor autor; //Por composicion
	private boolean alquilado;
	//Atributos de clase: Son compartidos por todos los objetos
	//Todos los libros pertenecen a la misma Editorial
	private static String editorial;
	private static int contador;
		
	//Constructores
	public Libro() {
		contador++;
	}	
	public Libro(String isbn) {
		this();
		this.ISBN = isbn;
	}
	
	public Libro(String isbn,String titulo,Autor autor) {
		//this.ISBN = isbn;
		
		this(isbn); //Llamada al constructor Libro(String ISBN)
		this.titulo = titulo;
		this.autor = autor;
		
		}
	
	public Libro(String isbn,String titulo,String nombre,String pais , int edad) {
	/*	this.ISBN = isbn;
		this.titulo = titulo;
		this.autor = new Autor(nombre,titulo,edad);*/
		this(isbn,titulo,new Autor(nombre,pais,edad)); //Llamada al segundo constructor utilizando instanciación anónima
		
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public boolean isAlquilado() {
		return alquilado;
	}
	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}
	@Override
	public String toString() {
		
		if(alquilado) {
			return Libro.editorial + " ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + " Alquilado";
			}
		return Libro.editorial + " ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", No Alquilado";
				
	}
		
	//Clase 4 Noviembre: Metodos set y get para variable static editorial
	public static String getEditorial() {
		return editorial;
	}
	public static void setEditorial(String editorial) {
		Libro.editorial = editorial;
	}
	public static int getContador() {
		return contador;
	}
	
	
	
	
	
}
