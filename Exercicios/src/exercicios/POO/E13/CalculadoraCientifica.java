package exercicios.POO.E13;

public class CalculadoraCientifica extends Calculadora {
	public void calcularRaizQuadrada(double radicando) {
		if (radicando < 0) {
			System.out.println(
					"Raiz quadrada de " + radicando + " = Não é possível calcular raix quadrada de um número negativo");
			return;
		}

		double raizQuadrada = Math.sqrt(radicando);
		System.out.println("Raiz quadrada de " + radicando + " = " + raizQuadrada);
	}

	public void calcularPotencia(double base, double expoente) {
		double potencia = Math.pow(base, expoente);
		System.out.println("A potência de " + base + " elevado a " + expoente + " = " + potencia);
	}
}
