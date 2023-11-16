package eje2;

import java.util.Scanner;

public class eje2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nombre;
		String apellido;
		char genero;

		System.out.println("Introduzca su Nombre");
		nombre = entrada.next();

		System.out.println("Introduzca su Apellido");
		apellido = entrada.next();

		System.out.println("Introduzca su género M/F");
		genero = entrada.next().charAt(0);

		System.out.println("\nEstos son tus datos :D");
		System.out.println("\n\t Nombre: " + nombre);
		System.out.println("\n\t Apellido: " + apellido);
		System.out.println("\n\t Género: " + genero);
	}
}
