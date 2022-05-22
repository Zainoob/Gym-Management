package application;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	Stage window;
	Scene primary;
	Scene Calender;
	@Override
	public void start(Stage primaryStage) {
		try {
			DBHandler ins = new DBHandler();
			ins.Initialize();
			window = primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
			Scene scene =  new Scene(root);
			primaryStage.setTitle("Gym Management");
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
