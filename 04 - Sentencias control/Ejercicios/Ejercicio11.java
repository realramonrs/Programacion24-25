/**
 * 
 */
package Ejercicios;

/**
 * @author Ramon RS
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Detectar cuantas palabras empiezan por z
		//Esta vez en vez de mostrarlas por pantalla las voy a guarda en una matriz
		//Para que veais un algoritmo diferente
		String frase = "Zacar�as se puso los zapatos y fu� tras "
				+ "el zorro atravezando zarzas y zarzamoras";
		
		//Separo el string en palabras utilizando split
		
		String palabras[] = frase.split(" ");
		
		//Declaro una matriz para almacenar palabras que empiecen por z
		
		String palabrasConZ[] = new String[palabras.length];
		
		for(String p : palabras) {
			
			if(p.startsWith("z")||p.startsWith("Z")) {
				//Introducirlo en la primera posici�n vac�a de palabrasConZ
				for(int i = 0;i<palabrasConZ.length;i++) {
					if(palabrasConZ[i]==null) {
						palabrasConZ[i] = p;
						
						break;
					} //Fin del if
					
				} //Fin del for que recorre palabrasconz buscando posiciones vac�as
				
			} //Fin del if que busca palabras con z
			
		} //Fin del for que recorre la matriz de palabras
		
		//Mostrar la matriz que almacena palabras con z
		//Como tendr� posiciones null a�ado un if para que no muestre estas posiciones
		for(String pz : palabrasConZ) {
			if(pz==null) {
				continue; //Si puede haber posiciones null por el medio
				// Si estamos seguros de que no las hay pondr�amos un break
			}
			System.out.println(pz);
		}
	}

}
