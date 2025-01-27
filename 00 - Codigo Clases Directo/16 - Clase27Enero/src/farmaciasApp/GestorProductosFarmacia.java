package farmaciasApp;

import java.util.ArrayList;

public class GestorProductosFarmacia {

	public ArrayList<Producto> productos;

	public GestorProductosFarmacia() {
		productos = new ArrayList<Producto>();
	}
	
	
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}



	//Añadir Producto
	public void addProducto(Producto p){
		productos.add(p);
		
	}
	
	//Mostrar info de todos los productos
	
	public void imprimirInfo() {
		for(Producto p : productos) {
			System.out.println(p);
		}
	}

	//Método que devuelve un producto a partir del índice
	public Producto getProducto(int indice) {
		return productos.get(indice);
	}
	
	//Método que devuelve un producto a partir del código
	public Producto getProducto(String codigo) {
		
		for(Producto p : productos) {
			if(p.getCodigo().equals(codigo)) {
				return p;
			}
		}
		return null;
		
	}
	
	//Método que obtiene el precio final de un producto a partir del código
	public float getPrecioFinalProducto(String codigo) {
		Producto p = getProducto(codigo);
		if(p!=null) {
			return p.calcularPrecioFinal();
		}
		else {
			return -1;
		}
		
	}
	
	
}
