/**
 * 
 */
package ejercicio2;

/**
 * @author Ramon RS
 *
 */
public class Estrella extends ObjetoEspacial {

	private float luminosidad;
	private float temperatura;
	private char tipo;
	
	//Constructores
	
	public Estrella() {
		
	}

	public Estrella(float masa, float velocidad, String nombre, float luminosidad, float temperatura) {
		super(masa, velocidad, nombre);
		setLuminosidad(luminosidad);
		setTemperatura(temperatura);
		calcularTipo();
	}

	public float getLuminosidad() {
		return luminosidad;
	}

	public void setLuminosidad(float luminosidad) {
		if(luminosidad >=0 && luminosidad <=1)
		this.luminosidad = luminosidad;
		calcularTipo();
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		if(temperatura>0 && temperatura < 11)
		this.temperatura = temperatura;
		calcularTipo();
	}

	public char getTipo() {
		return tipo;
	}

	//Método para establecer el tipo de una estrella
	private void calcularTipo() {
		if(this.luminosidad>0.5f && this.temperatura>5) {
			tipo = 'K';
		}
		else if(this.luminosidad>0.5f && this.temperatura<5) {
			tipo = 'F';
			
		}
		else if(this.luminosidad<0.5f && this.temperatura>5) {
			tipo = 'G';
		}
		else {
			tipo = 'M';
		}
	}
	
	
	
	
}
