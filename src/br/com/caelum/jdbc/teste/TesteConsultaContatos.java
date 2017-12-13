package br.com.caelum.jdbc.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteConsultaContatos {

	public static void main(String[] agrs) {
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = null;
		try {
			contatos = dao.getLista();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}
	}
}
