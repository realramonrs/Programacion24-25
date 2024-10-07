package ejemplosBucles;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Do While --> único bucle que garantizo al menos una iteración
		
		int n = 10;
		
		do {
			System.out.println("Esto ya se ejecutó");
		}
		while(n>10);
		
		// Mostrar menús al usuario y que escoja una opción:
		
		char opcion;
		boolean error;
		int contador=0;
		do {
		error = false;
		System.out.println("Escoge una opción: ");
		System.out.println("a) Suma dos números");
		System.out.println("b) Resta dos números");
		System.out.println("c) Calcula resto division");
		Scanner lector = new Scanner(System.in);
		opcion = lector.next().charAt(0);
		
		switch(opcion) {
		case 'a':
		case 'A':		
			System.out.println("Suma dos números");
		break;			
		case 'b':
			System.out.println("Resta dos números");
			break;
		case 'c':
			System.out.println("Calculo resto division:");
			break;
		default:
			error = true;
			contador++;
			System.out.println("Opción incorrecta");
			break;
		}
		
		}while(error && contador<2);
		
		if(contador==2) {
			System.out.println("Esto no es lo tuyo amigo!");
		}
		
		
		
		
		
		
		
	}

}
