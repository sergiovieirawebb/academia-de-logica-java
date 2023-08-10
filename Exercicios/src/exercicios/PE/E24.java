package exercicios.PE;

import java.util.Scanner;

public class E24 {
	
	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba “N” números e mostre positivo, negativo
		 * ou zero para cada número.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de números (N): ");
		int n = scanner.nextInt();
		
		System.out.println();

		for (int i = 0; i < n; i += 1) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			float numero = scanner.nextFloat();
			checarNumero(numero);
		}

		scanner.close();
	}

	private static void checarNumero(float numero) {
		if (numero > 0) {
			System.out.println(numero + " é positivo.");
		} else if (numero < 0) {
			System.out.println(numero + " é negativo.");
		} else {
			System.out.println(numero + " é zero.");
		}
		
		System.out.println();
	}
}
