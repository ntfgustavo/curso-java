package streams;

public class Produto {
	
	final String nome;
	final double preco;
	final double desconto;
	final double valorFrete;
	
	public Produto(String nome, double preco, double desconto, double frete) {	
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.valorFrete = frete;
	}
	
}
