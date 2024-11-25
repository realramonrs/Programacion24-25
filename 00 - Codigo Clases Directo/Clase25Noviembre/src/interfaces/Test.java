package interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula[] cartelera = new Pelicula[3];
		cartelera[0] = new Pelicula("Terminator",1.5f,12,"James Cameron");
		cartelera[1] = new Pelicula("Indiana Jones",2,14,"StevenSpielberg");
		cartelera[2] = new Pelicula("Interstellar",3.7f,23,"Cristopher Nolan");
		String[] pelis = {"Origen","Joker","Magnolia"};
		
		//Ordenar esta matriz
		
		
		Arrays.sort(pelis);
		Arrays.sort(new Integer[] {8,6,4,3});
		
		String cadena1 = "Zacarias";
		String cadena2 = "Anabel";
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf(5);
		
		//Funcionamiento metodo compareTo <0 , 0 , >0
		System.out.println("anabel".compareTo("zacarias"));
		System.out.println(i2.compareTo(i2));
		System.out.println("CompareTo Peliculas:");
		System.out.println(cartelera[0].compareTo(cartelera[1]));
		System.out.println(cartelera[0].getTitulo().compareTo(cartelera[1].getTitulo()));
		
		System.out.println("Peliculas Ordenadas por Titulo");
		Arrays.sort(cartelera);
		for(Pelicula p : cartelera) {
			System.out.println(p);
		}
		
		System.out.println("Peliculas ordenadas por precio de venta: ");
		Arrays.sort(cartelera,new ComparatorPelis());
		for(Pelicula p : cartelera) {
			System.out.println(p);
		}
		
		//Ordenar las pelicula de manera puntual por director.
		//Clases anónimas
		Arrays.sort(cartelera, new Comparator<Pelicula>() {

			@Override
			public int compare(Pelicula o1, Pelicula o2) {
				// TODO Auto-generated method stub
				return o1.getDirector().compareTo(o2.getDirector());
			}			
			}
		);
		
		System.out.println("Peliculas ordenadas por director: ");
		for(Pelicula p : cartelera) {
			System.out.println(p);
		}
		
		
		
		
		
		
		
	}

}
