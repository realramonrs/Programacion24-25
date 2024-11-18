package empleados;

import java.time.LocalDate;

public class Operario extends TFijo {

	//Formula para calcular el salario de un Operario
	//Salario = 800 + 70*añosAntiguedad + 10*nºObras
	private int numeroObras;
	
	
	public Operario(String dni, LocalDate fechaInicio, int numeroObras) {
		super(dni, fechaInicio);
		this.numeroObras = numeroObras;
	}
	
	public Operario(String dni) {
		super(dni);
		
	}
	
	
	
	public int getNumeroObras() {
		return numeroObras;
	}

	public void setNumeroObras(int numeroObras) {
		this.numeroObras = numeroObras;
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		//Calcular antiguedad:
		super.calcularAntiguedad();
		salario = 800 + super.getAntiguedad()*70 + 10*numeroObras;
	}
}
