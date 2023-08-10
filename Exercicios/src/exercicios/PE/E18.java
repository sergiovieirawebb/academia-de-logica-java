package exercicios.PE;

import java.util.Scanner;

public class E18 {
	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem
		 * informando “maior de idade” e “menor de idade” para cada pessoa.
		 * Considere a idade a partir de 18 anos como maior de idade.
		 */

		Scanner scanner = new Scanner(System.in);

		int quantidadePessoas = 3;
		int maiorDeIdade = 18;

		for (int i = 0; i < quantidadePessoas; i += 1) {
			System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
			int idadePessoa = scanner.nextInt();

			if (idadePessoa > 0) {
				if (idadePessoa >= maiorDeIdade) {
					System.out.println("Maior de idade.\n");
				} else {
					System.out.println("Menor de idade.\n");
				}
			} else {
				System.out.println("Idade inválida.\n");
			}

		}

		scanner.close();
	}
}
