package ejemplosFicheros;
import java.io.*;

public class EjemploTryConRecursos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] series = new String[10];
		try(FileReader lector = new FileReader(Globales.rutaSeries);BufferedReader bufer = new BufferedReader(lector)){
			String registro = "";
			int indice = 0;
			while(registro!=null) {
				registro = bufer.readLine();
				series[indice++]  = registro;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
