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

public class FeedbackListHandler implements Initializable{

    @FXML
    private TableView<Feedback> View;


    @FXML
    private TableColumn<Feedback, Integer> feedbacknum;

    @FXML
    private TableColumn<Feedback,String> feeds;

    @FXML
    private TableColumn<Feedback, Date> dateadded;

    @FXML
    private Label titleLabel;
    
    DBHandler db=new DBHandler();

    @Override
    public void initialize(URL location, ResourceBundle resources) {	
    	
		ObservableList<Feedback> feed = FXCollections.observableArrayList(db.FetchAllFeedback());
        feedbacknum.setCellValueFactory(new PropertyValueFactory<>("feedbacknum"));
        feeds.setCellValueFactory(new PropertyValueFactory<>("feedback"));
        dateadded.setCellValueFactory(new PropertyValueFactory<>("dateadded"));
        
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
