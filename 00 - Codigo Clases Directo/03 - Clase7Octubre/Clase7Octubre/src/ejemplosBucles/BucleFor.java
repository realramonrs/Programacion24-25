package ejemplosBucles;

import java.util.Arrays;
import java.util.Random;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que muestra los números entre n y m
		int n = 10,m = 15;
		
		
		for(int i=n;i<=m;i++) {
			if(i<m) {
			System.out.print(i + " , ");
			}
			else {
				System.out.print(i);
			}
		}
		System.out.println();
		
		//Llenar un array de enteros con valores aleatorios entre n y m
		n = -10;
		m = 10;
		int[] valores = new int[10];
		Random aleatorio = new Random();
		
		for(int i = 0;i<valores.length;i++) {
			valores[i] = aleatorio.nextInt(n, m + 1);
		}
		
		System.out.println("Array generado: ");
		System.out.println(Arrays.toString(valores));
		
		//Obtener la posición del primer número negativo
		int posicion = -1;
		for(int i = 0;i<valores.length;i++) {
			if(valores[i]<0) {
				posicion = i;
				System.out.println("Primer número negativo en posicion: " + i);
				break;
			}
		}
		if(posicion == -1) {
			System.out.println("No hay números negativos");
		}
		
		else {
			System.out.println("El primer negativo está en la posición: " + posicion);
		}
		
		//Comprobar si hay algún número impar
		boolean encontrado = false;
		for(int i = 0;i<valores.length;i++) {
			if(valores[i]%2!=0) {
				encontrado = true;
				break;
			}
		}
		if(!encontrado) {
			System.out.println("No hay números impares");
		}
		else {
			System.out.println("Hay al menos un número impar.");
		}
		
		//Calcular la media del array
		int suma = 0;
		double media = 0;
		for(int i = 0;i<valores.length;i++) {
			suma = suma + valores[i];
		}
		media = (double)suma / valores.length;
		
		System.out.println("La media de los valores es: " + media);
		
		
		
	}

}
