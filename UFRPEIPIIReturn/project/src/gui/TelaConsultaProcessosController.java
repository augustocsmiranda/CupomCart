package gui;

import java.time.LocalDate;
import java.util.List;

import application.Main;
import controllers.ControllerProcesso;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Processo;

public class TelaConsultaProcessosController {

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
	private TextField txtId;
	@FXML
	private TextField txtCliente;
	@FXML
	private DatePicker dpPrimeiraData;
	@FXML
	private DatePicker dpSegundaData;
	
	
	
	@FXML private TableView<Processo> tableProcessos;
    @FXML private TableColumn<Processo, String> columnId;
    @FXML private TableColumn<Processo, String> columnCliente;
    @FXML private TableColumn<Processo, String> columnTipo;
    @FXML private TableColumn<Processo, LocalDate> columnDataAbertura;
    @FXML private TableColumn<Processo, String> columnStatus;
    
    public ControllerProcesso controllerProcesso = new ControllerProcesso();

    @FXML
    public void initialize() {
    	columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
    	columnCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
    	columnTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));  
    	columnDataAbertura.setCellValueFactory(new PropertyValueFactory<>("dataAbertura"));  
    	columnStatus.setCellValueFactory(new PropertyValueFactory<>("status"));  
    	this.atualizarConsultaProcessos(controllerProcesso.listar());
    }
	
    public void atualizarConsultaProcessos(List<Processo> lista) {
		ObservableList<Processo> listaProcessos = FXCollections.observableArrayList();
		listaProcessos.addAll(lista); 
		tableProcessos.setItems(listaProcessos);
		System.out.println(tableProcessos.toString());
	}
	
    
   public void dadosASeremExibidos(String string) {
	   controllerProcesso.exibirListaPersonalizada();
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
