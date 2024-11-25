package empleados;

import java.time.LocalDate;

public class Comercial extends TFijo {

	private int numeroVentas;
	
	
	public Comercial(String dni, LocalDate fechaInicio, int numeroVentas) {
		super(dni, fechaInicio);
		this.numeroVentas = numeroVentas;
	}
	
	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}


	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		super.calcularAntiguedad();
		salario = 950 + super.getAntiguedad()*90 + numeroVentas*0.5f;
	}

}
