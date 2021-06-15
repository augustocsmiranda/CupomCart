package gui;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaAtendimentoController {

	
	@FXML
	private Button BTNprocessos;
	
	
	@FXML
	public void BTNprocessos(ActionEvent event) {
		Main.mudarTela("processo");
	}
	
}
