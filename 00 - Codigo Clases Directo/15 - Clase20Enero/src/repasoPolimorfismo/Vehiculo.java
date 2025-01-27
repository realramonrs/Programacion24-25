package repasoPolimorfismo;

import java.time.LocalDate;

public abstract class Vehiculo implements Comparable<Vehiculo>{
	
	/* De todos los vehiculos interesa conocer: 
	 * String codigo: Tiene que ser un 0 o un 1 dos letras
	 * String marca;
	 * float precio;
	 * LocalDate fechaFabricacion;
	 * 
	 * Funcionalidad de todos los vehiculos: calcularPrecio;
	 * Para los coches y las motos el precio depende del tipoCombustible y de la marca
	 * Para los aviones depende del númeroDeAsientos.
	 * 
	 * Clase Coche, Clase Moto, Clase Avion
	 *  De las clases Coche y Moto interesa saber:
	 *   String matricula;
	 *   String tipoCombustible; --> Gasolina , Diesel, Eléctrico
	 *   
	 *   De los aviones interesa saber --> NúmeroAsientos
	 *   
	 *   
	 */
	
	private String codigo;
	private String marca;
	private float precio;
	private LocalDate fechaFabricacion;
	
    
	public Vehiculo(String codigo, String marca, float precio, LocalDate fechaFabricacion) throws Exception {
		super();
		
		if(validarCodigo(codigo)) {
			this.codigo = codigo;
		}
		else {
			throw new Exception("No se pudo crear el vehiculo, el código es erróneo");
		}
		this.marca = marca;
		this.precio = precio;
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Vehiculo [codigo=" + codigo + ", marca=" + marca + ", precio=" + precio + ", fechaFabricacion="
				+ fechaFabricacion + "]";
	}
	
	
	private boolean validarCodigo(String codigo) {
		//Compruebe formato
		boolean correcto = true;
		
		//1º COmprobar que tiene 3 caracteres
		if(codigo.length()!=3) {
			correcto = false;
		}
		else {
			if(codigo.charAt(0)!='0' & codigo.charAt(0)!='1') {
				correcto = false;
			}
			else if(!Character.isLetter(codigo.charAt(1)) || !Character.isLetter(codigo.charAt(2))) {
				correcto = false;
			}
			else {
				correcto = true;
			}
		}
		return correcto;
		}
	
	    public abstract void calcularPrecio();

		@Override
		public int compareTo(Vehiculo o) {
			// TODO Auto-generated method stub
			Float precio1 = Float.valueOf(precio);
			Float precio2 = Float.valueOf(o.getPrecio());
			return precio1.compareTo(precio2);
		}

		
	
	

}
