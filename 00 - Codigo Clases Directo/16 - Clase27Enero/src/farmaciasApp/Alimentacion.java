package farmaciasApp;

public class Alimentacion extends Parafarmacia implements Descuentable  {

	private boolean infantil;

	public Alimentacion(String codigo, String nombre, String fabricante, float precio, float peso, boolean infantil)
			throws Exception {
		super(codigo, nombre, fabricante, precio, peso);
		this.infantil = infantil;
	}

	public boolean isInfantil() {
		return infantil;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}

	@Override
	public String toString() {
		return "Alimentacion [infantil=" + infantil + ", toString()=" + super.toString() + "]";
	}

	@Override
	public float calcularPrecioFinal() {
		// TODO Auto-generated method stub
		float precioFinal = 0;
		
		precioFinal = getPrecio() + getPrecio()*0.21f;
		
		return precioFinal;
	}
	
	@Override
	public float calcularDescuento(float porcentaje) {
		// TODO Auto-generated method stub
		float precioFinal = calcularPrecioFinal();
		
		precioFinal = precioFinal - (porcentaje/100)*precioFinal;
			
		
		return precioFinal;
		
	}
	
	
}
