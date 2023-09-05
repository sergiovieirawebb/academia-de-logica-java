package exercicios.POO.E03;

public class BombaCombustivel {
	/*
	 * Crie uma classe para representar uma BombaCombustivel. A classe
	 * BombaCombustivel deve conter os seguintes atributos: tipo de combustível,
	 * valor por litro e quantidade de combustível. Além desses atributos a classes
	 * deve conter os seguintes métodos:
	 * 
	 * - a. abastecerPorValor; //método onde é informado o valor a ser abastecido e
	 * mostra a quantidade de litros que foi colocada no veículo
	 * 
	 * - b. abastecerPorLitro; // método onde é informado a quantidade em litros de
	 * combustível e mostra o valor a ser pago pelo cliente.
	 * 
	 * - c. alterarValor; //altera o valor do litro do combustível.
	 * 
	 * - d. alterarCombustivel; //altera o tipo do combustível.
	 * 
	 * - e. alterarQuantidadeCombustivel; //altera a quantidade de combustível
	 * restante na bomba.
	 */

	private String tipoCombustivel;
	private double valorLitro;
	private double qtdCombustivel;

	public BombaCombustivel(String tipoCombustivel, double valorLitro, double qtdCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.qtdCombustivel = qtdCombustivel;
	}

	public void abastecerPorValor(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido. O valor deve ser maior que zero");
			return;
		}

		double litros = valor / valorLitro;

		if (litros <= qtdCombustivel) {
			this.qtdCombustivel -= litros;
			System.out.println("Você abasteceu " + litros + " litros de " + tipoCombustivel);
		} else {
			System.out.println("Não há combustível suficiente na bomba para abastecer essa quantidade");
		}
	}

	public void abastecerPorLitro(double litros) {
		double valorAPagar = valorLitro * litros;

		if (litros <= qtdCombustivel) {
			this.qtdCombustivel -= litros;
			System.out.println(
					"Você abasteceu " + litros + " litros de " + tipoCombustivel + ". Valor a pagar " + valorAPagar);
		} else {
			System.out.println("Não há combustível suficiente na bomba para abastecer essa quantidade");
		}
	}

	public void alterarValor(double novoValor) {
		if (novoValor <= 0) {
			System.out.println("Valor inválido. O valor deve ser maior que zero");
		} else {
			valorLitro = novoValor;
			System.out.println("Valor por litro de " + tipoCombustivel + "alterado para R$ " + novoValor);
		}
	}

	public void alterarCombustivel(String novoCombustivel) {
		tipoCombustivel = novoCombustivel;
		System.out.println("Tipo de combustível alterado para " + tipoCombustivel);
	}

	public void alterarQuantidadeCombustivel(double novaQtdCombustivel) {
		if (qtdCombustivel <= 0) {
			System.out.println("Quantidade inválida. A quantidade de combustível não pode ser negativa");
		} else {
			qtdCombustivel = novaQtdCombustivel;
			System.out.println("Quantidade de combustível alterada para " + novaQtdCombustivel + " Litros");
		}
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public double getValorLitro() {
		return valorLitro;
	}

	public double getQtdCombustivel() {
		return qtdCombustivel;
	}
}
