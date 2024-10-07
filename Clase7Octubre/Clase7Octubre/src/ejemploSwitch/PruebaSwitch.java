package ejemploSwitch;

import java.util.Scanner;

public class PruebaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 1;
		/*Scanner lector  = new Scanner(System.in);
		opcion = lector.nextInt();*/
		
		
		switch(opcion) {
		
		case 1:
			//Mostrarla por pantalla:
			System.out.println("opcion: " + opcion);
			break;
		case 2:
			opcion = opcion + 10;
			System.out.println("opcion: " + opcion);
			break;
		case 3:
			opcion*=5;
			System.out.println("opcion: " + opcion);
			
			break;
		default:
			System.out.println("Opción errónea");
			break;
			
		}
	}

}
