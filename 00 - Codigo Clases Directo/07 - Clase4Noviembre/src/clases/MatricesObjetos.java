package clases;

public class MatricesObjetos {
	
	//Método que printa por pantalla la matriz de libros
	public static void printarMatrizLibros(Libro[] libros) {
		for(Libro l : libros) {
			System.out.println(l);
		}		
	}
	
	public static boolean agregarLibro(Libro[] libros,Libro l) {
		for(int i = 0;i<libros.length;i++) {
			if(libros[i] == null) {
				libros[i] = l;
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Matrices de libros
		Libro[] misLibros = new Libro[10];
		Libro[] alquilados = new Libro[10];
		misLibros[0] = new Libro("adasf", "La fundación", "Isaac Asimov", "USA", 100);
		
		printarMatrizLibros(misLibros);		
			
		agregarLibro(misLibros, new Libro("2134","El archivo de las tormentas","Brandon","USA",50));
		
		printarMatrizLibros(misLibros);
		
		printarMatrizLibros(alquilados);
		
		
		
		
		
	}

}
