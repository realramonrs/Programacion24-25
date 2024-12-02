package clases;

public class Libro {

	private String ISBN;
	private String titulo;
	private Autor autor; //Por composicion
	private boolean alquilado;
	
	//Constructores
	public Libro() {
		
	}	
	public Libro(String isbn) {
		
		this.ISBN = isbn;
	}
	
	public Libro(String isbn,String titulo,Autor autor) {
		//this.ISBN = isbn;
		this(isbn);
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
			return "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + " Alquilado";
			}
		return "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", No Alquilado";
				
	}
	
	
	/*public boolean getAlquilado() {
		return this.alquilado;
	}
	
	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}*/
	
	
	
	
	
}
