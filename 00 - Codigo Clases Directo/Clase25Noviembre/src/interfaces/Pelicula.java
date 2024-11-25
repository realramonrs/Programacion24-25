package interfaces;

public class Pelicula implements Comparable<Pelicula> {

	private String titulo;
	private float precioAlquiler;
	private float precioVenta;
	private String director;
	
	public Pelicula(String titulo, float precioAlquiler, float precioVenta, String director) {
		super();
		this.titulo = titulo;
		this.precioAlquiler = precioAlquiler;
		this.precioVenta = precioVenta;
		this.director = director;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPrecioAlquiler() {
		return precioAlquiler;
	}
	public void setPrecioAlquiler(float precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", precioAlquiler=" + precioAlquiler + ", precioVenta=" + precioVenta
				+ ", director=" + director + "]";
	}
	@Override
	public int compareTo(Pelicula o) {
		// TODO Auto-generated method stub
		//Criterio de ordenacion por defecto
		
		return this.titulo.compareTo(o.titulo);
	}
	
	
	
}
