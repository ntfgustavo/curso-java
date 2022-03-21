package oo.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		this(315);
	}
	
	public Ferrari(int velociadeMaxima) {
		super(velociadeMaxima);
		super.delta = 350;
	}
	
//	@Override
//	public void acelerar() {
//		super.acelerar();
//	}
	
}
