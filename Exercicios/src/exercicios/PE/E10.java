package exercicios.PE;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		/*
		 * A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)
		 * prestações sem juros. Faça um algoritmo que receba um valor de uma
		 * compra e mostre o valor das prestações.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor da compra: ");
		float valorCompra = scanner.nextFloat();

		int numPrestacoes = 5;
		float valorPrestacao = valorCompra / numPrestacoes;

		System.out.println("O valor de cada prestação é: " + valorPrestacao);

		scanner.close();

	}

}
