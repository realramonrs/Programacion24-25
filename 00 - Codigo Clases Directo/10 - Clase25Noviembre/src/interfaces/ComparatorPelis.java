package interfaces;

import java.util.Comparator;

public class ComparatorPelis implements Comparator<Pelicula> {

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		// TODO Auto-generated method stub
		//Ordenar por precio de venta de menor a mayor
		//Obtener el precio de Venta pero como Float
		Float precioVentao1 = Float.valueOf(o1.getPrecioVenta());
		Float precioVentao2 = Float.valueOf(o2.getPrecioVenta());
		
		return precioVentao1.compareTo(precioVentao2);
	}

}
