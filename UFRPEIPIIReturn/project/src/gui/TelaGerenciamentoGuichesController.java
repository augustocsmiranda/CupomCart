package gui;

import application.Main;
import controllers.ControllerGuiche;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Guiche;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;

public class TelaGerenciamentoGuichesController {

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
	private TextField txtIdentificador;
	@FXML
	private TextField txtDisponivel;
	
	@FXML
	private Button atualizarListagemdeGuiches;
	@FXML
	private Button btnCadastrarGuiche;
	
	@FXML private TableView<Guiche> tableGuiche;
	@FXML private TableColumn<Guiche, Integer> columnIdentificador;
	@FXML private TableColumn<Guiche, String> columnDisponivel;
	
	
	
	public static ControllerGuiche controllerguiche = new ControllerGuiche();
	
	@FXML
	public void initialize() {
		columnIdentificador.setCellValueFactory(new PropertyValueFactory<>("identificador"));
		columnDisponivel.setCellValueFactory(new PropertyValueFactory<>("disponivel"));
		columnIdentificador.setPrefWidth(200);
		columnDisponivel.setPrefWidth(150);
		this.atualizarListagemdeGuiches();
	}
	
	private void atualizarListagemdeGuiches() {
		ObservableList<Guiche> listaGuiches = FXCollections.observableArrayList();
		listaGuiches.addAll(controllerguiche.listar());
		tableGuiche.setItems(listaGuiches);
	}
	
	@FXML
	public void btnCadastrarGuiche() throws Exception{
		Guiche guiche;
		guiche = new Guiche();
		
		guiche.setIdentificador(Integer.parseInt(this.txtIdentificador.toString()));
		guiche.setDisponivel(this.txtDisponivel.toString());
		
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
		popup.setContentText("Aqui o Administrador poderá gerencia os guichês do cartório. Os guichês poderão ser criados, removidos, ou ter seu status alterado.");
		popup.show();
	}
	
	public void adicionarGuiche() {
		//TODO Método para a adição de novos guichês
	}
	
	public void removerGuiche() {
		//TODO Método para a remoção de guichês
	}
	
	public void alterarStatus() {
		//TODO Função para mopdificar o status do guichê selecionado
	}
	
}
