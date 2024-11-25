package sentenciasSeleccion;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores relacionales: < , <= , > , >= , == , !=
		
		boolean condicion1 = 5 < 8;
		int x = 9, y = 3;
		boolean condicion2 = x < y;
		x = 3;
		boolean condicion3 = x <= y;
		boolean condicion4 = x != y;
		boolean condicion5 = x==y;
		
		String palabra1 = "hola";
		String palabra2 = new String("hola");
		
		boolean iguales = palabra1.equals(palabra2);
		System.out.println(iguales);
		
		//Operadores lógicos : Y logico: && , O lógico : || , Negación !
		int a = 4, b = 7;
		boolean c1 = a > 4 && b!=9;
		System.out.println("c1: " + c1);
		boolean c2 = a > 4 || b==9;
		System.out.println("c2: " + c2);
		
		boolean c3 = !c2;
		System.out.println("c3: " + c3);
		
		
		
		
		
		
	}

}
