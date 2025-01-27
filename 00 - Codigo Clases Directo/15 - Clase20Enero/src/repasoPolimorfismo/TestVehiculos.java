package repasoPolimorfismo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class TestVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo v1 = null;
		Vehiculo v2 = null;
		try {
			v1 = new Coche("0ER","Mercedes",0,LocalDate.of(2024, 12, 2),"1234GHT",Combustible.Diesel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			v2 = new Coche("1ER","Mercedes",0,LocalDate.of(2024, 12, 2),"9090RTF",Combustible.Gasolina);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
				
		System.out.println(v1);
		System.out.println(v2);
		
		
		//************************* TEST GESTOR VEHICULOS ************************//
		GestorVehiculos gv = new GestorVehiculos();
		gv.addVehiculo(v2);
		gv.addVehiculo(v2);
		gv.addVehiculo(v1);
		try {
			gv.addVehiculo(new Avion("1DR","Boening",0,LocalDate.of(2019, 3, 4),350));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		float totalRecaudadoPorImpuestoCirculacion = gv.getPagoPorImpuestoCirculacion();
		System.out.println(totalRecaudadoPorImpuestoCirculacion);
		
		gv.mostrarInfo();
		
		
		Vehiculo[] vehic = new Vehiculo[10];
		Arrays.sort(vehic);
		Arrays.sort(vehic, new ComparadorVehiculo());
		Arrays.sort(vehic,new Comparator<Vehiculo>() {

			@Override
			public int compare(Vehiculo o1, Vehiculo o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
		
		
		
	}

}
