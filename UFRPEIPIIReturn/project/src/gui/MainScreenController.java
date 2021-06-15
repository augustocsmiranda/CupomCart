package gui;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainScreenController {

	@FXML
	private Button BTNEntrar;
	
	@FXML
	public void apertar(ActionEvent event) {
		Main.mudarTela("cadastro");
	}
	
}
