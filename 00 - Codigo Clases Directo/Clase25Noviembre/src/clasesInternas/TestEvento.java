package clasesInternas;

public class TestEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evento e = new Evento("Festival Son do Camiño",10);
		Evento.Entrada entradaManual = e.createEntrada();
		
		
		e.mostrarInfo();
		e.ocuparEntrada();
		e.ocuparEntrada();
		e.ocuparEntrada();
		e.ocuparEntrada();
		e.ocuparEntrada();
		e.ocuparEntrada();
		System.out.println("Info ocupación actual: ");
		e.mostrarInfo();
	}

}
