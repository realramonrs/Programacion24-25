package repasoPolimorfismo;

import java.time.LocalDate;

public class Avion extends Vehiculo {

	private int numAsientos;
	
	
	
	public Avion(String codigo, String marca, float precio, LocalDate fechaFabricacion, int numAsientos)
			throws Exception {
		super(codigo, marca, precio, fechaFabricacion);
		this.numAsientos = numAsientos;
	}


	@Override
	public void calcularPrecio() {
		// TODO Auto-generated method stub

		if(numAsientos<200) {
			super.setPrecio(2000000);
		}
		else {
			super.setPrecio(4000000);
		}
	}


	@Override
	public String toString() {
		return super.toString() + "Avion [numAsientos=" + numAsientos + ", toString()=";
	}
	
	

}
