package gui;


import application.Main;
import controllers.ControllerFuncionario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Administrador;
import model.Atendente;
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
	@FXML 
	private TextField txtCPF;
	@FXML
	private TextField txtNome;
	@FXML
	private TextField txtFuncao;
	@FXML
	private TextField txtLogin;
	@FXML
	private TextField txtSenha;
	@FXML
	private Button btnCadastrarFuncionario;
	
	private ControllerFuncionario controllerFuncionario = new ControllerFuncionario();
	
	
	 
    @FXML private TableView<Funcionario> tableFuncionarios;
    @FXML private TableColumn<Funcionario, String> columnNome;
    @FXML private TableColumn<Funcionario, String> columnCPF;
    @FXML private TableColumn<Funcionario, String> columnFuncao;
    
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
        listaFuncionarios.addAll(controllerFuncionario.listar()); 
		this.tableFuncionarios.setItems(listaFuncionarios);
		System.out.println(listaFuncionarios.toString());
	}
	
	@FXML
	public void btnCadastrarFuncionario() throws Exception {
		Funcionario funcionario;
		
		if(txtFuncao.toString().toLowerCase().equals("atendente")) {
			funcionario = new Atendente();
		}else funcionario = new Administrador();		
		
		funcionario.setNome(this.txtNome.getText());
		funcionario.setCpf(this.txtCPF.getText());
		funcionario.setFuncao(this.txtFuncao.getText());
		funcionario.setLogin(this.txtLogin.getText());
		funcionario.setSenha(this.txtSenha.getText());
		//funcionario.setDataNascimento(this.txtSenha.getText());
		controllerFuncionario.salvar(funcionario);
		System.out.println("Pressionado");
    	this.atualizarListagemdeFuncionarios();
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
