package misMetodos;

import java.util.Arrays;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		n1 = 9;
		n2 = 5;
		n3 = 10;
		
		long suma = Matematicos.suma3Numeros(n1, n2,n3);
		
		System.out.println("La suma es : " + suma);
		
		
		//Prueba método factorial
		int numero = 10;
		long fact = Matematicos.factorial(numero);
		System.out.println("Factorial de :" + numero + " = " + fact);
		
		//Prueba método isPrimo
		int[] numeros = {4,7,1,3,9,13,17,19};
		
		System.out.println("Números primos: ");
		for(int valor : numeros) {
			 if(Matematicos.isPrimo(valor)) {
				 System.out.print(valor+ " ");
			 }
		}
		System.out.println();
		//Prueba método llenar Arrays
		int[] numeros2 = new int[20];
		Matematicos.llenarMatriz(numeros2);
		
		Escribir.matriz(numeros2);
		
		Escribir.cadena("Hola Mundo");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
