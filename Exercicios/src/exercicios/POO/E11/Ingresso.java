package exercicios.POO.E11;

public class Ingresso {
	/*
	 * Crie uma classe chamada Ingresso, que possui um valor em reais e um mé todo
	 * imprimirValor. Crie uma classe IngressoVIP, que herda de Ingresso e possui um
	 * valor adicional. Crie um mé todo que retorne o valor do ingresso VIP (com o
	 * adicional incluído). Crie um programa para criar as instâncias de Ingresso e
	 * IngressoVIP, mostrando a diferença de preços.
	 */

	private double valor;

	public Ingresso(double valor) {
		setValor(valor);
	}

	public void imprimirValor() {
		System.out.println("ingresso SIMPLES: R$" + valor);
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
