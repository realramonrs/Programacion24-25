package ejemplosBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConsultasPreparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String autor;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca el auotr: ");
		autor = lector.nextLine();
		
		try {
			Connection conexion = DriverManager.getConnection(Utilidades.cadenaConexion1,"root","");
			
			//Consulta que obtiene todos los libros de un autor
			PreparedStatement sentencia = conexion.prepareStatement("SELECT * From Libros Where Autor = ?");
			//Paso de parámetros
			sentencia.setString(1, autor);
			
			ResultSet resultados = sentencia.executeQuery();
			
			while(resultados.next()) {
				System.out.println(resultados.getString("Nombre") + " " + resultados.getFloat("Precio"));
			}
			
			resultados.close();
		}
		catch(SQLException ex) {
			ex.getStackTrace();
		}

	}

}
