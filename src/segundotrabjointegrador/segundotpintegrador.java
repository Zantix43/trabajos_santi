package segundotrabjointegrador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class segundotpintegrador {

	static int desicion;
	static int n1;
	static int n2;

	public static void Menu() {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("\n1. Suma \n2. Resta \n3. Multiplicación \n4. División");

			System.out.println("\n¿Que operación matematica desea realizar?");
			desicion = entrada.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Error: Tipo de dato no valido.");
		}
	}

	public static int Suma(int a, int b) {
		int suma = a + b;
		return suma;

	}

	public static int Resta(int a, int b) {
		int resta = a - b;
		return resta;
	}

	public static int Multiplicacion(int a, int b) {
		int multi = a * b;
		return multi;
	}

	public static float Division(int a, int b) {
		float div = a / b;
		return div;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean continuar = false;

		String siono;
		while (continuar == false) {
			Menu();

			switch (desicion) {

			case 1:
				try {
					System.out.println("\nIngrese un número:");
					n1 = entrada.nextInt();
					System.out.println("Ingrese otro número:");
					n2 = entrada.nextInt();

					System.out.println("El resultado de la suma es: " + Suma(n1, n2));

					System.out.println("\n¿Desea continuar?");
					siono = entrada.next();

					switch (siono.toLowerCase()) {

					case "si":
						System.out.println("");
						break;

					case "no":
						System.out.println("Programa Finalizado.");
						continuar = true;
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("Error: Tipo de dato no valido.");
				}
				break;

			case 2:
				try {
					System.out.println("\nIngrese un número:");
					n1 = entrada.nextInt();
					System.out.println("Ingrese otro número:");
					n2 = entrada.nextInt();

					System.out.println("El resultado de la Resta es: " + Resta(n1, n2));

					System.out.println("\n¿Desea continuar?");
					siono = entrada.next();

					switch (siono.toLowerCase()) {

					case "si":
						System.out.println("");
						break;
					case "no":
						System.out.println("Programa Finalizado.");
						continuar = true;
						break;
					}

					break;
				} catch (InputMismatchException e) {
					System.out.println("Error: Tipo de dato no valido.");
				}
			case 3:
				try {
					System.out.println("\nIngrese un número:");
					n1 = entrada.nextInt();
					System.out.println("Ingrese otro número:");
					n2 = entrada.nextInt();

					System.out.println("El resultado de la Multiplicación es: " + Multiplicacion(n1, n2));

					System.out.println("\n¿Desea continuar?");
					siono = entrada.next();

					switch (siono.toLowerCase()) {

					case "si":
						System.out.println("");
						break;

					case "no":
						System.out.println("Programa Finalizado.");
						continuar = true;
						break;
					}

					break;
				} catch (InputMismatchException e) {
					System.out.println("Error: Tipo de dato no valido.");
				}

			case 4:
				try {

					System.out.println("\nIngrese un número:");
					n1 = entrada.nextInt();
					System.out.println("Ingrese otro número:");
					n2 = entrada.nextInt();

					System.out.println("El resultado de la División es: " + Division(n1, n2));

					if (n1 == 0 && n2 == 0) {
						throw new ArithmeticException();
					}

					System.out.println("\n¿Desea continuar?");
					siono = entrada.next();

					switch (siono.toLowerCase()) {

					case "si":
						System.out.println("");
						break;

					case "no":
						System.out.println("Programa Finalizado.");
						continuar = true;
						break;
					}

					break;

				} catch (ArithmeticException e) {
					System.out.println("Error: División por cero.");
				} catch (InputMismatchException e) {
					System.out.println("Error: Tipo de dato no valido.");
				}
			}
		}
	}
}
