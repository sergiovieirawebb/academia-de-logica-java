package exercicios.PE;

import java.util.Scanner;

public class E19 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe
		 * o nome e se ela é homem ou mulher. No final informe total de homens e
		 * de mulheres.
		 */

		Scanner scanner = new Scanner(System.in);

		int quantidadePessoas = 2;
		int totalHomens = 0;
		int totalMulheres = 0;

		for (int i = 0; i < quantidadePessoas; i += 1) {
			System.out.print("Digite o nome da pessoa: ");
			String nomePessoa = scanner.nextLine();

			System.out.print(
					"Digite o sexo da pessoa (M para masculino, F para feminino): ");
			String sexoPessoa = scanner.nextLine();

			if (sexoPessoa.equalsIgnoreCase("M")) {
				System.out.println(nomePessoa + " é homem.\n");
				totalHomens += 1;
			} else if (sexoPessoa.equalsIgnoreCase("F")) {
				System.out.println(nomePessoa + " é mulher.\n");
				totalMulheres += 1;
			} else {
				System.out.println(
						"Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.\n");
				i -= 1;
			}
		}

		System.out.println("\nTotal de homens: " + totalHomens);
		System.out.println("Total de mulheres: " + totalMulheres);

		scanner.close();
	}
}
