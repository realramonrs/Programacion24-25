package ejemplosFicheros;
import java.io.*;
public class EjemploBufferLectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] series = new String[10];
		try {
			FileReader lector = new FileReader(Globales.rutaSeries);
			BufferedReader buffer = new BufferedReader(lector);
			
			String registro = "";
			int indice = 0;
			while(registro!=null) {
				registro = buffer.readLine();
				if(indice<series.length && registro!=null) {
				series[indice++] = registro;
				}				
			}
			
			buffer.close();
			lector.close();					
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no encontrado");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Series en stock
		System.out.println("Series disponibles para alquilar: ");
		for(String ser : series) {
			if(ser!=null) {
				System.out.println(ser);
			}
		}
	}

}
