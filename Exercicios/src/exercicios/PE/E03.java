package exercicios.PE;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para determinar o consumo médio de um automóvel
		 * sendo fornecida a distância total percorrida pelo automóvel e o total
		 * de combustível gasto.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe distância percorrida pelo veículo em Km: ");
		float distaciaPercorrida = scanner.nextFloat();

		System.out.print("Informe combustível gasto pelo veículo em Litros: ");
		float totalCombustivelGasto = scanner.nextFloat();

		float consumoMedio = distaciaPercorrida / totalCombustivelGasto;

		System.out.println("Consumo médio do automóvel é " + consumoMedio + " Km/L.");

		scanner.close();
	}
}
