package application;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class PaymentViewHandler implements Initializable{

    @FXML
    private TableView<Payment> View;


    @FXML
    private TableColumn<Payment, Integer> id;
    
    @FXML
    private TableColumn<Payment, Integer> amount;
    
    @FXML
    private TableColumn<Payment, Integer> status;
    
    @FXML
    private TableColumn<Payment, Date> datedue;

    @FXML
    private Label titleLabel;
    
    DBHandler db=new DBHandler();

    @Override
    public void initialize(URL location, ResourceBundle resources) {	
    	
		ObservableList<Payment> feed = FXCollections.observableArrayList(db.FetchAllPayments());
        id.setCellValueFactory(new PropertyValueFactory<>("paymentID"));
        amount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        status.setCellValueFactory(new PropertyValueFactory<>("paidStatus"));
        datedue.setCellValueFactory(new PropertyValueFactory<>("dateDue"));
        
        View.setItems(feed);
    }

    @FXML
    private void home(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Admin Menu");
		window.show();
    }
}