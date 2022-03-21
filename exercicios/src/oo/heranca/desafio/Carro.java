package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		
		if (this.velocidadeAtual + delta > this.VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += delta;
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
	
}
