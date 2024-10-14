package misMetodos;

public class Escribir {

	public static void cadena(String x) {
		System.out.println(x);
	}
	
	public static void matriz(int[] x) {
		for(int valor : x) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
}
