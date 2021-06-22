package controllers;

import java.util.List;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import model.Guiche;

public class ControllerGuiche {
	
	private IRepositorioGenerico<Guiche> repositorioGuiche;
	private static ControllerGuiche instance;
	
	private ControllerGuiche() {
		this.repositorioGuiche = new RepositorioGenerico<>();
	}

	public static ControllerGuiche getInstance() {
		if(instance == null) instance = new ControllerGuiche();
		return instance;
	}
	
	public void salvar(Guiche guiche) throws Exception {
		repositorioGuiche.salvar(guiche);
	}
	
	public List<Guiche> listar(){
		return repositorioGuiche.listar();
	}
	
	public void deletar(Guiche guiche) throws Exception{
		repositorioGuiche.deletar(guiche);
	}
	
	public void update(Guiche guiche) throws Exception {
		repositorioGuiche.update(guiche);
	}

}
