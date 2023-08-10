package exercicios.PE;

import java.util.Scanner;

public class E26 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso.
		 * Caso o usuário digite um número que não esteja neste intervalo,
		 * exibir a seguinte mensagem: número inválido.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número entre 1 e 5: ");
		int numero = scanner.nextInt();

		String[] numerosPorExtenso = {"Um", "Dois", "Três", "Quatro", "Cinco"};

		if (numero >= 1 && numero <= 5) {
			System.out.println("O número " + numero + " escrito por extenso é: "
					+ numerosPorExtenso[numero - 1]);
		} else {
			System.out.println("Número inválido.");
		}
		
		scanner.close();
	}
}
