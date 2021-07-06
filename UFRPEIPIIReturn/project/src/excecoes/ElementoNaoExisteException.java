package excecoes;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ElementoNaoExisteException extends Exception {
	
	private static final long serialVersionUID = 932253834806030845L;

	public ElementoNaoExisteException(Object elemento) {
		
		Alert popup = new Alert(AlertType.ERROR);
		popup.setHeaderText("");
		popup.setTitle("Erro de login");
		popup.setContentText(String.format("O %s n�o existe no banco de dados.", elemento.getClass()));
		popup.show();
	

	}
	
	
	public ElementoNaoExisteException() {
		
		Alert popup = new Alert(AlertType.ERROR);
		popup.setHeaderText("");
		popup.setTitle("Erro de login");
		popup.setContentText(String.format("Dados n�o existem no banco de dados."));
		popup.show();
	

	}

}
