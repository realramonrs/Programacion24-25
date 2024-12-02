package ejemplosFicheros;
import java.io.*;

public class MenuCanciones {
	
	private static Cancion[] leerFicheroCanciones(String ruta) {
		Cancion[] canciones = new Cancion[10];
		try(BufferedReader bf = new BufferedReader(new FileReader(Globales.rutaCaciones))){
			
			String registro = "";		
			
			String registro2 = "";
			int indice = 0;
			while(registro!=null) {
				registro = bf.readLine();
				if(registro!=null) {
				String[] datos = registro.split(",");
				canciones[indice++] = new Cancion(datos[0],datos[1],Integer.parseInt(datos[2]));
				}
				}					
		}
		catch(FileNotFoundException f) {
			return null;
		}
		catch(IOException ex) {
			return null;
		}
		
		return canciones;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cancion[] canciones = leerFicheroCanciones(Globales.rutaCaciones);
		
		
		System.out.println("1. Introducir nueva canción");
		System.out.println("2. Ver canciones actuales");
		System.out.println("3. Ver canciones por grupo");
		System.out.println("4. Ver canciones por valoración");
		
		
		InputStreamReader consola = new InputStreamReader(System.in);
		BufferedReader lector = new BufferedReader(consola);
		
		System.out.println("Introduzca una opcion:");
		try {
			int opcion = Integer.parseInt(lector.readLine());
			System.out.println(opcion);
			
			switch(opcion) {
			
			case 1:
				
				String titulo,autor;
				int valoracion;
				System.out.println("Introduzca titulo");
				titulo = lector.readLine();
				System.out.println("Introduzca autor");
				autor = lector.readLine();
				System.out.println("Introduzca la valoración");
				valoracion = Integer.parseInt(lector.readLine());
				
				//Escribir esto en el fichero
				
				try(BufferedWriter bf = new BufferedWriter(new FileWriter(Globales.rutaCaciones,true))){
					//Escribir los datos de la canción en el fichero
					//Cancion c = new Cancion(titulo,autor,valoracion);
					bf.write(titulo +"," + autor +"," + valoracion);
					bf.newLine();
					
				} catch(IOException ex) {
					System.out.println("Error al volcar al fichero");
				}
				
				
				break;
			case 2:
				for(Cancion c : canciones) {
					if(c!=null) {
						System.out.println(c);
					}
					else {
						break;
					}
				}
				break;
			case 3:
				System.out.println("Introduce el autor : ");
				String autor2 = lector.readLine();
				
				for(Cancion c : canciones) {
					if(c!=null) {
					if(c.getAutor().equals(autor2)) {
						System.out.println(c);
					}
					}
					else {
						break;
					}
				}
				
				default:
					break;
			}
			
			
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Debe introducir números enteros");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Se produjo error de conexión.");
		}
	}

}
