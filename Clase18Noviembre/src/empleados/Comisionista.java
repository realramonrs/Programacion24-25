package empleados;

public class Comisionista extends Trabajador {

	
	//Trabajador que cobra por servicio realizado
	
	public Comisionista(String dni) {
		super(dni);
		// TODO Auto-generated constructor stub
	}
	
	//Salario = 
	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		salario = 1000;
	}

	

}
