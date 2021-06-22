package gui;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Funcionario;

public class TelaManutencaoFuncionariosController {


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
	private Button BTNEditarFuncionario;
	
	 @FXML
	 private TableView<Funcionario> tableFuncionarios;
     private TableColumn<Funcionario, String> columnNome = new TableColumn<Funcionario, String>("Nome");
     private TableColumn<Funcionario, String> columnCPF = new TableColumn<Funcionario, String>("CPF");
     private TableColumn<Funcionario, String> columnFuncao = new TableColumn<Funcionario, String>("Função");
    
    ObservableList<Funcionario> listaFuncionarios = FXCollections.observableArrayList();
	    
	
	 @FXML
	 public void BTNEditarFuncionario(ActionEvent event) {
		
    	if (tableFuncionarios.getSelectionModel().isEmpty()) {
			Alert branco = new Alert(Alert.AlertType.ERROR);
			branco.setTitle("Erro");
			branco.setHeaderText("Selecione um funcionário para poder edita-lo.");
			branco.show();
		} 
	}
	    

	
	
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
	
}
