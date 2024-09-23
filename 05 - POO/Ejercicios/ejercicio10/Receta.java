package ejercicio10;

import java.util.Arrays;

public class Receta {

	private Ingrediente []ingredientes;
	private String descripcion;
	private float precioFinal;
	
	//Constructores
	
	public Receta(){
		//Inicializamos matriz de ingredientes d�ndole un tama�o
		ingredientes = new Ingrediente[3];
	}
	
	public Receta(int numeroIngredientes,String descripcion){
		//Inicializamos matriz de ingredientes d�ndole un tama�o
		ingredientes = new Ingrediente[numeroIngredientes];
		this.descripcion = descripcion;
	}
	
	public Receta(Ingrediente ingredientes[],String descripcion){
		this.ingredientes = ingredientes;
		this.descripcion = descripcion;
		
		//Calcular precioFinal
		this.setPrecioFinal();
	}
	
	//M�todos de acceso

	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecioFinal() {
		return precioFinal;
	}
	
	//Metodo que devuelve ingrediente a partir de la posicion
	
	public Ingrediente getIngrediente(int posicion){
		//Comprobamos que existe la posicion
		if(posicion <ingredientes.length){
			return ingredientes[posicion];
		}
		else
			return null;
	}

	//M�todo addIngrediente
	
	public void addIngrediente(Ingrediente ing){
		for(int i = 0;i<ingredientes.length;i++){
			if(ingredientes[i]==null){
				ingredientes[i] = ing;
				//Actualizamos precio Receta
				this.setPrecioFinal();
				break;
			}
		}
	}
	
	//M�todo getAporteCalorici
	
	public int getAporteCalorico(){
		int caloriasTotal = 0;
		
		for(Ingrediente ing : ingredientes){
			caloriasTotal+=ing.getCalorias();
		}
		
		return caloriasTotal;
	}
	
	//M�todo toString
	
	
	
	//M�todo privado para calcular precioFinal de la receta
	
	private void setPrecioFinal(){
		float precio = 0f;
		
		
		//Recorremos todos los ingredientes y vamos sumando sus precios
		
		for(Ingrediente i : ingredientes){
			if(i!=null)
			precio+=i.getCantidad()*i.getPrecioKilo();
		}
		
		this.precioFinal = precio;
	}

	@Override
	public String toString() {
		String info =  "Titulo : " + descripcion +"\n" + "Lista de Ingredientes: \n" + Arrays.toString(ingredientes) 
				+ "\n, precioFinal=" + precioFinal + " �.]";
		
		info+= " \nCalor�as : " + this.getAporteCalorico()+ " calor�as.";
		
		return info;
	}
	
	
}
