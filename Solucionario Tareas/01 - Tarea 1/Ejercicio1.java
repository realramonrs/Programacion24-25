/**
 * 
 */
package tarea;

import java.util.Arrays;
import java.util.Scanner;
 * @author Ramon RS
 *
 */
public class Ejercicio1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[] = new int[10];
		
		//a. Posicion cero = Numero aleatorio entre 3 y 17
			Random aleatorio1 = new Random();
			matriz[0] = aleatorio1.nextInt(3, 18)
			
		//b. Posicion uno = Posición cero + 20
			matriz[1] = matriz[0] + 20;   //0,5 ptos
			
		//c. Posicion dos = posicion[0] posicion[1]
			matriz[2] = (int)Math.sqrt(Math.pow(matriz[0], 3) + Math.pow(matriz[1], 2));
			//0,25 ptos
		//d. Posicion tres = La media de las anteriores
			matriz[3] = (matriz[0] + matriz[1] + matriz[2]) / 3; //0,25 ptos
		
		// Los seis siguientes a los valores que me apetece.
			matriz[4] = 5;
			matriz[5] = 5;
			matriz[6] = 1;
			matriz[7] = 7;
			matriz[8] = 8;
			matriz[9] = 9;
			
			
			
		// g. Realizar una copia del array en otro array.
			int nuevaMatriz[];
			nuevaMatriz = Arrays.copyOf(matriz, matriz.length); //0,5 ptos
			
		//h. Ordenar la copia de menor a mayor.
			Arrays.sort(nuevaMatriz);
			//0,5 ptos
		
			//i. Buscar en que posicion esta el valor ap a) , y mostrarla por pantalla.
			int posOriginal = Arrays.binarySearch(matriz, matriz[0]);
			int posCopiaOrdenada = Arrays.binarySearch(nuevaMatriz, matriz[0]); //Esto no lo pedía pero es para comparar el funcionamiento del binarysearch
			
			if(posCopiaOrdenada < 0) {
				System.out.println("El 1 no se encuentra en la matriz");
			}
			else {
				System.out.println("El 1 est� en la matriz ordenada en la posici�n : " + posCopiaOrdenada);
				System.out.println("En la matriz original est� en la posici�n : " + posOriginal);
				System.out.println("En la original no hay garant�as de que est� bien ya que el m�todo "
						+ "binarySearch necesita que est� ordenada");
			}
			
			//j. Utilizar el metodo equals para mostrar true por pantalla si son iguales ambos arrays.
			boolean iguales = Arrays.equals(matriz, nuevaMatriz);
			System.out.println("Son iguales : ?" + iguales);
			
			//0,5 ptos
		//k. Solicitar al usuario que introduzca una psición:
			Scanner lector = new Scanner(System.in);
			System.out.println("Introduzca una posición entre 0 y 9: ");
			int posicion = lector.nextInt();
			
			//SUponemos que el valor introducido es correcto
			matriz[posicion] = (int)Math.sqrt(matriz[posicion]) + (int)Math.pow(matriz[posicion],3);
			
			
			//Mostrar por pantalla los dos arrays.
			//Mostramos la matriz original:
			System.out.println();
			System.out.println("La matriz original es : ");
			System.out.println(matriz[0] + " " + matriz[1] + " " + matriz[2] + " " + 
					matriz[3] + " " + matriz[4] + " " + matriz[5] + " " +
					matriz[6] + " " + matriz[7] + " " +matriz[8] + " " + matriz[9]);
			
			//Mostramos la matriz ordenada:
			System.out.println();
			System.out.println("La matriz ordenada es : ");
			System.out.println(nuevaMatriz[0] + " " + nuevaMatriz[1] + " " + nuevaMatriz[2] + " " + 
					nuevaMatriz[3] + " " + nuevaMatriz[4] + " " + nuevaMatriz[5] + " " +
					nuevaMatriz[6] + " " + nuevaMatriz[7] + " " +nuevaMatriz[8] + " " + nuevaMatriz[9]);
	}
	

}
