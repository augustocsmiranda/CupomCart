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
import javafx.scene.control.cell.PropertyValueFactory;
import model.Funcionario;

public class TelaCadastroFuncionariosController {

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
	
	 
    @FXML private TableView<Funcionario> tableFuncionarios;
    private TableColumn<Funcionario, String> columnNome = new TableColumn<Funcionario, String>("Nome");
    private TableColumn<Funcionario, String> columnCPF = new TableColumn<Funcionario, String>("CPF");
    private TableColumn<Funcionario, String> columnFuncao = new TableColumn<Funcionario, String>("Função");
    
    @SuppressWarnings("unchecked")
	@FXML
    public void initialize() {
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        columnFuncao.setCellValueFactory(new PropertyValueFactory<>("funcao"));  
        columnNome.setPrefWidth(200);
        columnCPF.setPrefWidth(150);
        columnFuncao.setPrefWidth(150);
    	this.atualizarListagemdeFuncionarios();
    	
    }

	
	public void atualizarListagemdeFuncionarios() {
		ObservableList<Funcionario> listaFuncionarios = FXCollections.observableArrayList();
        listaFuncionarios.addAll(); 
		this.tableFuncionarios.setItems(listaFuncionarios);
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
