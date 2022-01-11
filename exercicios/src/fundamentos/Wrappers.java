package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		
		// Integer i = Integer.parseInt(entrada.next());
		Integer i = 10000; // int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 132.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		// System.out.println(("" + bo).toUpperCase()); // Concatenando com uma string vazia converte o falor para string
		
		Character c = '#'; // char
		System.out.println(c + "...");

	}
}
