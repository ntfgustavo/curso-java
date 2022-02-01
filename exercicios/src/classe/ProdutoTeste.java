package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
				
		double precoFianl1 = p1.precoComDesconto();
		double precoFianl2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFianl1 + precoFianl2) / 2; 
		
		System.out.printf("M�dia do carrinho = R$%.2f.", mediaCarrinho); 
		
	}
}
