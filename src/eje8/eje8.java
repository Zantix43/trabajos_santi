package eje8;

import java.util.Scanner;

public class eje8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float num;
		double suma;
		double multi;

		System.out.println("Ingrese un número con dos decimales:");
		num = entrada.nextFloat();

		double exponente = 2;
		double potencia = Math.pow(num, exponente);

		int redondeado = (int) Math.round(potencia);
		double num_random = (Math.random() * 1);

		suma = redondeado + num_random;
		multi = suma * 7;

		double raiz = Math.sqrt(multi);

		System.out.println("Resultado de las operaciones: " + raiz);

	}
}
