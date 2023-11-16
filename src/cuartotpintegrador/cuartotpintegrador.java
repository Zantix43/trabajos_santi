package cuartotpintegrador;

import java.util.Scanner;

public class cuartotpintegrador {

	static String nombre[] = new String[3];
	static String apellido[] = new String[3];
	static int numcam[] = new int[3];

	static String nombresup[] = new String[4];
	static String apellidosup[] = new String[4];
	static int numcamsup[] = new int[4];

	public static void IngresarDatos() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Ingrese el nombre del jugador " + (i + 1) + ":");
			nombre[i] = entrada.next();

			System.out.println("Ingrese el apellido del jugador " + (i + 1) + ":");
			apellido[i] = entrada.next();

			System.out.println("Ingrese el numero de camiseta del jugador " + (i + 1) + ":");
			numcam[i] = entrada.nextInt();
		}
	}

	public static void agregarJugador() {
		Scanner entrada = new Scanner(System.in);
		String respuesta;
		boolean respuestainc = false;

		while (respuestainc == false) {
			System.out.println("¿Desea agregar un jugador suplente?");
			respuesta = entrada.next();

			if (respuesta.equalsIgnoreCase("si")) {
				System.arraycopy(nombre, 0, nombresup, 0, nombre.length);
				System.arraycopy(apellido, 0, apellidosup, 0, apellido.length);
				System.arraycopy(numcam, 0, numcamsup, 0, numcam.length);

				System.out.println("Ingrese el nombre del jugador suplente:");
				nombresup[3] = entrada.next();

				System.out.println("Ingrese el apellido del jugador suplente:");
				apellidosup[3] = entrada.next();

				System.out.println("Ingrese el numero de camiseta del jugador suplente:");
				numcamsup[3] = entrada.nextInt();
				
				analizarDatosCuatroJugadores();
			}

			else if (respuesta.equalsIgnoreCase("no")) {
				System.out.println("Ok, continuemos");
				analizarDatosTresJugadores();
				respuestainc = true;
			}

			else {
				System.out.println("Respuesta incorrecta.");
				respuestainc = true;
			}

		}
	}

	public static void analizarDatosTresJugadores() {
		Scanner entrada = new Scanner(System.in);
		String siono;
		int numcam2;
		boolean respuestainc = false;

		while (respuestainc == false) {

			for (int i = 0; i < nombre.length; i++) {
				System.out.println("Nombre del Jugador numero " + (i + 1) + " : " + nombre[i]);
				System.out.println("Apellido del Jugador numero " + (i + 1) + " : " + apellido[i]);
				System.out.println("Numero de camiseta del Jugador numero " + (i + 1) + " : " + numcam[i]);
			}

			System.out.println("¿Los datos son corretos?");
			siono = entrada.next();

			if (siono.equalsIgnoreCase("si")) {
				System.out.println("Ok, programa finalizado");
				respuestainc = true;
			}

			else if (siono.equalsIgnoreCase("no")) {

				System.out.println("¿Que numero de camiseta desea cambiar?");
				numcam2 = entrada.nextInt();

				for (int e = 0; e < nombre.length; e++) {

					if (numcam2 == numcam[e]) {
						System.out.println("Ingrese el cambio de nombre:");
						nombre[e] = entrada.next();

						System.out.println("Ingrese el cambio de apellido:");
						apellido[e] = entrada.next();

						System.out.println("Ingrese el cambio de num de camiseta:");
						numcam[e] = entrada.nextInt();

						for (e = 0; e < nombresup.length; e++) {
							System.out.println("Nombre del Jugador numero " + (e + 1) + " : " + nombre[e]);
							System.out.println("Apellido del Jugador numero " + (e + 1) + " : " + apellido[e]);
							System.out.println("Numero de camiseta del Jugador numero " + (e + 1) + " : " + numcam[e]);
						}
					}

				}
			} else {
				System.out.println("Respuesta Incorrecta.");
				respuestainc = true;
			}
		}
	}
	
	public static void analizarDatosCuatroJugadores() {
		Scanner entrada = new Scanner(System.in);
		String siono;
		int numcam2;
		boolean respuestainc = false;

		while (respuestainc == false) {

			for (int i = 0; i < nombresup.length; i++) {
				System.out.println("Nombre del Jugador numero " + (i + 1) + " : " + nombresup[i]);
				System.out.println("Apellido del Jugador numero " + (i + 1) + " : " + apellidosup[i]);
				System.out.println("Numero de camiseta del Jugador numero " + (i + 1) + " : " + numcamsup[i]);
			}

			System.out.println("¿Los datos son corretos?");
			siono = entrada.next();

			if (siono.equalsIgnoreCase("si")) {
				System.out.println("Ok, programa finalizado.");
				respuestainc = true;
			}

			else if (siono.equalsIgnoreCase("no")) {

				System.out.println("¿Que numero de camiseta desea cambiar?");
				numcam2 = entrada.nextInt();

				for (int e = 0; e < nombresup.length; e++) {

					if (numcam2 == numcamsup[e]) {
						System.out.println("Ingrese el cambio de nombre:");
						nombresup[e] = entrada.next();

						System.out.println("Ingrese el cambio de apellido:");
						apellidosup[e] = entrada.next();

						System.out.println("Ingrese el cambio de num de camiseta:");
						numcamsup[e] = entrada.nextInt();

						for (e = 0; e < nombresup.length; e++) {
							System.out.println("Nombre del Jugador numero " + (e + 1) + " : " + nombresup[e]);
							System.out.println("Apellido del Jugador numero " + (e + 1) + " : " + apellidosup[e]);
							System.out.println("Numero de camiseta del Jugador numero " + (e + 1) + " : " + numcamsup[e]);
						}
					}

				}
			} else {
				System.out.println("Respuesta Incorrecta.");
				respuestainc = true;
			}
		}
	}	

	public static void main(String[] args) {
		IngresarDatos();
		agregarJugador();
	}
}