package application;


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		double[] vetor = new double[numero];
		
		for (int i = 0; i < numero; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < numero; i++) {
			soma += vetor[i];
		}
		
		double avg = soma / numero;
		
		System.out.println("Total" + avg);
		
		
		sc.close();

	}

}
