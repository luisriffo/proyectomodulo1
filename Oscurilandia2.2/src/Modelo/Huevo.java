package Modelo;

public class Huevo {
  /* conocer la fila donde  
	cayó el proyectil, la columna 
	y el puntaje obtenido en el lanzamiento*/
	
	private int fila;
	private int columna;
	private int puntaje;
	/**
	 * @param fila
	 * @param columna
	 * @param puntaje
	 */
	public Huevo(int fila, int columna, int puntaje) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.puntaje = puntaje;
	}
	/**
	 * 
	 */
	public Huevo() {
		super();
	}
	/**
	 * @return the fila
	 */
	protected int getFila() {
		return fila;
	}
	/**
	 * @param fila the fila to set
	 */
	protected void setFila(int fila) {
		this.fila = fila;
	}
	/**
	 * @return the columna
	 */
	protected int getColumna() {
		return columna;
	}
	/**
	 * @param columna the columna to set
	 */
	protected void setColumna(int columna) {
		this.columna = columna;
	}
	/**
	 * @return the puntaje
	 */
	protected int getPuntaje() {
		return puntaje;
	}
	/**
	 * @param puntaje the puntaje to set
	 */
	protected void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	@Override
	public String toString() {
		return "Huevo [fila=" + fila + ", columna=" + columna + ", puntaje=" + puntaje + "]";
	}
	
	
	
}