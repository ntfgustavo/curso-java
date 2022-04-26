package lambdas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
//import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * (1 + 0.85) : 0;
		
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		Function<Double, String> arredondar = preco -> {
			
			DecimalFormat df = new DecimalFormat("0.00");
			
			df.setRoundingMode(RoundingMode.HALF_UP);
			
			return df.format(preco);
						
		};
		
		Function<String, String> formatarPreco = preco -> "R$" + preco;
		
		System.out.println("O preço do " + p.nome + " é " + precoReal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatarPreco).apply(p) + ".");
		

	}
}
