package classe;

public class Data {

	// Valores padrão para tipos primitivos
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '\u0000'
	// Estes valores padrões não valem para uma variavel local, variavel local não é inicializada.
	
	// Objetos -> null
	
	
	int dia;
	int mes;
	int ano;

	Data() {
	
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
		
//		int a;
//		
//		a = 0;
//		System.out.println(a);
		
	}
	
	
	Data(int dia, int mes, int ano) {
					
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;	
		
	}

	String obterDataFormatada() {
		
		final String formato = "%d/%d/%d";
		return String.format(formato,  this.dia, mes, ano);
		
	}
	
	void imprimirDataFormatada() {
		
		System.out.println(this.obterDataFormatada());
		
	}
	
	
}
