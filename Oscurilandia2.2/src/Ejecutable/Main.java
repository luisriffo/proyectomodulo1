package Ejecutable;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import Modelo.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
    static Tablero tablero = new Tablero();
    static CajaHuevos cajaHuevos = new CajaHuevos();
    static Random random = new Random();
    static Kromi[] kromi = new Kromi[3];
    static Caguano[] caguano = new Caguano[5];
    static Trupalla[] trupalla = new Trupalla[10];
    static int fila;
    static int columna;
    static int puntaje = 0;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		tablero.carrosOcultos();
		crearCarros();
		menu();  

	}
	
	private static void menu() throws InterruptedException {
		// TODO Auto-generated method stub
		boolean salir = false;
		int opcion; //Guardaremos la opción del usuario
		
		
		while(!salir) {
            pantallaMenu();
			try{
				System.out.println("");
				System.out.println("Ingresa una opcion: ");
				opcion = sn.nextInt();
				switch (opcion) {
					case 1: 
						tablero.limpiar();
						cajaHuevos.limpiar();
						crearCarros();
						tablero.carrosOcultos();
						puntaje = 0;
						break;
					case 2: //lanzar_huevo();
						lanzar_huevo();
						break;
					case 3: //mostrar_Carros();
						tablero.mostrarCarros();
						break;
					case 4: //SALIR
						salir = true;
						System.out.println("GAME OVER");
						System.out.println("");
						break;
					default:
						System.out.println("Solo números entre 1 y 4");
						System.out.println("");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes ingresar un número:");
			}
		}
		
	}
	
	private static void pantallaMenu(){
		System.out.println();
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println("=         BIENVENIDO         =");
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println("==    JOVEN PRIMERA LINEA   ==");
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println("");
		System.out.println("____________________");
		System.out.println("");
		System.out.println("1.- Resetear Juego");
		System.out.println("2.- Lanzar Huevos");
		System.out.println("3.- Mostrar Posición Carros");
		System.out.println("4.- SALIR");
       	System.out.println("____________________");
    }   
	
	private static void crearCarros(){
        tablero.crearKromis();
        tablero.crearCaguanos();
        tablero.crearTrupallas();
        
    }
			
	private static void lanzar_huevo() {
		boolean salir = false;
		fila = 0;
		columna = 0;
		int op = 0;
		do {
			do {
				System.out.println("Ingrese fila ");
				fila = sn.nextInt();
				if (fila<1 || fila > 15) {
					System.out.println("debe ingresar un valor entre 1 y 15");
				}
			} while (fila<1 || fila > 15);
			do {
				System.out.println("Ingrese columna ");
				columna = sn.nextInt();
				if (columna<1 || columna > 15) {
					System.out.println("debe ingresar un valor entre 1 y 15");
				}
			} while (columna<1 || columna > 15);
			if (!cajaHuevos.is_ocupado(fila, columna)) {
				cajaHuevos.tiro(fila, columna);
				is_achuntandole(fila, columna);
				
			} else {System.out.println("ya habias tirado un huevo en esa posicion");}
						
			do {
				System.out.println("Desea tirar otro huevo(1) Si, (2) No");
				op = sn.nextInt();
				if (op!=1 && op!=2) {
					System.out.println("debe ingresar 1 o 2");
				}
			} while (op!=1 && op != 2);
			if (op==2) {
				salir = true;
			}
		} while (!salir);
		System.out.println("dejo de tirar Huevos");
	}
	
	private static boolean is_achuntandole(int fila, int columa) {
		boolean achuntado=false;
		if (cajaHuevos.is_ocupado(fila, columna)==tablero.is_ocupado(fila, columna)) {
			System.out.print("le achuntaste a un ");
			puntaje = puntaje + tablero.queHayAdentro(fila, columa);
			System.out.println("puntaje acumulado "+puntaje);
				
		}
		return achuntado;
	}
}
