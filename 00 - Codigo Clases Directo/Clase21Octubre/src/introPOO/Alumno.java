package introPOO;

public class Alumno {
	
	//DNI, Nombre, Email, edad.
	String dni;
	String nombre;
	String email;
	int edad;
	float[] notas; //Inicializar este array
	Curso curso;
	
	//Constructor por defecto
	public Alumno() {
		dni = null;
		nombre = null;
		email = null;
		edad = 0;
		notas = new float[10];
		//Si la ley no permite poner ceros
		//Pero sino
		for(int i  = 0;i<notas.length;i++) {
			notas[i] = -1;
		}
	}
	
	//Añadir notas
	
	public void addNota(float nota) {
		
		for(int i = 0;i<notas.length;i++) {
			if(notas[i] == -1) {
				notas[i] = nota;
				break;
			}
		}
	}

}
