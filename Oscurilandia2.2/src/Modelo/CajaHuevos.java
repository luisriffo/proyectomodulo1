package Modelo;

import java.util.Random;

public class CajaHuevos {
	static int fila;
	static int columna;
	static Random random = new Random();
	static int cajaHuevos[][];     /**
		 * @param tablero
		 */
	public CajaHuevos() {
			CajaHuevos.cajaHuevos = new int[15][15];
	}
	
	public boolean is_ocupado(int fila, int columna) {
			boolean is_ocupado = false;
			if (cajaHuevos[fila-1][columna-1]!=0) {
				is_ocupado = true;
				
			}
	        return is_ocupado;
	}
	
	public void tiro(int fila, int columna) {
		
			cajaHuevos[fila-1][columna-1]=1;
			System.out.println("tiro efectuado correctamente");
		
	}
	
	public void limpiar() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				cajaHuevos[i][j]=0;							
			}
		}

	}
	

	
}
