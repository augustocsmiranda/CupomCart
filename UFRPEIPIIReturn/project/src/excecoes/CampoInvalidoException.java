package excecoes;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CampoInvalidoException extends Exception{
	
	private static final long serialVersionUID = 6452276390416179223L;

	public CampoInvalidoException(String campo) {
		
		Alert popup = new Alert(AlertType.ERROR);
		popup.setHeaderText("");
		popup.setTitle("Erro de login");
		popup.setContentText(String.format("O campo %s possui valor inválido.", campo ));
		popup.show();
	
		
	}

}
