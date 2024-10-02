package br.com.cod3r.app.calculo;

import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	private OperacoesAritmeticas opAritmericas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return opAritmericas.soma(nums);
	}
	
	
	
}
