package soluciones;

import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[5][10];
		Random aleatorio = new Random();

		//Llenamos la matriz con valores en el rango -10 , 10

		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				matriz[i][j] = aleatorio.nextInt(-5,6);
			}
		}

		//Mostramos la matriz generada
		System.out.println("***********  La matriz generada es la siguiente:  *********");
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// Apartado a) Media de las dos primeras filas

		System.out.println();
		System.out.println("************ Apartado a) *************");
		System.out.println();
		int suma = 0;
		double media = 0;
		int contador = 0;

		for(int i = 0;i<2;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				suma+=matriz[i][j];
				contador++;
			}
		}
		//El contador sirve para saber cuantos elementos estmaos sumando
		media = suma / contador;

		//Ahora calculamos la suma de los valores positivos superiores a la media
		int suma2 = 0;
		int media2 = 0;
		for(int i = 0;i<2;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				if(matriz[i][j]>=0 && matriz[i][j]>media) {
					suma2+=matriz[i][j];
				}
			}
		}

		//Mostramos por pantalla las dos primeras filas la media , los nºs superiores a la media y su suma
		System.out.println("Las dos primeras filas son: ");
		for(int i = 0;i<2;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}


		System.out.println();

		System.out.println("La media es: " + media);

		System.out.println("Los números mayores que la media ");

		for(int i = 0;i<2;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				if(matriz[i][j]>=0 && matriz[i][j]>media) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}

		System.out.println();
		System.out.println("La suma de estos valores es: " + suma2);


		//************************   Apartado b ***********************************

		System.out.println();
		System.out.println("************ Apartado d) *************");
		System.out.println();

		//Contar ceros en la fila 3 y en la fila 4
		int contador3 = 0, contador4 = 0;
		for(int i = 0;i<matriz[2].length;i++) {

			if(matriz[2][i]==0) {
				contador3++;
				break;
			}
		}

		for(int i = 0;i<matriz[matriz.length-1].length;i++) {

			if(matriz[matriz.length-1][i]==0) {
				contador4++;
				break;
			}
		}

		//Si en la fila 3 hay un cero y en la última no
		if(contador3>0&&contador4==0) {
			//Intercambiar filas pero debemos mostrar antes la matriz original 
			System.out.println("Matriz original: ");
			for(int i = 0;i<matriz.length;i++) {
				for(int j = 0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}

			//Intercambiamos elementos fila 2 con ultima fila


			for(int j = 0;j<matriz[2].length;j++) {

				int aux = matriz[2][j];
				matriz[2][j] = matriz[matriz.length-1][j];
				matriz[matriz.length-1][j] = aux;

			}

			System.out.println("Matriz intercambiadas fila 2 y última: ");
			for(int i = 0;i<matriz.length;i++) {
				for(int j = 0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}

		}

		//Apartado c
		System.out.println();
		System.out.println("************ Apartado c) *************");
		System.out.println();
		//Encontrar la columna que tenga más números positivos

		//Creamos un array para guardar la cuenta de números positivos de cada columna
		int[] positivos = new int[matriz[0].length];

		//Recorremos las columnas contando números positivos
		int cuentaPositivos = 0;
		int maximo = 0;
		int indiceColMasPositivos = 0;
		for(int col = 0;col<matriz[0].length;col++) {
			cuentaPositivos = 0;
			for(int fil = 0;fil<matriz.length;fil++) {
				if(matriz[fil][col]>0) {
					cuentaPositivos++;
				}
			}

			System.out.println("Positivos columna : " + col + " = " + cuentaPositivos);
			if(maximo<cuentaPositivos) {
				maximo = cuentaPositivos;
				indiceColMasPositivos = col;
			}

		}

		System.out.println("La columna con más positivos tiene índice: " + indiceColMasPositivos);
		System.out.println("Elementos columna con más positivos: ");
		for(int i = 0;i<matriz.length;i++) {
			System.out.print(matriz[i][indiceColMasPositivos] + " ");
		}
		System.out.println("");

		//Sumamos los elementos de esta columna
		int sumaColumnaMasPositivos = 0;

		for(int i = 0;i<matriz.length;i++) {
			sumaColumnaMasPositivos+=matriz[i][indiceColMasPositivos];
		}

		System.out.println("La suma de la columna con más positivos es : " + sumaColumnaMasPositivos);

		System.out.println();
		System.out.println("************ Apartado d) *************");
		System.out.println();

		//Pasar los ceros de cada fila para ls posiciones finales
		//Aquí podemos usar dos estrategias:
		//Burbujear ceros para el final: Este algoritmo es el método de la nurbuja
		//Utilizado para ordenar elementos. Consiste en ir intercambiando los elementos del array que cumplen una determinada condición
		for(int k = 0;k<matriz[0].length;k++) {
			//Vamos a burbujear los ceros para el final
			for(int i = 0;i<matriz.length;i++) {

				for(int j = 0;j<matriz[i].length-1;j++) {

					if(matriz[i][j] == 0) {
						int aux = matriz[i][j];
						matriz[i][j]= matriz[i][j+1];
						matriz[i][j+1] = aux;					
					}	

					//	System.out.println();
				}		
			}
		}

		System.out.println(" ********** Matriz resultante *************");

		for(int i = 0;i<matriz.length;i++) {

			for(int j = 0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}

			System.out.println();
		}

		//Otra estrategia es mover los elementos que NO SON CERO para las primeras posiciones

		System.out.println("Prueba con el segundo método");
		int[][] matriz2 = new int[3][10];

		for(int i = 0;i<matriz2.length;i++) {
			for(int j = 0;j<matriz2[i].length;j++) {
				matriz2[i][j] = aleatorio.nextInt(-5,6);
			}
		}

		System.out.println(" **** MATRIZ 2: ****");
		for(int i = 0;i<matriz2.length;i++) {
			for(int j = 0;j<matriz2[i].length;j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}


		for (int i = 0; i < matriz2.length; i++) {
			int index = 0; // Índice para elementos no cero en la fila actual

			// Recorrer la fila y mover elementos no cero al frente
			for (int j = 0; j < matriz2[i].length; j++) {
				if (matriz2[i][j] != 0) {
					matriz2[i][index++] = matriz2[i][j];
				}
			}

			// Llenar el resto de la fila con ceros
			while (index < matriz2[i].length) {
				matriz2[i][index++] = 0;
			}
		}

		System.out.println();
		System.out.println(" * MATRIZ RESULTANTE ****");
		for(int i = 0;i<matriz2.length;i++) {
			for(int j = 0;j<matriz2[i].length;j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}

	}//Fin de la clase

}
