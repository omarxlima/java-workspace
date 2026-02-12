package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Altura;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Altura[] alturas = new Altura[n];
		
		for (int i = 0; i < alturas.length; i++) {
			double valor = sc.nextDouble();
			alturas[i] = new Altura(valor);
		}
		double media = Altura.calcularMedia(alturas);
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", media);
		
		sc.close();
	}

}
