package soluciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generamos la matriz con los valores aleatorios
		int matriz[] = new int[10];
		Random aleatorio = new Random();
		
		for(int i = 0; i<matriz.length; i++) {
			matriz[i]= aleatorio.nextInt(101);
		}		
		
		char opcion ;
		
		boolean salir = false;
		do {
			
		System.out.println("");
		System.out.println("Seleccione una opción:");
		System.out.println("a. Mostrar 3 primeros valores inferiores a uno introducido por teclado");
		System.out.println("b. Calcular la media de los 50 primeros valores almacenados");
		System.out.println("c. Mostrar por pantalla los 10 primeros valores que sean superiores a la media junto con las posiciones que ocupan");
		System.out.println("d. Mostrar por pantalla el primer valor inferior a 5");
		System.out.println("e. Mostrar por pantalla los valores que sean primos");
		System.out.println("f. Mostrar el valor máximo y el mínimo del array ");
		System.out.println("g. Mostrar por pantalla aquellos valores que sean múltiplos de 3 y 5 en binario");
		System.out.println("h. Cerrar programa");
		Scanner lector = new Scanner(System.in);
		opcion = lector.nextLine().charAt(0);
		
		//Mostrar el array generado
		System.out.println("Array generado: ");
		for(int n : matriz){
			System.out.print(n + " ");
		}
		System.out.println();
		switch (opcion) {
		
		// Apartado A - Mostrar 3 valores inferiores a uno introducido por teclado
		case 'a':
			System.out.println("");
				System.out.println("Introduzca un número del 0 al 100");
				int valorInt = lector.nextInt();

				System.out.println("Los 3 primeros valores inferiores a " + valorInt + ":");
				int contador1 = 0;
				for(int i = 0; i<matriz.length && contador1<3; i++) {
					if(matriz[i]<valorInt) {
						System.out.println("" + matriz[i]);
						contador1 ++; //Usamos esta variable para saber cuantos números hemos detectado
					}
				}
				
				break;
		
		case 'b':
			// Apartado B - Calcular la media de los n últimos valores almacenados
			int suma = 0;
			int media;
			
			int n = 0;
			Scanner lectorB = new Scanner(System.in);
			System.out.println("Intrdocue un valor de n(nº de elementos para calcular la media)");
			n = lector.nextInt();
			
			System.out.println("Vamos a calcular la media de los siguientes valores: ");
			for(int i = matriz.length - 1; i > matriz.length - n - 1; i--) {
				System.out.print(matriz[i] + " ");
			}
			System.out.println();
			for(int i = matriz.length - 1; i > matriz.length - n - 1; i--) {
				suma+=matriz[i];				
			}
			
			media = suma/n;
			System.out.println("");
			System.out.println("La media de los últimos " + n + "  valores es de: " + media);
			System.out.println("");
			break;
		
		case 'c':
			/* Apartado C - Mostrar por pantalla los 10 primeros valores que sean superiores a la media junto con
			las posiciones que ocupan.*/
			int sumac =0 ;
			double mediac = 0;
			/* Cálculo de la media */
			for(int i = 0;i<matriz.length;i++) {
				sumac = sumac + matriz[i];
			}
			mediac = sumac / matriz.length;
			
			int contador= 0;
			
			for(int i = 0; i<matriz.length && contador<10; i++) {
				if(matriz[i]>mediac) {
					
					System.out.println("El número " + matriz[i] + " es mayor que la media, y ocupa la posición " + i);
					contador++;
					
				}
		
			}
			System.out.println(""); 
			break;
		
		case 'd':
			int n2;
			Scanner l = new Scanner(System.in);
			System.out.println("Introduce un número: ");
			n2 = l.nextInt();
			for(int i = 0; i<matriz.length; i++) {
				if(matriz[i]<n2) {
					System.out.println("El número " + matriz[i] + " es el primer valor inferior a 5");
					break;
				}
			}
			System.out.println(""); 
			break;
		
		case 'e':
			//Apartado E - Mostrar por pantalla los valores que sean primos. 
			
			for(int i = 0; i<matriz.length; i++ ) {
				int contador2=0;
				for(int j = 1; j<=matriz[i]; j++) {
					if(matriz[i]%j==0) {
						contador2+=1;
					}
				}
				if(contador2==2) {
					System.out.println("El número " + matriz[i] + " es primo");
				}			
			}
			
			break;
		case 'f':
			
			//Apartado F - Mostrar el valor máximo y el mínimo del array
			int valorMax=matriz[0];
			int valorMin=matriz[0];
			
			int[] posicionesMaximos = {-1,-1,-1};
			int z = 0;
			while(z<3) {
				valorMax=matriz[0];
			
				for(int i = 0; i<matriz.length; i++) {
					if(i==posicionesMaximos[0]||i==posicionesMaximos[1]) {						
						//Ignoramos las posiciones donde están los máximos
						continue;
						}
					if(matriz[i]>valorMax) {
						valorMax= matriz[i];	
						posicionesMaximos[z] = i;
						
					}
				}
				z++;				
			}			 
			
			System.out.println("Tercer Valor más alto: " + valorMax + " en la posición: " + posicionesMaximos[2]);

			//Para obtener ahora el valor mínimo el razonamiento será similar:
			
			 z = 0;
			 int[] posicionesMinimos = {-1,-1,-1,-1};
			while(z<4) {
				valorMin=matriz[0];
			
				for(int i = 0; i<matriz.length; i++) {
					if(i==posicionesMinimos[0]||i==posicionesMinimos[1]||i==posicionesMinimos[2]) {						
						//Ignoramos las posiciones donde están los máximos
						continue;
						}
					if(matriz[i]<valorMin) {
						valorMin= matriz[i];	
						posicionesMinimos[z] = i;
						
					}
				}
				z++;				
			}			
			
			System.out.println("4º Valor Mínimo: " + valorMin + " en la posición: " + posicionesMinimos[3]);
			
			break;
		case 'g':
			// Apartado G -Crear copia del array desplazando todos los elementos una posición a la izquierda
			int[] copia = new int[matriz.length];
			//Ponemos en la última posicion el valor que está en la posición cero
			
			copia[copia.length-1] = matriz[0];
			
			//Ahora movemos el resto
			for(int i = 1;i<matriz.length; i++) {
				copia[i-1] = matriz[i];
			}
			
			System.out.println("Array rotado 1 a la izquierda");
			for(int valor : copia) {
				System.out.print(valor + " ");
			}
			System.out.println("");
			break;
		
		case 'h':
			// Apartado H - Salir
			salir= true;
			System.out.println("El programa ha sido cerrado con éxito.");
			break;
		}
	}
		while(!salir);
	}

	}


