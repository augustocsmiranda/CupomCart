package gui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import application.Main;
import controllers.ControllerCupom;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Cupom;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class MonitorController {

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
	private Label exibirCupomAtual;
	@FXML
	private Label exibirGuicheAtual;
	@FXML
	private Label exibirUltimo;
	@FXML
	private Label exibirPenultimo;
	@FXML
	private Label exibirAntePenultimo;
	@FXML
	private Button chamarCupom;
	
	private Integer idIncrementalCupons = 0;
	
	private int ordem = 0;
	
	public static ControllerCupom controllerCupons = new ControllerCupom();
	ArrayList<Cupom> ordemChamada = new ArrayList<Cupom>();
	
	
	 public void initialize() throws Exception {
		 
		 Cupom cupom1 = new Cupom("01", 1, "Casamento", LocalDateTime.now(), true);
		 Cupom cupom2 = new Cupom("02", 4, "Reconhecer firma", LocalDateTime.now(), true);
		 Cupom cupom3 = new Cupom("03", 5, "Atestado de óbito", LocalDateTime.now(), true);
		 Cupom cupom4 = new Cupom("04", 2, "Casamento", LocalDateTime.now(), true);
		 Cupom cupom5 = new Cupom("05", 3, "Casamento", LocalDateTime.now(), true);
		 Cupom cupom6 = new Cupom("06", 6, "Casamento", LocalDateTime.now(), true);
		 Cupom cupom7 = new Cupom("07", 1, "Casamento", LocalDateTime.now(), true);
		 Cupom cupom8 = new Cupom("P01", 2, "Casamento", LocalDateTime.now(), true);
		 Cupom cupom9 = new Cupom("08", 3, "Casamento", LocalDateTime.now(), true);
		 Cupom cupom10 = new Cupom("09", 4, "Casamento", LocalDateTime.now(), true);
		 
		 controllerCupons.salvar(cupom1);
		 controllerCupons.salvar(cupom2);
		 controllerCupons.salvar(cupom3);
		 controllerCupons.salvar(cupom4);
		 controllerCupons.salvar(cupom5);
		 controllerCupons.salvar(cupom6);
		 controllerCupons.salvar(cupom7);
		 controllerCupons.salvar(cupom8);
		 controllerCupons.salvar(cupom9);
		 controllerCupons.salvar(cupom10);
	
		 

	 }

	@FXML
	public void chamarCupom() throws InterruptedException {
		
		ordemChamada.addAll(controllerCupons.listar());
		this.exibirCupomAtual.setText(ordemChamada.get(ordem).getNumero());
		this.exibirGuicheAtual.setText(ordemChamada.get(ordem).getGuiche().toString());
		if(ordem > 0) this.exibirUltimo.setText(ordemChamada.get(ordem - 1).getNumero()); 
		else this.exibirUltimo.setText("");
		if(ordem > 1) this.exibirPenultimo.setText(ordemChamada.get(ordem - 2).getNumero());
		else this.exibirPenultimo.setText("");
		if(ordem > 2) this.exibirAntePenultimo.setText(ordemChamada.get(ordem - 3).getNumero());
		else this.exibirAntePenultimo.setText("");
		ordem ++;
		
	}
	
	
	public void gerarCupoom() throws Exception {
		
		idIncrementalCupons++;
		Cupom cupom = new Cupom(idIncrementalCupons.toString(), 2, "Casamento", LocalDateTime.now(), true);
		controllerCupons.salvar(cupom);
		
		//TODO Criação dinâmica de novo cupom usando um pop up para adição de informações adicionais
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
	public void mudarLogin() {
		Main.mudarTela("login");
	}
	@FXML
	public void exibirDescricao() {
		Alert popup = new Alert(AlertType.INFORMATION);
		popup.setHeaderText("");
		popup.setTitle("Descrição da tela");
		popup.setContentText("Essa tela tem a função de exibir o cupom sendo chamado e o últimos 3 cupons chamados até o momento.");
		popup.show();
	}
	
}
