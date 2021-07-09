package controllers;

import java.util.List;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import model.Processo;

public class ControllerProcesso {

	private IRepositorioGenerico<Processo> repositorioProcesso;
	private static ControllerProcesso instance;
	
	public ControllerProcesso() {
		this.repositorioProcesso = new RepositorioGenerico<>();
	}

	public static ControllerProcesso getInstance() {
		if(instance == null) instance = new ControllerProcesso();
		return instance;
	}
	
	public void salvar(Processo processo) throws Exception {
		repositorioProcesso.salvar(processo);
	}
	
	public List<Processo> listar(){
		return repositorioProcesso.listar();
	}
	
	public void deletar(Processo processo) throws Exception{
		repositorioProcesso.deletar(processo);
	}
	
	public void update(Processo processo) throws Exception {
		repositorioProcesso.update(processo);
	}

	public List<Processo> exibirListaPersonalizada() {
		return null;
	}

	
}
