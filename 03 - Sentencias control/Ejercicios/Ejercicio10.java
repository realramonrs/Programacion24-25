/**
 * 
 */
package Ejercicios;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio10 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Encontrar vocales en un String
		//Este ejercicio se podr�a hacer m�s r�pido con expresiones regulares 
		//Pero vamos a realizarlo con los conocimientos del tema , pero los
		//que ya sabeis podr�ais investigar sobre como utilizar expresiones regulares en Java
		
		String frase ="El murci�lago se comi� la fruta";
		
		for(int i = 0;i<frase.length();i++) {
			char letra = frase.charAt(i);
			if(letra=='a'||letra=='e'||letra=='i'||
				letra=='o'||letra=='u'){
					//No detecta vocales con acento , tendr�a que a�ad�rselo en el if '�' , '�' ...
					System.out.println("Vocal " + letra + " en posicion : " + i);
				}
		}
		
	}

}
