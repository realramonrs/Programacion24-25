package boletin;

import java.util.Scanner;

public class PruebaMatrizEstadios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estadio estadios[] = new Estadio[10];
		// Guardamos algunos estadios ya por código para poder probar opciones 2,3 y 4
		estadios[0] = new Estadio("Balaidos", 30000, "Vigo");
		estadios[1] = new Estadio("Santiago Bernabeu", 96000, "Madrid");
		estadios[2] = new Estadio("Camp Nou", 102000, "Barcelona");
		estadios[3] = new Estadio("Wanda Metropolitano", 85000, "Madrid");
		estadios[4] = new Estadio("El del Espanyol", 45000, "Barcelona");

		

		Scanner lector = new Scanner(System.in);
		int opcion;
		char continuar;
		do {
			System.out.println("Escoja una opción: ");
			System.out.println("1. Guardar nuevo estadio");
			System.out.println("2. Mostrar estadios con capacidad superior");
			System.out.println("3. Mostrar estadios de una ciudad.");
			System.out.println("4. Buscar estadio a partir del nombre");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduza el nombre del estadio:");
				lector = new Scanner(System.in);
				String nombre = lector.nextLine();
				System.out.println("Introduza la capacidad del estadio:");
				int capacidad = lector.nextInt();
				System.out.println("Introduza la ciudad del estadio:");
				lector = new Scanner(System.in);
				String ciudad = lector.nextLine();
				
				for(int i = 0;i<estadios.length;i++) {
					if(estadios[i]==null) {
						estadios[i] = new Estadio(nombre,capacidad,ciudad);
						break;
					}
				}
				break;
			case 2:
				System.out.println("Introduzca una capacidad:");
				int capacidad2 = lector.nextInt();
				for(Estadio e : estadios) {
					if(e!=null) {
						if(e.getCapacidad()>= capacidad2) {
							System.out.println(e);
						}
					}
					else {
						break; //Salimos porque ya no hay más estadios
					}
				}
				break;
			case 3:
				System.out.println("Escoja una ciudad: ");
				lector = new Scanner(System.in);
				String ciudad2 = lector.nextLine();
				for(Estadio e : estadios) {
					if(e!=null) {
						if(e.getCiudad().equals(ciudad2)) {
							System.out.println(e);
						}
					}
					else {
						break; //Salimos porque ya no hay más estadios
					}
				}
				
				break;
			case 4:
				System.out.println("Nombre estadio: ");
				lector = new Scanner(System.in);
				String nombre4 = lector.nextLine();
				for(Estadio e : estadios) {
					if(e!=null) {
						if(e.getNombre().equals(nombre4)) {
							System.out.println(e);
							break;
						}
					}
					else {
						break; //Salimos porque ya no hay más estadios
					}
				}
				break;
			default:
				System.out.println("Opción errónea");
				break;

			}
			System.out.println("Desea continuar s/n");
			lector = new Scanner(System.in);
			continuar = lector.nextLine().charAt(0);
		} while (opcion > 4 || continuar == 's');

	}

}
