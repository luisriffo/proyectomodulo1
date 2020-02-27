package Modelo;

import java.util.Random;

public class Caguano extends Carro{
	static Random random = new Random();
	private int alcance;
	private String color;
	protected Caguano() {
	
	}
	protected Caguano(int fila, int columna, int maximo_ocupantes) {
		super(fila, columna, maximo_ocupantes);
		this.alcance = fx_alcance();
		this.color = fx_color();
	}
	/**
	 * @return the alcance
	 */
	public int getAlcance() {
		return alcance;
	}
	/**
	 * @param alcance the alcance to set
	 */
	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Caguano [alcance=" + alcance + ", color=" + color + "]";
	}
	
	private int fx_alcance(){
        return random.nextInt(20)+1;
    }
	
	private String fx_color(){
        String[ ] color = new String[5];
        color[0] = "blanco";
        color[1] = "rojo";
        color[2] = "verde";
        color[3] = "fucsia";
        color[4] = "multicolor";
        int azar = random.nextInt(4);
        return color[azar];
   }
	
	
}
