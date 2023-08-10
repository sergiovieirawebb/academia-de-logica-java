package exercicios.PE;

import java.util.Scanner;

public class E08 {

	private static Scanner scanner;

	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que efetue a apresentação do valor da conversão
		 * em real (R$) de um valor lido em dólar (US$). O algoritmo deverá
		 * solicitar o valor da cotação do dólar e também a quantidade de
		 * dólares disponíveis com o usuário;
		 */

		float cotacaoDolarEmReais = 0.0f;
		float qtdDolares = 0.0f;
		float conversaoEmReais = 0.0f;

		scanner = new Scanner(System.in);
		System.err.println("Informe: ");

		System.out.print("- quantidade de dolares $: ");
		qtdDolares = scanner.nextFloat();

		System.out.print("- cotação de hoje R$: ");
		cotacaoDolarEmReais = scanner.nextFloat();

		conversaoEmReais = qtdDolares * cotacaoDolarEmReais;
		System.err.println("Resultado: ");
		System.out.println("Conversão: R$ " + conversaoEmReais);

	}

}
