package tercertrabajointegrador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tercertrabajointegrador {
	static String Titulo[] = { "Harry Potter", "Jurassic Park", "Lord of the Rings" };
	static String Autor[] = { "Brandin", "Santiago", "Lolo" };
	static int NumPag[] = { 120, 300, 230 };

	public static void Menu() {
		System.out.println("\n1. Mostrar lista de libros \n2. Buscar libro por titulo \n3. Salir");
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int desicion;
		int num = 1;
		String busqueda;
		boolean cont = false;
		String siono;

		try {
		while (cont == false) {

			Menu();
			System.out.println("\n¿Que desea realizar?");
			desicion = entrada.nextInt();
			entrada.nextLine();

			switch (desicion) {

			case 1:
				for (String titulos : Titulo) {
					System.out.println("Titulo del libro n° " + num++ + " : " + titulos);
					if (num > 3) {
						num = 1;
					}

				}
				for (String autores : Autor) {
					System.out.println("Autor del libro n° " + num++ + " : " + autores);
					if (num > 3) {
						num = 1;
					}
				}
				for (int nump : NumPag) {
					System.out.println("Numero de páginas del libro n° " + num++ + " : " + nump);
					if (num > 3) {
						num = 1;
					}
				}

				System.out.println("¿Desea continuar?");
				siono = entrada.next();
				entrada.nextLine();

				switch (siono.toLowerCase()) {

				case "si":
					System.out.println("");
					break;

				case "no":

					System.out.println("Progarma Finalizado");
					cont = true;
					break;
				}

				break;
			case 2:
				System.out.println("Ingrese el titulo del libro que desea buscar:");
				busqueda = entrada.nextLine();
				
				boolean libroencontrado = false;

				for (int i = 0; i < Titulo.length; i++) {
					if (busqueda.equalsIgnoreCase(Titulo[i])) {
						System.out.println("El libro '" + Titulo[i] + "' fue encontrado. \nAutor: " + Autor[i]+ "\nNumero de Paginas: " + NumPag[i]);
						libroencontrado = true;
					}
		
				}

				if (libroencontrado == false) {
					System.out.println("Libro no encontrado.");
				}
				
				System.out.println("¿Desea continuar?");
				siono = entrada.next();
				entrada.nextLine();

				switch (siono.toLowerCase()) {

				case "si":
					System.out.println("");
					break;

				case "no":

					System.out.println("Progarma Finalizado");
					cont = true;

					break;

				}
				break;
			case 3:
				System.out.println("Programa Finalizado.");
				cont = true;
				break;

			}

		}

	} catch (InputMismatchException e) {
		System.out.println("Error: Tipo de dato incorrecto");
	}
		}

}
