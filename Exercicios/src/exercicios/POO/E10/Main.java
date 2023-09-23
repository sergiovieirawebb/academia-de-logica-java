package exercicios.POO.E10;

import exercicios.POO.E10.JogadorFutebol.Posicao;

public class Main {

	public static void main(String[] args) {
		JogadorFutebol sergio = new JogadorFutebol("Sérgio Vieira", Posicao.MEIO_CAMPO.getValor(), "27/08/1984",
				"Brasileiro", 1.82, 85.0);

		sergio.imprimirDados();
	}
}
