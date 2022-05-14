package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	
	public static void main(String[] args) {
		
		/*
		 * Mostrar todos os produtos que o desconto é maior que 30%
		 * Mostrar os produtos que o frete é gratis
		 * Map -> nome do produto, preço super promoção
		 */
		
		Produto p1 = new Produto("Régua", 25, 50, 0.1, 25.5);
		Produto p2 = new Produto("Caderno", 50, 150, 0.2, 0);
		Produto p3 = new Produto("Lápis", 75, 250, 0.3, 50);
		Produto p4 = new Produto("Caneta", 100, 350, 0.4, 0);
		Produto p5 = new Produto("Borracha", 125, 450, 0.5, 0);
				
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5); 
		
		Predicate<Produto> descontoMaiorQue30Porc = p -> p.desconto > 0.3;
		Predicate<Produto> freteGratis = p -> p.frete <= 0;
		Function<Produto, String> msg = p -> p.nome + " no valor de " + p.preco * (1 - p.desconto) + ", super promoção!";
		
		produtos.stream().filter(descontoMaiorQue30Porc).filter(freteGratis).map(msg).forEach(System.out::println);
		
	}
	
}
