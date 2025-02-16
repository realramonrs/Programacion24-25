/**
 * 
 */
package ejercicio2;

/**
 * @author Ramon RS
 *
 */
public class ObjetoEspacial implements Comparable<ObjetoEspacial> {

	private float masa;
	private float velocidad;
	private String nombre;
	
	private static String Universo;

	//Constructores
	
	public ObjetoEspacial(float masa, float velocidad, String nombre) {
		super();
		setMasa(masa);
		setVelocidad(velocidad);
		this.nombre = nombre;
	}

	public ObjetoEspacial() {
		super();
	}

	public float getMasa() {
		return masa;
	}

	public void setMasa(float masa) {
		if(masa>0)
		this.masa = masa;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		if(velocidad>0)
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static String getUniverso() {
		return Universo;
	}

	public static void setUniverso(String universo) {
		Universo = universo;
	}

	@Override
	public String toString() {
		return "ObjetoEspacial [masa=" + masa + ", velocidad=" + velocidad + ", nombre=" + nombre + "]";
	}

	
	
	
	//Apartado f: Método desintegrar
	public void desintegrar() {
		this.masa-=masa*0.1f;
		this.velocidad=this.velocidad*0.85f;
		
	}
	
	//Agregar criterio de igualdad por nombre:
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoEspacial other = (ObjetoEspacial) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	//Apartado g: Método static getObjetoMasivo
	public static ObjetoEspacial getObjetoMasivo(ObjetoEspacial oe1 , ObjetoEspacial oe2) {
		if(oe1.getMasa()>oe2.getMasa()) {
			return oe1;
		}
		else {
			return oe2;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(ObjetoEspacial arg0) {
		// TODO Auto-generated method stub
		Float masaf = this.getMasa();
		Float masaf2 = arg0.getMasa();
		return masaf.compareTo(masaf2);
	}
	
	
	
	
	
	
}
