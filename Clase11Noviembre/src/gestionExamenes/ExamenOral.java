package gestionExamenes;

import java.time.LocalDate;

public class ExamenOral extends Examen {

	private NivelSatisfaccion ns;
	
	public ExamenOral(LocalDate fecha,NivelSatisfaccion ns) {
		super(fecha);
		this.ns = ns;
	}

	public NivelSatisfaccion getNs() {
		return ns;
	}

	public void setNs(NivelSatisfaccion ns) {
		this.ns = ns;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Nivel Satisfaccion: " + ns;
	}
	
	@Override
	public boolean aprobar() {
		// TODO Auto-generated method stub
		if(this.ns == NivelSatisfaccion.excelente || this.ns == NivelSatisfaccion.suficiente) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
