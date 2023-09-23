package exercicios.POO.E13;

public class Calculadora {
	public void somar(double parcelaA, double parcelaB) {
		double adicao = parcelaA + parcelaB;
		System.out.println(parcelaA + " + " + parcelaB + " = " + adicao);
	}

	public void subtrair(double minuendo, double subtraendo) {
		double resto = minuendo - subtraendo;
		System.out.println(minuendo + " - " + subtraendo + " = " + resto);
	}

	public void multiplicar(double fatorA, double fatorB) {
		double produto = fatorA * fatorB;
		System.out.println(fatorA + " x " + fatorB + " = " + produto);
	}

	public void dividir(double dividendo, double divisor) {
		if (divisor == 0) {
			System.out.println(dividendo + " / " + divisor + " = Não é possível dividir por zero");
			return;
		}
		
		double quociente = dividendo / divisor;
		System.out.println(dividendo + " / " + divisor + " = " + String.format("%.2f", quociente));

	}
}
