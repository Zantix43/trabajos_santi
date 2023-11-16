package eje4;

import java.util.Scanner;

public class eje4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int dato, anios, meses, semanas; 
		
		System.out.println("Ingrese Años/Meses/Semanas para calcular el valor en Días:");
		dato = entrada.nextInt();
		
		anios = dato * 365;
		meses = dato * 30;
		semanas = dato * 7;
		
		System.out.println(+dato +" años son: " +anios +" días");
		System.out.println(+dato +" meses son: " +meses +" días");
		System.out.println(+dato +" semanas son: " +semanas +" días");
		
	}

}
