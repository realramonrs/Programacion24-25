package Ejemplos;

public class _02OperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//En este ejemplo se obtiene el valor absoluto de un n�mero
		
		int x = 3;
		int valorAbsoluto;
		
		if(x<0) {
			valorAbsoluto = -x;
		}
		else {
			valorAbsoluto = x;
		}
		
		//Con el operador condicional quedar�a
		valorAbsoluto = x < 0 ? -x : x;
		
		
		

	}

}
