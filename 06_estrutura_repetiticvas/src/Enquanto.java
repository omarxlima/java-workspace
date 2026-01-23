import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		
		System.out.println("Digite um numero (0 para encerrar: ");
		numero = sc.nextInt();
		
		while(numero != 0) {
			soma += numero;
			System.out.println("Digite um numero (0 para encerrar: ");
			numero = sc.nextInt();
			
			System.out.println("Soma dos numeros lidos: " + soma);
		}
		
		sc.close();

	}

}
