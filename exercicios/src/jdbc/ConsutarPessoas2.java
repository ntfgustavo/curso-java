package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class ConsutarPessoas2 {
	
	public static void main(String[] args) throws SQLException {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome da pessoa: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ? ";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + nome + "%");		
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			
			pessoas.add(new Pessoa(resultado.getInt("codigo"), resultado.getString("nome")));
			
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}	
		
		entrada.close();
		stmt.close();
		conexao.close();
		
	}
	
}
