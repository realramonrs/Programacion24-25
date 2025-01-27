package farmaciasApp;

import java.time.LocalDate;

public  class Medicamento extends Producto implements Descuentable {

	private boolean receta;
	private String indicaciones;
	private float porcentajeSegSocial;
	private LocalDate fechaCaducidad;
	
	public Medicamento(String codigo, String nombre, String fabricante, float precio, boolean receta,
			String indicaciones, float porcentajeSegSocial, LocalDate fechaCaducidad)throws Exception  {
		super(codigo, nombre, fabricante, precio);
		this.receta = receta;
		this.indicaciones = indicaciones;
		this.porcentajeSegSocial = porcentajeSegSocial;
		this.fechaCaducidad = fechaCaducidad;
	}

	public boolean isReceta() {
		return receta;
	}

	public void setReceta(boolean receta) {
		this.receta = receta;
	}

	public String getIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}

	public float getPorcentajeSegSocial() {
		return porcentajeSegSocial;
	}

	public void setPorcentajeSegSocial(float porcentajeSegSocial) {
		this.porcentajeSegSocial = porcentajeSegSocial;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Medicamento [receta=" + receta + ", indicaciones=" + indicaciones + ", porcentajeSegSocial="
				+ porcentajeSegSocial + ", fechaCaducidad=" + fechaCaducidad + ", toString()=" + super.toString() + "]";
	}

	@Override
	public float calcularPrecioFinal() {
		// TODO Auto-generated method stub
		float precioFinal = 0;
		
		precioFinal = getPrecio() + getPrecio()*0.05f - getPrecio()*porcentajeSegSocial/100;
		
		return precioFinal;
	}

	@Override
	public float calcularDescuento(float porcentaje) {
		// TODO Auto-generated method stub
		float precioFinal = calcularPrecioFinal();
		if(this.fechaCaducidad.isAfter(LocalDate.now())) {
			precioFinal = precioFinal - (porcentaje/100)*precioFinal;
			
		}
		return precioFinal;
	}
	
	
	
	
	
}
