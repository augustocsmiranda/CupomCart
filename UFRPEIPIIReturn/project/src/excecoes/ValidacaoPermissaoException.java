package excecoes;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ValidacaoPermissaoException extends Exception {

	private static final long serialVersionUID = -1358613909130913619L;
	
	public ValidacaoPermissaoException() {
		Alert popup = new Alert(AlertType.ERROR);
		popup.setHeaderText("");
		popup.setTitle("Erro de permiss�o");
		popup.setContentText("Voc� n�o tem permiss�o para acessar essa p�gina.");
		popup.show();
	}
	
	

	
			
}
