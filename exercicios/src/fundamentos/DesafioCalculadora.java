package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor!");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo valor!");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a operação que deseja efetuar! Ex.: + - * / %");
		System.out.println("Somente o primeiro caractere digitado será considerado!");
		char operador = entrada.next().charAt(0);
		
		boolean validacao = (operador == '+' || operador == '-' || operador == '*' || operador == '/' || operador == '%');
		
		boolean soma = (operador == '+' && validacao);
		boolean subtracao = (operador == '-' && validacao);
		boolean multiplicacao = (operador == '*' && validacao);
		boolean divisao = (operador == '/' && validacao);
		boolean restoDivisao = (operador == '%' && validacao);
		
		double resultado = soma ? num1 + num2 : 0;
		resultado = subtracao ? num1 - num2 : resultado;
		resultado = multiplicacao ? num1 * num2 : resultado;
		resultado = divisao ? num1 / num2 : resultado;
		resultado = restoDivisao ? num1 % num2 : resultado;
		
		System.out.println(validacao ? "O resultado da operação é " + resultado : "Operador inválido!");
		
		entrada.close();
	}
}
