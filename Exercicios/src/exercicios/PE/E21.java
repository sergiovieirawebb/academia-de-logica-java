package exercicios.PE;

import java.util.Scanner;

public class E21 {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo,
		 * idade e saúde) e informe se está apta ou não para cumprir o serviço
		 * militar obrigatório. Informe os totais.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantas pessoas deseja cadastrar?: ");
		int n = scanner.nextInt();
		int totalPessoasAptas = 0;
		int totalPessoasNaoAptas = 0;

		for (int i = 1; i <= n; i += 1) {
			System.out.println("\nDados da pessoa " + i + ":");

			System.out.print("Nome: ");
			String nome = scanner.next();

			System.out.print("Sexo (M/F): ");
			char sexo = scanner.next().charAt(0);

			System.out.print("Idade: ");
			int idade = scanner.nextInt();

			System.out.print("Saúde (Boa/Baixa): ");
			String saude = scanner.next().toLowerCase();

			boolean pessoaApta = verificarAptidao(sexo, idade, saude);

			if (pessoaApta) {
				System.out.println(nome + " está apto(a) para o serviço militar obrigatório.");
				totalPessoasAptas += 1;
			} else {
				System.out.println(nome + " não está apto(a) para o serviço militar obrigatório.");
				totalPessoasNaoAptas += 1;
			}
		}

		System.out.println("\nTotal de pessoas aptas: " + totalPessoasAptas);
		System.out
				.println("Total de pessoas não aptas: " + totalPessoasNaoAptas);

		scanner.close();
	}

	private static boolean verificarAptidao(char sexo, int idade,
			String saude) {
		return (sexo == 'M' || sexo == 'm') && (idade >= 18 && idade <= 45)
				&& saude.equals("boa");
	}
}
