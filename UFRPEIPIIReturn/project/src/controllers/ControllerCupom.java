package controllers;

import java.util.List;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import model.Cupom;

public class ControllerCupom {
	
	private IRepositorioGenerico<Cupom> repositorioCupons;
	private static ControllerCupom instance;
	
	public ControllerCupom() {
		this.repositorioCupons = new RepositorioGenerico<>();
	}

	public static ControllerCupom getInstance() {
		if(instance == null) instance = new ControllerCupom();
		return instance;
	}
	
	public void salvar(Cupom cupom) throws Exception {
		repositorioCupons.salvar(cupom);
	}
	
	public List<Cupom> listar(){
		return repositorioCupons.listar();
	}
	
	public void deletar(Cupom cupom) throws Exception{
		repositorioCupons.deletar(cupom);
	}
	
	public void update(Cupom cupom) throws Exception {
		repositorioCupons.update(cupom);
	}
	
}
