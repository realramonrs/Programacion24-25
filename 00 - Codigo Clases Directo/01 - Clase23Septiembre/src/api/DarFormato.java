package api;

import java.text.DecimalFormat;

public class DarFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(78.8374));
		
		float numero2 = 4.8932f;
		long numero3 = 9000000;
		System.out.printf("%.2f \n",numero2);
		//Mostrar separador de miles
		System.out.printf("%,d \n",numero3);
		
		//Todo en la misma linea
		System.out.printf("%.2f \n%,d",numero2,numero3);
		
	}

}
