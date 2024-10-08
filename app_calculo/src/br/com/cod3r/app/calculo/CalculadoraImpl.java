package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {

	private String id = "abc";
	
	private OperacoesAritmeticas opAritmericas = new OperacoesAritmeticas();

	public String getId() {
		return id;
	}

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmericas.soma(nums);
	}
	
	
}
