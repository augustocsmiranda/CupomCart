package excecoes;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ItemNaoSelecionadoException extends Exception{

	private static final long serialVersionUID = 8077823572497961696L;
	
	public ItemNaoSelecionadoException() {
		Alert popup = new Alert(AlertType.ERROR);
		popup.setHeaderText("");
		popup.setTitle("Erro ao realizar ação");
		popup.setContentText("Por favor, selecione um item para realizar essa ação.");
		popup.show();
	}
	
	

}
