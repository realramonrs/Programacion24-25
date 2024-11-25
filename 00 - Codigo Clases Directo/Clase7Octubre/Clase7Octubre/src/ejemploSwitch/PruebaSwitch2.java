package ejemploSwitch;

import java.util.Scanner;

public class PruebaSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char opcion;
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
			System.out.println("Opción incorrecta");
			break;
		}
				
	}

}
