package modelo.heranca.desafio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes_Desafio")
public class ClienteDesafio extends Pessoa {

	@Column(length = 50)
	private String email;
	
	@Column(length = 100)
	private String enderaco;
	
	@Column(length = 20)
	private String telefone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnderaco() {
		return enderaco;
	}

	public void setEnderaco(String enderaco) {
		this.enderaco = enderaco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
