package gestionVuelos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;



public class Principal {

	public static ArrayList<Lugar> getLugares(){
		String ruta = ".\\src\\coordenadas.txt";
		ArrayList<Lugar> lugares = new ArrayList<Lugar>();
		try {
		FileReader lector = new FileReader(ruta);
		BufferedReader buffer = new BufferedReader(lector);
		
		String registro = "";
		int indice = 0;
		while(registro!=null) {
			registro = buffer.readLine();
			if(registro ==null) {
				break;
			}
			String[] partesRegistro = registro.split("_");
			String nombreLugar = partesRegistro[0];
			double longitud = Double.parseDouble(partesRegistro[1]);
			double latitud = Double.parseDouble(partesRegistro[2]);
			lugares.add(new Lugar(nombreLugar,new GeoPunto(longitud,latitud)));	
				}		
			buffer.close();
			lector.close();					
				
			} catch (FileNotFoundException ex) {
				// TODO Auto-generated catch block
				System.out.println("Fichero no encontrado");
		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return lugares;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nos conectamos al fichero para obtener los posibles destinos
		ArrayList<Lugar> destinos = getLugares();
		//Nuestro origen será siempre Madrid --> Posición cero del fichero
		Lugar origen = destinos.get(0);
		//Para tener más claro los destinos los volcamos a variables con su nombre
		Lugar berlin = destinos.get(1);
		Lugar dublin = destinos.get(2);
		Lugar londres = destinos.get(3);
		Lugar dubai = destinos.get(4);
		Lugar sidney = destinos.get(5);
		Lugar roma = destinos.get(6);
		Lugar tokio = destinos.get(7);
		Lugar pekin = destinos.get(8);
		VueloComercial vc1 = new VueloComercial(Companhia.FlyInfinity,origen,berlin,LocalDate.of(2025, 2, 10),5);
		VueloComercial vc2 = new VueloComercial(Companhia.FlyInfinity,origen,berlin,LocalDate.of(2025, 3, 10),5);
		VueloComercial vc3 = new VueloComercial(Companhia.SkyAir,origen,dubai,LocalDate.of(2025, 2, 10),5);
		VueloComercial vc4 = new VueloComercial(Companhia.SkyAir,origen,tokio,LocalDate.of(2025, 3, 10),5);
		VueloMercancias vm1 = new VueloMercancias(Companhia.MacAir, origen, pekin,LocalDate.of(2025, 2,1),Mercancia.Combustible, 2000);
		VueloMercancias vm2 = new VueloMercancias(Companhia.MacAir, origen, roma,LocalDate.of(2025, 2,1),Mercancia.Combustible, 2000);
		VueloMercancias vm3 = new VueloMercancias(Companhia.MacAir, origen, dubai,LocalDate.of(2025, 2,1),Mercancia.Alimentacion, 2000);
		VueloMercancias vm4 = new VueloMercancias(Companhia.MacAir, origen, berlin,LocalDate.of(2025, 2,1),Mercancia.Alimentacion, 2000);
		VueloComercial vc5 = new VueloComercial(Companhia.SkyAir,origen,roma,LocalDate.of(2025, 1, 18),5);
		VueloComercial vc6 = new VueloComercial(Companhia.SkyAir,origen,tokio,LocalDate.of(2025, 1, 30),5);
	
		//******************* Creamos el aeropuerto y añadimos vuelos **********************//
		
		Aeropuerto peinador = new Aeropuerto();
		peinador.addVuelo(vc1);
		peinador.addVuelo(vc2);
		peinador.addVuelo(vc3);
		peinador.addVuelo(vc4);
		peinador.addVuelo(vc5);
		peinador.addVuelo(vc6);
		peinador.addVuelo(vm1);
		peinador.addVuelo(vm2);
		peinador.addVuelo(vm3);
		peinador.addVuelo(vm4);
		
		
		// *************** Mostramos menú con las opciones
		int opcion = 0;
		do {
		System.out.println("Escoja una opción: ");
		System.out.println("0. Mostrar todos los Vuelo.");
		System.out.println("1. Añadir Vuelo.");
		System.out.println("2. Buscar Vuelo.");
		System.out.println("3. Reservar / Anular asiento");
		System.out.println("10. Salir.");
		System.out.println();
		Scanner lector = new Scanner(System.in);
		opcion = lector.nextInt();
		
		switch(opcion) {
			case 0:
				peinador.mostrarInfoVuelos();
				break;
			case 1:
				//Datos que necesitamos para el nuevo vuelo
				Vuelo nuevo;
				char tipoVuelo;
				String fecha;
				int destino;
				int numeroFilas;
				Mercancia tipoMercancia;
				Companhia companhia;
				Lugar lugarDestino;
				System.out.println("Escoja la compañía:");
				System.out.println("1.SkyAir");
				System.out.println("2.FlyInfinity");
				System.out.println("3.MacAir");
				int compan = lector.nextInt();
				switch(compan) {
				case 1:
					companhia = Companhia.SkyAir;
					break;		
				case 2:
					companhia = Companhia.FlyInfinity;
					break;
				case 3:
					companhia = Companhia.MacAir;
					break;	
					default:
						companhia = null;
					}
				System.out.println("a. Vuelo Comercial");
				System.out.println("b. Vuelo de mercancías");
				tipoVuelo = lector.next().charAt(0);
				System.out.println("Introduzca una fecha dd-mm-aaaa");
				fecha = lector.next();
				LocalDate fechaSalida = LocalDate.of(Integer.parseInt(fecha.split("-")[2]), Integer.parseInt(fecha.split("-")[1]), Integer.parseInt(fecha.split("-")[0]));
				System.out.println("Escoja un destino");
				System.out.println("1.Berlin");
				System.out.println("2.Dublin");
				System.out.println("3.Londres");
				System.out.println("4.Dubai");
				System.out.println("5.Sidney");
				System.out.println("6.Roma");
				System.out.println("7.Tokio");
				System.out.println("8.Pekin");
				destino = lector.nextInt();
				switch(destino) {
					case 1:
						lugarDestino = berlin;
						break;		
					case 2:
						lugarDestino = dublin;
						break;
					case 3:
						lugarDestino = londres;
						break;
					case 4:
						lugarDestino = dubai;
						break;
					case 5:
						lugarDestino = sidney;
						break;
					case 6:
						lugarDestino = roma;
						break;
					case 7:
						lugarDestino = tokio;
						break;
					case 8:
						lugarDestino = pekin;
						break;
					default:
						lugarDestino = null;
						break;
					}
				
				if(tipoVuelo == 'a') {
					System.out.print("Filas del avión");
					numeroFilas = lector.nextInt();
					nuevo = new VueloComercial(companhia, origen, lugarDestino, fechaSalida, numeroFilas);
					}
				else {
					System.out.println("Tipo de Mercancía:");
					System.out.println("1.Alimentacion");
					System.out.println("2.Residuos nucleares");
					System.out.println("3.Combustible");
					int tipo = lector.nextInt();
					switch(tipo) {
						case 1:
							tipoMercancia = Mercancia.Alimentacion;
							break;
						case 2:
							tipoMercancia = Mercancia.ResiduosNucleares;
							break;
						case 3:
							tipoMercancia = Mercancia.Combustible;
							break;
							default:
								tipoMercancia = null;
						}
					System.out.println("Introduzca peso mercancia");
					int peso = lector.nextInt();
					nuevo = new VueloMercancias(companhia, origen, lugarDestino, fechaSalida, tipoMercancia, peso);
					}
				
				//Añadimo vuelo al aeropuerto
				peinador.addVuelo(nuevo);
				break;
				
			case 2:
				
				System.out.println();
				peinador.mostrarCodigos();
				String codigo = lector.next();
				System.out.println("Escoja el código del que quiere visualizar la información: ");
				Vuelo buscado = peinador.getVueloByCodigo(codigo);
				if(buscado!=null) {
					System.out.println(buscado);
				}
				break;
			
			case 3:
				System.out.println("1. Reservar Asiento: ");
				System.out.println("2. Cancelar Reserva: ");
				int opcion3 = lector.nextInt();
				
				switch(opcion3) {
					case 1:
						peinador.mostrarCodigos(true);
						String codigo2 = lector.next();
										
						VueloComercial buscado2 = (VueloComercial) peinador.getVueloByCodigo(codigo2);
						String codigoAsiento = buscado2.reservarAsiento();	
						System.out.println("Asiento: " + codigoAsiento + " Precio: " + buscado2.getPrecioAsiento(codigoAsiento));
						buscado2.mostrarAsientos();
						break;
					case 2:
						peinador.mostrarCodigos(true);
						System.out.println("Intro código vuelo");
						String codigo2Anular = lector.next();
						VueloComercial buscado3 = (VueloComercial) peinador.getVueloByCodigo(codigo2Anular);
						System.out.println("Qué asiento desea anular: ");
						buscado3.mostrarAsientosReservados();
						String codigoAsientoAnular = lector.next();
						buscado3.anularReserva(codigoAsientoAnular);
						System.out.println("Asientos: ");
						buscado3.mostrarAsientos();
						break;
					
				}
				
			case 4:
				System.out.println("Vuelos comerciales");
				peinador.mostrarInfoVuelosComerciales();
				System.out.println("Vuelos mercancías: ");
				peinador.mostrarInfoVuelosMercancias();
				break;
			case 5:
				System.out.println("Introduzca un destino:");
				String destino5 = new Scanner(System.in).next();
				ArrayList<Vuelo> vuelosDestino = peinador.getVuelosByDestino(destino5);
				
				for(Vuelo v :vuelosDestino) {
					System.out.println(v);
				}
				break;
			
			case 6:
				float gananciaMercancias = peinador.calcularGananciaMercancias();
				float gananciaComercial = peinador.calcularGananciaComercial();
				System.out.println("Ganancia vuelos comerciales: " + gananciaComercial);
				System.out.println("Ganancia vuelos Mercancías: " + gananciaMercancias);
				break;
				
			case 7:
				
				System.out.println(peinador.gananciaTotal());
				break;
				
			case 8:
				for(Vuelo v : peinador.gestorVuelos) {
					System.out.println(v.getDistancia());
				}
				System.out.println(peinador.getVueloMasLargo().getDistancia());
				break;
			case 9:
				break;
				
			} // Final del Switch del menú
		}
		while(opcion<11);
		
	}
}




