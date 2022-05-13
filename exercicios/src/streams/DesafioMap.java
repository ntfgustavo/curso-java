package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);		
		
		/* 
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro... "011" => 3
		 * 
		 * Integer.
		 */
		
		Consumer<Integer> print = System.out::println;
		
		Function<Integer, String> strBinaria = numero -> Integer.toBinaryString(numero);
		UnaryOperator<String> inverterStr = str -> new StringBuilder(str).reverse().toString();
		Function<String, Integer> converterParaInteiro = str -> Integer.valueOf(str);

		nums.stream().map(strBinaria).map(inverterStr).map(converterParaInteiro).forEach(print);
		
	}
	
}
