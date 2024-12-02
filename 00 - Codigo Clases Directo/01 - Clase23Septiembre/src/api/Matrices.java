package api;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Matrices o arrays
		float []temperaturas = new float[10];
		//Meter una temperatura en la posicion 0
		temperaturas[0] = 9;
		//...
		temperaturas[1] = 12.5f;
		temperaturas[2] = 19.56f;
		
		//Mostrar por pantalla los valores del array:
		System.out.println(temperaturas[0]);
		System.out.println(Arrays.toString(temperaturas));
		
		//Declarar e inicializar el array
		int []notas = {9,4,3,6,7};
		notas[1] = 0;
		
		//Sabel el tamaño del array
		int capacidad = notas.length;
		
		System.out.println("Capacidad: " + capacidad);
		
		//Acceder a la última posición del array de forma segura
		notas[notas.length-1] = 10;
		
		//Métodos de la librería Arrays
		//Ordenar un array de menor a mayor
		Arrays.sort(notas);
		System.out.println("Array notas ordenado:");
		System.out.println(Arrays.toString(notas));
		
		//Búsquedas en un array ordenado
		//Buscar el valor 6:
		int posicion = Arrays.binarySearch(notas, 7);
		System.out.println("Valor 6 está en posicion: " + posicion);
		
		//Realizar copias de un array
		int[] original = {1,2,3,4};
		int[] copia = new int[4];
		
		//copia = original; No hagais esto en vuestras casas!!
		
		copia = Arrays.copyOf(original,original.length);
		original[0] = 99;
		//Mostramos ambos arrays
		System.out.println(Arrays.toString(original));
		
		System.out.println(Arrays.toString(copia));
		
		
		
		
	}

}
