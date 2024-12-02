package sentenciasSeleccion;

public class EjemploIfAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que clasifica numero par y mayor que 100
		int numero = 151;
		
		if(numero>=100) {
			if(numero %2 == 0) {
				System.out.println("Mayor que 100 y par");
			}
			else {
				System.out.println("Mayor que 100 e impar");
			} // Cierre el else numero %2 == 0		
		} // Cierre el if numero >100
		else {
			
			System.out.println("Numero menor que 100");
		}
		
	}

}
