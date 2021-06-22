package controllers;

import java.util.List;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import model.Funcionario;

public class ControllerFuncionario {
	
	private IRepositorioGenerico<Funcionario> repositorioFuncionarios;
	private static ControllerFuncionario instance;
	
	private ControllerFuncionario() {
		this.repositorioFuncionarios = new RepositorioGenerico<>();
	}

	public static ControllerFuncionario getInstance() {
		if(instance == null) instance = new ControllerFuncionario();
		return instance;
	}
	
	public void salvar(Funcionario funcionario) throws Exception {
		repositorioFuncionarios.salvar(funcionario);
	}
	
	public List<Funcionario> listar(){
		return repositorioFuncionarios.listar();
	}
	
	public void deletar(Funcionario funcionario) throws Exception{
		repositorioFuncionarios.deletar(funcionario);
	}
	
	public void update(Funcionario funcionario) throws Exception {
		repositorioFuncionarios.update(funcionario);
	}
	

}
