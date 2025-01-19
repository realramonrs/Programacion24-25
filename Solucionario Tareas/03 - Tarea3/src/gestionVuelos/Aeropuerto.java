package gestionVuelos;

import java.util.ArrayList;

public class Aeropuerto {

	ArrayList<Vuelo> gestorVuelos;
	
	public Aeropuerto() {
		gestorVuelos = new ArrayList<Vuelo>();
	}
	
	public Aeropuerto(int capacidad) {
		gestorVuelos = new ArrayList<Vuelo>(capacidad);
	}
	
	public void addVuelo(Vuelo v) {
		this.gestorVuelos.add(v);
	}
	
	public float getGanancia() {
		float ganancia = 0;
		for(Vuelo v : gestorVuelos) {
			
			ganancia+=v.calcularGanancia();
		}
		return ganancia;
	}
	
	public ArrayList<Vuelo> getVuelosByCompania(Companhia c){
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
		
		for(Vuelo v : gestorVuelos) {
			if(v.getCompanhia()==c) {
				vuelos.add(v);
			}
		}
		return vuelos;
	}
	public ArrayList<Vuelo> getVuelosByDestino(String destino){
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
		
		for(Vuelo v : gestorVuelos) {
			if(v.getDestino().getNombre().equals(destino)) {
				vuelos.add(v);
			}
		}
		return vuelos;
	}
	
	public Vuelo getVueloByCodigo(String codigo) {
		for(Vuelo v : gestorVuelos) {
			if(v.getCodigo().equals(codigo)) {
				return v;
			}
		}
		return null;
	}
	
	public void mostrarInfoVuelos() {
		for(Vuelo v : gestorVuelos) {
			System.out.println(v);
		}
	}
	
	public void mostrarInfoVuelosComerciales() {
		for(Vuelo v : gestorVuelos) {
			if(v instanceof VueloComercial)
				System.out.println(v);
		}
	}
	
	public void mostrarInfoVuelosMercancias() {
		for(Vuelo v : gestorVuelos) {
			if(v instanceof VueloMercancias)
				System.out.println(v);
		}
	}
	public void mostrarCodigos() {
		for(Vuelo v : gestorVuelos) {
			
				System.out.println(v.getCodigo());
			
		}
	}
	public void mostrarCodigos(boolean comercial) {
		if(comercial) {
			for(Vuelo v : gestorVuelos) {
				if(v instanceof VueloComercial) {
					System.out.println(v.getCodigo());
				}
			}
				
			}
			else {
				for(Vuelo v : gestorVuelos) {
					if(v instanceof VueloMercancias) {
						System.out.println(v.getCodigo());
					}
				}
			}	
		}
	
	public float calcularGananciaMercancias() {
		float ganancia = 0;
		for(Vuelo v : gestorVuelos) {
			if(v instanceof VueloMercancias) {
				ganancia += v.calcularGanancia();
			}
		}
		return ganancia;
	}
	public float calcularGananciaComercial() {
		float ganancia = 0;
		for(Vuelo v : gestorVuelos) {
			if(v instanceof VueloComercial) {
				ganancia += v.calcularGanancia();
			}
		}
		return ganancia;
	}
	
	public float gananciaTotal() {
		return calcularGananciaComercial() + calcularGananciaMercancias();
	}
	
	public Vuelo getVueloMasLargo() {
		Vuelo v = gestorVuelos.get(0);
		
		for(Vuelo vuelo : gestorVuelos) {
			if(vuelo.getDistancia()>v.getDistancia()) {
				v = vuelo;
			}
		}
		return v;
	}
}
