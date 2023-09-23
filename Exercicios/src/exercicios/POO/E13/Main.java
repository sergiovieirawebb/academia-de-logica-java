package exercicios.POO.E13;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

		calculadora.somar(2, 10);
		calculadora.subtrair(2, 10);
		calculadora.multiplicar(2, 10);
		calculadora.dividir(2, 10);
		calculadoraCientifica.calcularRaizQuadrada(4);
		calculadoraCientifica.calcularPotencia(2, 3);
	}
}
