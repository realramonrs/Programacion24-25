package ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void actualizarUsuarios(ArrayList<Usuario> lista) {
		// Comprobar si existe el fichero de usuarios
		File fichero = new File("usuarios.txt");
		if (fichero.exists() == false) {
			// Crear el fichero de usuarios
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		// Actualizar el fichero de usuarios
		try {
			FileWriter escritor = new FileWriter(fichero.getAbsolutePath(), false);
			BufferedWriter bufferEscritor = new BufferedWriter(escritor);
			for (Usuario u : lista) {
				bufferEscritor.write(u.toString());
				bufferEscritor.newLine();
			}
			bufferEscritor.close();
			escritor.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero.");
		}
		catch (IOException e) {
			System.out.println("No se ha podido acceder al fichero.");
		}
	}
	
	public static void actualizarSeries(ArrayList<Serie> lista) {
		// Comprobar si existe el fichero de series
		File fichero = new File("series.txt");
		if (fichero.exists() == false) {
			// Crear el fichero de series
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		// Actualizar el fichero de series
		try {
			FileWriter escritor = new FileWriter(fichero.getAbsolutePath(), false);
			BufferedWriter bufferEscritor = new BufferedWriter(escritor);
			for (Serie s : lista) {
				bufferEscritor.write(s.toString());
				bufferEscritor.newLine();
			}
			bufferEscritor.close();
			escritor.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero.");
		}
		catch (IOException e) {
			System.out.println("No se ha podido acceder al fichero.");
		}
	}
	
	public static void actualizarVotaciones(ArrayList<String> lista) {
		// Comprobar si existe el fichero de votaciones
		File fichero = new File("votaciones.txt");
		if (fichero.exists() == false) {
			// Crear el fichero de votaciones
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		// Actualizar el fichero de votaciones
		try {
			FileWriter escritor = new FileWriter(fichero.getAbsolutePath(), false);
			BufferedWriter bufferEscritor = new BufferedWriter(escritor);
			for (String v : lista) {
				bufferEscritor.write(v);
				bufferEscritor.newLine();
			}
			bufferEscritor.close();
			escritor.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero.");
		}
		catch (IOException e) {
			System.out.println("No se ha podido acceder al fichero.");
		}
	}

	public static void main(String[] args) {

		// Declarar listas
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Serie> series = new ArrayList<Serie>();
		ArrayList<String> votaciones = new ArrayList<String>();

		// Comprobar si existe el fichero de usuarios
		File ficheroUsuarios = new File("usuarios.txt");
		if (ficheroUsuarios.exists() == false) {
			// Crear el fichero de usuarios
			try {
				ficheroUsuarios.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		else {
			// Obtener usuarios del fichero
			try {
				String linea = "";
				FileReader lector = new FileReader(ficheroUsuarios.getAbsolutePath());
				BufferedReader buffer = new BufferedReader(lector);
				while (linea != null) {
					linea = buffer.readLine();
					if (linea != null) {
						usuarios.add(new Usuario(linea.split("#")[0], linea.split("#")[1], linea.split("#")[2]));
					}
				}
				buffer.close();
				lector.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el fichero.");
			}
			catch (IOException e) {
				System.out.println("No se ha podido acceder al fichero.");
			}
		}
		
		// Comprobar si existe el fichero de votaciones
		File ficheroVotaciones = new File("votaciones.txt");
		if (ficheroVotaciones.exists() == false) {
			// Crear el fichero de votaciones
			try {
				ficheroVotaciones.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		else {
			// Obtener votaciones del fichero
			try {
				String linea = "";
				FileReader lector = new FileReader(ficheroVotaciones.getAbsolutePath());
				BufferedReader buffer = new BufferedReader(lector);
				while (linea != null) {
					linea = buffer.readLine();
					if (linea != null) {
						votaciones.add(linea);
					}
				}
				buffer.close();
				lector.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el fichero.");
			}
			catch (IOException e) {
				System.out.println("No se ha podido acceder al fichero.");
			}
		}
		
		// Comprobar si existe el fichero de series
		File ficheroSeries = new File("series.txt");
		if (ficheroSeries.exists() == false) {
			// Crear el fichero de series
			try {
				ficheroSeries.createNewFile();
			} catch (IOException e) {
				System.out.println("No se ha podido crear el fichero.");
			}
		}
		else {
			// Obtener series del fichero
			try {
				String linea = "";
				FileReader lector = new FileReader(ficheroSeries.getAbsolutePath());
				BufferedReader buffer = new BufferedReader(lector);
				while (linea != null) {
					linea = buffer.readLine();
					if (linea != null) {
						Serie s = new Serie(linea.split("#")[0], linea.split("#")[1], Integer.parseInt(linea.split("#")[3]), linea.split("#")[4], Integer.parseInt(linea.split("#")[5]));
						s.setValoracion(Integer.parseInt(linea.split("#")[2]));
						series.add(s);
					}
				}
				buffer.close();
				lector.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el fichero.");
			}
			catch (IOException e) {
				System.out.println("No se ha podido acceder al fichero.");
			}
		}
		
		// Crear bucle para que el programa no se cierre
		String salir = "";
		do {
		
			// Mostrar opciones
			System.out.println("Escoja una opci�n:");
			System.out.println(" 1. Crear cuenta");
			System.out.println(" 2. A�adir serie");
			System.out.println(" 3. Votar serie");
			System.out.println(" 4. Ver series");
			System.out.println(" 5. Ver usuarios");
			System.out.println(" 6. Ver votaciones");
			
			// Obtener opci�n
			Scanner lectorConsola = new Scanner(System.in);
			String opcion = lectorConsola.nextLine();
			
			// Realizar opci�n escogida
			switch (opcion) {
			case "1":
				// Comprobar si el nombre de usuario es v�lido
				System.out.println("Introduzca un nombre de usuario:");
				String user = lectorConsola.nextLine();
				if (user.contains("#") || user.equals("")) {
					System.out.println("El nombre de usuario no es v�lido.");
				}
				else {
					// Comprobar si el nombre de usuario est� repetido
					boolean repetido = false;
					for (Usuario u : usuarios) {
						if (u.getUsername().equals(user)) {
							repetido = true;
							break;
						}
					}
					if (repetido == false) {
						// Comprobar si la contrase�a es v�lida
						System.out.println("Introduzca una contrase�a:");
						String contrasenha = lectorConsola.nextLine();
						if (contrasenha.contains("#") || contrasenha.equals("")) {
							System.out.println("La contrase�a no es v�lida.");
						}
						else {
							// Comprobar si el email es v�lido
							System.out.println("Introduzca un email:");
							String email = lectorConsola.nextLine();
							if (email.contains("#") || email.equals("")) {
								System.out.println("El email no es v�lido.");
							}
							else {
								// Crear usuario y a�adirlo a la lista
								usuarios.add(new Usuario(user, contrasenha, email));
								actualizarUsuarios(usuarios);
								System.out.println("La cuenta se ha creado correctamente.");
							}
						}
					}
					else {
						System.out.println("El usuario introducido ya existe.");
					}
				}
				break;
			case "2":
				// Comprobar si el t�tulo es v�lido
				System.out.println("Introduzca el t�tulo de la serie:");
				String titulo = lectorConsola.nextLine();
				if (titulo.equals("") || titulo.contains("#")) {
					System.out.println("El t�tulo introducido no es v�lido.");
				}
				else {
					// Comprobar si la plataforma es v�lida
					System.out.println("Introduzca la plataforma de la serie:");
					String plataforma = lectorConsola.nextLine();
					if (plataforma.equals("") || plataforma.contains("#")) {
						System.out.println("La plataforma introducida no es v�lida.");
					}
					else {
						// Comprobar si el n�mero de cap�tulos es v�lido
						System.out.println("Introduzca el n�mero de cap�tulos de la serie:");
						int capitulos = Integer.parseInt(lectorConsola.nextLine());
						if (capitulos <= 0) {
							System.out.println("El n�mero de cap�tulos introducido no es v�lido.");
						}
						else {
							// Comprobar si el g�nero es v�lido
							System.out.println("Introduzca el g�nero de la serie:");
							String genero = lectorConsola.nextLine();
							if (genero.equals("") || genero.contains("#")) {
								System.out.println("El g�nero introducido no es v�lido.");
							}
							else {
								// Comprobar si el a�o es v�lido (la primera pel�cula de la historia es del a�o 1888)
								System.out.println("Introduzca el a�o de la serie:");
								int anho = Integer.parseInt(lectorConsola.nextLine());
								if (anho < 1888) {
									System.out.println("El a�o introducido no es v�lido.");
								}
								else {
									// Crear serie y a�adirla a la lista
									series.add(new Serie(titulo, plataforma, capitulos, genero, anho));
									actualizarSeries(series);
									System.out.println("La serie se ha a�adido correctamente.");
								}
							}
						}
					}
				}
				break;
			case "3":
				// Comprobar si el nombre de usuario existe
				System.out.println("Introduzca su nombre de usuario:");
				String nombreVotacion = lectorConsola.nextLine();
				String contrasenha = "";
				for (Usuario u : usuarios) {
					if (u.getUsername().equals(nombreVotacion)) {
						contrasenha = u.getPassword();
					}
				}
				if (!contrasenha.equals("")) {
					// Comprobar si la contrase�a coincide
					System.out.println("Introduzca su contrase�a:");
					String contrasenhaVotacion = lectorConsola.nextLine();
					if (contrasenha.equals(contrasenhaVotacion)) {
						// Comprobar si la serie existe
						System.out.println("Introduzca el t�tulo de la serie:");
						String tituloVotacion = lectorConsola.nextLine();
						boolean existe = false;
						for (Serie s : series) {
							if (s.getTitulo().equals(tituloVotacion)) {
								existe = true;
							}
						}
						if (existe == true) {
							// Comprobar si la valoraci�n es v�lida
							System.out.println("Introduzca una valoraci�n entre 0 y 10:");
							int votacion = Integer.parseInt(lectorConsola.nextLine());
							if (votacion >= 0 && votacion <= 10) {
								// Crear votaci�n y a�adirla a la lista
								String nuevaVotacion = nombreVotacion + "#" + tituloVotacion + "#" + votacion;
								votaciones.add(nuevaVotacion);
								actualizarVotaciones(votaciones);
								// Actualizar serie
								int suma = 0;
								int cuenta = 0;
								for (String v : votaciones) {
									if (v.split("#")[1].equals(tituloVotacion)) {
										suma += Integer.parseInt(v.split("#")[2]);
										cuenta++;
									}
								}
								int media = Math.round(suma / cuenta);
								for (Serie s : series) {
									if (s.getTitulo().equals(tituloVotacion)) {
										s.setValoracion(media);
										break;
									}
								}
								actualizarSeries(series);
								System.out.println("La votaci�n se ha a�adido correctamente.");
							}
							else {
								System.out.println("La votaci�n introducida no es v�lida.");
							}
						}		
						else {
							System.out.println("La serie introducida no es v�lida.");
						}
					}
					else {
						System.out.println("La contrase�a introducida no es v�lida.");
					}
				}
				else {
					System.out.println("El usuario introducido no existe.");
				}
				break;
			case "4":
				// Mostrar el t�tulo de cada serie guardada
				for (Serie s : series) {
					System.out.println(s.getTitulo());
				}
				break;
			case "5":
				// Mostrar el nombre de cada usuario guardado
				for (Usuario u : usuarios) {
					System.out.println(u.getUsername());
				}
				break;
			case "6":
				// Mostrar cada votaci�n guardada
				for (String votacion : votaciones) {
					System.out.println("El usuario \"" + votacion.split("#")[0] + "\" ha votado la serie \"" + votacion.split("#")[1] + "\" con un " + votacion.split("#")[2] + ".");
				}
				break;
			default:
				System.out.println("El n�mero introducido no es v�lido");
				break;
			}
			// Preguntar si se desea salir del programa
			System.out.println("�Desea salir del programa? (S/N)");
			salir = lectorConsola.nextLine();	
		}
		while (!salir.equals("S"));
		
	}

}
