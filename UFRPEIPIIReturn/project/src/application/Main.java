package application;
	
import gui.ScreenManager;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	
	private static Stage stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setScene(ScreenManager.getInstance().getMainScene());
	        primaryStage.setTitle("GerServCart");
	        
	        primaryStage.setResizable(false);
			primaryStage.getIcons().add(new Image("file:///D:/Programming/IP2/GerServCart/UFRPEIPIIReturn/project/src/application/iconeApp.png"));
	        
	        ScreenManager.getInstance().setPrimaryStage(primaryStage);
	        
	        primaryStage.show();
	        
	        stage = primaryStage;
	        
	    //    cenaAtual = primaryStage;
//			primaryStage.setTitle("GerServCart");
//			primaryStage.setResizable(false);
//			Parent inicial = FXMLLoader.load(getClass().getResource("../application/mainScene.fxml"));
//			Scene scene = new Scene(inicial,500,500);
//			primaryStage.getIcons().add(new Image("file:///D:/Programming/IP2/GerServCart/UFRPEIPIIReturn/project/src/application/iconeApp.png"));
//			
//		//	scene.getStylesheets().add("application.css");
//			ScreenManager.getInstance().setPrimaryStage(primaryStage);
//			primaryStage.setScene(scene);
//			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public void teste() {
		
	}
	
	public static void mudarTela(String tela) {
		switch (tela) {
	case "cadastro":
		stage.setScene(ScreenManager.getInstance().getCadastroFuncionarios());
		break;
	case "Caixa":
		stage.setScene(ScreenManager.getInstance().getProcessos());
		break;
	case "Mesas":
		stage.setScene(ScreenManager.getInstance().getMainScene());
		break;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
