package oo.heranca.desafio;

public class Ferrari extends Carro {

	Ferrari() {
		this(315);
	}
	
	Ferrari(int velociadeMaxima) {
		super(velociadeMaxima);
		super.delta = 350;
	}
	
//	@Override
//	void acelerar() {
//		super.acelerar();
//	}
	
}
