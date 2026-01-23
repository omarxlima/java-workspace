import java.util.Scanner;

public class ContaAPagar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double resultado;
		
		switch (codigo) {
		case  1: 
			resultado = 4.0 * quantidade;
			break;
		case 2: 
			resultado = 4.5 * quantidade;
			break;
		case 3: 
			resultado = 5.0 * quantidade;
			break;
		case 4: 
			resultado = 2.0 * quantidade;
			break;
		case 5: 
			resultado = 1.5 * quantidade;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + codigo);
		}
		
		System.out.printf("Total: R$ %.2f%n", resultado );

	}

}
