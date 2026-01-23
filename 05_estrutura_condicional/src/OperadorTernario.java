
public class OperadorTernario {

	public static void main(String[] args) {
		//String expressao = (10 > 8) ? "verdadeiro": "falso";
		//System.out.println(expressao);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
		System.out.println(desconto);

	}

}
