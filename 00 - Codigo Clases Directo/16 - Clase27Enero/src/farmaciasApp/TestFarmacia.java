package farmaciasApp;

import java.time.LocalDate;

public class TestFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1=null;
		try {
		//	p1 = new Producto("237878","Aspirina","Bayern",20);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			p1.setCodigo("12");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(p1);
		
		Medicamento m1 = null;
		try {
			m1 = new Medicamento("123456","Paracetamol","F1",35,true,"1 pastillas cada 8 horas",15,LocalDate.of(2028, 10,10));
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
