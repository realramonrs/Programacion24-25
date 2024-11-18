package empleados;

import java.time.LocalDate;
import java.time.Period;

public abstract class TFijo extends Trabajador implements Antiguable{

	private LocalDate fechaInicio;
	private int antiguedad;
	
	public TFijo(String dni, LocalDate fechaInicio) {
		super(dni);
		this.fechaInicio = fechaInicio;
	}
	
	public TFijo(String dni) {
		super(dni);
		this.fechaInicio = LocalDate.now();
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
		
	public void calcularAntiguedad() {
		Period p = Period.between(fechaInicio, LocalDate.now());
		this.antiguedad = p.getYears();
	}

	@Override
	public String toString() {
		return "TFijo [fechaInicio=" + fechaInicio + ", antiguedad=" + antiguedad + " Salario: " + super.getSalario() + " DNI: " + super.getDni();
	}
	
	
	

}
