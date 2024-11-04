package clases;

public class TestCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1,c2;
		try {
			c1 = new Coche("1234AGS",20000);
			c2 = new Coche("1234AGS",20000);
			System.out.println(c1);
						
			System.out.println(c1.hashCode());
			System.out.println(c2.hashCode());
			//Comparar c1 con c2
			System.out.println(c1.equals(c2));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Hola");
		
	}

}
