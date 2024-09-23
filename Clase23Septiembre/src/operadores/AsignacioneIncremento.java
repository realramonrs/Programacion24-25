package operadores;

import java.util.Scanner;

public class AsignacioneIncremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//+= , -= , *= , /=
		int x = 10;
		//Sumarle 2 a x
		x = x + 2;
		x+=2;
		x-=2;
		x*=2;
		
		//++ y -- : postincremento o preincremento
		int y = 1;
		y++; //y= y +1; y+=1
		++y;
		System.out.println("y= " + y);
		int z= ++y;
		System.out.println("z=" + z + "\n" + "y=" + y);
		String d;
		Scanner lector;
		
	}

}
