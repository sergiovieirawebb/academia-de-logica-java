package exercicios.POO.E03;

public class Main {
	public static void main(String[] args) {
		BombaCombustivel bomba = new BombaCombustivel("gasolina", 12, 20);

		bomba.abastecerPorValor(24);
		bomba.abastecerPorLitro(3);
		bomba.alterarValor(4);
		bomba.alterarCombustivel("Diesel");
		bomba.alterarQuantidadeCombustivel(35);

		System.out.println();
		imprimirDados(bomba);
	}

	private static void imprimirDados(BombaCombustivel bomba) {
		System.out.println("BOMBA DE COMBUSTÍVEL:");
		System.out.println("- tipo combustível: " + bomba.getTipoCombustivel());
		System.out.println("- valor por litro: R$ " + bomba.getValorLitro());
		System.out.println("- quantidade combustível: " + bomba.getQtdCombustivel() + " litros");
	}
}
