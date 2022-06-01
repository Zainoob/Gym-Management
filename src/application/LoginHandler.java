package application;
import java.io.IOException;
import java.util.Date;

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
	TextField feedback;

	@FXML
	Button Submit;

	
	@FXML
	Label Prompt=new Label();
	
	@FXML
	Label prompt = new Label();
	
	@FXML
	Label prompt2 = new Label();
	
	@FXML
	TextField  user_n = new TextField();
	
	@FXML
	TextField pass_w = new TextField();
	
	@FXML
	TextField  regID = new TextField();
	
	@FXML
	TextField phone = new TextField();
	
	


	//username and password
	String str1 = "a";
	String str2 = "a";

	private static Gym gym;

	public LoginHandler() {
		gym = gym.getInstance();
	}

    

    @FXML
    private void Enter_Feedback(ActionEvent event) throws IOException {
    	String feedbackk=feedback.getText();
    	LoginController c = new LoginController();
    	Date d = new Date();
    	if(feedback.getText().isEmpty())
    	{
    		Prompt.setText("*Feedback is empty");
    	}
    	else
    	{
    		Prompt.setText("");
    		c.feedback(feedbackk, d);
    		Parent CalenderView = FXMLLoader.load(getClass().getResource("FeedbackSuccessful.fxml"));
    		Scene CalenderScene=  new Scene(CalenderView);
    		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    		window.setScene(CalenderScene);
    		window.setTitle("");
    		window.show();
    	}
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
    private void  SignupPage(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("SignupForm.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("SignUp");
		window.show();
    }
    
    @FXML
    private void  ViewFacilities(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("FacilitiesViewPage.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Facilities");
		window.show();
    }
    @FXML
    private void  ViewMembershipPlans(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("MembershipPlansViewPage.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Membership Plans");
		window.show();
    }
    @FXML
    private void  Give_Feedback(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Give_Feedback.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Feedback Form");
		window.show();
    }
    @FXML
    private void  ViewFeedback(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("FeedbackView.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Feedback View");
		window.show();
    }
    @FXML
    private void AdminLogIn(ActionEvent event) throws IOException {

    	String username = user_n.getText();
        String password = pass_w.getText();
        if (username.equals(str1) && password.equals(str2)) {
        	prompt2.setText("");
        	Parent CalenderView = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
    		Scene CalenderScene=  new Scene(CalenderView);
    		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    		window.setScene(CalenderScene);
    		window.setTitle("Admin Menu");
    		window.show();
        }
        
        else {
        	prompt2.setText("Invalid username or password");
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
    private void  AdminPaymentsPage(ActionEvent event) throws IOException {
	Parent CalenderView = FXMLLoader.load(getClass().getResource("AdminPayments.fxml"));
	Scene CalenderScene=  new Scene(CalenderView);
	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	window.setScene(CalenderScene);
	window.setTitle("View Payments");
	window.show();
    }
    
    @FXML
    private void  LoadAdminCancelPage(ActionEvent event) throws IOException {
	Parent CalenderView = FXMLLoader.load(getClass().getResource("CancelMembershipAdmin.fxml"));
	Scene CalenderScene=  new Scene(CalenderView);
	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	window.setScene(CalenderScene);
	window.setTitle("");
	window.show();
    }
    
    @FXML
    private void  AdminCancelMembership(ActionEvent event) throws IOException {
    	int reg=Integer.parseInt(regID.getText());
		String phon=phone.getText();
		RegistrationController rc= new RegistrationController();
		if(regID.getText().isEmpty() || phone.getText().isEmpty())
    	{
    		prompt2.setText("*Please fill all fields");
    	}
    	else
    	{
    		prompt2.setText("");
    		int check=rc.cancelregistration(phon, reg);
    		if(check==1 ||check==-1)
    		{
		    	Parent HomeView = FXMLLoader.load(getClass().getResource("CancelMembershipAdminSuccessful.fxml"));
				Scene HomeScene=  new Scene(HomeView);
				Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
				window.setScene(HomeScene);
				window.setTitle("Gym Management System");
				window.show();
    		}
    		else
    		{
    			prompt2.setText("");
    			prompt2.setText("Membership not found");
    		}
    	}
    }
    
    
    @FXML
    private void  MembersListView(ActionEvent event) throws IOException {
	Parent CalenderView = FXMLLoader.load(getClass().getResource("MembersListView.fxml"));
	Scene CalenderScene=  new Scene(CalenderView);
	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	window.setScene(CalenderScene);
	window.setTitle("");
	window.show();
    }
	
    @FXML
    private void  PaymentsListView(ActionEvent event) throws IOException {
	Parent CalenderView = FXMLLoader.load(getClass().getResource("PaymentView.fxml"));
	Scene CalenderScene=  new Scene(CalenderView);
	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	window.setScene(CalenderScene);
	window.setTitle("");
	window.show();
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
    private void adminhome(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
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