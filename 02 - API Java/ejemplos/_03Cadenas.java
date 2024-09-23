package ejemplos;

public class _03Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "En un lugar de la Mancha...";
				
		int numeroCaracteres = cadena.length(); //Obtiene el n�mero de caracteres
		
		char letra = cadena.charAt(4); //Obtiene el caracter que ocupa la posici�n 4
		
		int posicionPrimerEspacio = cadena.indexOf(" "); //�ndice de la primera aparici�n de un espacio
		
		System.out.println(posicionPrimerEspacio);
		
		int posPrimerSubstring = cadena.indexOf("lugar"); //�ndice de la primera aparici�n del String lugar
		
		System.out.println(posPrimerSubstring);
		
		String cadena2 = "En un lugar de la Mancha...";
		
		boolean igualesConEquals = cadena.equals(cadena2); //Compara ambos Strings y devuelve true si son iguales.
		
		boolean igualesConOperadorIgual = cadena == cadena2;
		
		System.out.println(igualesConEquals);
		System.out.println(igualesConOperadorIgual);
		
		String subCadena = cadena2.substring(3); //Devuelve la subcadena a partir del �ndice 3 inclu�do
		
		String subCadena2 = cadena2.substring(2, 5); //Devuelve la subcadena comprendida entre el �ndice 2 inclu�do
		//y el 5 sin incluir
		
		System.out.println(subCadena);
		String trozos[] = cadena.split(" "); //Trocea la cadena en subcadenas y devuelve una matriz con las subcadenas
		String trozoCero = cadena.split(" ")[0];//Obtiene la posici�n cero de la matriz devuelta por split
	}

}
