package repasoPolimorfismo;

import java.util.ArrayList;
import java.util.Comparator;

public class GestorVehiculos {

	private ArrayList<Vehiculo> vehiculos;
	
	public GestorVehiculos() {
		vehiculos = new ArrayList<Vehiculo>();
	}
	
	public boolean addVehiculo(Vehiculo v) {
		
		//Comprobar que no tengo otro vehiculo con el mismo código
		
		if(!buscarCodigo(v.getCodigo())) {
			vehiculos.add(v);
			return true;
		}
		return false;
		
	}
	
	public void establecerPrecio() {
		for(Vehiculo v : vehiculos) {
			v.calcularPrecio();
		}
	}
	
	public float getPagoPorImpuestoCirculacion() {
		float pagoTotal = 0;
		
		for(Vehiculo v : vehiculos) {
			if(v instanceof Coche) {
			Coche c = (Coche)v;
			pagoTotal+= c.calcularImpuestoCirculacion();
			}
		}
		return pagoTotal;
	}
	
	private boolean buscarCodigo(String codigo) {
		for(Vehiculo v : vehiculos) {
			
			if(v.getCodigo().equals(codigo)) {
				return true;
			}
		}
		return false;
	}
	
	public void mostrarInfo() {
		for(Vehiculo v : vehiculos) {
			System.out.println(v.toString());
		}
	}
	
	//Ordenar los vehiculos por precio
	public void ordenarPorPrecio() {
		vehiculos.sort(null);
	}
	
	
}
