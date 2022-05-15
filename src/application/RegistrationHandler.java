package application;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrationHandler implements Initializable{

	@FXML
	ComboBox<String> descBox = new ComboBox<String>();
	@FXML
	TextArea feedback;
	@FXML
	TextField name=new TextField();
	@FXML
	TextField age=new TextField();
	@FXML
	TextField cnic=new TextField();
	@FXML
	TextField phoneno=new TextField();
	@FXML
	TextField password=new TextField();
	@FXML
	Label prompt = new Label();
	@FXML
	Label prompt2 = new Label();
	@FXML
	Label prompt21 = new Label();
	@FXML
	Label prompt22 = new Label();
	@FXML
	Label prompt3 = new Label();
	
	public void settexttolabel(int text) {
		prompt3.setText(String.valueOf(text));
	}
	
    @FXML
    private void  Signup(ActionEvent event) throws IOException {
    
    	if (descBox.getValue() == null || phoneno.getText().isBlank()
				|| name.getText().isBlank() || age.getText().isBlank() || cnic.getText().isBlank()
				|| password.getText().isBlank()) {
			prompt2.setText("Please fill in all fields ");
		} 
    	else if(Integer.parseInt(age.getText())<10 ||Integer.parseInt(age.getText())>100)
    	{
    		prompt2.setText("");
    		prompt21.setText("");
    		prompt22.setText("*Enter a valid age");
    	}
    	else if(phoneno.getText().length() != 11 )
    	{
    		prompt2.setText("");
    		prompt21.setText("*Must be 11 digits");
    	}
    	else if(cnic.getText().length() != 13)
    	{
    		prompt21.setText("");
    		prompt2.setText("*Must be 13 digits");
    	}
    	else
    	{
    		prompt2.setText("");
    		prompt21.setText("");
    		prompt22.setText("");
    		int Age = Integer.parseInt(age.getText());
        	String phoneNo = phoneno.getText();
        	String c=cnic.getText();
        	Long Cnic =Long.parseLong(c);
        	String Name=name.getText();
        	String Password=password.getText();
        	String plan=descBox.getValue();
    		int x=193;
    		prompt2.setText("");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("SignUpSuccessful.fxml"));
			Parent HomeView = loader.load();
			RegistrationHandler hand = loader.getController();
			hand.settexttolabel(x);
			Scene HomeScene = new Scene(HomeView);
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(HomeScene);
			window.setTitle("");
			window.show();
    	}
    }
 

    @FXML
    private void userhome(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("UserMenu.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Gym Management System");
		window.show();
    }
  
    
    @FXML
    private void home(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Gym Management System");
		window.show();
    }
    
	@Override
	public void initialize(URL Location, ResourceBundle resources) {

		ObservableList<String> BoxInfo = FXCollections.observableArrayList("Basic", "Standard",
				"Premium");
		descBox.setItems(BoxInfo);
	}


}
