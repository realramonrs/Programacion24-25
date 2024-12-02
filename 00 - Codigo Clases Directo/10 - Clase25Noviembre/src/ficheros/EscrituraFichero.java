package ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter escritor = new FileWriter(".\\src\\datos.txt",true);
			escritor.write("\n");
			escritor.write("11111111E");
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
