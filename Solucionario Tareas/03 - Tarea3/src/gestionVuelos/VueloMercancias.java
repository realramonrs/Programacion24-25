package gestionVuelos;

import java.time.LocalDate;

public class VueloMercancias extends Vuelo {
	Mercancia mercancia;
	float peso;
	float precioBase;
	
	public VueloMercancias(Companhia companhia, Lugar origen, Lugar destino, LocalDate fechaSalida,Mercancia mercancia,float peso) {
		super(companhia, origen, destino, fechaSalida);
		this.mercancia = mercancia;
		this.peso = peso;
		setPrecioBase();
	}
	
	private void setPrecioBase() {
		switch(mercancia) {
		case Alimentacion:
			this.precioBase = 100;
			break;
		case ResiduosNucleares:
			this.precioBase = 450;
			break;
		case Combustible:
			this.precioBase = 275;
			break;
		}
	}

	public Mercancia getMercancia() {
		return mercancia;
	}

	public void setMercancia(Mercancia mercancia) {
		this.mercancia = mercancia;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	@Override
	public float calcularGanancia() {
		// TODO Auto-generated method stub
		return peso*precioBase;
	}

	@Override
	public String toString() {
		return super.toString() + "VueloMercancias [mercancia=" + mercancia + ", peso=" + peso + ", precioBase=" + precioBase + "]";
	}
	
	public void aplicarImpuesto() {
		
	}

	
}
