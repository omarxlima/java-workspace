import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f ", retangulo.area());
		System.out.printf("AREA = %.2f ", retangulo.perimetro());
		System.out.printf("AREA = %.2f ", retangulo.diagonal());
		
		sc.close();

	}

}
