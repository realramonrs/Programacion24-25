
package ejercicios;

import java.util.Scanner;

public class Ejercicio2y3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x , y , z, maximo , minimo;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un n�mero ");
		x = lector.nextInt();
		System.out.println("Introduce otro n�mero ");
		y = lector.nextInt();
		System.out.println("Introduce un tercer n�mero ");
		z = lector.nextInt();
		
		lector.close();
		
		minimo = Math.min(x, y);
		maximo = Math.max(x, y);
		
		//Para obtener el menor de los 3 n�meros volvemos a
		//utilizar la mfunci�n min y lo mismo con max
		
		minimo = Math.min(minimo, z);
		maximo = Math.max(maximo, z);
		
		System.out.println("El menor es : " + minimo);
		System.out.println("El mayor es : " + maximo);
				
		
		
		
		
		
	}

}
