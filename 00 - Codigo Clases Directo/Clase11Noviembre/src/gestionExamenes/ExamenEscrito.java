package gestionExamenes;

import java.time.LocalDate;

public class ExamenEscrito extends Examen {

	private int duracion;
	private float nota;
	
	//Constructor
	
	public ExamenEscrito(LocalDate fechaRealizacion,int duracion,float nota) {
		super(fechaRealizacion);
		this.duracion = duracion;
		this.nota = nota;		
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Duracion: " + duracion + " Nota: " + nota;
	}
	
	@Override
	public boolean aprobar() {
		// TODO Auto-generated method stub
		if(nota>=6 && duracion<=90) {
			return true;
		}
		else {
			return false;
		}
	}
}
