package mapping;

import java.util.ArrayList;
import java.util.Scanner;

import conexionBBDD.Utilidades;

public class PrincipalMapping {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		//Volcar toda la información al ArrayList
		libros = Utilidades.getLibrosBBDD();
		
		//PRESENTAR UN MENÚ : 
		System.out.println("1. Ver todos los libros");
		System.out.println("2. Ver libros por género");
		System.out.println("3. Ver libros por autor:");
		System.out.println("4. Añadir nuevo libro");
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escoja una opción: ");
		int opcion = lector.nextInt();
		
		switch(opcion) {
		case 1:
			for(Libro l : libros) {
				System.out.println(l);
			}
			break;
		case 2:
			String genero;
			System.out.println("Introduzca el género: ");
			genero = lector.next();
			
			for(Libro l : libros) {
				if(l.getGenero().equals(genero)) {
					System.out.println(l);
				}
			}
			
			break;
			
		case 4:
			String titulo,autor,genero4;
			float precio;
			
			Scanner lector4 = new Scanner(System.in);
			System.out.println("Introduzca un autor: ");
			autor = lector4.nextLine();
			
			System.out.println("Intro titulo");
			titulo = lector4.nextLine();
			System.out.println("Intro genero");
			genero4 = lector4.nextLine();
			System.out.println("Intro precio: ");
			precio = lector4.nextFloat();
			
			Utilidades.addLibroBBDD(titulo, autor, precio, genero4);
			
		}
		
		
		
	}

}
