package model;

public class Guiche {

	private Integer identificador;
	//private boolean disponivel;
	private String disponivel;
	
	//Start Aug
	public Guiche() {
		
	}
	
	public Guiche(Integer identificador, String disponivel) {
		this.identificador = identificador;
		this.disponivel = disponivel;
	}
	//End Aug
	
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public String getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
