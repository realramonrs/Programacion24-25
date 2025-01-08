package ejemplosBBDD;
import java.sql.*;

public class ConsultasBBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Connection conexion = DriverManager.getConnection(Utilidades.cadenaConexion1,"root","");
			
			Statement sentencia = conexion.createStatement();
			String consulta1 = "SELECT Nombre,Precio From Libros Where Autor = 'JRR Tolkien'";
			String consulta2 = "SELECT * From Libros Where Precio > 20";
			
			// Ejemplo de Consulta que inserta un registro en la BBDD
			String consulta3 = "INSERT INTO Libros(Nombre,Autor,Precio) Values ('It','Stephen King',18)";
			//sentencia.executeUpdate(consulta3);
			
			//Ejemplo de Consulta que elimina un registro de la BBDD
			String consulta4 = "DELETE From Libros Where Codigo = 1";
			sentencia.executeUpdate(consulta4);
			
			//Ejemplo de Consulta que actualiza un registro, por ejemplo el precio
			String consulta5 = "UPDATE Libros SET Precio = 50 Where Codigo = 2";
			sentencia.executeUpdate(consulta5);
			
			ResultSet resultados = sentencia.executeQuery(consulta1);
			
			//Mostrar por pantalla el título
			while(resultados.next()) {
				System.out.println(resultados.getString("Nombre"));
			}
			
			resultados = sentencia.executeQuery(consulta2);
			System.out.println("Libros cuyo precio es superior a 20€");
			while(resultados.next()) {
				System.out.println(resultados.getString("Nombre"));
			}
			
			
			resultados.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
