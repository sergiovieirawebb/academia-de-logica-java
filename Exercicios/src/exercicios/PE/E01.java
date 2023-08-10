package exercicios.PE;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba dois números e exiba o
		 * resultado da sua soma.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o numero1: ");
		int numero1 = scanner.nextInt();

		System.out.print("Digite o numero2: ");
		int numero2 = scanner.nextInt();

		int soma = numero1 + numero2;
		System.out
				.println("Soma de " + numero1 + " + " + numero2 + " = " + soma);

		scanner.close();
	}
}
