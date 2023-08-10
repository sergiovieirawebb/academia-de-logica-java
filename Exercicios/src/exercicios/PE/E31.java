package exercicios.PE;

import java.util.Scanner;

public class E31 {

	public static void main(String[] args) {
		/*
		 * Dados três valores A, B e C, em que A e B são números reais e C é um
		 * caractere, pede-se para imprimir o resultado da operação de A por B
		 * se C for um símbolo de operador aritmético; caso contrário deve ser
		 * impressa uma mensagem de operador não definido. Tratar erro de
		 * divisão por zero.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número A: ");
		float A = scanner.nextFloat();

		System.out.print("Digite o número B: ");
		float B = scanner.nextFloat();

		System.out.print("Digite o operador (+, -, *, /): ");
		char C = scanner.next().charAt(0);

		System.out.println(calcular(A, B, C));
		
		scanner.close();
	}

	private static String calcular(float A, float B, char C) {
		String resultado = "Resultado: ";

		switch (C) {
			case '+' :
				resultado += Float.toString(A + B);
				break;
			case '-' :
				resultado += Float.toString(A - B);
				break;
			case '*' :
				resultado += Float.toString(A * B);
				break;
			case '/' :
				if (B != 0) {
					resultado += Float.toString(A / B);
				} else {
					resultado = "Erro: Divisão por zero.";
				}
				break;
			default :
				resultado = "Operador não definido.";
				break;
		}
		
		return resultado;
	}

}
