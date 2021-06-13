package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
		
			primaryStage.setTitle("GerServCart");
			Parent inicial = FXMLLoader.load(getClass().getResource("../application/mainScene.fxml"));
			Scene scene = new Scene(inicial,500,500);
			primaryStage.getIcons().add(new Image("file:///D:/Programming/IP2/GerServCart/UFRPEIPIIReturn/project/src/application/iconeApp.png"));
			
		//	scene.getStylesheets().add("application.css");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
