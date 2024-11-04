package clases;

public class Principal {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o = new Object();
		Autor a1 = new Autor();
		//Acceder a los atributor del objeto a1
		a1.setNombre("Ken Follet");
		String nombre = a1.getNombre();
		System.out.println("Autor: " + a1.getNombre());
		
		// Autor con segundo constructor
		Autor a2 = new Autor("Stephen King","USA",55);
		Autor a3 = new Autor("Herman Hesse","Alemania",9890);
		
		System.out.println(a2.getNombre());
		
		//Mostrar por pantalla info de un autor
		System.out.println(a3);
		a3.printAutor();
		
		
		//Acceso con set y get
		int edad = a3.getEdad();
		//a3.setEdad(45);
		a3.setPais("Alemania");
		System.out.println("**************");
		System.out.println("a1= " + a1);
		System.out.println("a2= " + a2);
		System.out.println("a3= " + a3);
		
		
		
	}

}
