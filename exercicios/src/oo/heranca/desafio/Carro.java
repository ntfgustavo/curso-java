package oo.heranca.desafio;

public class Carro {

	private final int VELOCIDADE_MAXIMA;
	private int velocidadeAtual;
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
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
