package mapping;

public class Libro {
	private int codigo;
	private String titulo;
	private String autor;
	private float precio;
	private String genero;
	
	public Libro(int codigo, String titulo, String autor, float precio,String genero) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.genero = genero;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return codigo + ", " + titulo + " ," + autor + ", " + precio
				+ ", " + genero;
	}
	
	

}
