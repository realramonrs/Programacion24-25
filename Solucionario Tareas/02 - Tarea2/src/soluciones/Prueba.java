package soluciones;

import java.util.Random;

public class Prueba {

	public static void mostrarMatriz2d(int m[][]) {
		for(int i = 0;i<m.length;i++) {
			for(int j = 0;j<m[i].length;j++) {
			 System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void llenarMatriz2D(int m[][],int minimo,int maximo) {
		Random aleatorio = new Random();
		for(int i = 0;i<m.length;i++) {
			for(int j = 0;j<m[i].length;j++) {
				m[i][j] = aleatorio.nextInt(minimo,maximo+1);
			}
		}
		
	}
	
	public static void moverCerosconBurbuja(int[][] matriz) {
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
	}
	
	public static void moverCeros(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
            int index = 0; // Índice para elementos no cero en la fila actual

            // Recorrer la fila y mover elementos no cero al frente
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    matriz[i][index++] = matriz[i][j];
                }
            }

            // Llenar el resto de la fila con ceros
            while (index < matriz[i].length) {
                matriz[i][index++] = 0;
            }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vamos a realizar una comparativa de los dos métodos , calculando el tiempo que tardan en ejecutar el algoritmo
		//Para ello con un bucle while hacemos ques se generen 10 matrices y que para cada una de ellas
		//se calcule el tiempo que tardan los dos algoritmos en ejecutarse
		//Podreis comprobar que si el número de columnas es inferior a 10 las diferencias son mínimas , pero para matrices
		//con mayor número de columnas se va nontando cada vez más que el algoritmos sin burbuja es mucho más eficiente

		int[][] matriz = new int[10][1000];
		int contador = 0;
		while(contador<10) {
		//llenamos matriz
		llenarMatriz2D(matriz, -3, 3);
				
		//mÉTODO BURBUJA
		long inicio = System.currentTimeMillis();
		moverCerosconBurbuja(matriz);
		long fin = System.currentTimeMillis();
		

		long tiempoBurbuja = fin - inicio;
		System.out.println("Prueba : " + contador);
		System.out.println("Tiempo con burbuja: " + tiempoBurbuja);
		//llenamos otra vez 
		llenarMatriz2D(matriz, -3, 3);		
		//Mover ceros sin burbuja
		long inicio2 = System.currentTimeMillis();
		moverCeros(matriz);
		long fin2 = System.currentTimeMillis();
		long tiempo = fin2 - inicio2;
	
		System.out.println("Tiempo sin burbuja: " + tiempo);
		contador++;
		}
	}

}
