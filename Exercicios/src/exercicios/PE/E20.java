package exercicios.PE;

import java.util.Scanner;

public class E20 {
	public static void main(String[] args) {
		/*
		 * A concessionária de veículos “CARANGO VELHO” está vendendo os seus
		 * veículos com desconto. Faça um algoritmo que calcule e exiba o valor
		 * do desconto e o valor a ser pago pelo cliente de vários carros. O
		 * desconto deverá ser calculado de acordo com o ano do veículo. Até
		 * 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja
		 * continuar calculando desconto até que a resposta seja: “(N) Não”.
		 * Informar total de carros com ano até 2000 e total geral.
		 */

		Scanner scanner = new Scanner(System.in);

		char desejaContinuar = 'S';
		int totalCarrosAnoAte2000 = 0;
		int totalGeralCarros = 0;

		while (desejaContinuar == 'S' || desejaContinuar == 's') {
			System.out.print("Digite o ano do veículo: ");
			int anoVeiculo = scanner.nextInt();

			float percentualDesconto;
			if (anoVeiculo <= 2000) {
				percentualDesconto = 0.12f;
				totalCarrosAnoAte2000 += 1;
			} else {
				percentualDesconto = 0.07f;
			}

			System.out.print("Digite o valor do veículo: ");
			float valorVeiculo = scanner.nextFloat();

			float valorDesconto = valorVeiculo * percentualDesconto;
			float valorPagoPeloCliente = valorVeiculo - valorDesconto;
			
			totalGeralCarros += 1;

			System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
			System.out.printf("Valor a ser pago pelo cliente: R$ %.2f%n",
					valorPagoPeloCliente);

			System.out.print(
					"\nDeseja continuar calculando desconto? (S) Sim, (N) Não: ");
			desejaContinuar = scanner.next().charAt(0);
		}

		System.out.println(
				"\nTotal de carros com ano até 2000: " + totalCarrosAnoAte2000);
		System.out.println("Total geral de carros: " + totalGeralCarros);

		scanner.close();
	}
}
