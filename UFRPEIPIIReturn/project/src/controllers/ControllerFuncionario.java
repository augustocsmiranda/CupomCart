package controllers;

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
	        if (instance == null) {
	            instance = new ControllerFuncionario();
	        }
	        return instance;
	    }
	
	
	
	

}
