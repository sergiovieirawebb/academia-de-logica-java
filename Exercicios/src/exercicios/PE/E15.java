package exercicios.PE;

import java.util.Scanner;

public class E15 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba um número e diga se este número está no
		 * intervalo entre 100 e 200.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		if (numero >= 100 && numero <= 200) {
			System.out.println("Número está no intervalo entre 100 e 200.");
		} else {
			System.out.println("Número não está no intervalo entre 100 e 200.");
		}

		scanner.close();

	}

}
