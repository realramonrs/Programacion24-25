package farmaciasApp;

import java.time.LocalDate;

public class Cosmetica extends Parafarmacia {

	private boolean dermatologico;

	public Cosmetica(String codigo, String nombre, String fabricante, float precio, float peso, boolean dermatologico)
			throws Exception {
		super(codigo, nombre, fabricante, precio, peso);
		this.dermatologico = dermatologico;
	}

	public boolean isDermatologico() {
		return dermatologico;
	}

	public void setDermatologico(boolean dermatologico) {
		this.dermatologico = dermatologico;
	}

	@Override
	public String toString() {
		return "Cosmetica [dermatologico=" + dermatologico + ", toString()=" + super.toString() + "]";
	}

	@Override
	public float calcularPrecioFinal() {
		// TODO Auto-generated method stub
		float precioFinal = 0;
		
		precioFinal = getPrecio() + getPrecio()*0.1f;
		
		return precioFinal;
	}

	
	
	
	
}
