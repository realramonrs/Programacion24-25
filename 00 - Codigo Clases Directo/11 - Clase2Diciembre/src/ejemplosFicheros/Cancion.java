package ejemplosFicheros;

public class Cancion {

	private String titulo;
	private String autor;
	private int valoracion;
	
	public Cancion() {
		
	}
	public Cancion(String titulo, String autor, int valoracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.valoracion = valoracion;
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
	public int getValoracion() {
		return valoracion;
	}
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	@Override
	public String toString() {
		return titulo + "," + autor + "," + valoracion;
	}
	
	
	
	
}
