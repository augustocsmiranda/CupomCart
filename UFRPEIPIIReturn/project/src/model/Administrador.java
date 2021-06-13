package model;

import java.time.LocalDate;

public class Administrador extends Funcionario {

	public Administrador() {
		super(null, null, null, null, null, null);
	}
	
	public Administrador(String login, String senha, String nome, String cpf, LocalDate dataNascimento, String funcao) {
		super(login, senha, nome, cpf, dataNascimento, funcao);
	}
	
}
