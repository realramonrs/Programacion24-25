package empleados;

public class TestSalariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salariable[] plantilla = new Salariable[20];
		Antiguable[] trabajadoresConAntiguedad = new Antiguable[20];
		//Puedo almacenar formadores y trabajadores fijos
		plantilla[0] = new Operario("2312312G");
		plantilla[1] = new Comisionista("9999999E");
		plantilla[2] = new Autonomo("4245","qefr234",30,20);
		
		//Calcular el salario
		for(Salariable s : plantilla) {
			if(s!=null) {
				s.calcularSalario();
			}
			else {
				break;
			}
		}
		
		
		
	}

}
