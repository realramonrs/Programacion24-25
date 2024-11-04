package clases;

import java.util.Objects;

public class Coche {

	private String matricula; //9999ASW
	private float precio;
	
	public Coche(String matricula, float precio) throws Exception {
		super();
		setMatricula(matricula);
		this.precio = precio;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula)throws Exception {
		if(validarMatricula(matricula)) {
			this.matricula = matricula;
		}
		else {
			throw new Exception("Matrícula errónea!!");
		}
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", precio=" + precio + "]";
	}	
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(matricula, other.matricula);
	}
	private boolean validarMatricula(String matricula) {
		
		if(matricula.length()!=7) {
			return false;
		}
		for(int i = 0;i<4;i++) {
			if(!Character.isDigit(matricula.charAt(i))) {
				return false;
			}
		}
		for(int i = 4;i<matricula.length();i++) {
			if(!Character.isLetter(matricula.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
}
