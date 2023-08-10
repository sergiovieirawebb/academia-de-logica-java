package exercicios.PE;

import java.util.Scanner;

public class E22 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba o preço de custo e o preço de venda de
		 * 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate
		 * para cada produto. Informe o valor de custo de cada produto, o valor
		 * de venda de cada produto, amédia de preço de custo e do preço de
		 * venda.
		 */

		Scanner scanner = new Scanner(System.in);

		int quantidadeProdutos = 2;

		float[] precoCusto = new float[quantidadeProdutos];
		float[] precoVenda = new float[quantidadeProdutos];
		String[] resultado = new String[quantidadeProdutos];

		// Entrada de dados
		for (int i = 0; i < quantidadeProdutos; i += 1) {
			System.out.println("Informe os dados do produto " + (i + 1) + ": ");

			System.out.print("Preço de custo: R$ ");
			precoCusto[i] = scanner.nextFloat();

			System.out.print("Preço de venda: R$ ");
			precoVenda[i] = scanner.nextFloat();

			System.out.println();

			if (precoCusto[i] == precoVenda[i]) {
				resultado[i] = "Empate";
			} else if (precoCusto[i] > precoVenda[i]) {
				resultado[i] = "Prejuízo";
			} else {
				resultado[i] = "Lucro";
			}
		}

		scanner.close();

		// Saída de dados
		System.out.println("Resultados:\n");
		for (int i = 0; i < quantidadeProdutos; i += 1) {
			System.out.println("PRODUTO " + (i + 1));
			System.out.println("Preco de custo: R$ " + precoCusto[i]);
			System.out.println("Preco de venda: R$ " + precoVenda[i]);
			System.out.println("Resultado: " + resultado[i]);
			System.out.println();
		}

		float mediaPrecoCusto = calcularMedia(precoCusto);
		float mediaPrecoVenda = calcularMedia(precoVenda);

		System.out.println("Média de preço de custo: " + mediaPrecoCusto);
		System.out.println("Média de preço de venda: " + mediaPrecoVenda);

	}

	private static float calcularMedia(float[] valores) {
		float soma = 0;
		for (float valor : valores) {
			soma += valor;
		}
		return soma / valores.length;
	}
}
