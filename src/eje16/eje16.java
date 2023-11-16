package eje16;

import java.util.Scanner;

public class eje16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int hora, min, seg;

		System.out.println("Ingrese la Hora:");
		hora = entrada.nextInt();

		System.out.println("Ingrese los minutos:");
		min = entrada.nextInt();

		System.out.println("Ingrese los segundos:");
		seg = entrada.nextInt();

		if (hora >= 24 && min >= 60 && seg >= 60) {
			System.out.println("Horario Incorrecto.");
		}

		else {
			System.out.println("Horario Correcto");
		}
	}
}