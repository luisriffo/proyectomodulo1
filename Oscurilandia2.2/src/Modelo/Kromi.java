package Modelo;

import java.util.Random;


public class Kromi extends Carro{
	static Random random = new Random();
	private String anno_fabricacion;
	private String marca;
	/**
	 * @param cantidad_ocupantes
	 * @param fecha_ingreso
	 * @param fila
	 * @param columna
	 * @param anno_fabricacion
	 * @param marca
	 */
	public Kromi(int fila, int columna,int maximo_ocupantes) {
		super(fila, columna,maximo_ocupantes);
		this.anno_fabricacion = fx_anno_fabricacion();
		this.marca = fx_marca();
	}
	/**
	 * @param cantidad_ocupantes
	 * @param fecha_ingreso
	 * @param fila
	 * @param columna
	 */
	public Kromi() {
		
	}
	/**
	 * @return the anno_fabricacion
	 */
	protected String getAnno_fabricacion() {
		return anno_fabricacion;
	}
	/**
	 * @param anno_fabricacion the anno_fabricacion to set
	 */
	protected void setAnno_fabricacion(String anno_fabricacion) {
		this.anno_fabricacion = anno_fabricacion;
	}
	/**
	 * @return the marca
	 */
	protected String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Kromi [anno_fabricacion=" + anno_fabricacion + ", marca=" + marca + "]";
	}
	
	private String fx_anno_fabricacion(){
		return Integer.toString(random.nextInt(50)+1970);
    }
	private String fx_marca(){
        String[ ] marca= new String[5];
        marca[0] = "Lada";
        marca[1] = "Renaut";
        marca[2] = "Ferrari";
        marca[3] = "Mercedes Benz";
        marca[4] = "Isuzu";
        int azar = random.nextInt(4);
        return marca[azar];
   }  
}
