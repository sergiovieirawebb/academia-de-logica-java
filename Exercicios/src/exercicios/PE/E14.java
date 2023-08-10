package exercicios.PE;

import java.util.Scanner;

public class E14 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia dois valores inteiro distintos e
		 * informe qual é o maior.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro valor inteiro: ");
		float valor1 = scanner.nextFloat();

		System.out.print("Digite o segundo valor inteiro: ");
		float valor2 = scanner.nextFloat();

		if (valor1 == valor2) {
			System.out.println("Os valores são iguais.");
		} else {
			if (valor1 > valor2) {
				System.out.println("O maior valor é: " + valor1);
			} else {
				System.out.println("O maior valor é: " + valor2);
			}
		}

		scanner.close();

	}

}
