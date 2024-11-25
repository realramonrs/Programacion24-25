package gestionExamenes;

import java.time.LocalDate;

public abstract class Examen {

	private LocalDate fechaRealizacion;
	private String calificacion;

	public Examen(LocalDate fechaRealizacion) {
		
		this.fechaRealizacion = fechaRealizacion;
	}

	public LocalDate getFechaRealizacion() {
		return fechaRealizacion;
	}

	public void setFechaRealizacion(LocalDate fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}

	@Override
	public String toString() {
		return "Examen [fechaRealizacion=" + fechaRealizacion + "]";
	}
	
	public abstract boolean aprobar();
		 //No se programarlo
	
}
