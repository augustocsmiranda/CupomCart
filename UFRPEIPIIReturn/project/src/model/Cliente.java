package model;

import java.time.LocalDate;

public class Cliente {

	private String nome;
	private LocalDate dataNascimento;
	private String formaDeContato;
	private String cpf;
	private Cupom cupom;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getFormaDeContato() {
		return formaDeContato;
	}
	public void setFormaDeContato(String formaDeContato) {
		this.formaDeContato = formaDeContato;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cupom getCupom() {
		return cupom;
	}
	public void setCupom(Cupom cupom) {
		this.cupom = cupom;
	}
	
}
