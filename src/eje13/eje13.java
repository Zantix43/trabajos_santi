package eje13;

import java.util.Scanner;

public class eje13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char talla;

		System.out.println("Eliga un talle de remera S/M/L");
		talla = entrada.next().charAt(0);

		if (talla == 'S') {
			System.out.println("Quedan 5 remeras de este talle.");
		}

		else if (talla == 'M') {
			System.out.println("Quedan 2 remeras de este talle.");
		}

		else if (talla == 'L') {
			System.out.println("No quedan remeras de este talle.");
		}

	}
}
