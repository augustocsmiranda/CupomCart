package gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreenManager {

	 private static ScreenManager instance;
	    private Stage primaryStage;
	    private Scene mainScene;
	    private MainScreenController mainScreenController;
	    
	    private Scene cadastroFuncionarios;
	    private TelaCadastroFuncionariosController cadastroFuncionariosController;
	    
	    private Scene atendimento;
	    private TelaAtendimentoController atendimentoController;
	    
	    private Scene processos;
	    private TelaDeProcessosController processosController;
	    
	    private Scene manutencaoFuncionarios;
	    private TelaManutencaoFuncionariosController manutencaoFuncionariosController;
	    
	    private Scene painelAdm;
	    private PainelAdministradorController painelAdmController;

		private Scene monitor;
	    private MonitorController monitorController;
	    
	    private Scene gerenciamentoGuiche;
	    private TelaGerenciamentoGuichesController gerenciamentoGuicheController;
	    
	    private Scene consultaProcessos;
	    private TelaConsultaProcessosController consultaProcessosController;
	    
	    private Scene relatorioAtendimentos;
	    private TelaRelatorioAtendimentosController relatorioAtendimentosController;
	    
	
		private ScreenManager() { 
	        this.initialize(); 
	    }
	    
	    public static ScreenManager getInstance() {
	        if (instance == null) {
	            instance = new ScreenManager();
	        }
	        return instance;
	    }
	    
	    private void initialize() {
	        try {
	        	
	        	FXMLLoader fxmlLoader = new FXMLLoader();
	        	Parent inicial = FXMLLoader.load(getClass().getResource("../gui/mainScene.fxml"));
				this.mainScene = new Scene(inicial,500,500); 
		        this.mainScreenController = (MainScreenController) fxmlLoader.getController();	           
		        
	            fxmlLoader = new FXMLLoader();
	            Parent cadastro = FXMLLoader.load(getClass().getResource("../gui/TelaCadastroFuncionarios.fxml"));
	            this.cadastroFuncionarios = new Scene(cadastro,500,500); 
	            this.cadastroFuncionariosController = (TelaCadastroFuncionariosController) fxmlLoader.getController();
	           
	            fxmlLoader = new FXMLLoader();
	            Parent atendimentoT = FXMLLoader.load(getClass().getResource("../gui/TelaAtendimento.fxml"));
	            this.atendimento = new Scene(atendimentoT,500,500); 
	            this.atendimentoController = (TelaAtendimentoController) fxmlLoader.getController();
	            
	            fxmlLoader = new FXMLLoader();
	            Parent processosT = FXMLLoader.load(getClass().getResource("../gui/TelaDeProcessos.fxml"));
	            this.processos = new Scene(processosT,500,500); 
	            this.processosController = (TelaDeProcessosController) fxmlLoader.getController();
	            
	            fxmlLoader = new FXMLLoader();
	            Parent painel = FXMLLoader.load(getClass().getResource("../gui/PainelAdministrador.fxml"));
	            this.painelAdm = new Scene(painel,500,500); 
	            this.painelAdmController = (PainelAdministradorController) fxmlLoader.getController();
	            
	            fxmlLoader = new FXMLLoader();
	            Parent manutencaoF = FXMLLoader.load(getClass().getResource("../gui/TelaManutencaoFuncionarios.fxml"));
	            this.manutencaoFuncionarios = new Scene(manutencaoF,500,500); 
	            this.manutencaoFuncionariosController = (TelaManutencaoFuncionariosController) fxmlLoader.getController();
	            
	            fxmlLoader = new FXMLLoader();
	            Parent monitorL = FXMLLoader.load(getClass().getResource("../gui/Monitor.fxml"));
	            this.monitor = new Scene(monitorL,500,500); 
	            this.monitorController = (MonitorController) fxmlLoader.getController();
	        
	            fxmlLoader = new FXMLLoader();
	            Parent gerenciamentoGuiches = FXMLLoader.load(getClass().getResource("../gui/TelaGerenciamentoGuiches.fxml"));
	            this.gerenciamentoGuiche = new Scene(gerenciamentoGuiches,500,500); 
	            this.gerenciamentoGuicheController = (TelaGerenciamentoGuichesController) fxmlLoader.getController();
	            
	            fxmlLoader = new FXMLLoader();
	            Parent consulta = FXMLLoader.load(getClass().getResource("../gui/TelaConsultaProcessos.fxml"));
	            this.consultaProcessos = new Scene(consulta,500,500); 
	            this.consultaProcessosController = (TelaConsultaProcessosController) fxmlLoader.getController();
	            
	            fxmlLoader = new FXMLLoader();
	            Parent relatorioT = FXMLLoader.load(getClass().getResource("../gui/TelaRelatorioAtendimentos.fxml"));
	            this.relatorioAtendimentos = new Scene(relatorioT,500,500); 
	            this.relatorioAtendimentosController = (TelaRelatorioAtendimentosController) fxmlLoader.getController();
	 
	          
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

		public Stage getPrimaryStage() {
			return primaryStage;
		}

		public void setPrimaryStage(Stage primaryStage) {
			this.primaryStage = primaryStage;
		}

		public Scene getMainScene() {
			return mainScene;
		}

		public void setMainScene(Scene mainScene) {
			this.mainScene = mainScene;
		}

		public MainScreenController getMainScreenController() {
			return mainScreenController;
		}

		public void setMainScreenController(MainScreenController mainScreenController) {
			this.mainScreenController = mainScreenController;
		}

		public Scene getCadastroFuncionarios() {
			return cadastroFuncionarios;
		}

		public void setCadastroFuncionarios(Scene cadastroFuncionarios) {
			this.cadastroFuncionarios = cadastroFuncionarios;
		}

		public TelaCadastroFuncionariosController getCadastroFuncionariosController() {
			return cadastroFuncionariosController;
		}

		public void setCadastroFuncionariosController(TelaCadastroFuncionariosController cadastroFuncionariosController) {
			this.cadastroFuncionariosController = cadastroFuncionariosController;
		}

		public Scene getAtendimento() {
			return atendimento;
		}

		public void setAtendimento(Scene atendimento) {
			this.atendimento = atendimento;
		}

		public TelaAtendimentoController getAtendimentoController() {
			return atendimentoController;
		}

		public void setAtendimentoController(TelaAtendimentoController atendimentoController) {
			this.atendimentoController = atendimentoController;
		}

		public Scene getProcessos() {
			return processos;
		}

		public void setProcessos(Scene processos) {
			this.processos = processos;
		}

		public TelaDeProcessosController getProcessosController() {
			return processosController;
		}

		public void setProcessosController(TelaDeProcessosController processosController) {
			this.processosController = processosController;
		}

		public static void setInstance(ScreenManager instance) {
			ScreenManager.instance = instance;
		}
	    public Scene getManutencaoFuncionarios() {
			return manutencaoFuncionarios;
		}

		public void setManutencaoFuncionarios(Scene manutencaoFuncionarios) {
			this.manutencaoFuncionarios = manutencaoFuncionarios;
		}

		public TelaManutencaoFuncionariosController getManutencaoFuncionariosController() {
			return manutencaoFuncionariosController;
		}

		public void setManutencaoFuncionariosController(TelaManutencaoFuncionariosController manutencaoFuncionariosController) {
			this.manutencaoFuncionariosController = manutencaoFuncionariosController;
		}

		public Scene getPainelAdm() {
			return painelAdm;
		}

		public void setPainelAdm(Scene painelAdm) {
			this.painelAdm = painelAdm;
		}

		public PainelAdministradorController getPainelAdmController() {
			return painelAdmController;
		}

		public void setPainelAdmController(PainelAdministradorController painelAdmController) {
			this.painelAdmController = painelAdmController;
		}

		public Scene getMonitor() {
			return monitor;
		}

		public void setMonitor(Scene monitor) {
			this.monitor = monitor;
		}

		public MonitorController getMonitorController() {
			return monitorController;
		}

		public void setMonitorController(MonitorController monitorController) {
			this.monitorController = monitorController;
		}

		public Scene getGerenciamentoGuiche() {
			return gerenciamentoGuiche;
		}

		public void setGerenciamentoGuiche(Scene gerenciamentoGuiche) {
			this.gerenciamentoGuiche = gerenciamentoGuiche;
		}

		public TelaGerenciamentoGuichesController getGerenciamentoGuicheController() {
			return gerenciamentoGuicheController;
		}

		public void setGerenciamentoGuicheController(TelaGerenciamentoGuichesController gerenciamentoGuicheController) {
			this.gerenciamentoGuicheController = gerenciamentoGuicheController;
		}

		public Scene getConsultaProcessos() {
			return consultaProcessos;
		}

		public void setConsultaProcessos(Scene consultaProcessos) {
			this.consultaProcessos = consultaProcessos;
		}

		public TelaConsultaProcessosController getConsultaProcessosController() {
			return consultaProcessosController;
		}

		public void setConsultaProcessosController(TelaConsultaProcessosController consultaProcessosController) {
			this.consultaProcessosController = consultaProcessosController;
		}

		public Scene getRelatorioAtendimentos() {
			return relatorioAtendimentos;
		}

		public void setRelatorioAtendimentos(Scene relatorioAtendimentos) {
			this.relatorioAtendimentos = relatorioAtendimentos;
		}

		public TelaRelatorioAtendimentosController getRelatorioAtendimentosController() {
			return relatorioAtendimentosController;
		}

		public void setRelatorioAtendimentosController(TelaRelatorioAtendimentosController relatorioAtendimentosController) {
			this.relatorioAtendimentosController = relatorioAtendimentosController;
		} 
	    
	
}
