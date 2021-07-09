package excecoes;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class NaoHaCamposPreenchidosException extends Exception{

	private static final long serialVersionUID = 4128115441361820264L;
	
	public NaoHaCamposPreenchidosException() {
		Alert popup = new Alert(AlertType.INFORMATION);
		popup.setHeaderText("");
		popup.setTitle("Informação Indisponível");
		popup.setContentText("Nenhum campo foi preenchido. Por favor, preeencher algum parâmetro de busca antes de fazer a consulta.");
		popup.show();
	
}
	

}
