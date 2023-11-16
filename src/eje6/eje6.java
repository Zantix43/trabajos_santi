package eje6;

import java.util.Scanner;

public class eje6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float nota;

		System.out.println("Ingrese su calificación del examén:");
		nota = entrada.nextFloat();

		int num_redondeado = (int) Math.round(nota);

		System.out.println("La calificación redondeada es: " + num_redondeado);
	}
}
