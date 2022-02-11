package oo.heranca.desafio;

public class Motorista {

	public static void main(String[] args) {
	
		Civic civic = new Civic();		
		Ferrari ferrari = new Ferrari();
		
		for (int i = 0; i < 10; i++) {
			civic.acelerar();	
		}
		
		System.out.println(civic.velocidadeAtual);
		
		for (int i = 0; i < 10; i++) {
			ferrari.acelerar();	
		}
		
		System.out.println(ferrari.velocidadeAtual);
		
		for (int i = 0; i < 10; i++) {
			civic.frear();	
		}
		
		System.out.println(civic.velocidadeAtual);
		
		for (int i = 0; i < 10; i++) {
			ferrari.frear();	
		}
		
		System.out.println(ferrari.velocidadeAtual);
		
	}
	
}
