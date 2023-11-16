package eje5;

import java.util.Scanner;

public class eje5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float num;

		System.out.println("Ingrese un número para calcular su raíz:");
		num = entrada.nextFloat();

		float raiz_cuadrada = (float) Math.sqrt(num);

		int num_redondeado = (int) Math.round(raiz_cuadrada);

		System.out.println("Valor de la raíz: " + raiz_cuadrada);
		System.out.println("Valor de la raíz redondeado: " + num_redondeado);

	}
}
