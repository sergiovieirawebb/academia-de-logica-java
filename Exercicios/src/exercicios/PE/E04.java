package exercicios.PE;

import java.util.Scanner;

public class E04 {

	private static Scanner scanner;

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia o nome de um vendedor, o seu salário
		 * fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
		 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
		 * efetuadas, informar o seu nome, o salário fixo e salário no final do
		 * mês.
		 */

		scanner = new Scanner(System.in);

		System.out.print("Nome do vendedor: ");
		String nomeVendedor = scanner.nextLine();

		System.out.print("Salário fixo R$: ");
		float salarioFixo = scanner.nextFloat();

		System.out.print("Total de vendas no mês R$: ");
		float totalVendasMesEmDinheiro = scanner.nextFloat();

		float porcentagemComissaoVendas = 0.15f;
		float salarioFinalMes = salarioFixo
				+ (totalVendasMesEmDinheiro * porcentagemComissaoVendas);

		System.err.println("\nResultado: ");
		System.out.println("- nome do vendedor: " + nomeVendedor);
		System.out.println("- salário fixo: R$ " + salarioFixo);
		System.out.println("- salário final do mês: R$ " + salarioFinalMes);

	}

}
