package model;

public class Casilla {
	
	private int fila;
	private int columna;
	private boolean ocupada;
	private String simbolo;
	
	
	public Casilla(int fila, int columna, boolean ocupada, String simbolo) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.ocupada = ocupada;
		this.simbolo = simbolo;
	}


	public Casilla() {
		super();
	}


	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public int getColumna() {
		return columna;
	}


	public void setColumna(int columna) {
		this.columna = columna;
	}


	public boolean isOcupada() {
		return ocupada;
	}


	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}


	public String getSimbolo() {
		return simbolo;
	}


	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}


	@Override
	public String toString() {
		return "Casilla [fila=" + fila + ", columna=" + columna + ", ocupada=" + ocupada + ", simbolo=" + simbolo + "]";
	}
	
	

}
