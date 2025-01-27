package farmaciasApp;

import java.util.Comparator;

public class ComparadorProductos implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}
	

}
