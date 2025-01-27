package repasoPolimorfismo;

import java.time.LocalDate;

public class Coche extends Vehiculo {

	private String matricula;
	private Combustible combustible;
	
	
	public Coche(String codigo, String marca, float precio, LocalDate fechaFabricacion, String matricula,
			Combustible combustible) throws Exception  {
		super(codigo, marca, precio, fechaFabricacion);
		this.matricula = matricula;
		this.combustible = combustible;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}
	
	public void calcularPrecio() {
		
		if(super.getMarca().equals("Mercedes") && combustible == Combustible.Diesel) {
			super.setPrecio(40000);
		}
		else if(super.getMarca().equals("Mercedes") && combustible == Combustible.Gasolina) {
			super.setPrecio(38000);
		}
	}
	
	//Calcular impuesto Circulacion
	public float calcularImpuestoCirculacion() {
		
		if(this.combustible == Combustible.Electrico) {
			return 10;
		}
		else if(this.combustible == Combustible.Diesel) {
			return 80;
		}
		else {
			return 180;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Coche [matricula=" + matricula + ", combustible=" + combustible + "]";
	}
	
	
	
}
