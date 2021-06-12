package model;

import java.time.LocalDateTime;

public class Cupom {

	private Integer id;
	private Guiche guiche;
	private String tipoAtendimento;
	private LocalDateTime horaDeImpressao;
	private boolean cupomChamado;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Guiche getGuiche() {
		return guiche;
	}
	public void setGuiche(Guiche guiche) {
		this.guiche = guiche;
	}
	public String getTipoAtendimento() {
		return tipoAtendimento;
	}
	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
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
