package Ejemplos;

import java.io.IOException;
import java.util.Scanner;

public class _10BucleDoWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char opcion;
		
		do {
			
		
		
		System.out.println("Escoja una opci�n:");
		System.out.println("a) Calcular suma dos n�meros.");
		System.out.println("b) Calcular resta dos n�meros.");
		System.out.println("c) Calcular el producto de dos n�meros.");
		System.out.println("d) Calcular la divisi�n.");
		System.out.println("e) Salir.");
		
		opcion = (char)System.in.read();
		
		}
		while(opcion!='e');

	}

}
