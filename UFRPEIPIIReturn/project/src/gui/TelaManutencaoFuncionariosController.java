package gui;

import java.time.LocalDate;
import java.util.List;

import application.Main;
import controllers.ControllerFuncionario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Administrador;
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
	private MenuItem exibirDescricao;
	@FXML
	private Button btnCadastrarFuncionario;
	@FXML
	private Button atualizarListagemdeFuncionarios;
	
    @FXML private TableView<Funcionario> tableManutencaoFuncionarios = new TableView<Funcionario>();
	@FXML private TableColumn<Funcionario, String> columnNome;
    @FXML private TableColumn<Funcionario, String> columnCPF;
    @FXML private TableColumn<Funcionario, LocalDate> columnDataNascimento;
    
    
    @FXML
    public void initialize() throws Exception {
//    	Funcionario funcionario = new Administrador();
//		funcionario.setNome("Maike");		
//		funcionario.setCpf("12345678987");
//		funcionario.setFuncao("Administreador");
//	    funcionario.setLogin("maike123");
//		funcionario.setSenha("123456");
//    	funcionario.setDataNascimento(LocalDate.of(1996,02,06));
//    	TelaCadastroFuncionariosController.controllerFuncionario.salvar(funcionario);
//	
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        columnDataNascimento.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));  
        columnNome.setPrefWidth(159);
        columnCPF.setPrefWidth(115);
        columnDataNascimento.setPrefWidth(135);
    	this.atualizarListagemdeFuncionarios();
    }

	@FXML
	public void atualizarListagemdeFuncionarios() {
		ObservableList<Funcionario> listaManutencaoFuncionarios = FXCollections.observableArrayList();
		listaManutencaoFuncionarios.addAll(TelaCadastroFuncionariosController.controllerFuncionario.listar()); 
		tableManutencaoFuncionarios.setItems(listaManutencaoFuncionarios);
		System.out.println("Listagem sendo atualizada");
	}

	@FXML
	public void btnCadastrarFuncionario() throws Exception {
		Main.mudarTela("cadastro");
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
	@FXML
	public void exibirDescricao() {
		Alert popup = new Alert(AlertType.INFORMATION);
		popup.setHeaderText("");
		popup.setTitle("Descrição da tela");
		popup.setContentText("Esta tela tem o objetivo de auxiliar o Administrador no gerenciamento dos funcionários do cartório. Possui as funções de editar, remover e cadastrar novos funcionários, assim com a listagem de todos eles.");
		popup.show();
	}

}
