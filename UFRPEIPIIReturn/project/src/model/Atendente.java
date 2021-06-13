package model;

import java.time.LocalDate;

public class Atendente extends Funcionario {
		
	public Atendente() {
		super(null, null, null, null, null, null);
	}
	public Atendente(String login, String senha, String nome, String cpf, LocalDate dataNascimento, String funcao) {
		super(login, senha, nome, cpf, dataNascimento, funcao);
	}
	
}
