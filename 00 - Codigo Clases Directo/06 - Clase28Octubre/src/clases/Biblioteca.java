package clases;

public class Biblioteca {

	private Libro[] libros;
	
	
	public void printarBiblioteca() {
		for(Libro l : libros) {
			System.out.println(l);
		}
	}
	
	public boolean addLibro(Libro l) {
		for(int i = 0;i<libros.length;i++) {
			if(libros[i]==null) {
				libros[i] = l;
				return true;
			}
		}
		return false;
	}
}
