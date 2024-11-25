package matrices2D;

public class EjemploMatrices2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arrays 1 D --> índice para indicar la posición. 
		//Arrays 2 D --> 2 índice para indicar la posición.
		
		// 1 2 3 4 6  --> Fila 0
		// 8 2 8 8 7 --> Fila 1
		// 1 2 3 4 8 --> Fila 2
		
		int[][] valores = new int[3][5];
		int[][] otra = {{1,2,3},{0,5,6},{0,9,8}};
		
		//Acceder a un elemento de la matriz
		valores[0][0] = 9;
		valores[0][1] = 8;
		valores[0][2] = 2;
				
		//Conocer número de filas:
		System.out.println("Filas " + valores.length);
		//Conocer número de elementos de una fila
		System.out.println("Columnas: " + valores[0].length);
		
		//Mostrar por pantalla una matriz 2D
		
		for(int i = 0;i<valores.length;i++) {
			for(int j = 0;j<valores[i].length;j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//Detectar la posición del primer cero en una matriz 2D
		int fila = -1;
		int columna = -1;
		int[] posicion = {-1,-1};
		for(int i = 0;i< valores.length;i++) {
			for(int j = 0 ;j<valores[i].length;j++) {
				if(valores[i][j] == 0) {
					fila = i;
					columna = j;
					posicion[0] = i;
					posicion[1] = j;
					break;
				}
			}
			
			if(fila!=-1) {
				break;
			}
		}
		if(fila == -1 ) {
			System.out.println("No hay ceros");
		}
		else {
			System.out.println("El primer cero está en " + fila + " , " + columna);
		}
		
		//Calcular la media de la primera fila
		int suma = 0;
		double media = 0;
		for(int indiceCol = 0;indiceCol<valores[0].length;indiceCol++) {
			suma = suma + valores[0][indiceCol];
		}
		
		
		
		
		
		
		//Se puede pasar una matriz 2D a una matriz 1D??
		
		
		
		
	}

}
