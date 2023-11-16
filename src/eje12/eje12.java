package eje12;

import java.util.Scanner;

public class eje12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota;
		
		System.out.println("Ingrese su Calificación:");
		nota = entrada.nextInt();
		
		if (nota > 10 || nota <= 0) {
			System.out.println("Valor Incorrecto");
		}
		
		else if (nota >= 1 && nota <= 3) {
			System.out.println("Insuficiente");	
		}
		
		else if (nota > 3 && nota < 6) {
			System.out.println("No logrado.");
		}
		
		else if (nota >= 6 && nota <= 7) {
			System.out.println("Suficiente.");
		}
		
		else if (nota >= 8 && nota <= 9) {
			System.out.println("Notable.");
		}
		else {
			System.out.println("Sobresaliente.");
		}
	}
}
