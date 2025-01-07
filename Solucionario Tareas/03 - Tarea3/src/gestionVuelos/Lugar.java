package gestionVuelos;

public class Lugar {

	private String nombre;
	private GeoPunto posicion;
	public Lugar(String nombre, GeoPunto posicion) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public GeoPunto getPosicion() {
		return posicion;
	}
	public void setPosicion(GeoPunto posicion) {
		this.posicion = posicion;
	}
	@Override
	public String toString() {
		return "Lugar [nombre=" + nombre + ", posicion=" + posicion + "]";
	}
	
	public static double calcularDistacia(Lugar l1 , Lugar l2) {
		return l1.getPosicion().distancia(l2.getPosicion());
	}
}
