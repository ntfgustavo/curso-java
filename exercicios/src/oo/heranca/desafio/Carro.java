package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		
		if (this.velocidadeAtual + getDelta() > this.VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += getDelta();
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;	
		} else {
			this.velocidadeAtual = 0;	
		}		
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h.";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
