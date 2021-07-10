package gui;

import java.time.LocalDate;

import application.Main;
import controllers.ControllerProcesso;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Cliente;
import model.Funcionario;
import model.Processo;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class TelaAtendimentoController {

	
	@FXML
	private Button BTNprocessos;
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
	private MenuItem menuConsulta;
	@FXML
	private MenuItem exibirDescricao;
	@FXML
	private Button chamarCupom;
	
	public static Integer idIncrementalProcesso = 0;
	
	MonitorController monitorController = new MonitorController();
	
	ControllerProcesso controllerProcesso = new ControllerProcesso();
	
	

	@FXML
	public void BTNprocessos(ActionEvent event) {
		Main.mudarTela("processo");
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
		Main.mudarTela("consulta");
	}
	@FXML
	public void mudarConsulta() {
		Main.mudarTela("consulta");
	}
	@FXML
	public void mudarLogin() {
		Main.mudarTela("login");
	}
	public void exibirDescricao() {
		Alert popup = new Alert(AlertType.INFORMATION);
		popup.setHeaderText("");
		popup.setTitle("Descrição da tela");
		popup.setContentText("Dentro dessa tela, é possível adicionar as informações do cliente sendo atendido, para fins de registro que serão adicionados ao histórico de atendimentos.");
		popup.show();
	}
	
	
	@FXML
	public void chamarCupom() throws InterruptedException {
		//TODO Função de chamar cupom dentro da tela de atendimento, utilizando dinamicamente do funcionário que está designado àquele guichê
	}
	
	public void abrirProcesso() throws Exception {
		
		Cliente cliente = new Cliente();
		Processo processo = new Processo();
		processo.setNumero(idIncrementalProcesso.toString());
		processo.setDataAbertura(LocalDate.now());
		processo.setCliente("fulano2");
		processo.setStatus("Aberto");
		controllerProcesso.salvar(processo);
	
		
	}
	
	public void concluir() {
		//TODO Função de concuir o atendimento
	}
	
}
