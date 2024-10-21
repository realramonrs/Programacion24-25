package repaso;

import java.util.Random;

public class MetodosVoid {

	//Cuando un método no devuelve ningún resultado el tipo de retorn es void
	//Método que imprime por pantalla un mensaje
	public static void escribir(String mensaje) {
		System.out.println(mensaje);		
	}
		
	//Método que le sume 10 a todas las posiciones de un array
	
	public static void suma10Arrays(int[] m) {
		for(int i = 0;i<m.length;i++) {
			m[i] = m[i] + 10;
		}
	}
	
	//Método que me llene un array con enteros
	
	public static void llenarArray(int[] m) {
		Random aleatorio = new Random();
		for(int i = 0;i<m.length;i++) {
			m[i] = aleatorio.nextInt();
		}
	}
	
	//Sobrecarga que permita indicar límite superior 
	public static void llenarArray(int[] m,int limiteSuperior) {
		Random aleatorio = new Random();
		for(int i = 0;i<m.length;i++) {
			m[i] = aleatorio.nextInt(limiteSuperior+1);
		}
	}
	
	//Sobrecarga que permita indicar límite superior 
		public static void llenarArray(int[] m,int limiteInferior,int limiteSuperior) {
			Random aleatorio = new Random();
			for(int i = 0;i<m.length;i++) {
				m[i] = aleatorio.nextInt(limiteInferior,limiteSuperior+1);
			}
		}
		
		
	
}
