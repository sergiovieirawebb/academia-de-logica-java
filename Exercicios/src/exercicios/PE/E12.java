package exercicios.PE;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		/*
		 * O custo de um carro novo ao consumidor é a soma do custo de fábrica
		 * mais o percentual do distribuidor e dos impostos aplicados (primeiro
		 * os impostos são aplicados sobre o custo de fábrica, e depois o
		 * percentual do distribuidor sobre o resultado). Supondo que o
		 * percentual do distribuidor seja de 28% e os impostos 45%, escreva um
		 * algoritmo que leia o custo de fábrica de um carro e informe o custo
		 * ao consumidor do mesmo.
		 */

		Scanner scanner = new Scanner(System.in);

		final float PERCENTUAL_IMPOSTOS = 0.45f;
		final float PERCENTUAL_DISTRIBUIDOR = 0.28f;

		System.out.print("Digite o custo de fábrica do carro: ");
		float custoFabrica = scanner.nextFloat();

		float impostos = custoFabrica * PERCENTUAL_IMPOSTOS;
		float custoDistribuidor = custoFabrica + impostos;
		float custoConsumidor = custoDistribuidor
				* (1 + PERCENTUAL_DISTRIBUIDOR);

		System.out.println("O custo ao consumidor é: " + custoConsumidor);

		scanner.close();

	}

}
