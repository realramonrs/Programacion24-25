package empleados;

public abstract class Trabajador implements Salariable  {

	private String dni;
	protected float salario;
			
	public Trabajador(String dni) {
		super();
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSalario() {
		return salario;
	}
		
	//Método calcularSalario()--> No sabemos programarlo
	
	//public abstract void calcularSalario(); 
	//Lo quitamos de aquí porque lo vamos a colgar en la interface Salariable

	@Override
	public String toString() {
		return "Trabajador [dni=" + dni + ", salario=" + salario + "]";
	}
	
	
	
}
