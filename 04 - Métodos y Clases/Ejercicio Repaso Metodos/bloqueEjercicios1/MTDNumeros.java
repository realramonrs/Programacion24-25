package bloqueEjercicios1;

import java.text.DecimalFormat;

public class MTDNumeros {
	/*1.Crea un m�todo que reciba un n�mero int y devuelva true si ese n�mero es perfecto. Un n�mero es perfecto 
	 * si la suma de sus divisores (sin contar el propio n�mero) es igual al n�mero. Por ejemplo :
	 *  6 es perfecto porque es igual a 1 + 2 + 3.
	 */

	//Todos los m�todos programados en esta clase ser�n est�ticos para que puedan ser llamados
	//sin necesidad de crear un objeto de la clase.
	public static boolean isPerfect(int numero){
		boolean perfecto = false;
		
		int suma = 0; //En esta variable guardaremos la suma de los divisores
		
		for(int i = 0;i<numero;i++){
			suma+=i;
		}
		//Ahora comprobamos si la suma = numero
		if(suma == numero){
			perfecto = true;
		}
		return perfecto;
	}
	
	
	/*Crear un m�todo que reciba 3 n�meros y devuelva su m�nimo com�n m�ltiplo , 
	 * es decir el n�mero m�s bajo que sea m�ltiplo de los 3.
	 * Para probarlo solicitar que el usuario introduzca 3 n�meros. 
	 * Estos 3 n�meros deben de ser positivos y menores que 100.

	 */

	public static int mcm(int n1,int n2,int n3){
		//Debemos determinar cu�l es el mayor de los 3 , ya que como m�nimo
		//ser� este el minimo com�n m�ltiplo
		int maximo = n1;
		
		if(n2>maximo)
			maximo = n2;
		if(n3>maximo)
			maximo = n3;
		
		
		//Ahora s�lo queda buscar a partir de este valor el primer numero que sea m�ltiplo de los 3
		
		int i = maximo;
		
		while((i%n1!=0) || (i%n2!=0) || (i%n3!=0))
			i++;
		
		return i;		
		
	}
	
	/*Crea un m�todo que reciba dos valores de tipo float que representan dos resistencias y 
	 * un par�metro opcional que va a representar las unidades. 
	 * El m�todo debe de devolver la resistencia equivalente seg�n la siguiente f�rmula:

	Req = (r1*r2)/(r1 + r2)

	El m�todo recibe siempre los valores en ohmnios y el par�metro opcional indica las unidades en las que se debe devolver la resistencia equivalente  seg�n el siguiente sistema:
		Si vale 1 : En microOhmnios (106 ohmnios)
		Si vale 2: En Kiloohmnios (10-3 ohmnios)
		Si no se pasa ning�n par�metros es que el resultado se devuelve en ohmnios.

	Cuando se pruebe esto desde el main se deben probar estas 3 opciones. */
	
	public static double calculoREquivalente(float r1,float r2,int... unidad){
			double resistenciaEquivalente = 0;
			//Para comprobar si se pasa alg�n par�metro opcional o no
			if(unidad.length == 0){
				//no se pas� par�metro opcional , se devuelve en ohmnios
				
				resistenciaEquivalente = (r1*r2)/(r1+r2);
			}
			//Estamos ahora en el caso de que se ha recibido un par�metro , como los par�metros
			//opcionales son tratados como un array , este par�metro ser� unidad[0] 
			else if(unidad[0] == 1){
				resistenciaEquivalente = (r1*r2)/(r1+r2)*Math.pow(10, 6);
			}
			else if(unidad[0]==2){
				resistenciaEquivalente = (r1*r2)/(r1+r2)*Math.pow(10, -3);
			}
			else{
				//error en el par�metro
				resistenciaEquivalente = -1;
			}
			return resistenciaEquivalente;
	}
	
	/* 4. M�todo que recibe una matriz de n�meros y modifica todas aquellas posiciones que almacenan un n�mero negativo 
	 * guardando en ellas el valor medio(redondeado al siguiente entero m�s cercano) 
	 * de los elementos positivos de la matriz  
	 */

	public static void quitarNegativosMatriz(int []matriz){
		
		//Primero debemos calcular la media de los elementos positivos
		int suma = 0;
		int contadorPositivos=0;
		double media = 0;
		
		for(int valor:matriz){
			if(valor > 0){
				suma+=valor;
				//Aumentamos el contador para saber cuantos elementos positivos hay
				contadorPositivos+=1;
			}
		}
		
		media = suma/contadorPositivos;
		
		//Ahora sustituimos todos los elementos negativos por esta media
		//Esto no podemos hacerlo con el for anterior , sino con el for tradicional
		
		for(int i = 0;i<matriz.length;i++){
			if(matriz[i] < 0){
				matriz[i] = (int)Math.ceil(media);
			}
			
		}
		
		//Como las matrices se pasan por referencia , estamos modificando la matriz original , no es necesario
		//devolver ning�n resultado.		
	}
	
	/* 5. Programar un m�todo que devuelva la media de una matriz de tipo float que recibe como par�metro.
	 *  Debe de devolver siempre un valor con 2 decimales.
	 * 
	 */

