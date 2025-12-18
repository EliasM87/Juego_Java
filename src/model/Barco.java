package model;

public class Barco {
	
	private String nombre;
	private int longitud;
	private int impactos;
	private boolean hundido;
	
	public Barco(String nombre, int longitud) {
		super();
		this.nombre = nombre;
		this.longitud = longitud;
		this.impactos = 0;
		
	}
	public Barco() {
		super();
	}
	
	
	public boolean estaHundido() {
		return impactos >= longitud;
	}
	
	public void registrarImpactos() {
		this.impactos++;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getImpactos() {
		return impactos;
	}
	public void setImpactos(int impactos) {
		this.impactos = impactos;
	}
	public boolean isHundido() {
		return hundido;
	}
	public void setHundido(boolean hundido) {
		this.hundido = hundido;
	}
	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", longitud=" + longitud + ", impactos=" + impactos + ", hundido=" + hundido
				+ "]";
	}
	
	

}
