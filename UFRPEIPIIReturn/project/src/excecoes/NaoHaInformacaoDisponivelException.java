package excecoes;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class NaoHaInformacaoDisponivelException extends Exception{

	private static final long serialVersionUID = 5540178931629931596L;
	
	public NaoHaInformacaoDisponivelException() {
			Alert popup = new Alert(AlertType.INFORMATION);
			popup.setHeaderText("");
			popup.setTitle("Informação Indisponível");
			popup.setContentText("Não há informação disponível para os parâmetros informados.");
			popup.show();
		
	}
	
	

}
