package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cupom {

	private String numero;
	private Integer guiche;
	private ArrayList<String> tipoAtendimento = new ArrayList<String>();
	private LocalDateTime horaDeImpressao;
	private boolean cupomChamado;
	
	
	
	public Cupom(String numero, Integer guiche, String tipoAtendimento, LocalDateTime horaDeImpressao,
			boolean cupomChamado) {
		super();
		this.numero = numero;
		this.guiche = guiche;
		this.tipoAtendimento.add(tipoAtendimento);
		this.horaDeImpressao = horaDeImpressao;
		this.cupomChamado = cupomChamado;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Integer getGuiche() {
		return guiche;
	}
	public void setGuiche(Integer guiche) {
		this.guiche = guiche;
	}
	public ArrayList<String> getTipoAtendimento() {
		return tipoAtendimento;
	}
	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento.add(tipoAtendimento);
	}
	public LocalDateTime getHoraDeImpressao() {
		return horaDeImpressao;
	}
	public void setHoraDeImpressao(LocalDateTime horaDeImpressao) {
		this.horaDeImpressao = horaDeImpressao;
	}
	public boolean isCupomChamado() {
		return cupomChamado;
	}
	public void setCupomChamado(boolean cupomChamado) {
		this.cupomChamado = cupomChamado;
	}
	
}
