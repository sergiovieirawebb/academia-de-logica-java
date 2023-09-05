package exercicios.POO.E04;

public class Main {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		
		elevador.inicializar(2, 3);
		
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		
		elevador.sair();
		elevador.sair();
		elevador.sair();
		
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.subir();
		
		elevador.descer();
		elevador.descer();
		elevador.descer();
		elevador.descer();
	}

}
