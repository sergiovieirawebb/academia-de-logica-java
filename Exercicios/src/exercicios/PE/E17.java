package exercicios.PE;

import java.util.Scanner;

public class E17 {
	public static void main(String[] args) {
		/*
		 * Leia 80 números e ao final informar quantos número(s) est(á)ão no
		 * intervalo entre 10 (inclusive) e 150 (inclusive);
		 */

		Scanner scanner = new Scanner(System.in);

		int quantidadeNumeros = 4;
		int limiteInferior = 10;
		int limiteSuperior = 150;

		int numerosNoIntervalo = 0;

		for (int i = 0; i < quantidadeNumeros; i += 1) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			int numero = scanner.nextInt();

			if (numero >= limiteInferior && numero <= limiteSuperior) {
				numerosNoIntervalo += 1;
			}
		}

		System.out.println("\nA quantidade de números entre o intervalo de "
				+ limiteInferior + " e " + limiteSuperior + " é: "
				+ numerosNoIntervalo);

		scanner.close();
	}
}
