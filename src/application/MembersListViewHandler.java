package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MembersListViewHandler implements Initializable{

    @FXML
    private TableColumn<Member, Long> CNICColumn;

    @FXML
    private TableColumn<Member,String> PhoneColumn;

    @FXML
    private TableView<Member> PersonView;


    @FXML
    private TableColumn<Member, Integer> MemberIDColumn;

    @FXML
    private TableColumn<Member,String> NameColumn;

    @FXML
    private TableColumn<Member, Integer> AgeColumn;

    @FXML
    private Label titleLabel;
    
    DBHandler db=new DBHandler();

    @Override
    public void initialize(URL location, ResourceBundle resources) {	
    	
		ObservableList<Member> person = FXCollections.observableArrayList(db.FetchAllMembers());
        MemberIDColumn.setCellValueFactory(new PropertyValueFactory<>("memberID"));
        AgeColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        CNICColumn.setCellValueFactory(new PropertyValueFactory<>("cnic"));
        PhoneColumn.setCellValueFactory(new PropertyValueFactory<>("PhoneNo"));
        
        PersonView.setItems(person);
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
