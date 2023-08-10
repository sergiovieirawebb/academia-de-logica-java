package exercicios.PE;

import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba o preço de custo de um produto e mostre
		 * o valor de venda. Sabe-se que o preço de custo receberá um acréscimo
		 * de acordo com um percentual informado pelo usuário.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite o preço de custo do produto: ");
		float precoCusto = scanner.nextFloat();
		
		System.out.print("Digite o percentual de acréscimo ao custo: ");
		float percentualAcrescimo = scanner.nextFloat() / 100.0f;
		
		float valorVenda = precoCusto * (1 + percentualAcrescimo);
		
		System.out.println("O valor de venda do produto é: R$ " + valorVenda);
		
		scanner.close();
	}
}
