package exercicios.PE;

import java.util.Scanner;

public class E30 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia três valores inteiros distintos e os
		 * escreva em ordem crescente;
		 */

		Scanner scanner = new Scanner(System.in);

		int[] valores = new int[3];

		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
			valores[i] = scanner.nextInt();
		}

		ordenarEmOrdemCrescente(valores);
		
		String numerosEmOrdemCrescente = "";
		
		for (int i = 0; i < valores.length; i++) {
			if(i < valores.length - 1) {
				numerosEmOrdemCrescente += valores[i] + ", ";
			} else {
				numerosEmOrdemCrescente += valores[i] + ".";
			}
		}
		
		System.out.println("Números em ordem crescente: " + numerosEmOrdemCrescente);
		
		scanner.close();
	}

	private static void ordenarEmOrdemCrescente(int[] valores) {
		for (int i = 0; i < valores.length; i += 1) {
			for (int j = 0; j < valores.length; j += 1) {
				if (valores[i] < valores[j]) {
					int aux = valores[i];
					valores[i] = valores[j];
					valores[j] = aux;
				}
			}
		}
	}

}
