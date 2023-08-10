package exercicios.PE;

import java.util.Scanner;

public class E16 {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia o nome e as três notas obtidas por um
		 * aluno durante o semestre. Calcular a sua média (aritmética), informar
		 * o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
		 * Recuperação (media entre 5.1 a 6.9);
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = scanner.nextLine();

		System.out.print("Digite a primeira nota do aluno: ");
		int nota1 = scanner.nextInt();

		System.out.print("Digite a segunda nota do aluno: ");
		int nota2 = scanner.nextInt();

		System.out.print("Digite a terceira nota do aluno: ");
		int nota3 = scanner.nextInt();

		float media = (nota1 + nota2 + nota3) / 3;

		String mencao;
		if (media >= 7) {
			mencao = "Aprovado";
		} else if (media <= 5) {
			mencao = "Reprovado";
		} else {
			mencao = "Recuperação";
		}

		System.out.println("\nNome do aluno: " + nomeAluno);
		System.out.println("Média: " + media);
		System.out.println("Menção: " + mencao);

		scanner.close();
	}
}
