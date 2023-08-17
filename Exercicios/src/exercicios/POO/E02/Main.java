package exercicios.POO.E02;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente(1234567, "Sérgio Vieira");
		ContaCorrente conta2 = new ContaCorrente(7654321, "Diana Santos", 500);

		conta1.depositar(230);
		conta2.depositar(230);
		conta1.sacar(30);

		imprimirDados(conta1);
		imprimirDados(conta2);
	}

	private static void imprimirDados(ContaCorrente conta) {
		System.out.println();
		System.out.println("Correntista 1: " + conta.getNomeCorrentista());
		System.out.println("Número da conta: " + conta.getNumeroConta());
		System.out.println("Saldo incial: " + conta.getSaldo());
	}
}
