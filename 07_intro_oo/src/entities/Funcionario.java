package entities;


public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salario()
	{
		return this.salarioBruto - this.imposto;
	}
	
	public void salarioComTaxa(double porcentagem) {
		this.salarioBruto += salarioBruto *porcentagem /100.0;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salario());
	}
}
