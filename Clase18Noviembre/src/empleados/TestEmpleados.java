package empleados;

import java.time.LocalDate;

public class TestEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Trabajador t1 = new Trabajador("1324123H");
		Trabajador[] plantilla = new Trabajador[20];
		Autonomo[] autonomos = new Autonomo[20];
		
		
		
		plantilla[0] = new Operario("12345678F");
		plantilla[1] = new Operario("99999999S",LocalDate.of(2010, 10, 4),8);
		plantilla[2] = new Comercial("2222222S",LocalDate.of(2000, 10, 10),20);
		plantilla[3] = new Administrador("90909090E",LocalDate.of(2020, 10, 10));
		//Necesito crear un Operario pero cuyo salario se calcula de forma diferente
		//Porque es el hijo del jefe.
		plantilla[4] = new Operario("2331231",LocalDate.of(2019, 10, 10),2) {
			@Override
			public void calcularSalario() {
				// TODO Auto-generated method stub
				//Calcular antiguedad:
				super.calcularAntiguedad();
				salario = 2000 + super.getAntiguedad()*70 + 10*super.getNumeroObras();
			}
		};
			
		
		
		//Calcular el salario de todos los trabajadores
		
		for(Trabajador t : plantilla) {
			if(t!=null) {
				t.calcularSalario();
			}
			else {
				break;
			}
		}
		
		//Mostrar por pantalla info plantilla
				for(Trabajador t : plantilla) {
					if(t!=null) {
						System.out.println(t);
					}
					else {
						break;
					}
				}
				
		//Aumentar el salario de los administradores
		
			for(Trabajador t : plantilla) {
				if(t!=null) {
					if(t instanceof Administrador) {
						Administrador a = (Administrador)t; //downcasting
						a.aumentarSueldo();
					} //Cierro if instanceof
				}
				
			}
		
		//Mostrar salario y dni de los administradores
			System.out.println("Datos administradores");
			for(Trabajador t : plantilla) {
				if(t!=null) {
					if(t instanceof Administrador) {
						System.out.println(t.getDni() + " " + t.getSalario());
					}
				}
				else {
					break;
				}
				
			}
		
	}

}
