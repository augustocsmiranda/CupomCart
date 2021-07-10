package model;

public class Guiche {

	private String identificador;
	//private boolean disponivel;
	private String disponivel;
	
	//Start Aug
	public Guiche() {
		
	}
	
	public Guiche(String identificador, String disponivel) {
		this.identificador = identificador;
		this.disponivel = disponivel;
	}
	//End Aug
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
