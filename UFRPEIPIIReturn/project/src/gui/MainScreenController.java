package gui;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainScreenController {

	@FXML
	private Button BTNCadastrar;
	@FXML
	private Button BTNEntrar;
	
	@FXML
	public void BTNCadastrar(ActionEvent event) {
		Main.mudarTela("cadastro");
	}
	@FXML
	public void BTNEntrar(ActionEvent event) {
		Main.mudarTela("atendimento");
		//Main.mudarTela("painelAdm");
	}
	
}
