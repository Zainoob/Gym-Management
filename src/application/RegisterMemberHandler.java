package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterMemberHandler {
	@FXML
	TextField name=new TextField();
	@FXML
	TextField age = new TextField();
	@FXML
	TextField cnic = new TextField();
	@FXML
	TextField email = new TextField();
	
	@FXML
	Button Home;
	
	@FXML
	Label alert=new Label();
	
	@FXML    
	private void RegisterMember(ActionEvent event) throws IOException {
		  
		  	String Name=name.getText();
		  	if(Name.isEmpty())
		  	{
		  		alert.setText("Invalid Input in textfield");
		  	}
		  	else
		  	{
		    	Parent CalenderView = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
				Scene CalenderScene=  new Scene(CalenderView);
				Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
				window.setScene(CalenderScene);
				window.setTitle("");
				window.show();
		  	}
	    }
	  
	@FXML
	private void home(ActionEvent event) throws IOException {
			Parent HomeView = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
			Scene HomeScene = new Scene(HomeView);
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(HomeScene);
			window.setTitle("Main Menu");
			window.show();
		}

}
