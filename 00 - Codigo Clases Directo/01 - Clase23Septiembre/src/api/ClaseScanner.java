package api;
import java.util.*;
public class ClaseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		String nombre = lector.next();
		int edad;
		System.out.println("Introduce tu edad: ");
		edad = lector.nextInt();
		System.out.println("Introduce tu DNI:");
		String dni = lector.next() ;
		
		System.out.println("Nombre: " + nombre + " DNI:" + dni);
		System.out.println("Edad: " + edad);
		
		//Como almacenar el valor en un enumerado
		System.out.println("Introduce un Pais de Destino");
		
		Pais pais = Pais.valueOf(lector.next());
		
	}

}
