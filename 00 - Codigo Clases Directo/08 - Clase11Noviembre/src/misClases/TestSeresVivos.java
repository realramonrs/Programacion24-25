package misClases;

public class TestSeresVivos {
	
	public static void respirarSerVivo(SerVivo sv) {
		sv.respirar();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1 = new Animal("Neandertalis prudentis");
		Vegetal v1 = new Vegetal("Fungis Almonicae");
		SerVivo sv = new SerVivo("No definido");
		Extraterrestres et = new Extraterrestres("Marcianos");
		
		System.out.println(a1);
		System.out.println(v1);
		System.out.println(sv);
		
	/*	a1.respirar();
		v1.respirar();
		sv.respirar();*/
		
		respirarSerVivo(a1);
		respirarSerVivo(v1);
		respirarSerVivo(et);
		
		
		
		
		a1.comunicar();
		
		
		//Polimorfismo
		
		SerVivo sv2 = new Animal("Protelis Casusis");		
		SerVivo sv3 = new Vegetal("Valeriae Fratellis");
		System.out.println();
		System.out.println("EL polimorfismo en acción: ");
		sv2.respirar();
		sv3.respirar();
		
		//DownCasting
		Animal animal = (Animal)sv2;
		animal.comunicar();
		((Animal)sv2).comunicar();
		
		//Ventajas de todo este lío
		//Necesito almacenar todos los seres vivos en una variable
		SerVivo[] seresvivos = new SerVivo[200];
		seresvivos[0] = new Antonio("Desconocida");
		seresvivos[1] = new Extraterrestres("Allien");
		seresvivos[2] = new Animal("asdfasd");
		seresvivos[3] = new Perro("Pastor Alemán");
		
		for(SerVivo serv : seresvivos) {
			if(serv!=null)
			serv.respirar();
		}
		
		
		
	}

}
