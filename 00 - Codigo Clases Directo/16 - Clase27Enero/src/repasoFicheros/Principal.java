package repasoFicheros;
import java.io.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ruta = ".\\pelis.txt";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(ruta))) {
			
			String registro = "";
			while(registro!=null) {
				registro = bf.readLine();
				if(registro!=null)
				System.out.println(registro);
				
			}
			
			
		}catch(Exception e) {
			System.out.println("Error al leer el fichero");
		}
		
		try(BufferedWriter bfw = new BufferedWriter(new FileWriter(ruta,true))){
			
			bfw.newLine();
			bfw.write("Gremlins");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
