package clases;

public class Autor {
	
	//Definición de una nueva variable
	private String nombre;
	private String pais;
	private int edad;
	
	//Constructores
	//Por defecto
	public Autor() {
		nombre = null;
		pais = null;
		edad = 0;
	}
	
	public Autor(String nombre,String pais,int edad) {
		this.nombre = nombre;
		this.pais = pais;
		
		setEdad(edad);
	}
	
	//Métodos de acceso get (lectura) set (escritura)para la edad
	public int getEdad() {
		return this.edad;
	}	
	
	public void setEdad(int edad) {
		if(edad>=0 && edad <=150) {
			this.edad = edad;
		}
	}	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	//Sobreescribir el método toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	return this.nombre + " " + this.pais + " " + this.edad;
	}
	
	//Método que printe por consola la info del autor
	
	public void printAutor() {
		System.out.println(this);
	}
	

	
	
	
	
	
	
	
	

}
