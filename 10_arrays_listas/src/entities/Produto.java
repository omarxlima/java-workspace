package entities;

public class Produto {
	private String nome;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public static double calcularMedia(Produto[] produtos) {
		double soma = 0.0;
		
		for (int i = 0; i < produtos.length; i++) {
			soma += produtos[i].getPreco();
		}
		return soma / produtos.length;
	}
	
}
