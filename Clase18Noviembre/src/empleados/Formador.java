package empleados;

import java.time.LocalDate;
import java.time.Period;

public class Formador extends Autonomo implements Antiguable {

	private LocalDate fechaInicio;
	private int antiguedad;

	public Formador(String iban, String cif, float costeHora, float horas,LocalDate fecha) {
		super(iban, cif, costeHora, horas);
		this.fechaInicio = fecha;
		// TODO Auto-generated constructor stub
	}
	
	//Salario es el del Autonomo + 10% de IVA
	
	@Override
	public void calcularSalario() {
		super.calcularSalario(); 
		salario = (float)(salario + 0.1*salario) ;
	}

	@Override
	public void calcularAntiguedad() {
		// TODO Auto-generated method stub
		Period p = Period.between(fechaInicio, LocalDate.now());
		this.antiguedad = p.getYears();
	}
}
