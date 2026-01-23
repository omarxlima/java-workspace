package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;


public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota FINAL: %.2f%n ", aluno.notaFinal());
		if(aluno.notaFinal() < 60.0) {
			System.out.println("Failed");
			System.out.printf("Falta %.2f POINT%n ", aluno.pontosFaltante());
		}else {
			System.out.println("PASS");
		}
		sc.close();
		

	}

}
