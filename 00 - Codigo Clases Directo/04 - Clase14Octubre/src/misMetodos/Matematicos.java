package misMetodos;

import java.util.Random;

public class Matematicos {
	
	//Añadir métodos
	//Ejemplo 1 : Método que calcula la suma de 3 números enteros
	public static long suma3Numeros(int a,int b,int c) {
		long suma = a + b + c;
		return suma;
		
	}
	
	//Ejemplo 2: Método que calcula el factorial de un número: 5! = 5*4*3*2*1
	//0! = 1  función gamma de Euler
	public static long factorial(int n) {
		long factorial = 1;
		
		if(n==0 || n == 1) {
			return 1;
		}
			for(int i=n;i>=1;i--) {
				factorial = factorial*i;
			}
			return factorial;
		
		
	}
	
	//Ejemplo 3: Método que devuelve  si un número es primo
	
	public static boolean isPrimo(int numero) {
		for(int i = 2;i<= numero/2;i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	//Método que llena una matriz con valores aleatorios
	public static void llenarMatriz(int[] matriz) {
		Random aleatorio = new Random();
		for(int i = 0;i<matriz.length;i++) {
			matriz[i] = aleatorio.nextInt();
		}
	}
	
	//
	
	
	
	
	
	
	
	

}
