package eje15;

import java.util.Scanner;

public class eje15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int costo_total, descuento, resta;
		
			System.out.println("Ingrese el costo total:");
			costo_total = entrada.nextInt();

			if (costo_total >= 15000) {

			descuento = costo_total / 10;
			resta = costo_total - descuento;

			System.out.println("El costo total con el descuento es de: " + resta);
			}

			else {
			System.out.println("El costo total es de: " + costo_total);
			}
	}
}
