package gestionVuelos;

public class TestCalculoDistancias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lugar origen = new Lugar("Madrid",new GeoPunto(40.4195,-3.700));
		Lugar destino = new Lugar("Berlin",new GeoPunto(52.523,13.383489154));
		System.out.println(origen.getPosicion().distancia(destino.getPosicion())/1000);
		
	}

}
