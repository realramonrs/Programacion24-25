package bloqueEjercicios2;

public class MTDCadenas {

	public static char letraDNI(String str) {

        if (str.matches("^(\\d){8}$")) {

            int dniInt = Integer.parseInt(str);
            int resto = dniInt % 23;

            String posiblesLetras = "TRWAGMYFPDXBNJZSQVHLCKE";

            return posiblesLetras.charAt(resto);
        }
        return ' ';
    }
	
	/*
	 * 2.
	 */
	public static String crearCadenaConGuiones(String original,char c){
		String guionizado="";
		for(int i=0;i<original.length();i++){
			if(original.charAt(i)==c)
				guionizado+=c+" ";
			else
			guionizado+="- ";
		}
		
		return guionizado;
	}
	
	/*
	 * 3, Sobrecargar el m�todo anterior para que pueda recibir un String y un n�mero opcional de variables de 
	 * tipo char. El m�todo devolver� un String formado por los caracteres encontrados y guiones en aquellas 
	 * posiciones donde no est�n los caracteres que recibe como par�metro. (Algoritmo explicado en Tema 5 , p�g 7 de los apuntes)

	 */
	public static String crearCadenaConGuiones(String original,char ...c){
		String guionizado="";
		boolean encontrado = false;
		for(int i=0;i<original.length();i++){
			//Recorremos array de caracteres pasados como par�metros
			encontrado = false;
			for(char j:c){
			if(original.charAt(i)==j){
				guionizado+=j+" ";
				encontrado = true;
			}
			}
			if(!encontrado){
				guionizado+="- ";
			}
			
		}
		
		return guionizado;
	}
	
	/* 4.
	 * Programar un m�todo que reciba un String y devuelva true si contiene alg�n digito y false si no lo contiene.

	 */
	
	public static boolean contieneDigMinMay8Car(String str) {

        boolean hay8Caracteres = false;
        boolean hayDigito = false;
        boolean hayMin = false;
        boolean hayMay = false;

        if (str.length() >= 8) {
            hay8Caracteres = true;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                hayDigito = true;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                hayMin = true;
            }
            if (Character.isUpperCase(str.charAt(i))) {
                hayMay = true;
            }
        }
        return hay8Caracteres && hayDigito && hayMin && hayMay;
    }


	
	/*
	 * 5. Crear un m�todo que codifique el String que recibe como par�metro siguiendo el siguiente algoritmo:
			Las letras �i� las sustituye por un 1
			Las letras �o� las sustituye por un cero.
			Las letras �a� por un *
			A�ade al final de cada palabra del String el hashcode de dicha palabra.
			A�ade al principio de cada palabra el n�mero de caracteres de la palabra resultante despu�s de las transformaciones anteriores.

	 */
	
	public static String codificar(String original){
		String codificado = original;
		
		//1 Sustituimos vocales
		codificado = original.replace("i", "1");
		codificado= codificado.replace("o", "0");
		codificado = codificado.replace("a", "*");
		//2. Troceamos en palabras
		
		String palabras[] = codificado.split(" ");
		
		//3. A�adimos en cada palabra su hashcode
		
		for(int i = 0;i<palabras.length;i++){
			palabras[i]+=Integer.toString(palabras[i].hashCode());
		}
		
		//4. Debemos a�adir al inicio de cada palabra el n�mero de caracteres
		
		for(int i = 0;i<palabras.length;i++){
			palabras[i] = Integer.toBinaryString(palabras[i].length()) + palabras[i];
		}
		
		//5. Debemos reconstruir el String codificado con las nuevas palabras generadas
		codificado = "";
		for(int i = 0;i<palabras.length;i++){
			codificado+=palabras[i]+" ";
		}
		return codificado;
	}
}
