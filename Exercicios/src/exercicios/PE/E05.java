package exercicios.PE;

import java.util.Scanner;

public class E05 {

	private static Scanner scanner;

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia o nome de um aluno e as notas das três
		 * provas que ele obteve no semestre. No finalinformar o nome do aluno e
		 * a sua média (aritmética).
		 */

		String nomeAluno = null;
		int qtdProvas = 3;
		float somaNotas = 0.0f;
		float mediaProvas = 0.0f;

		scanner = new Scanner(System.in);
		System.err.println("Informe:");

		System.out.print("- nome do aluno: ");
		nomeAluno = scanner.nextLine();

		for (int i = 1; i <= qtdProvas; i += 1) {
			System.out.print("- nota da prova " + i + ": ");
			somaNotas += scanner.nextFloat();
		}

		mediaProvas = somaNotas / qtdProvas;

		System.err.println("\nResultado:");
		System.out.println("- nome do aluno: " + nomeAluno);
		System.out.println("- média das provas: " + mediaProvas);

	}

}
