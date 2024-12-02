package ejemplosBucles;

import java.util.Random;

public class EjemploForMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] valores = new int[10];
		Random aleatorio = new Random();
		
		for(int i = 0;i<valores.length;i++) {
			valores[i] = aleatorio.nextInt(-20,21);
		}
		System.out.println("Matriz de valores: ");
		//Mostrarlo por pantalla con un bucle for mejorado
		for(int valor : valores) {
			
			System.out.print(valor + " ");
		}
		System.out.println();
		for(int pos = 0;pos<valores.length;pos++) {
			System.out.print(valores[pos] + " ");
		}
		System.out.println();
		//Recorrer el array y modificar todas las posiciones que almacenen números negativos
		//Pasándolos a positivos
		for(int i = 0;i<valores.length;i++) {
			if(valores[i] < 0) {
				valores[i] = Math.abs(valores[i]);
			}
		}
		
		System.out.println("Array modificado a valores positivos: ");
		
		for(int valor : valores) {
			System.out.print(valor + " ");
		}
		//Calcular la suma
		int suma = 0;
		for(int s : valores) {
			suma += s;
		}
		
		
		
		
		
	}

}
