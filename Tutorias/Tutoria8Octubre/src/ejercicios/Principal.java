package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ejercicio;
		Scanner lector;
		
		do {
			System.out.println("1. Detectar si un número es primo");
			System.out.println("2. Resolver ecuación de segundo grado");
			System.out.println("8. Obtener valor más alto de un array.");
			System.out.println("20. Salir");
			lector = new Scanner(System.in);
			ejercicio = lector.nextInt();
			
			switch(ejercicio) {
			case 1:
				int numero;
				System.out.println("Introduce un número");
				numero = lector.nextInt();
				
				boolean primo = true;
				int i = 2;
				while(i<=numero/2) {
					if(numero % i == 0) {
						primo = false;
						break;
					}
					i++;
				}
				//Evaluar la variable primo
				if(primo) {
					System.out.println(numero + " es primo" );
				}
				else {
					System.out.println(numero + " no es primo");
				}
				
				
				break; //Rompe el case 1
			case 2:
				int a,b,c;
				boolean error = false;
				double sol1 = Double.MAX_VALUE, sol2=Double.MAX_VALUE;
				System.out.println("Introduce el valor de a: ");
				a = lector.nextInt();
				System.out.println("Introduce el valor de b: ");
				b = lector.nextInt();
				System.out.println("Introduce el valor de c: ");
				c = lector.nextInt();
				
				if(a==0) {
					if(c!=0) {
						sol1 = -b/(float)c;
						sol2 = sol1;
					}
					else {
						error = true;
					}					
				} // Llave de cierre del if principal
				
				else if(b==0) {
					double raiz = -c/(float)a;
					if(raiz >=0) {
						sol1 = -Math.sqrt(raiz);
						sol2 = Math.sqrt(raiz);
					}


				} //Llave que cierra el else if
				else if (c==0) {
					sol1 = 0;
					sol2 = -b/(float)a;
				}
				
				else {
					double raiz = b*b - 4*a*c;
					
					if(raiz>0) {
						sol1 = (-b + Math.sqrt(raiz))/(2*a);
						sol2 = (-b - Math.sqrt(raiz))/(2*a);
					}
					else {
						error = true;
					}
				} //Llave que cierra el else del if principal
				
				
				if(error) {
					System.out.println("No hay solución real.");
				}
				else {
					System.out.println("Solucion 1: " + sol1);
					System.out.println("Solución 2: " + sol2);
				}
				
				
				
				
				break; //Fin del case 2
			case 8:
				//Obtener el valor más alto de un array
				int[] valores = {9,8,9,5,9,6};
				
			/*	Random aleatorio = new Random();
				for(int j = 0;j<valores.length;j++) {
					valores[j] = aleatorio.nextInt(21);
					}*/
				System.out.println("Array generado: ");
				System.out.println(Arrays.toString(valores));
				
				int maximo = valores[0];
				int posMax[] = new int[valores.length];
				for(int j = 0;j<posMax.length;j++) {
					posMax[j] = -1;
				}
				int contador = 0;
				for(int j = 1;j<valores.length;j++) {
					if(valores[j] >= maximo) {
						maximo = valores[j];
						
					}
				}
				
				for(int j = 0;j<valores.length;j++) {
					if(valores[j]==maximo) {
						posMax[contador] = j;
						contador++;
					}
				}
				
				System.out.println("El valor más alto es: " + maximo);
				//System.out.println("Está en la posición: " + Arrays.toString(posMax));
				System.out.println("Se encuentra en las posiciones: ");
				for(int valor : posMax) {
					if(valor!=-1) {
						System.out.print(valor + " ");
					}
				}
				
				System.out.println();
				
			}
			
			
		}
		while(ejercicio!=20);
	}

}
