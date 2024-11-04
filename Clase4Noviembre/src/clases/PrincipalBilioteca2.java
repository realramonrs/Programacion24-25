package clases;

public class PrincipalBilioteca2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Biblioteca escolar = new Biblioteca("IES Colegio Fenomenal",2);
		
		//Añadir un par de libros
		escolar.addLibro(new Libro("100","La Isla del tesoro",new Autor("Robert Stevenson","Inglaterra",44)));
		escolar.addLibro(new Libro("101","Viaje al centro de la Tierra",new Autor("Julio Verne","Francia",76)));
		escolar.addLibro(new Libro("102","El arte de la guerra",new Autor("Tsun Tzu","China",76)));
		escolar.addLibro(new Libro("103","El arte de la guerra",new Autor("Tsun Tzu","China",76)));
		escolar.addLibro(new Libro("104","El arte de la guerra",new Autor("Tsun Tzu","China",76)));
		//Printar info biblioteca
		escolar.printarBiblioteca();
	}

}
