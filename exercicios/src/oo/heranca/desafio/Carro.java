package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual;
	
	void acelerar() {
		this.velocidadeAtual += 5;		
	}
	
	void frear() {
		if(velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;	
		} else {
			this.velocidadeAtual = 0;	
		}		
	}
	
	public String toString() {
		return "Velocidade atual � " + velocidadeAtual + "Km/h.";
	}
	
}
