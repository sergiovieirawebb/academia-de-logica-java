package exercicios.PE;

import java.util.Scanner;

public class E29 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba o número do mês e mostre o mês
		 * correspondente. Valide mês inválido.
		 */

		Scanner scanner = new Scanner(System.in);

		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
				"Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro",
				"Dezembro"};

		System.out.print("Digite o número do mês (1 a 12): ");
		int numMes = scanner.nextInt();

		if (numMes > 0 && numMes <= 12) {
			String mesCorrespondenteAoNum = meses[numMes - 1];
			System.out.println(
					"O mês correspondente: " + mesCorrespondenteAoNum);
		} else {
			System.out.println("Mês inválido. Por favor, digite um número de mês válido (1 a 12)");
		}
		
		scanner.close();
	}
}
