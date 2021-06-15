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
	            Parent atendimento = FXMLLoader.load(getClass().getResource("../gui/TelaAtendimento.fxml"));
	            this.atendimento = new Scene(atendimento,500,500); 
	            this.atendimentoController = (TelaAtendimentoController) fxmlLoader.getController();
	            
	            fxmlLoader = new FXMLLoader();
	            Parent processos = FXMLLoader.load(getClass().getResource("../gui/TelaDeProcessos.fxml"));
	            this.processos = new Scene(processos,500,500); 
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
	            Parent monitor = FXMLLoader.load(getClass().getResource("../gui/TelaManutencaoFuncionarios.fxml"));
	            this.monitor = new Scene(monitor,500,500); 
	            this.monitorController = (MonitorController) fxmlLoader.getController();
	 
	          
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
	    
	
}
