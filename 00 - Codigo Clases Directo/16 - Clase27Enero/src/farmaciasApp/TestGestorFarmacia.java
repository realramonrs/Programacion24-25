package farmaciasApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class TestGestorFarmacia {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestorProductosFarmacia gestor = new GestorProductosFarmacia();
		try {
			Descuentable ds = new Alimentacion("111111","Potito Verduras","Nestle",25,150,true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Creamos varios medicamentos de prueba
		try {
			Medicamento m1 = new Medicamento("123456","Paracetamol","F1",35,true,"1 pastillas cada 8 horas",15,LocalDate.of(2028, 10,10));
			Parafarmacia para1 = new Cosmetica("909090","Crema Pieles Atópicas","Nivea",40,120,true);
			Parafarmacia alim1 = new Alimentacion("111111","Potito Verduras","Nestle",25,150,true);
			
			gestor.addProducto(m1);
			gestor.addProducto(para1);
			gestor.addProducto(alim1);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		gestor.imprimirInfo();
		
		//Calcular el precio final de un producto
		
		System.out.println(gestor.getPrecioFinalProducto("123456"));
		
		//Aplicar Descuento a todos los productos de alimentación de público infantil
		
		ArrayList<Producto> productosExterno = gestor.getProductos();
		System.out.println("Precios Alimentación Infantil: ");
		for(Producto p : productosExterno) {
			if(p instanceof Alimentacion) {
				Alimentacion al = (Alimentacion)p;
				if(al.isInfantil()) {
					System.out.println("Precio sin descuento: " + al.calcularPrecioFinal());
					System.out.println("Precio con descuento: " + al.calcularDescuento(15));
				}
			}
			
		}
		
		productosExterno.sort(null);
		
		for(Producto p : gestor.productos) {
			System.out.println(p);
			
		}
		
		//Ordenar por nombre
		gestor.getProductos().sort(new ComparadorProductos());
		
		System.out.println("Productos ordenados por nombre: ");
		
		for(Producto p : gestor.productos) {
			System.out.println(p);
		}
		
		//Ordenar por codigo
		
	    gestor.getProductos().sort(new Comparator<Producto>() {

			@Override
			public int compare(Producto o1, Producto o2) {
				// TODO Auto-generated method stub
				return o1.getCodigo().compareTo(o2.getCodigo());
			}
	    	
	    });	
		
		System.out.println();
		System.out.println("Productos ordenados por código: ");
		
		for(Producto p : gestor.productos) {
			System.out.println(p);
		}
		
		
		
		
		
	}

}