		public static float media2Decimales(float [] matriz){
			float media = 0;
			float suma = 0;
			
			for(float valor:matriz){
				suma+=valor;
			}
			media = suma/matriz.length;
			
			//Para formatear a 2 Decimales
			
			DecimalFormat df = new DecimalFormat("#.00");
			String mediaFormateada = df.format(media);
			
			//Hay que volver a pasarlo a float , el problema es que el string que devuelve el m�todo format tiene el formato 0,00 
			//y al utilizar el m�todo parseFloat va a producir una excepci�n por lo tanto debemos reemplazar la coma por un punto
			
			mediaFormateada = mediaFormateada.replace(',', '.');
			
			//Ahora ya podremos pasar a float
			media = Float.parseFloat(mediaFormateada);
			return media;		
			
		}
		
		/*Sobrecargarlo para que pueda recibir tambi�n una matriz de enteros.
		 		*/
		public static float media2Decimales(int [] matriz){
			float media = 0;
			int suma = 0;
			
			for(int valor:matriz){
				suma+=valor;
			}
			media = suma/matriz.length;
			
			//Para formatear a 2 Decimales
			
			DecimalFormat df = new DecimalFormat("#.00");
			String mediaFormateada = df.format(media);
			
			//Hay que volver a pasarlo a float , el problema es que el string que devuelve el m�todo format tiene el formato 0,00 
			//y al utilizar el m�todo parseFloat va a producir una excepci�n por lo tanto debemos reemplazar la coma por un punto
			
			mediaFormateada = mediaFormateada.replace(',', '.');
			
			//Ahora ya podremos pasar a float
			media = Float.parseFloat(mediaFormateada);
			return media;		
			
		}
		
		
		/*6.
		 * M�todo que recibe una matriz de tipo float y un boolean
		 * y devuelve una matriz de int con los valores de la original redondeados al entero
		 * m�s cercano por debajo si el boolean es true o redondeados al entero m�s cercano por arriba 
		 * si el boolean es false.
		 */
		
		public static int[] matrizRedondeada(float matriz[],boolean abajo){
			//Creamos otra matriz para almacenar el resultado ya que la original no se debe modificar
			int matrizResultado[] = new int[matriz.length]; //Le asignamos mismo tama�o que a la original.
			
			if(abajo){
				for(int i = 0;i<matriz.length;i++){
					matrizResultado[i] = (int)Math.floor(matriz[i]);
				}
			}
			else{
				for(int i = 0;i<matriz.length;i++){
					matrizResultado[i] = (int)Math.ceil(matriz[i]);
				}
			}
			
			return matrizResultado;
		}
		
		/*7.Programar un m�todo que reciba una matriz 2D y modifique todas sus posiciones de forma que 
		 * cada posici�n almacene el valor seg�n la siguiente expresi�n:
					valor = (i* j)3 /2*(i + j)
					Siendo i el �ndice de fila y j el �ndice de columna.
					*/

			public static void modificarMatriz2d(double matriz[][]){
				for(int i = 0;i<matriz.length;i++){
					for(int j = 0;j<matriz[i].length;j++){
						if(j==0&&i==0)
							continue;
						matriz[i][j] = Math.pow(i*j,3)/(2*(i+j));
					}
				}
				
			}
			
		/*Programar un m�todo que reciba una matriz 2D de tipo int y devuelva el siguiente String:
		�La media de la fila 1 es: � �
		�La media de la fila 2 es: � �
		�La fila con la media m�s alta es�...*/
	
	public static String getInfoMatriz(int matriz[][]){
		int sumas[] = new int[matriz.length];
		double medias[] = new double[matriz.length];
		String info = "";
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				sumas[i]+=matriz[i][j];
			}
			medias[i] = sumas[i]/matriz[i].length;
			
		}
		
		for (int i = 0; i < matriz.length; i++) {
			info+="La media de la fila " + i + " es " + medias[i] + "\n";
			
		}
		
		double mediaMasAlta = Integer.MIN_VALUE;
		int posMediaMasAlta = -1;
		for (int i = 0; i < medias.length; i++) {
			if(medias[i]>mediaMasAlta) {
				mediaMasAlta = medias[i];
				posMediaMasAlta = i;
			}
		}
		
		info+= " La fila con la media m�s alta es la " + posMediaMasAlta + " media = " + mediaMasAlta;
		
		
		
		return info;
		
	}
			
			/*9.Programar un m�todo que reciba una matriz de 2 dimensiones de tipo float e indique con un 
			 * booleano si hay filas repetidas , es decir , que almacenen los mismos valores. 
			  * */
			
			
			public static boolean getRepetidas(int matriz[][]){
				boolean repetidas = false;
				for(int i = 0;i<matriz.length&&!repetidas;i++){
					//Comparar filas
					for(int j = i+1;j<matriz.length;j++)
						repetidas = comparaArrays(matriz[i],matriz[j]);
					
				}
				return repetidas;
			}
			
			
			//M�todo auxiliar para apartado 9 que compara dos arrays y devuelve true si son iguales
			
			private static boolean comparaArrays(int m1[],int m2[]){
				boolean iguales = true;
				
				if(m1.length==m2.length){
				for(int i = 0;i<m1.length;i++){
					if(m1[i]!=m2[i]){
						iguales = false;
						break;
					}
				}
				}
				else{
					iguales = false;
				}
				return iguales;
			}
		}
