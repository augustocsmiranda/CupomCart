package gui;

import java.time.LocalDate;
import java.util.List;

import application.Main;
import controllers.ControllerProcesso;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
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
	private MenuItem exibirDescricao;
	@FXML
	private TextField txtId;
	@FXML
	private TextField txtCliente;
	@FXML
	private DatePicker dpPrimeiraData;
	@FXML
	private DatePicker dpSegundaData;
	@FXML
	private Button dadosASeremExibidos;
	
	@FXML private TableView<Processo> tableProcessos = new TableView<Processo>();
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
    	columnId.setPrefWidth(66);
        columnCliente.setPrefWidth(122);
        columnTipo.setPrefWidth(81);
        columnDataAbertura.setPrefWidth(177);
        columnStatus.setPrefWidth(113);
        
    }
	
    public void atualizarConsultaProcessos(List<Processo> lista) {
		ObservableList<Processo> listaProcessos = FXCollections.observableArrayList();
		listaProcessos.addAll(lista); 
		tableProcessos.setItems(listaProcessos);
		System.out.println(tableProcessos.toString());
	}
	
   @FXML
   public List<Processo> dadosASeremExibidos() {
	   return controllerProcesso.exibirListaPersonalizada();
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
		popup.setTitle("Descrição do monitor");
		popup.setContentText("Nesta tela será possível realizar a consulta de processos em aberto usando filtro por período, cliente ou id do processo..");
		popup.show();
	}
	
}
