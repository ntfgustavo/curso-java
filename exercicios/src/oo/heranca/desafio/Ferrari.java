package oo.heranca.desafio;

public class Ferrari extends Carro {

	Ferrari() {
		this(350);
	}
	
	Ferrari(int velociadeMaxima) {
		super(velociadeMaxima);
	}
	
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
	
}
