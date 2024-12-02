package ficheros;
import java.io.*;

public class LecturaFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rutaBase = System.getProperty("user.dir")+"\\src";		
		System.out.println(rutaBase);
		try {
			FileReader lector = new FileReader(rutaBase + "\\datos.txt");
			
			int c=0;
			while(c!=-1) {
				c = lector.read();
				System.out.print((char)c);
				
			}
			System.out.println();
			lector.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero no existe!");
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se puede acceder ahora al fichero");
		}
		catch(Exception e) {
			System.out.println("Error desconocido");
		}
		
		System.out.println("Hola");
	}

}
