package exercicios.POO.E11;

public class Main {

	public static void main(String[] args) {
		Ingresso ingressoNormal = new Ingresso(10);
		IngressoVIP ingressoVIP = new IngressoVIP(10, 5);

		ingressoNormal.imprimirValor();
		ingressoVIP.imprimirValor();
	}
}
