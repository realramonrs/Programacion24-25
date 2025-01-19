package gestionVuelos;

import java.time.LocalDate;
import java.util.Random;

public abstract class Vuelo {

	private String codigo;
	private Companhia companhia;
	private Lugar origen;
	private Lugar destino;
	private LocalDate fechaSalida;
	private float distancia;
	
	
	public Vuelo( Companhia companhia, Lugar origen, Lugar destino, LocalDate fechaSalida) {
		super();
		this.codigo = generarCodigo();
		this.companhia = companhia;
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		setDistancia();
	}
	private String generarCodigo() {
		char letras[] = {'A','B','C','D','E','F','G','H','I','J','G'};
		char digitos[] = {'1','2','3','4','5','6','7','8','9','0'};
		Random generador = new Random();
		char letra1 = letras[generador.nextInt(0,11)];
		char letra2 = letras[generador.nextInt(0,11)];
		char letra3 = digitos[generador.nextInt(0,10)];
		char letra4 = digitos[generador.nextInt(0,10)];
		String codigo = Character.toString(letra1) + Character.toString(letra2) +
				Character.toString(letra3)+Character.toString(letra4);
		return codigo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Companhia getCompanhia() {
		return companhia;
	}
	public void setCompanhia(Companhia companhia) {
		this.companhia = companhia;
	}
	public Lugar getOrigen() {
		return origen;
	}
	public void setOrigen(Lugar origen) {
		this.origen = origen;
	}
	public Lugar getDestino() {
		return destino;
	}
	public void setDestino(Lugar destino) {
		this.destino = destino;
	}
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	private void setDistancia() {
		this.distancia =  (float)Lugar.calcularDistacia(origen, destino)/1000;
	}
	public float getDistancia() {
		return this.distancia;
	}
	
	public String toString() {
		return "Vuelo [codigo=" + codigo + ", companhia=" + companhia + ", origen=" + origen + ", destino=" + destino
				+ ", fechaSalida=" + fechaSalida + ", distancia=" + distancia + "]";
	}
	public abstract float calcularGanancia();
	
}
