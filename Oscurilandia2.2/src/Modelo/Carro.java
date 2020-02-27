package Modelo;

import java.util.Random;

public class Carro {
	static Random random = new Random();
	private int cantidad_ocupantes;
	private String fecha_ingreso;
	private int fila;
	private int columna;
	protected Carro(int fila, int columna,int maximo_ocupantes) {
		this.cantidad_ocupantes = fx_cantidad_ocupantes(maximo_ocupantes);
		this.fecha_ingreso = fx_fecha_ingreso();
		this.fila = fila;
		this.columna = columna;
	}
	protected Carro() {
		super();
	}
	public int getCantidad_ocupantes() {
		return cantidad_ocupantes;
	}
	public void setCantidad_ocupantes(int maximo_ocupantes) {
		this.cantidad_ocupantes = random.nextInt(maximo_ocupantes)+1;        
	}
	public String getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
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
	private int fx_cantidad_ocupantes(int maximo_ocupantes){
		return random.nextInt(maximo_ocupantes)+1;
    }
	
	private String fx_fecha_ingreso(){
        String dia = Integer.toString(random.nextInt(30)+1);
        String mes = Integer.toString(random.nextInt(12)+1);
        String anno = Integer.toString(random.nextInt(50)+1970);
        String fecha = dia+"/"+mes+"/"+anno; 
        return fecha; 
     }
	@Override
	public String toString() {
		return "Carro [cantidad_ocupantes=" + cantidad_ocupantes + ", fecha_ingreso=" + fecha_ingreso + ", fila=" + fila
				+ ", columna=" + columna + "]";
	}
	
}
