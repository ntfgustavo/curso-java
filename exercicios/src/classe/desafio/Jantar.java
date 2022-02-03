package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Gustavo Neres", 92);
		
		Comida comida1 = new Comida("Pizza", 1);
		
		Comida comida2 = new Comida("Churrasco", 2);
						
		System.out.println(pessoa.apresentar());
		pessoa.comer(comida1);
				
		System.out.println(pessoa.apresentar());
		pessoa.comer(comida2);
		
		System.out.println(pessoa.apresentar());
		
	}
}
