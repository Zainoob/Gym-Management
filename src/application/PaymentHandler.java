package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PaymentHandler {
	@FXML
	TextField name=new TextField();
	
	@FXML
	Label alert=new Label();
	  @FXML
	    private void GetPayment(ActionEvent event) throws IOException {
		  
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

}
