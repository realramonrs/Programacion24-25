package misClases;

public class SerVivo {
	
	//Todos los seres vivos respiran
	private String especie;
	
	

	public SerVivo(String especie) {
		super();
		this.especie = especie;
	}
	
	
	public String getEspecie() {
		return especie;
	}

	public  void setEspecie(String especie) {
		this.especie = especie;
	}
	
	@Override
	public String toString() {
		return "SerVivo [especie=" + especie + "]";
	}


	public void respirar() {
		System.out.println("Respiro como un ser vivo");
	}
}
