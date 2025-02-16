/**
 * 
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author Ramon RS
 *
 */
public class Principal2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<ObjetoEspacial> cosmos = new HashSet<ObjetoEspacial>();
		
		cosmos.add(new ObjetoEspacial(10,2300,"A"));
		cosmos.add(new ObjetoEspacial(34,1000,"B"));
		cosmos.add(new ObjetoEspacial(106,2300,"C"));
		cosmos.add(new ObjetoEspacial(340,1000,"D"));
//		Intentamos almacenar un objeto espacial con el mismo nombre
		cosmos.add(new ObjetoEspacial(1000,2300,"A"));
		
		//Mostrar nombres y masa
		for(ObjetoEspacial oE : cosmos) {
			System.out.println(oE.getNombre() + " " + oE.getMasa());
		}
		
		//Obtener objeto más masivo : Opción A
						
		ArrayList<ObjetoEspacial> cosmosLista = new ArrayList<ObjetoEspacial>(cosmos);
		ObjetoEspacial oMasivo = cosmosLista.get(0);
		for(int i = 1;i<cosmosLista.size();i++) {
			oMasivo = ObjetoEspacial.getObjetoMasivo(cosmosLista.get(i), oMasivo);
		}
		
		System.out.println("El objeto más masivo es : " + oMasivo);
		
		//Obtener objeto más masivo : Oción B: Utilizando un TreeSet
		TreeSet<ObjetoEspacial> cosmosOrdenado = new TreeSet<ObjetoEspacial>(cosmos);
		System.out.println("El objeto más masivo es : " + cosmosOrdenado.last());
		System.out.println("El objeto menos masivo es : " + cosmosOrdenado.first());
		
	}

}
