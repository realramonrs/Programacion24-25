package gestionExamenes;

import java.time.LocalDate;

public class ExamenTipoTest extends Examen {

	private int preguntasAcertadas;
	private int preguntasFalladas;
	
	public ExamenTipoTest(LocalDate fechaRealizacion, int preguntasAcertadas, int preguntasFalladas) {
		super(fechaRealizacion);
		this.preguntasAcertadas = preguntasAcertadas;
		this.preguntasFalladas = preguntasFalladas;
	}

	public int getPreguntasAcertadas() {
		return preguntasAcertadas;
	}

	public void setPreguntasAcertadas(int preguntasAcertadas) {
		this.preguntasAcertadas = preguntasAcertadas;
	}

	public int getPreguntasFalladas() {
		return preguntasFalladas;
	}

	public void setPreguntasFalladas(int preguntasFalladas) {
		this.preguntasFalladas = preguntasFalladas;
	}
	
	//Un examen tipoTest se considera aprobado si las preguntadas acertas superan a las erróneas
	
	@Override
	public boolean aprobar() {
		// TODO Auto-generated method stub
		if(this.preguntasAcertadas>this.preguntasFalladas) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
