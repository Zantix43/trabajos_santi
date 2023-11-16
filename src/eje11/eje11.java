package eje11;

import java.util.Scanner;

public class eje11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Ingrese un número:");
		num = entrada.nextInt();
		
		if (num < 0) {
			System.out.println("\nEl número es negativo");
		}
		
		else if (num == 0) {
			System.out.println("\nEl número es cero");
		}
		
		else {
			System.out.println("\nEl número es positivo");
		}
		
	}
}
