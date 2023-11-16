package eje10;

import java.util.Scanner;

public class eje10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre, apellido;
		int bingo;

		System.out.println("\tBienvenido al Bingo");
		System.out.println("\nIngrese su Nombre:");
		nombre = entrada.next();

		System.out.println("\nIngrese su Apellido:");
		apellido = entrada.next();
		
		System.out.println("\nIngrese un número de bingo:");
		bingo = entrada.nextInt();

		int numbingo = (int) (Math.random() * 99);

		if (bingo == numbingo) {
			System.out.println("\nUsted ha ganado el Bingo");
		}
		
		if (bingo != numbingo) {
			System.out.println("\nUsted ha perdido");
		}
		
		System.out.println("\nNombre: " + nombre + " \nApellido: " + apellido + " \nNúmero de bingo: " + numbingo);
	}
}

