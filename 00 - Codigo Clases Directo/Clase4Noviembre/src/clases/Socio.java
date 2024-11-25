package clases;

public class Socio {

	private String nombre;
	private String dni;
		
	//Constructores
	
	public Socio(String nombre, String dni) {
		//super(); //Llamada al constructor por defector de la clase base
		this.nombre = nombre;
		setDni(dni);
	}

	public Socio() {
		
	}
		
	//Métodos de acceso
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		//Validar DNI
		if(validarDNI(dni)) {
			this.dni = dni;
		}
		
	}
	private boolean validarDNI(String dni) {
		
		//Vamos a simplificar suponiendo que si tiene 9 caracteres está bien
		if(dni.length()==9) {
			return true;
		}
		return false;
		
	}

	//toString
	@Override
	public String toString() {
		return "nombre=" + nombre + ", dni=" + dni;
	}
		
	
}
