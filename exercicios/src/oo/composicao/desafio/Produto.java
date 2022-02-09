package oo.composicao.desafio;

public class Produto {

	String nome;
	double preco;
	
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString() {
		return this.nome + " - R$ " + this.preco;
	}
}
