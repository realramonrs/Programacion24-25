package gestionExamenes;

public class Alumno {

	private Examen[] examenes;
	private boolean aprobado;
		
	public Alumno() {
		examenes = new Examen[5];
	}
	
	public Alumno(int numeroExamenes) {
		examenes = new Examen[numeroExamenes];
	}
	
	//Añadir examen
	public boolean addExamen(Examen ex) {
		for(int i = 0;i<examenes.length;i++) {
			if(examenes[i] == null) {
				examenes[i] = ex;
				return true;
			}
		}
		return false;
	}
	
	//Obtener examen por posicion
	public Examen getExamenByPosicion(int pos) {
		return examenes[pos];
	}
	
	//Obtener si alumno está aprobado o suspenso
	public void calificar() {
		aprobado = true;
		for(Examen ex : examenes) {
			if(ex!=null) {
				if(!ex.aprobar()) {
					this.aprobado = false;
				}
			}
		}
	}//Final del método

	public boolean isAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(this.aprobado){
			return "Calificación final: Aprobado" ;
		}
		else {
			return "Calificación final: Suspenso";
		}
		
	}
	
}
