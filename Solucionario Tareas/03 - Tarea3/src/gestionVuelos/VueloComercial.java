package gestionVuelos;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class VueloComercial extends Vuelo{

	private Asiento[] asientos;
	private Companhia companhia;
	
	
	public VueloComercial(Companhia c, Lugar origen,Lugar destino,LocalDate fecha,int filas) {
		super(c,origen,destino,fecha);
		asientos = new Asiento[filas*6];
		companhia = c;
		char[] letras = {'A','B','C','D','E','F'};
		int contador = 0;
		
		for(int i = 1;i<=filas;i++) {
			for(int j = 0;j<6;j++) {
			String codigoAsiento = Integer.toString(i) + letras[j];
			asientos[contador++] = new Asiento(codigoAsiento);
			
				}			
			}
		}
	
	public float getPrecioAsiento(String codigo) {
		for(Asiento a : asientos) {
			if(a.getCodigoAsiento().equals(codigo)) {
				return a.getPrecioBillete();
			}
		}
		return 0;
	}
	
	public void anularReserva(String codigoAsiento) {
		for(Asiento a : asientos) {
			if(a.getCodigoAsiento().equals(codigoAsiento)) {
				a.setOcupado(false);
				break;
			}
		}
	}
	
	public String reservarAsiento() {
		String codigo = "";
		for(Asiento a : asientos) {
			if(!a.getOcupado()) {
				a.setOcupado(true);	
				codigo = a.getCodigoAsiento();
				break;
			}
		}
		//Actualizamos precio resto de asientos
		for(Asiento a : asientos) {
			if(!a.getOcupado()) {
				a.setPrecioBillete();
			}
		}
		return codigo;
	}
	public String reservarAsiento(boolean ventana) {
		//Consideramos ventana aquellos cuya letra sea A o F
		String codigo = "";
		for(Asiento a : asientos) {
			if(!a.getOcupado()) {
				if(a.getCodigoAsiento().charAt(1)=='A' ||a.getCodigoAsiento().charAt(1)=='F' ) {
				a.setOcupado(true);	
				codigo = a.getCodigoAsiento();
				break;
				}
			}
		}
		//Actualizamos precio resto de asientos
		for(Asiento a : asientos) {
			if(!a.getOcupado()) {
				a.setPrecioBillete();
			}
		}
		return codigo;
	}
	
	public void mostrarAsientos() {
		for(Asiento a : asientos) {
			System.out.println(a.getCodigoAsiento() +" " + a.getOcupado()  + " "+ a.getPrecioBase()+ " " + a.precioBillete);
		}
	}
	public void mostrarAsientosReservados() {
		for(Asiento a : asientos) {
			if(a.getOcupado())
			System.out.println(a.getCodigoAsiento() +" " + a.getOcupado()  + " "+ a.getPrecioBase()+ " " + a.precioBillete);
		}
	}
	
	public float getPorcentajeAsientosLibres() {
		int contador = 0;
		for(Asiento a : asientos) {
			if(!a.getOcupado()) {
				contador++;
			}
		}
		return ((float)contador/asientos.length);
	}
	@Override
	public float calcularGanancia() {
		// TODO Auto-generated method stub
		float ganancia = 0;
		for(Asiento a : asientos) {
			if(a.getOcupado())
			ganancia+= a.getPrecioBillete();
		}
		return ganancia;
	}
		
	class Asiento{
		private String codigoAsiento;
		private float precioBase;
		private boolean ocupado;
		private float precioBillete;
		
		public Asiento(String codigo) {
			this.codigoAsiento = codigo;
			setPrecioBase();
			precioBillete = precioBase;
			
		}
		public String getCodigoAsiento() {
			return codigoAsiento;
		}
		public float getPrecioBase() {
			return precioBase;
		}
		
		private void setPrecioBase() {
			switch(companhia) {
			case SkyAir:
				this.precioBase = 75;
				break;
			case FlyInfinity:
				this.precioBase = 125;
				break;

			case MacAir:
				this.precioBase = 175;
				break;
			}
		}
		
		public void setOcupado(boolean ocupado) {
			this.ocupado = ocupado;
		}
		public boolean getOcupado() {
			return this.ocupado;
		}
		
		public void  setPrecioBillete() {
			
			int dias = (int) ChronoUnit.DAYS.between(LocalDate.now(), getFechaSalida());
			precioBillete = (float) (precioBase + getDistancia()*0.05 +70*(1-getPorcentajeAsientosLibres()) +(150-dias));
		}
		
		public float getPrecioBillete() {
			return this.precioBillete;
		}
	}


	
}
