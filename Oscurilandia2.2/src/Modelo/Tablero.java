package Modelo;

import java.util.Random;





public class Tablero {
	static int fila;
	static int columna;
	static Random random = new Random();
	static Kromi[] kromi = new Kromi[3];
	static Caguano[] caguano = new Caguano[5];
	static Trupalla[] trupalla = new Trupalla[10];
	static int tablero[][];     /**
		 * @param tablero
		 */
	public Tablero() {
			this.tablero = new int [15][15];
	}
	
	public boolean is_ocupado(int fila, int columna) {
			boolean is_ocupado = false;
			if (tablero[fila-1][columna-1]!=0) {
				is_ocupado = true;
			}
	                return is_ocupado;
	}
	
	public static boolean crearCarro(int fila, int columna, int tipo_carro) {
		boolean is_vacio = false;
		switch (tipo_carro) {
		case 1:
			is_vacio = crearCarroTrupalla(fila, columna);
			break;
		case 2:
			is_vacio = crearCarroCaguano(fila,columna);
			break;
		case 3:
			is_vacio = crearCarroKromi(fila, columna);
			break;	
		}
		
        return is_vacio;
        
    }
	
	public static boolean crearCarroTrupalla(int fila, int columna) {
		boolean is_vacio = false;
		
		if (tablero[fila-1][columna-1]==0) {
			
			tablero[fila-1][columna-1]=1;
			is_vacio = true;
		}
        return is_vacio;
        
    }
	
	public static boolean crearCarroKromi(int fila, int columna) {
		boolean is_vacio = false;
		if (tablero[fila-1][columna-1]==0 && tablero[fila][columna-1]==0 && tablero[fila+1][columna-1]==0 && fila <12) {
			
			tablero[fila-1][columna-1]=3;
			tablero[fila][columna-1]=3;
			tablero[fila+1][columna-1]=3;
			is_vacio = true;
		}
        return is_vacio;
        
    }
	
	public static boolean crearCarroCaguano(int fila, int columna) {
		boolean is_vacio = false;
		if (tablero[fila-1][columna-1]==0 && tablero[fila-1][columna]==0) {
			tablero[fila-1][columna-1]=2;
			tablero[fila-1][columna]=2;
			is_vacio = true;
		}
        return is_vacio;
        
    }
	public void barraArriba() {
		System.out.print("Fi/Col");
    	for (int i = 0; i < 15; i++) {
    		if (i<=8) {
    			System.out.print(" 0"+(i+1)+" | ");
		}else {
			System.out.print(" "+(i+1)+" | ");
		}	
    	
	}
        System.out.println();
	}
	public void mostrarCarros() {
		barraArriba();
		for (int i = 0; i < 15; i++) {
			if (i<=8) {
				System.out.print("0"+(i+1));				
			}else {
				System.out.print(i+1);				
			}
			System.out.print(" | ");
			for (int j = 0; j < 15; j++) {
				if (tablero[i][j]==0) {
					System.out.print("[ "+tablero[i][j]+" ] ");
				}
				if (tablero[i][j]==1) {
					System.out.print("["+"-T-"+"] ");
				}
				if (tablero[i][j]==2) {
					System.out.print("["+"-C-"+"] ");
				}
				if (tablero[i][j]==3) {
					System.out.print("["+"-K-"+"] ");
				}
							
			}
			System.out.println("|");
		}
		for (int i = 0; i < 96; i++) {
			System.out.print("-");
		} 
		
	}
	
	public void carrosOcultos() {
		barraArriba();
		for (int i = 0; i < 15; i++) {
			if (i<=8) {
				System.out.print("0"+(i+1));				
			}else {
				System.out.print(i+1);				
			}
			System.out.print(" | ");
			for (int j = 0; j < 15; j++) {
				
					System.out.print("["+"-?-"+"] ");
				
							
			}
			System.out.println("|");
		}
		for (int i = 0; i < 96; i++) {
			System.out.print("-");
		} 
	}
	
	public void limpiar() {
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				tablero[i][j]=0;				
				
							
			}
			
		}
		
	}
	public static void crearKromis(){
		//Kromi
	        for (int i = 0; i < 3; i++) {
        		fila = random.nextInt(11)+1;
        		columna = random.nextInt(15)+1;
        		if (crearCarro(fila, columna,3)) {
                              kromi[i] = new Kromi(fila,columna,21);
                        
        		}else {i=i-1;}
        	}      
    }
	
	public static void crearCaguanos(){
		//Caguanos

	        for (int i = 0; i < 5; i++) {
        		fila = random.nextInt(15)+1;
        		columna = random.nextInt(12)+1;
        		if (crearCarro(fila, columna,2)) {
        			caguano[i] = new Caguano(fila, columna, 4);
                        
        		}else {i=i-1;}
        	}      
    }
	
	 public static void crearTrupallas(){
			//Trupallas

		        for (int i = 0; i < 10; i++) {
	        		fila = random.nextInt(15)+1;
	        		columna = random.nextInt(15)+1;
	        		if (crearCarro(fila, columna,1)) {
	                              trupalla[i] = new Trupalla(fila, columna, 1);
	        		}else {i=i-1;}
	        	}      
	 }
	 
	 public static int queHayAdentro(int fila, int columna) {
		int puntaje=0;
		switch (tablero[fila-1][columna-1]) {
		case 1:
			System.out.println("Trupalla!!");
			puntaje=puntaje+1;
			break;
		case 2:
			System.out.println("Caguano!!");
			puntaje=puntaje+2;			
			break;
		case 3:
			System.out.println("Kromi!!");
			puntaje=puntaje+3;
			break;
		default:
			break;
		}
		System.out.println("puntaje huevo "+puntaje);		
		return puntaje;
		 
	 }
       
	
	
	
	
}
