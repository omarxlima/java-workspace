package entities;


public class Retangulo {
	public double largura;
	public double altura;
	
	public double area() {
		return this.largura * this.altura;
	}
	
	public double perimetro() {
		return (this.largura + this.altura)* 2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura,2));
	}

}
