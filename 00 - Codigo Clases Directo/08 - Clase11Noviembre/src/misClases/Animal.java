package misClases;

public class Animal extends SerVivo {
	
	//Constructor
	public Animal(String especie) {
		super(especie); //Defino valores de atributos clase padre.
	}
	
	//Funcionalidades propias de los animales (No de todos los seres vivos)
	//Mover
	public void mover() {
		System.out.println("Me muevo como un animal");
	}
	//Comunicar
	public void comunicar() {
		System.out.println("Me comunico como un animal");
	}
	
	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println("Respiro como un animal");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "soy un animal de la especie " + super.getEspecie();
	}
	
}
