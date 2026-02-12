package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Produto[] produtos = new Produto[n];
		
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Preço: ");
			double preco = sc.nextDouble();
			sc.nextLine();
			
			produtos[i] = new Produto(nome, preco);
		}
		
		double mediaProdutos = Produto.calcularMedia(produtos);
		System.out.printf("AVERAGE PRICE: %.2f%n", mediaProdutos);
		
		sc.close();

	}

}
