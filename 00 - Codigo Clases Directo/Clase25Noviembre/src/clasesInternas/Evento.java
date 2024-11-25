package clasesInternas;

public class Evento {

	private String nombre;
	private Entrada[] entrada;
	
	public Evento(String nombre,int capacidad) {
		this.nombre = nombre;
		entrada = new Entrada[capacidad];
		
		//Crear todas las entradas
		
		for(int i = 0;i<capacidad;i++) {
			String codigo ="A"+i;
			entrada[i] = new Entrada(codigo);
		}	
		
	}
	
	//Método que permita ocupar una entrada
	public boolean ocuparEntrada() {
		for(Entrada e : entrada) {
			if(!e.isOcupada()) {
				e.setOcupada(true);
				//Actualizar el precio de las demás entradas
				for(Entrada e2 : entrada) {
					if(!e2.isOcupada()) {
						e2.actualizarPrecio();
					}
				}
				return true;
			}
		}
		return false;
	}
	
	//Método que me devuelva la ocupación
	public float getOcupacion() {
		// Ocupados/Total
		int contador = 0;
		for(Entrada entr : entrada) {
			if(entr.isOcupada()) {
				contador++;
			}
		}
		return (float)contador/entrada.length;
	}
	
	public void mostrarInfo() {
		for(Entrada e: entrada) {
			System.out.println(e.codigo + " " + e.precio +" " + e.isOcupada());
		}
	}
	
	public  Entrada createEntrada() {
		return new Entrada("Z1");
	}
	
	
	//***** Clase Entrada *****//
	public class Entrada{
		private String codigo; 
		private boolean ocupada;
		private float precio;
		
		public Entrada(String codigo) {
			super();
			this.codigo = codigo;
			this.precio = 5;
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public boolean isOcupada() {
			return ocupada;
		}
		public void setOcupada(boolean ocupada) {
			this.ocupada = ocupada;
		}
		public float getPrecio() {
			return precio;
		}
		
		public void actualizarPrecio() {
			this.precio = this.precio + this.precio*getOcupacion();
		}
		
	}
	
	
}
