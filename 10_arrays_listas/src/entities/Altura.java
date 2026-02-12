package entities;

public class Altura {
	private double valor;
	
	public Altura(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public static double calcularMedia(Altura[] alturas) {
		double soma = 0.0;
		
		for (int i = 0; i < alturas.length; i++) {
			soma += alturas[i].getValor();		
			}
		return soma / alturas.length;
	}

}
