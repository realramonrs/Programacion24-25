package misClases;

public class Vegetal extends SerVivo {

		
	public Vegetal(String especie) {
		super(especie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void respirar() {
		System.out.println("Absorvo O2 a través de mis hojas");
	}

	@Override
	public String toString() {
		return "Soy un Vegetal: de la especie" + super.getEspecie();
	}
	
	
}
