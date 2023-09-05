package exercicios.POO.E06;

public class Fatura {
	/*
	 * Crie uma classe chamada Invoice que possa ser utilizado por uma loja de
	 * suprimentos de informática para representar uma fatura de um item vendido na
	 * loja. Uma fatura deve incluir as seguintes informações como atributos:
	 * 
	 * - a. o número do item faturado
	 * - b. a descrição do item
	 * - c. a quantidade comprada do item
	 * - d. o preço unitário do item
	 * 
	 * Sua classe deve ter um construtor que inicialize os quatro atributos. Se a
	 * quantidade não for positiva, ela deve ser configurada como 0. Se o preço por
	 * item não for positivo ele deve ser configurado como 0.0. Forneça os métodos
	 * getters e setters para cada variável de instância. Além disso, forneça um
	 * método chamado getInvoiceAmount que calcula o valor da fatura (isso é,
	 * multiplica a quantidade pelo preço por item) e depois retorna o valor como um
	 * double. Escreva um aplicativo de teste que demonstra as capacidades da classe
	 * Invoice.
	 */

	private String numeroItem;
	private String descricaoItem;
	private int quantidadeItem;
	private double precoUnitarioItem;

	public Fatura(String numeroItem, String descricaoItem, int quantidadeItem, double precoUnitarioItem) {
		this.setNumeroItem(numeroItem);
		this.setDescricaoItem(descricaoItem);
		this.setQuantidadeItem(quantidadeItem);
		this.setPrecoUnitarioItem(precoUnitarioItem);
	}

	public double calcularValorFatura() {
		return quantidadeItem * precoUnitarioItem;
	}

	public void imprimirDados() {
		System.out.println("Número: " + numeroItem);
		System.out.println("Descrição: " + descricaoItem);
		System.out.println("Quantidade: " + quantidadeItem);
		System.out.println("Preço unitário: R$ " + precoUnitarioItem);
		System.out.println("Total Fatura: R$ " + calcularValorFatura());
	}

	public String getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(String numeroItem) {
		this.numeroItem = numeroItem;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public int getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem < 0 ? 0 : quantidadeItem;
	}

	public double getPrecoUnitarioItem() {
		return precoUnitarioItem;
	}

	public void setPrecoUnitarioItem(double precoUnitarioItem) {
		this.precoUnitarioItem = precoUnitarioItem < 0 ? 0.0 : precoUnitarioItem;
	}
}
