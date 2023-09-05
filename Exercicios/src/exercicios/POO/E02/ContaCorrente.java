package exercicios.POO.E02;

/*
 * Crie uma classe para implementar uma ContaCorrente. A classe deve possuir
 * os seguintes atributos: número da conta, nome do correntista e saldo. Os
 * métodos são os seguintes: alterarNome, depósito e saque; No construtor,
 * saldo é opcional, com valor default zero e os demais atributos são
 * obrigatórios.
 */

public class ContaCorrente {
	private int numeroConta;
	private String nomeCorrentista;
	private float saldo;

	public ContaCorrente(int numeroConta, String nomeCorrentista, float saldo) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}
	
	public ContaCorrente(int numeroConta, String nomeCorrentista) {
		this(numeroConta, nomeCorrentista, 0);
	}

	public void alterarNome(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public void depositar(float valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta " + numeroConta + ".");
		} else {
			System.out.println("O valor do depósito deve ser positivo.");
		}

	}

	public void sacar(float valor) {
		if (valor > 0 && valor <= saldo) {
			this.saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso na conta " + numeroConta + ".");
		} else {
			System.out.println("Saldo insuficiente ou valor inválido para saque na conta " + numeroConta + ".");
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public float getSaldo() {
		return saldo;
	}
}
