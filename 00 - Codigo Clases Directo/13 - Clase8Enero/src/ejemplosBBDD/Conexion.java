package ejemplosBBDD;
import java.sql.*;
public class Conexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Definir la conexión a la Base de Datos
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaonline","root","");
		//2. Crear objeto Statement
			Statement sentencia = conexion.createStatement();
		
		//3. Ejecturar sentencia SQL
			//Dos tipos de consultas
			// A) Consultas que devuelven información --> Tipo SELECT --> método executeQuery
			// B) Consultas que modifican la tabla --> Tipo INSERT, DELETE, UPDATE --> método executeUpdate...
			
		    ResultSet resultados = sentencia.executeQuery("SELECT * From Libros");
		    
		  //4. Recorrer el ResultSet
		    while(resultados.next()) {
		    	//System.out.println(resultados.getInt("codigo") + " , " + resultados.getString("nombre") + "," + 
		   // resultados.getString("Autor") + " , " + resultados.getFloat("Precio"));//
		    	System.out.println(resultados.getInt(1) + " , " + resultados.getString(2) + "," + 
		    		    resultados.getString(3) + " , " + resultados.getFloat(4));
		    }
		    resultados.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
