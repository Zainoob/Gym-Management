package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaymentsHandler {
	
	@FXML
    private void OutstandingPaymentsPage(ActionEvent event) throws IOException {

    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Outstanding Payments");
		window.show();
    }
	@FXML
    private void PaymentsDuePage(ActionEvent event) throws IOException {

    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Payments Due");
		window.show();
    }
	@FXML
    private void PH_home(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Admin Menu");
		window.show();
    }
}

