package eje9;

import java.util.Scanner;

public class eje9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre, apellido;

		System.out.println("\tBienvenido al Bingo");
		System.out.println("\nIngrese su Nombre:");
		nombre = entrada.next();

		System.out.println("\nIngrese su Apellido:");
		apellido = entrada.next();

		int numbingo = (int) (Math.random() * 99);

		System.out.println("\nNombre: " + nombre + " \nApellido: " + apellido + " \nNúmero de bingo: " + numbingo);
	}
}
