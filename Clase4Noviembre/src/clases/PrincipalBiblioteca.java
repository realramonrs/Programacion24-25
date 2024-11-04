package clases;

public class PrincipalBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Biblioteca b = new Biblioteca();
		Biblioteca b2 = new Biblioteca("Municipal",100);
		Libro[] librosCiencia = new Libro[3];
		librosCiencia[0] = new Libro("31341234","Historia del tiempo",new Autor( "Stephen Hawking","Inglaterra",80));
		Biblioteca b3 = new Biblioteca("Cientifica",librosCiencia);
		
		System.out.println("Info biblioteca b");
		b.printarBiblioteca();
		
		b.addLibro(new Libro("123456789","El problema de los 3 cuerpos","Jao Xin","China",45));
		System.out.println("Info biblioteca b , después de añadir un libro");
		b.addLibro(librosCiencia[0]);
		
		
		b.addLibro(new Libro("0909090909","El médico",new Autor("Moah Gordon","USA",90)));
		
		b.printarBiblioteca();
		
		//Obtener un libro a partir del ISBN
		
		//Obtener libro a partir del título
		
		//Obtener el libro que está en una determinadad posición
		
		
		
		
		
	}

}
