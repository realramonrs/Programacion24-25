
package Ejercicios;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Encontrar el valor m�s alto de una matriz y su posici�n
		
		int matriz[] = {2,5,6,1,8,4,2,3,0,-5};
		
		int maximo = matriz[0]; 
		int posicion = -1;
		//Comparamos el valor almacenado en maximo con el resto de 
		//elementos de la matriz y si hay alguno m�s alto sobreescribimos la variable maximo
		//al nuevo valor
		
		for(int i = 1;i<matriz.length;i++) {
			if(matriz[i]>maximo) {
				maximo = matriz[i];
				//Guardamos la posicion
				posicion = i;
			}
		}
		
		System.out.println("Valor m�s alto " + maximo);
		System.out.println("Posici�n : " + posicion);
		
		
		
		
		
	}

}
