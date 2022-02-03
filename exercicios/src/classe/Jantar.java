package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Gustavo Neres", 92);
		
		Comida comida1 = new Comida("Pizza", 1);
		
		Comida comida2 = new Comida("Churrasco", 2);
		
		System.out.println("Antes do Jantar!");
		System.out.printf("%s %.2fKg \n\n", pessoa.nome, pessoa.peso);
		
		System.out.printf("%s jantou %s que aumentou seu peso em %.2fKg \n\n", pessoa.nome, comida1.nome, comida1.peso);
		pessoa.comer(comida1);
				
		System.out.printf("%s %.2fKg \n\n", pessoa.nome, pessoa.peso);
		
		System.out.printf("%s jantou novamente, desta vez %s que aumentou seu peso em %.2fKg \n\n", pessoa.nome, comida2.nome, comida2.peso);
		pessoa.comer(comida2);
		
		System.out.printf("%s %.2fKg \n\n", pessoa.nome, pessoa.peso);
		
		System.out.println("Depois do Jantar!");
		System.out.println("Finalizando o dia com o peso:");
		System.out.printf("%s %.2fKg \n\n", pessoa.nome, pessoa.peso);
		
	}
}
