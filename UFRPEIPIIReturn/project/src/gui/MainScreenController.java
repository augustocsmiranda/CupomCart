package gui;

import application.Main;
import controllers.ControllerFuncionario;
import excecoes.ValidacaoPermissaoException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.Funcionario;

public class MainScreenController {

	@FXML
	private Button BTNCadastrar;
	@FXML
	private Button BTNEntrar;
	
	ControllerFuncionario controlleFuncionario = new ControllerFuncionario();
	
	@FXML
	public void BTNCadastrar(ActionEvent event) throws Exception {
		validadorAcesso("maike123");
		Main.mudarTela("cadastro");
	}
	@FXML
	public void BTNEntrar(ActionEvent event) {
		Main.mudarTela("atendimento");
		//Main.mudarTela("painelAdm");
	}
	
	
	public void validadorAcesso(String login) throws Exception {
		
		Funcionario funcionario = ControllerFuncionario.getInstance().findByLogin(login);
		
		if (!funcionario.getFuncao().toLowerCase().equals("administrador")) {
			throw new ValidacaoPermissaoException();
		}
	
	}
}


