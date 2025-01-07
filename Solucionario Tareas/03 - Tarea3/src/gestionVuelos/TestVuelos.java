package gestionVuelos;

import java.time.LocalDate;

public class TestVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lugar origen = new Lugar("Madrid",new GeoPunto(40.4195,-3.700));
		Lugar destino = new Lugar("Berlin",new GeoPunto(52.523,13.383489154));

		VueloComercial vc = new VueloComercial(Companhia.FlyInfinity,origen,destino,LocalDate.of(2025, 6, 1),2);
		System.out.println(vc);
	}

}
