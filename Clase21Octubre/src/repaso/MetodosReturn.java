package repaso;

public class MetodosReturn {

	private static int buscarCaracter(String mensaje,char c) {
		
		int posicion = -1;
		
		for(int i = 0;i<mensaje.length();i++) {
			if(mensaje.charAt(i)==c){
				posicion = i;
				break;
			}
		}		
		return posicion;
		
	}
	
	//Sobrecarga del método anterior que permite elegir si queremos buscar la
	//primera o la última aparición del caracter
public static int buscarCaracter(String frase,char car,boolean firstOrLast) {
		//Si es true devuelve la primera aparición
		if(firstOrLast==true) {
			return buscarCaracter(frase, car);
		}
		
		for(int i = frase.length()-1;i>0;i--) {
			if(frase.charAt(i)==car) {
				return i;
			}
		}
		
		return -1;
		
		
	}
	
	
	
	
	//Método que le suma 10 al parámetro que recibe como argumento
	
	public static int suma10(int numero) {
		numero = numero + 10;
		return numero;
	}
	 
}


