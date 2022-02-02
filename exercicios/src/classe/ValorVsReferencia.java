package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // Atribui��o por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " - " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribui��o por refer�ncia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataparaValorPadrao(d1); // Passa a refer�ncia do objeto
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	
		int c = 5;
		alterarPrimitivo(c); // Passa uma c�pia da variavel
		System.out.println(c);
		
	}
	
	static void voltarDataparaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
	
}
