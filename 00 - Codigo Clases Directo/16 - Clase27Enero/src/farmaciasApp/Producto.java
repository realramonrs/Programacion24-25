package farmaciasApp;

public abstract class Producto implements Comparable<Producto> {
	
	private String codigo;
	private String nombre;
	private String fabricante;
	private float precio;
	
	public Producto(String codigo, String nombre, String fabricante, float precio) throws Exception {
		super();
		if(validarCodigo(codigo)) {
			this.codigo = codigo;
		}	else {
			throw new Exception("Código erróneo. Producto no creado");
		}
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) throws Exception {
		if(validarCodigo(codigo))
			this.codigo = codigo;
		else
			throw new Exception("Código erróneo.No se ha podido modificar");
			
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	//Método privado que permita validar el código
	private boolean validarCodigo(String codigo) {
		if(codigo.length()!=6) {
			return false;
		}
		else {
			for(int i = 0;i<codigo.length();i++) {
				if(!Character.isDigit(codigo.charAt(i))) {
					return false;
				}				
			}
		}
		return true;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", fabricante=" + fabricante + ", precio=" + precio
				+ "]";
	}
	
	public abstract float calcularPrecioFinal();
	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		Float miPrecio = Float.valueOf(precio);
		Float otroPrecio = Float.valueOf(o.precio);
		return miPrecio.compareTo(otroPrecio);
	}
	
	
	

}
