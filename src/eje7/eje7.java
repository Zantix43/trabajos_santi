package eje7;

public class eje7 {
	public static void main(String[] args) {
		System.out.println("¿Qué calificación tendrás en el año en la asignatura Laboratorio de algoritmos y estructura de datos?");

		double num_random = (Math.random() * 9);

		int num_redondeado = (int) Math.round(num_random);

		System.out.println("\nTu calificación este año será un: " + num_redondeado);

	}
}
