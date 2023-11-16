package eje3;

import java.util.Scanner;

public class eje3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float n1, n2, suma, resta, multi, div;

		System.out.println("Ingrese el primer número:");
		n1 = entrada.nextFloat();

		System.out.println("Ingrese el segundo número");
		n2 = entrada.nextFloat();

		suma = n1 + n2;

		resta = n1 - n2;

		multi = n1 * n2;

		div = n1 / n2;

		System.out.println("\nResultado de la suma: " + suma);

		System.out.println("\nResultado de la resta: " + resta);

		System.out.println("\nResultado de la multiplicación: " + multi);

		System.out.println("\nResultado de la división: " + div);
	}

}
