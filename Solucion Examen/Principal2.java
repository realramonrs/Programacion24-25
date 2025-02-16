/**
 * 
 */
package ejercicio2;

import java.util.ArrayList;

/**
 * @author Ramon RS
 *
 */
public class Principal3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ap. d ) Crear una matriz o colección de objetos espaciales ,
		//almacena tanto estrellas como objetosespaciales , como ovnis.

		ArrayList<ObjetoEspacial> cosmos = new ArrayList<ObjetoEspacial>();
		cosmos.add(new Estrella(10,2300,"A",0.2f,7));
		cosmos.add(new Ovni(34,1000));
		cosmos.add(new Estrella(106,2300,"C",0.6f,2));
		cosmos.add(new ObjetoEspacial(340,1000,"D"));

		//Ap. e)Motrar por pantalla la luminosidad , la temperatura y el 
		//tipo de estrella de aquellos objetos de la colección que efectivamente sean estrellas. 

		for(ObjetoEspacial oe : cosmos) {
			if(oe instanceof Estrella) {
				//Cast de oe a estrella
				Estrella star = (Estrella)oe;
				System.out.println(star.getNombre() + " " + star.getLuminosidad() + " " + 
				star.getTemperatura() + " " + star.getTipo());
			}
		}
		
		//Ap f. ) Mostrar el número de Ovnis registrado en la matriz.
		int contadorOvnis = 0;
		for(ObjetoEspacial oe : cosmos) {
			if(oe instanceof Ovni) {
				contadorOvnis++;
				}
			}
		System.out.println("Hay " + contadorOvnis + " ovnis registrados");
	}

}
