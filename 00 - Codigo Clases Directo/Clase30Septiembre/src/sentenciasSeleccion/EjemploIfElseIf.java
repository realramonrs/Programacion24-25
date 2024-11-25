package sentenciasSeleccion;

public class EjemploIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que califica una nota como:
		//Entregado todas las tareas.
		//Suspenso si es < 5
		//Aprobado si es >= 5 y <7
		//Sobresaliente si es >=7
		int nota = 5;
		boolean tareasEntregadas = false;
		
		if(nota < 5 || tareasEntregadas==false) {
			System.out.println("Suspenso");
		}
		else if(nota < 7) {
			System.out.println("Aprobado");
		}
		else if(nota<=10) {
			System.out.println("Sobresaliente");
		}
		else {
			System.out.println("Error en la nota");
		}
		System.out.println("*FIN DEL PROGRAMA**");
		
		
		//Programa que dice si un número es positivo o negativo
		
		int numero = -5;		
		boolean positivo = numero >=0;
		
		if(!positivo) {
			System.out.println("Numero negativo");
		}
		else {
			System.out.println("Numero positivo");
		}
		
		
		
	}

}
