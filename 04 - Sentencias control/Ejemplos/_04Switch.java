package Ejemplos;
import java.util.Scanner;
public class _04Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Presentaci�n de un men� con diferentes opciones
		
		System.out.println("Escoja una opci�n por favor");
		System.out.println("1. Ver provincias de Galicia");
		System.out.println("2. Ver la lista de Reyes Godos");
		System.out.println("3. R�os de Espa�a");
		System.out.println("4. Salir");
		Scanner lector = new Scanner(System.in);
		int opcion = lector.nextInt();
		
		switch(opcion) {
				
		case 1:
			System.out.println("Provincias de Galicia");
			System.out.println("Coru�a , Lugo , Ourense , Pontevedra");
			break;
		case 2:
			System.out.println("Reyes Godos : ");
			System.out.println("Ata�lfo , Sigerico , Walia , Teoderedo, Turismundo, Teodorico ,"
					+ "Eurico , Alarico II , Gesaleico , Amalarico , Teudis, Teudiselo , Agila I,"
					+ "Atanagildo , Liuva I , Leovigido , Recaredo I, Liuva II, Witerico , Gundemaro,"
					+ "Sisebuto , Recaredo II , Suintila , Sisenando , Chintila , Tulga, Chindasvinto,"
					+ "Recesvinto , Wamba , Ervigio , �gica , Witiza , Rodrigo");
			break;
		case 3:
			System.out.println("R�os de Espa�a");
			System.out.println("Ebro , Tajo , Guadiana , Guadalquivir , Duero , Mi�o , Segura , J�car,"
					+ "Genil , Nal�n , Ter , Turia , Segre , Esla , Tormes , Sil , Bidasoa , Pisuerga...");
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Opci�n escogida no v�lida");
			break;
		
		}

	}

}
