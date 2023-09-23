package exercicios.POO.E11;

public class IngressoVIP extends Ingresso {
	public IngressoVIP(double valor, double valorAdicional) {
		super(valor + valorAdicional);
	}

	@Override
	public void imprimirValor() {
		System.out.println("ingresso VIP: R$ " + super.getValor());
	}
}
