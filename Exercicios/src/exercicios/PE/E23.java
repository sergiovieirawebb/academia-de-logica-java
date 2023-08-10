package exercicios.PE;

import java.util.Scanner;

public class E23 {
	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba um número e mostre uma mensagem caso
		 * este número seja maior que 80, menor que 25 ou igual a 40.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		float numero = scanner.nextFloat();

		if (numero < 25) {
			System.out.println("Número menor que 25.");
		} else if (numero == 40) {
			System.out.println("Número igual 40.");
		} else if(numero > 80) {
			System.out.println("Número maior que 80.");
		} else {
			System.out.println("Número não é menor que 25, nem igual a 40, e não é maior que 80.");
		}

		scanner.close();
	}
}
