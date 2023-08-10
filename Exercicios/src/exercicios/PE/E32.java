package exercicios.PE;

import java.util.Scanner;

public class E32 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia três valores inteiros e verifique se
		 * eles podem ser os lados de um triângulo. Se forem, informar qual o
		 * tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
		 * 
		 * Propriedade: o comprimento de cada lado de um triângulo é menor do
		 * que a soma dos comprimentos dos outros dois lados.
		 * 
		 * - a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
		 * - b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
		 * - c. Triângulo equilátero é também isóscele;
		 * - d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o 1º valor: ");
		int lado1 = scanner.nextInt();

		System.out.print("Digite o 2º valor: ");
		int lado2 = scanner.nextInt();

		System.out.print("Digite o 3º valor: ");
		int lado3 = scanner.nextInt();

		if (verificarTriangulo(lado1, lado2, lado3)) {

			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero.");
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("Triângulo Isóceles.");
			} else {
				System.out.println("Triângulo Escaleno.");
			}
		} else {
			System.out.println("Os valores não formam um triângulo.");
		}
		
		scanner.close();
	}

	private static boolean verificarTriangulo(int a, int b, int c) {
		return a < b + c && b < a + c && c < a + b;
	}
}
