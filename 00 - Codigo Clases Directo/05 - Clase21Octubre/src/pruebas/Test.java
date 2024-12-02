package pruebas;

import java.util.Arrays;

import repaso.MetodosReturn;
import repaso.MetodosVoid;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Probar método buscarCaracter
		String frase = "Estay probando";
		int posicion = MetodosReturn.buscarCaracter(frase, 'z',true);
		System.out.println(MetodosReturn.buscarCaracter(frase, 'a',true));
		
		if(posicion==-1) {
			System.out.println("El caracter no se encuentra en la frase");
		}
		else {
			System.out.println("El caracter está en la posición: " + posicion);
		}
		
		//Probar método escribir:
		
		MetodosVoid.escribir("Programar es lo mejor que hay");
		
		//Prueba metodo suma10:
		int n = 20;
		
		for(int i = 0;i<5;i++) {
			n = MetodosReturn.suma10(n);
		}
		
				
	//	System.out.println(MetodosReturn.suma10(n));
		System.out.println("n = " + n);
		
		
		//Prueba método suma10Arrays
		
		int[] matriz = {1,2,3,4,5};
		MetodosVoid.suma10Arrays(matriz);
		System.out.println(Arrays.toString(matriz));
		
		
		//Probar método llenarArray
		int[] matriz2 = new int[10];
		MetodosVoid.llenarArray(matriz2, -10, 10);
		System.out.println(Arrays.toString(matriz2));
		
		
	}

}
