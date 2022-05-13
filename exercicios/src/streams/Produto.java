package streams;

public class Produto {
	
	final String nome;
	final double saldoAtual;
	final static double estoqueMinimo = 50;
	final static double estoqueMaximo = 100;
	
	public Produto(String nome, double saldoAtual) {	
		this.nome = nome;
		this.saldoAtual = saldoAtual;	
	}
	
}
