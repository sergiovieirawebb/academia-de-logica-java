package exercicios.PE;

import java.util.Scanner;

public class E09 {

	private static Scanner scanner;

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba um valor que foi depositado e exiba o
		 * valor com rendimento após um mês. Considere fixo o juro da poupança
		 * em 0,07% a. m;
		 */

		float valorDepositado = 0.0f;
		float porcentagemAoMes = 0.07f;
		float rendimentoAposUmMes = 0.0f;
		float valorComRendimento = 0.0f;

		scanner = new Scanner(System.in);

		System.err.println("Informe: ");
		System.out.print("- valor depositado R$: ");
		valorDepositado = scanner.nextFloat();

		rendimentoAposUmMes = valorDepositado * porcentagemAoMes;
		valorComRendimento = valorDepositado + rendimentoAposUmMes;

		System.err.println("Resultado: ");
		System.out.println(
				"- valor com rendimento após um mês: " + valorComRendimento);
	}

}
