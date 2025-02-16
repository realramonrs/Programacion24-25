/**
 * 
 */
package ejercicio2;

/**
 * @author Ramon RS
 *
 */
public class Principal2ConArrays {

	/**
	 * @param args
	 */
	
	//Apartado f: No se pueden guardar 2 objetos con el mismo nombre
	public static boolean buscarNombre(ObjetoEspacial c[],ObjetoEspacial o) {
		boolean encontrado = false;
		
		for(ObjetoEspacial oe : c) {
			if(oe!=null) {
				if(oe.getNombre().equals(o.getNombre())) {
					encontrado = true;
					break;
				}
			}
		}
		
		return encontrado;
	}
	public static void guardarObjetoEspacial(ObjetoEspacial c[],ObjetoEspacial o) {
		//Primero buscamos si ya hay un Objeto con el mismo nombre
		if(!buscarNombre(c,o)) {
		for(int i = 0;i<c.length;i++) {
			if(c[i]==null) {
				c[i]=o;
				break;
			}
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Apartado h: Matriz con 4 Objetos Espaciales
		ObjetoEspacial cosmos[] = new ObjetoEspacial[10];
		
		guardarObjetoEspacial(cosmos,new ObjetoEspacial(10,2300,"A"));
		guardarObjetoEspacial(cosmos,new ObjetoEspacial(34,1000,"B"));
		guardarObjetoEspacial(cosmos,new ObjetoEspacial(106,2300,"C"));
		guardarObjetoEspacial(cosmos,new ObjetoEspacial(340,1000,"D"));
		
		guardarObjetoEspacial(cosmos,new ObjetoEspacial(340,1000,"D"));
		
		//Apartado g): Mostramos los nombres y la masa de los objetos guardados
		for(ObjetoEspacial o : cosmos) {
			if(o!=null)
			System.out.println(o.getNombre() + " " + o.getMasa());
		}
		
	}

}
