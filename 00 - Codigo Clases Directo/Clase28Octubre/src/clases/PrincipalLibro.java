package clases;

public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Autor a1 = new Autor("Noah Gordon","Irlanda",67);
		Libro l1 = new Libro("134712398471329","El Médico",a1);
		
		//Instanciación anónima
		Libro l2 = new Libro("p2u3u4pwper0900","Los pilares de la Tierra",new Autor("Ken Follet","Inglaterra",81));
		
		Libro l3 = new Libro("12341324123","Piensa en Java","Bruce Eckel","USA",67);
		
		//Mostrar por pantalla info de un libro
		System.out.println(l1);
		//Alquilar l1:
		l1.setAlquilado(true);
		System.out.println(l1);
		//Acceder al título y al isbn de un libro
		
		String titulo = l2.getTitulo();
		String isbn = l2.getISBN();
		
		//Acceder al nombre del autor
		String autor = l2.getAutor().getNombre();
		int edad = l2.getAutor().getEdad();
		
		
		
	}

}
