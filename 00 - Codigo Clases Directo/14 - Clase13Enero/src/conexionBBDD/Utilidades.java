package conexionBBDD;

import java.sql.*;
import java.util.ArrayList;

import mapping.Libro;

public class Utilidades {

	public static final String cadenaConexionMariaDB = "jdbc:mariadb://localhost:3306/tiendaonline";
	public static final String cadenaMySQL = "jdbc:mysql://localhost:3306/tiendaonline";
	
	
	//Método que genera una Lista con los libros de la BBDD
	
	public static ArrayList<Libro> getLibrosBBDD(){
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Connection conexion;
		try {
			conexion = DriverManager.getConnection(cadenaConexionMariaDB,"root","");
			Statement consulta = conexion.createStatement();
			ResultSet resultado = consulta.executeQuery("SELECT * FROM Libros");
			
			while(resultado.next()) {
				Libro libro = new Libro(resultado.getInt("Codigo"),resultado.getString("Titulo"),
						resultado.getString("Autor"),resultado.getFloat("Precio"),resultado.getString("Genero"));
				
				libros.add(libro);
			}
			resultado.close();
			conexion.close();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return libros;
		
	}
	
	//Método que realiza un Insert en la bbdd
	public static void addLibroBBDD(String titulo,String autor,float precio,String genero) {
		Connection conexion;
		try {
			conexion = DriverManager.getConnection(cadenaConexionMariaDB,"root","");
			PreparedStatement consultaPreparada = conexion.prepareStatement("INSERT INTO Libros(Titulo,Autor,precio,genero) Values (?,?,?,?)");
	        consultaPreparada.setString(1, titulo);
	        consultaPreparada.setString(2, autor);
	        consultaPreparada.setFloat(3,precio);
	        consultaPreparada.setString(4, genero);
		
	        consultaPreparada.executeUpdate();
	        conexion.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
