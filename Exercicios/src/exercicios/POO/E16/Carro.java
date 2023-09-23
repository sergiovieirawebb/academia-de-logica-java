package exercicios.POO.E16;

public class Carro {
	/*
	 * Construa uma classe para representar um carro. O tanque de combustível do
	 * carro armazena no máximo 50 litros de gasolina. O carro consome 15 km/litro.
	 * Deve ser possível: a. Abastecer o carro com certa quantidade de gasolina; b.
	 * Mover o carro em uma determinada distância (medida em km); c. Retornar a
	 * quantidade de combustível e a distância total percorrida. No programa
	 * principal, crie 2 carros. Abasteça 20 litros no primeiro e 30 litros no
	 * segundo. Desloque o primeiro em 200 km e o segundo em 400 km. Exiba na tela a
	 * distância percorrida e o total de combustível restante para cada um.
	 */

	private final double capacidadeMaximaTanqueCombustivel = 50.0;
	private double tanqueCombustivel;
	private double distanciaPercorrida;

	public void abastecer(double litros) {
		if (litros < 0) {
			System.out.println("O valor de litros não pode ser negativo");
		} else if (tanqueCombustivel + litros > capacidadeMaximaTanqueCombustivel) {
			System.out.println("A capacidade máxima do tanque é de " + capacidadeMaximaTanqueCombustivel + " litros");
		} else {
			tanqueCombustivel += litros;
			System.out.println("Tanque abastecido com " + litros + " litros de combustível");
		}
	}

	public void mover(double quilometros) {
		double quilometrosPorLitro = 15.0;
		double consumoCombustivel = quilometros / quilometrosPorLitro;

		if (quilometros < 0) {
			System.out.println("O valor de quilômetros não pode ser negativo");
		} else if (tanqueCombustivel < consumoCombustivel) {
			System.out.println("Combustível insuficiente para mover o carro");
		} else {
			tanqueCombustivel -= consumoCombustivel;
			distanciaPercorrida += quilometros;
		}
	}

	public void imprimirDados() {
		System.out.println("Distância total percorrida pelo carro: " + distanciaPercorrida + " Km");
		System.out.println(
				"Total de combustível restante no carro: " + String.format("%.2f", tanqueCombustivel) + " Litros");
	}
}
