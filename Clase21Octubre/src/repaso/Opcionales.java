package repaso;

public class Opcionales {

	
	/*public static int sumaNumeros(int... x) {
		
		int suma = 0;
		for(int i = 0;i<x.length;i++) {
			suma = suma + x[i];
		}
		
		return suma;
		
	}*/
	
public static int sumaNumeros(int n,int... x) {
		
		int suma = n;
		for(int i = 0;i<x.length;i++) {
			suma = suma + x[i];
		}
		
		return suma;
		
	}
	
	
}
