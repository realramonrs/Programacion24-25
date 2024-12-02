package pruebas;

import repaso.Opcionales;

public class TestOpcionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Prueba método suma
		
		int resultado = Opcionales.sumaNumeros(4,7);
		int resultado2 = Opcionales.sumaNumeros(4, 5, 7);
		int resultado3 = Opcionales.sumaNumeros(4,8,7,6,5,4,3,2,1);
		
		int[] matriz = {3,4,5};
		int resultado4 = Opcionales.sumaNumeros(0,matriz);
		int resultado5 = Opcionales.sumaNumeros(7,6);
		
		
		System.out.println(resultado4);
		
	}

}
