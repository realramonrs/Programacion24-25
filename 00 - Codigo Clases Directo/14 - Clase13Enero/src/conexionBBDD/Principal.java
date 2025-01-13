package conexionBBDD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Conection
		Connection conexion;
		Statement consulta;
		PreparedStatement consultaLibrosPorGenero;
		PreparedStatement consultaLibrosPorAutor;
		PreparedStatement consultaInsertLibro;
		
		try {
			conexion = DriverManager.getConnection(Utilidades.cadenaConexionMariaDB, "root", "");
			//Consulta que obtenga todos los registros:
			consulta = conexion.createStatement();
			//Definir consultas preparadas
			//1. Obtener libros por género
			consultaLibrosPorGenero = conexion.prepareStatement("SELECT * From Libros Where Genero = ?");
			//2. Obtener libros por autor
			consultaLibrosPorAutor = conexion.prepareStatement("SELECT * FROM Libros Where Autor = ?");
			//3. Consulta para añadir un nuevo libro a la BBDD
			
			consultaInsertLibro = conexion.prepareStatement("INSERT INTO Libros (Titulo,Autor,Precio,Genero) Values(?,?,?,?)");
				
			
			//PRESENTAR UN MENÚ : 
			System.out.println("1. Ver todos los libros");
			System.out.println("2. Ver libros por género");
			System.out.println("3. Ver libros por autor:");
			System.out.println("4. Añadir nuevo libro");
			Scanner lector = new Scanner(System.in);
			int opcion = lector.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Libros actualmente en stock: ");
				//Las consultas de tipo SELECT --> ResultSet
				ResultSet resultado = consulta.executeQuery("SELECT * FROM Libros");
				//Recorrer el ResultSet
				while(resultado.next()) {
					System.out.println(resultado.getInt(1) + " " + resultado.getString("Titulo") + " " + resultado.getString("Autor"));
				}
				resultado.close();
				break;
			case 2: 
				//Mostrar por pantalla los géneros que tenemos:
				Statement consultaGeneros = conexion.createStatement();
				ResultSet resultado2 = consultaGeneros.executeQuery("SELECT DISTINCT Genero FROM Libros");
				
				System.out.println("Seleccione un género");
				int contador = 1;
				while(resultado2.next()) {
					System.out.println(contador +" " + resultado2.getString("Genero"));
					contador++;
				}
				
				int opcion2 = lector.nextInt();
				String genero = null;
				switch(opcion2) {
				case 1:
					genero = "Ficción";
					break;
				
				case 2:
					genero = "Terror";
					break;
			
				case 3:
					genero = "Novela";
					break;
						
				
				case 4:
					genero = "Comedia";
				break;
			
					} //Fin del Switch opcion2
				
				//Indicar parámetro a la consulta preparada
				consultaLibrosPorGenero.setString(1, genero);
				ResultSet librosPorGenero = consultaLibrosPorGenero.executeQuery();
				while(librosPorGenero.next()) {
					System.out.println(librosPorGenero.getString("Titulo") + " " + librosPorGenero.getString("Autor") + " " +
				librosPorGenero.getFloat("Precio"));
				}
			    librosPorGenero.close();
			    
			    
			case 3:
				String autor;
				System.out.println("Introduzca autor");
				Scanner lector2 = new Scanner(System.in);
				autor = lector2.nextLine();
				
				consultaLibrosPorAutor.setString(1, autor);
				
				ResultSet librosPorAutor = consultaLibrosPorAutor.executeQuery();
				
				while(librosPorAutor.next()) {
					System.out.println(librosPorAutor.getString("Titulo") + " " + librosPorAutor.getString("Genero"));
				}
				librosPorAutor.close();		
			  
			case 4:
				String autor4, titulo,genero4;
				float precio;
				Scanner lector4 = new Scanner(System.in);
				System.out.println("Introduzca un autor: ");
				autor4 = lector4.nextLine();
				
				System.out.println("Intro titulo");
				titulo = lector4.nextLine();
				System.out.println("Intro genero");
				genero4 = lector4.nextLine();
				System.out.println("Intro precio: ");
				precio = lector4.nextFloat();
				
				//Pasar parámetros a la consulta preparada
				consultaInsertLibro.setString(1,titulo);
				consultaInsertLibro.setString(2, autor4);
				consultaInsertLibro.setFloat(3, precio);
				consultaInsertLibro.setString(4, genero4);
				
				//Ejecutar la consulta
				consultaInsertLibro.executeUpdate();
				
			}
			} //Final del Try
		catch(SQLException ex) {
			
			ex.printStackTrace();
		}
		
	}

}
