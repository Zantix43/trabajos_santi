package eje14;

import java.util.Scanner;

public class eje14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
			System.out.println("Ingrese un número:");
			num = entrada.nextInt();
			
			if (num != 0) {
				System.out.println("Si se puede realizar la división");
			}
			else {
				System.out.println("No se puede realizar la división");
			}
	}
	
}
