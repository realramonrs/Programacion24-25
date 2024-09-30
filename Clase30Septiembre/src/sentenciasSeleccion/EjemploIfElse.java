package sentenciasSeleccion;

import java.util.Scanner;

public class EjemploIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejemplo1: Programa que lee un número e indica si es par
		int numero;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un número:");
		numero = lector.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("El número es par");
		}
		
		else {
			System.out.println("El número es impar");
		}
		
	}

}
