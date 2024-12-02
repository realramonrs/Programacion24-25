package ejemplosFicheros;
import java.io.*;

public class EjemploBufferEscritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter escritor = new FileWriter(Globales.rutaSeries,true);
			BufferedWriter buffer = new BufferedWriter(escritor);
			
			buffer.write("The Wire");
			buffer.newLine();
			
			buffer.close();	
			escritor.close();					
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
