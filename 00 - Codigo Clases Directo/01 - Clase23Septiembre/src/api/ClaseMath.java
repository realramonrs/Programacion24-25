package api;

import java.util.Random;

public class ClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular la raiz cuadrada
		int numero = 10;
		double raiz = Math.sqrt(numero);
		
		//Calcular potencias
		int x = 2;
		int resultado = (int) Math.pow(x, 5);
		
		//a = (4*Raiz(b)*c5 )/2*c
		
		int b=8,c=2;
		double a;
		double numerador = (4*Math.sqrt(b)*Math.pow(c, 5));
		
		a = numerador / (2*c);
		//a = Math.floor(a);
		System.out.println("floor(a)= " + Math.floor(a) + " a= " + a);
		
		//Calcular la longitud de una circunferencia
		double longitud,radio = 2;
		//longitud = 2*PI*radio;
		longitud = 2*Math.PI*radio;
		
		//Definir constante limite
		final int LIMITE = 10;
		
		float valor = 4.89f;
		//Redondear al entero inferior más cercano
		//valor = (float) Math.floor(valor);
		float valor2 = (float) Math.floor(valor);
		System.out.println(valor2 + " " + valor);
		
		//Redondear al entero más cercano por arriba
		float valor3 = 5.29f;
		float valor4 = (float) Math.ceil(valor3);
		
		System.out.println("valor4: " + valor4);
		
		//Redondear al más cercano
		float valor5 = 6.55f;
		float valor6 = Math.round(valor5);
		
		System.out.println("valor 6 = " + valor6);
		
		float n1 = 9,n2 = 8;
		float minimo = Math.min(n1, n2);
		
		System.out.println("Minimo: " + minimo);
		
		//Generar números aleatoria
		int aleatorio =  (int) (Math.floor(Math.random()*10));
		System.out.println("Aleatorio:" + aleatorio);
		
		Random generador = new Random();
		int aleatorio2 = generador.nextInt();
		int aleatorio3 = generador.nextInt(11);
		int aleatorio4 = generador.nextInt(10, 21);
		System.out.println(aleatorio4);
		
		
	}

}
