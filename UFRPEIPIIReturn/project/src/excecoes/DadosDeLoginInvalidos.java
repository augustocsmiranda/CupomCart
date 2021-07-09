package excecoes;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DadosDeLoginInvalidos extends Exception {

	private static final long serialVersionUID = -6849212128458619680L;
	
	public DadosDeLoginInvalidos() {
		
		Alert popup = new Alert(AlertType.ERROR);
		popup.setHeaderText("");
		popup.setTitle("Erro de login");
		popup.setContentText("Campo login ou senha inválido. Tende novamente.");
		popup.show();
	
	}
	

}
