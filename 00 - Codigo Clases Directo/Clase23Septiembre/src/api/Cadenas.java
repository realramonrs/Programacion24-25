package api;

import java.util.Arrays;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Rc Celta";
		//Número de caracteres que hay en el String
		int caracteres = frase.length();
		//Buscar la posición de un caracter
		int posPrimerEspacio = frase.indexOf(" ");
		System.out.println("Primer espacio en posición: " + posPrimerEspacio);
		//Que caracter hay en una determinada posición:
		char caracter = frase.charAt(0);
		//Saber si empieza por un determinado substring
		boolean verdadero = frase.startsWith("las");
		//Saber si acaba en z
		boolean v2 = frase.endsWith("z");
		
		//Obtener un trozo del string
		String subCadena = frase.substring(3);
		System.out.println("SubCadena:" + subCadena);
		String subCadena2 = frase.substring(0,1);
		System.out.println("SubCadena 2: " + subCadena2);
		
		//Replace:
		//Cambiar las aes por asteriscos
		
		String frase1 = "Hala Celta";
		frase1 =  frase1.replace("a","*");
		
		System.out.println(frase1);
		
		//Separar el String en palabras
		String dnis = "12345678A_90909090E_34567382Q_11111111F";
		
		//Obtener la letra del segundo DNI:
		
		String trozos[] = dnis.split("_");
		
		System.out.println(Arrays.toString(trozos));
		
		char letra = trozos[1].charAt(trozos[1].length()-1);
		System.out.println("Letra segundo DNI: " + letra);
		
		
	}

}
