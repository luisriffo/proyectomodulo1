package Modelo;

public class Trupalla extends Carro{
	private int nivel_armadura;
	private String nombre_operador;
	protected Trupalla() {
		
	}
	protected Trupalla(int fila, int columna, int maximo_ocupantes) {
		super(fila, columna, maximo_ocupantes);
		this.nivel_armadura = fx_nivelArmadura();
		this.nombre_operador = fx_nombre_operador();
	}
	/**
	 * @return the nivel_armadura
	 */
	public int getNivel_armadura() {
		return nivel_armadura;
	}
	/**
	 * @param nivel_armadura the nivel_armadura to set
	 */
	public void setNivel_armadura(int nivel_armadura) {
		this.nivel_armadura = nivel_armadura;
	}
	/**
	 * @return the nombre_operador
	 */
	public String getNombre_operador() {
		return nombre_operador;
	}
	/**
	 * @param nombre_operador the nombre_operador to set
	 */
	public void setNombre_operador(String nombre_operador) {
		this.nombre_operador = nombre_operador;
	}
	@Override
	public String toString() {
		return "Trupalla [nivel_armadura=" + nivel_armadura + ", nombre_operador=" + nombre_operador + "]";
	}
	
	private int fx_nivelArmadura(){
        return random.nextInt(4)+1;
    }
    private String fx_nombre_operador(){
       String nombre = "operador";
       for(int i = 0;i < 5;i++){
          nombre = nombre + Integer.toString(random.nextInt(10)+1);
       }
       return nombre;

    }
	
	
	
}
