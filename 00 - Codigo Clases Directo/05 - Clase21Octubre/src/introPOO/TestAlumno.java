package introPOO;

import java.util.Arrays;
import java.util.Random;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio = new Random();
		//Declarar variables de tipo Alumno
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno();
		
		//Modificar datos del alumno a1
		//a1.dni = "12345678P";
		a2.dni = "98765431D";
		
		//Muestro a1 por pantalla
		System.out.println(a1.dni + " " + a1.edad + " " + a1.email+ " " + a1.nombre);

		//Poner una nota a a1
		a1.addNota(2);
		a1.addNota(5);
		
		
		
		//Mostrar por pantalla las notas de a1
		System.out.println(Arrays.toString(a1.notas));
		System.out.println(Arrays.toString(a2.notas));
	}

}
