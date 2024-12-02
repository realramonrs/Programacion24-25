package buclesAnidados;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import misMetodos.Escribir;

public class ForAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa que la siguiente salida
		//* * * * *
		//* * * * *
		//* * * * *
		//n filas de 5 asteriscos
		
		int n;
		System.out.println("Introduce numero de filas: ");
		Scanner lector = new Scanner(System.in);
		n = lector.nextInt();
		
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<5;j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		
		
		//Mostrar las tablas de multiplicar de los 10 primeros números
		
		
	//	int m = 2;
		
		for(int m=1;m<=10;m++) {
		System.out.println("Tabla de multiplicar del " + m);
		for(int i = 1; i<=10;i++) {
			System.out.println(m + " * " + i + " = " + m*i);
		}
		}
		
		//Detectar todos los números primos 
		
		int[] matriz = new int[20];
		Random aleatorio = new Random();
		
		for(int i = 0;i<matriz.length;i++) {
			matriz[i] = aleatorio.nextInt(20);
		}
		
		//Mostrar los números primos
		//9 , 7 , 8 , 10 , 11 , 14 , 15
		System.out.println(Arrays.toString(matriz));
		Escribir.matriz(matriz);
		
		
		//Ver si matriz[0] es primo
		boolean primo = true;	
		System.out.println("Números primos: ");
		for(int i = 0;i<matriz.length;i++) {	
			primo = true;
			for(int j = 2;j<=matriz[i]/2;j++) {
				if(matriz[i] % j == 0) {
					primo = false;
					break;
				}
			}//Llave que cierra el bucle interno
			
			if(primo) {
				System.out.print(matriz[i] + " ");
			}
			
			
		} //Llave que cierra el bucle externo
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
