package empleados;

import java.time.LocalDate;

public class Administrador extends TFijo {

	public Administrador(String dni, LocalDate fechaInicio) {
		super(dni, fechaInicio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		super.calcularAntiguedad();
		salario = 1200 + super.getAntiguedad()*100;
	}
	
	public void aumentarSueldo() {
		salario+=200;
	}

}
