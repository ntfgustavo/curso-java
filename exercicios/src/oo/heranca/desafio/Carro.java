package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual = 0;
	
	void acelerar() {
		this.velocidadeAtual += 5;		
	}
	
	void frear() {
		this.velocidadeAtual -= 5;
		
		this.velocidadeAtual = this.velocidadeAtual < 0 ?  0 : this.velocidadeAtual; 
		
	}
	
}
