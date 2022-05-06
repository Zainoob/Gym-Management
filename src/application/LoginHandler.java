package application;
import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginHandler {


	@FXML
	Button Login;
	
	
	@FXML
	Button Home;
	
	@FXML
	Button Welcome;
	
	@FXML
	TextArea feedback;

	@FXML
	Button Submit;

	
	@FXML
	Label Prompt=new Label();
	
	@FXML
	Label prompt = new Label();
	
	@FXML
	TextField  user_n = new TextField();
	
	@FXML
	TextField pass_w = new TextField();
	


	//username and password
	String str1 = "a";
	String str2 = "a";

	

    @FXML
    private void LogIn(ActionEvent event) throws IOException {

    	String username = user_n.getText();
        String password = pass_w.getText();
        if (username.equals(str1) && password.equals(str2)) {

        	Parent CalenderView = FXMLLoader.load(getClass().getResource("UserMenu.fxml"));
    		Scene CalenderScene=  new Scene(CalenderView);
    		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    		window.setScene(CalenderScene);
    		window.setTitle("Admin Menu");
    		window.show();
        }
        
        else {
        	prompt.setText("Invalid username or password");
        }     
    }
    @FXML
    private void Member(ActionEvent event) throws IOException {

    	Parent CalenderView = FXMLLoader.load(getClass().getResource("UserMenu.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
    
    @FXML
    private void AdminLoginPage(ActionEvent event) throws IOException {

    	Parent CalenderView = FXMLLoader.load(getClass().getResource("AdminLoginForm.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Login");
		window.show();
    }
    
    @FXML
    private void MemberLoginPage(ActionEvent event) throws IOException {

    	Parent CalenderView = FXMLLoader.load(getClass().getResource("MemberLoginForm.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Login");
		window.show();
    }
    @FXML
    private void  Signup(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("UserMenu.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Main Menu");
		window.show();
    }
    @FXML
    private void  ViewFacilities(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("FacilitiesViewPage.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Main Menu");
		window.show();
    }
    @FXML
    private void  ViewMembershipPlans(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("MembershipPlansViewPage.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Main Menu");
		window.show();
    }
    @FXML
    private void  Give_Feedback(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Give_Feedback.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
    /*private void  AdminPaymentsPage(ActionEvent event) throws IOException {
	Parent CalenderView = FXMLLoader.load(getClass().getResource("AdminPayments.fxml"));*/
    @FXML
    private void  SignupPage(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("SignupForm.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("View Payments");
		window.show();
    }
    
    
    @FXML
    private void Enter_Feedback(ActionEvent event) throws IOException {
    	String feedbackk=feedback.getText();
    	if(feedback.getText().isEmpty())
    	{
    		prompt.setText("*Feedback is empty");
    	}
    	else
    	{
    		Parent CalenderView = FXMLLoader.load(getClass().getResource("FeedbackSuccessful.fxml"));
    		Scene CalenderScene=  new Scene(CalenderView);
    		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    		window.setScene(CalenderScene);
    		window.setTitle("");
    		window.show();
    		//clinic.setFeedback(feedbackk);
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
    
    

}