package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);		
		
		/* 
		 * 1. N�mero para string bin�ria... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro... "011" => 3

		 */
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioaParaInt = s -> Integer.parseInt(s, 2);
		
		nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioaParaInt).forEach(System.out::println);
		
		
//		Consumer<Integer> print = System.out::println;
//		
//		Function<Integer, String> strBinaria = numero -> Integer.toBinaryString(numero);
//		UnaryOperator<String> inverterStr = str -> new StringBuilder(str).reverse().toString();
//		Function<String, Integer> converterParaInteiro = str -> Integer.valueOf(str); //Errei, deveria ter usado o parseInt
//
//		nums.stream().map(strBinaria).map(inverterStr).map(converterParaInteiro).forEach(print);
//		
	}
	
}
