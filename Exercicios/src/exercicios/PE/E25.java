package exercicios.PE;

import java.util.Scanner;

public class E25 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que leia dois números e identifique se são iguais
		 * ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo
		 * que eles são iguais. Caso sejam diferentes, informe qual número é o
		 * maior, e uma mensagem que são diferentes.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();

		if (numero1 == numero2) {
			System.out.println("Os números são iguais.");
		} else {
			System.out.println("Os números são diferentes.");
			
			int maiorNumero = (numero1 > numero2) ? numero1 : numero2;
			System.out.println("O maior número é: " + maiorNumero);
		}
		
		scanner.close();
	}
}
