package streams;

public class Produto {
	
	final String nome;
	final double saldoAtual;
	final static double estoqueMinimo = 50;
	final static double estoqueMaximo = 100;
	
	final double preco;
	final double desconto;
	final double frete;
	
	public Produto(String nome, double saldoAtual) {	
		this.nome = nome;
		this.saldoAtual = saldoAtual;
		this.preco = 0;
		this.desconto = 0;
		this.frete = 0;
	}
	
	public Produto(String nome, double saldoAtual, double preco, double desconto, double frete) {		
		this.nome = nome;
		this.saldoAtual = saldoAtual;
		this.preco = preco;
		this.desconto = desconto;
		this.frete = frete;
	}
	
}
