package controllers;

import java.util.List;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import excecoes.CampoInvalidoException;
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
		if(((cupom.getGuiche() == null) || (cupom.getHoraDeImpressao() == null) || (cupom.getNumero()==null) || (cupom.getTipoAtendimento() == null))) {
			throw new CampoInvalidoException("Existem campos inválidos!");
		}
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
