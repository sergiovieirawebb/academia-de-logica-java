package exercicios.PE;

import java.util.Scanner;

public class E02 {

	private static Scanner scanner;

	public static void main(String[] args) {

		/*
		 * Faça um algoritmo que receba dois números e ao final mostre a soma,
		 * subtração, multiplicação e a divisão dos dois números lidos.
		 */

		scanner = new Scanner(System.in);

		System.out.print("Informe o numero1: ");
		int numero1 = scanner.nextInt();

		System.out.print("Informe o numero2: ");
		int numero2 = scanner.nextInt();

		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;

		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);

		if (numero2 != 0) {
			int divisao = numero1 / numero2;
			System.out.println("Divisão: " + divisao);
		} else {
			System.out.println("Divisão: numero2 não pode ser zero.");
		}

	}

}
