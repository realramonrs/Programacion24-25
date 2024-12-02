package gestionExamenes;

import java.time.LocalDate;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExamenEscrito e1 = new ExamenEscrito(LocalDate.now(),80,4);
		ExamenOral o1 = new ExamenOral(LocalDate.now(),NivelSatisfaccion.suficiente);
		Examen e = new ExamenEscrito(LocalDate.now(),78,10);
		//Creamos un alumno
		Alumno a1 = new Alumno();		
		a1.addExamen(e1);
		a1.addExamen(o1);
		a1.addExamen(e);
		a1.addExamen(new ExamenTipoTest(LocalDate.now(), 25, 20));
		
		//Calificar
		a1.calificar();
		
		System.out.println(a1);
		
		
		
	}

}
