import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Index {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Dados do produto");
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Informaçoes do produto" + produto);
		
		System.out.println();
		System.out.println("Quantos produtos adicionados no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Informaçoes do produto atualizadas" + produto);
		
		
		
		System.out.println();
		System.out.println("Quantos produtos removidos no estoque: ");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		
		System.out.println();
		System.out.println("Informaçoes do produto atualizadas" + produto);
		
		
		
		sc.close();

	}

}
