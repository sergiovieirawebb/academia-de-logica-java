package exercicios.PE;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba um número e mostre uma mensagem caso
		 * este número seja maior que 10.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		float numero = scanner.nextFloat();

		if (numero == 10) {
			System.out.println("Número igual a 10");
		} else {
			if (numero > 10) {
				System.out.println("Maior que 10");
			} else {
				System.out.println("Menor que 10");
			}
		}

		scanner.close();

	}

}
