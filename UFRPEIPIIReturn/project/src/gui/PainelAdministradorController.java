package gui;

import application.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class PainelAdministradorController {


	@FXML
	private MenuItem menuRelatorio;
	@FXML
	private MenuItem menuAtendimento;
	@FXML
	private MenuItem menuMonitor;
	@FXML
	private MenuItem menuPainelAdm;
	@FXML
	private MenuItem menuProcessos;
	@FXML
	private MenuItem menuManutencao;
	@FXML
	private MenuItem menuGuiche;
	@FXML
	private MenuItem menuLogout;
	@FXML
	private MenuItem exibirDescricao;
	@FXML
	private Button onBtManutencaoFuncionario;
	@FXML
	private Button onBTGerenciamentoGuiches;
	@FXML
	private Button onBTMenuAtendimento;
	@FXML
	private Button onBTCadastroFuncionarios;
	
	

	@FXML
	public void mudarRelatorios() {
		Main.mudarTela("relatorioA");
	}
	@FXML
	public void mudarMonitor() {
		Main.mudarTela("monitor");
	}
	@FXML
	public void mudarPainelAdm() {
		Main.mudarTela("painelAdm");
	}
	@FXML
	public void mudarGuiche() {
		Main.mudarTela("gerenciamentoG");
	}
	@FXML
	public void mudarManutencao() {
		Main.mudarTela("manutencao");
	}
	@FXML
	public void mudarAtendimento() {
		Main.mudarTela("atendimento");
	}
	@FXML
	public void mudarProcessos() {
		Main.mudarTela("processo");
	}
	@FXML
	public void mudarLogin() {
		Main.mudarTela("login");
	}
	@FXML
	public void exibirDescricao() {
		Alert popup = new Alert(AlertType.INFORMATION);
		popup.setHeaderText("");
		popup.setTitle("Descrição do painel do administrador");
		popup.setContentText("");
		popup.show();
	}
	
}
