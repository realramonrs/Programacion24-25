package ejemplosBucles;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que muestra n asteriscos por pantalla
		int n;
		Scanner lector = new Scanner(System.in);
		n = lector.nextInt();
		
		//n = 3 --> * * *
		//n = 4 --> * * * *
		
		//Todo bucle utiliza una o más variables para establecer
		//condicion de continuidad
		int i = 1;
		
		while(i<=n) {
		
		  System.out.print("* ");
		  i=i+1;
		}
		
		System.out.println();
		System.out.println("Ahora pasamos al siguiente apartado;");
		
		//Sumar todos los valores almacenados en un array
		int[] valores = {7,9,4};
		
		int suma = 0;
		//suma = valores[0] + valores[1] + valores[2] + valores[3] + valores[4]+ valores[5];
		
		int posicion = 0;
		
		while(posicion < valores.length) {
			
			suma = suma + valores[posicion];
			posicion++;
		}
		
		System.out.println("Suma = " + suma);
		
		//Programa que cuente cuantas veces aparece un caracter en un string
		String frase = "El Celta gana con nueve";
		char letra = 'l';
		int contador = 0;
		
		int j = 0;
		
		while(j<frase.length()) {
			if(frase.charAt(j)==letra) {
				contador++;
			}
			j++;
		}
		
		if(contador==0) {
			System.out.println(letra + " no está en la frase");
		}
		else if(contador == 1) {
			System.out.println(letra + " aparece 1 vez");
		}
		else {
			System.out.println(letra + " aparece : " + contador + " veces");
		}
		
		//Encontrar la posición de la primera aparición de un caracter en un String
		j = 0 ;//reseteo variable de control contaminada por algoritmo anterior
		int posicion2 = -1; //Inicializo a valor absurdo
		boolean encontrado = false; //flag
		while(j<frase.length()) {
			if(frase.charAt(j)==letra) {
				//posicion2 = j;
				encontrado = true;
				break; //Salir precipitadamente , antes de que se deje de cumplir la condicion de continuidad
			}
			j++;
		}
		
		if(!encontrado) {
			System.out.println(letra + " no está en la frase");
		}
		else {
			System.out.println(letra + " está en la frase");
		}
		
		
		
		/*	Si quiero saber la posición
		 * if(posicion2==-1) {
			System.out.println("No está en la frase");
		}
		else {
			System.out.println("Está en la posición: " + posicion2);
		}*/
		
		
	}

}
