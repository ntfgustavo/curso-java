package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaInterveloException extends RuntimeException {

	private String nomeDoAtributo;
	
	public NumeroForaInterveloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
	}
	
}
