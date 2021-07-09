 package model;

import java.time.LocalDate;

public class Processo {

	private String numero;
	private LocalDate dataAbertura;
	private String cliente;
	private String descricao;
	private String status;
	private Atendente atendente;

	
	
	public Processo(String numero, LocalDate dataAbertura, String cliente, String descricao, String status,
			Atendente atendente) {
		super();
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.cliente = cliente;
		this.descricao = descricao;
		this.status = status;
		this.atendente = atendente;
	}
	
	public Processo() {
		this.numero = null;
		this.dataAbertura = null;
		this.cliente = null;
		this.descricao = null;
		this.status = null;
		this.atendente = null;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDate getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Atendente getAtendente() {
		return atendente;
	}
	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}
	
}
