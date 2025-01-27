package farmaciasApp;

public abstract class Parafarmacia extends Producto {

	private float peso;

	public Parafarmacia(String codigo, String nombre, String fabricante, float precio, float peso) throws Exception {
		super(codigo, nombre, fabricante, precio);
		this.peso = peso;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Parafarmacia [peso=" + peso + ", toString()=" + super.toString() + "]";
	}
	
	
}
