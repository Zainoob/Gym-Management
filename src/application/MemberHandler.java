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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class MemberHandler implements Initializable{

		@FXML
		ComboBox<String> descBox = new ComboBox<String>();
		
		@FXML
		TextField  regID = new TextField();
		
		@FXML
		TextField  regID2 = new TextField();
		
		@FXML
		TextField  regID3 = new TextField();
		
		
		@FXML
		TextField phone = new TextField();
	
		DBHandler db=new DBHandler();
		
		@FXML
		TextField  user_n = new TextField();
		
		@FXML
		TextField pass_w = new TextField();
		
		@FXML
		Label prompt = new Label();
		
		@FXML
		Label name = new Label();
		@FXML
		Label age = new Label();
		
		@FXML
		Label id = new Label();
		
		@FXML
		Label cnic = new Label();
		
		@FXML
		Label phoneno = new Label();
		
		@FXML
		Label  Fee = new Label();
		
		@FXML
		Label  pprompt = new Label();
		
		@FXML
		Label  prompt1 = new Label();
		
		@FXML
		Label  prompt2 = new Label();
		
		
		
		
		//username and password
		String str1 = "a";
		String str2 = "a";
		public static int memberid;
		
		
		
		public void settexttolabel(String n,int a, Long cn, String no, int ID) {
			id.setText("Your MemberID is "+String.valueOf(ID));
			age.setText("You are "+String.valueOf(a)+" years old");
			cnic.setText("CNIC = "+String.valueOf(cn));
			name.setText(n);
			phoneno.setText("Phone number = "+no);
		}
		
		
		private static Gym gym;

		public MemberHandler() 
		{
			gym = gym.getInstance();
		}
		
		
		@FXML
		Button payNow= new Button();
		
		public void buttonenable()
		{
			payNow.setVisible(true);
			payNow.setDisable(false);
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
    private void memberhome(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("MemberMenu.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Gym Management System");
		window.show();
    }
	@FXML
    private void LogIn(ActionEvent event) throws IOException {

    	String username = user_n.getText();
        String password = pass_w.getText();
        LoginController c = new LoginController();
        memberid=c.validateUser(username, password);
        //user can enter his own name and password now to enter
        if (memberid>0) {

        	Parent CalenderView = FXMLLoader.load(getClass().getResource("MemberMenu.fxml"));
    		Scene CalenderScene=  new Scene(CalenderView);
    		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    		window.setScene(CalenderScene);
    		window.setTitle("Member Menu");
    		window.show();
        }
        
        else {
        	prompt.setText("Invalid username or password");
        }     
    }
	@FXML
    private void CancelMembership(ActionEvent event) throws IOException {
		
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
    		if(check!=-1)
    		{
		    	Parent HomeView = FXMLLoader.load(getClass().getResource("CancellationSuccessful.fxml"));
				Scene HomeScene=  new Scene(HomeView);
				Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
				window.setScene(HomeScene);
				window.setTitle("Gym Management System");
				window.show();
    		}
    		else if(check==-1)
    		{
    			prompt2.setText("");
        		prompt2.setText("Membership has not been paid for!");
    		}
    		else
    		{
    			prompt2.setText("");
    			prompt2.setText("Mmebership not found");
    		}
    	}
    }
	@FXML
    private void LoadCancelMembershipPage(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("CancelMembership.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Gym Management System");
		window.show();
    }
	@FXML
    private void LoadUpdateMembershipPlan(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("UpdateMembershipPlan.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Gym Management System");
		window.show();
    }
	@FXML
    private void UpdateMembershipPlan(ActionEvent event) throws IOException {
		
		int reg=Integer.parseInt(regID2.getText());
		String plan=descBox.getValue();
		RegistrationController rc= new RegistrationController();
		if(regID2.getText().isEmpty() || descBox.getValue() == null)
    	{
    		prompt1.setText("*Please fill all fields");
    	}
    	else
    	{
    		prompt1.setText("");
			int check=rc.updateregistration(plan, reg);
			if(check>0)
			{
	    	Parent HomeView = FXMLLoader.load(getClass().getResource("UpdateMembershipSuccessful.fxml"));
			Scene HomeScene=  new Scene(HomeView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(HomeScene);
			window.setTitle("Gym Management System");
			window.show();
			}
			else
			{
				prompt1.setText("Registration ID not found!");
			}
    	}
    }
	
	@FXML
    private void MemberProfileView(ActionEvent event) throws IOException {
		ObservableList<Member> person = FXCollections.observableArrayList(db.FetchMemberProfile(memberid));
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MemberProfile.fxml"));
		Parent HomeView = loader.load();
		MemberHandler hand = loader.getController();
		hand.settexttolabel(person.get(0).getName(),person.get(0).getAge(),person.get(0).getCnic(),person.get(0).getPhoneNo(),person.get(0).getMemberID());
		Scene HomeScene = new Scene(HomeView);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Profile");
		window.show();
    }
	@FXML
    private void ExtendMembership(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("UserMenu.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Gym Management System");
		window.show();
    }
	@FXML
    private void PaymentPage(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("PaymentPage.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Gym Management System");
		window.show();
    }
	
	@FXML
	private void getFee(ActionEvent event) throws IOException {

		PaymentController  rc=new PaymentController ();
		int fee = rc.GetFee(Integer.parseInt(regID3.getText()));
		if (fee > 0) {
			Fee.setText("Your payment is " + String.valueOf(fee)+"Rs");
			pprompt.setText("");
			this.buttonenable();
		} else if(fee==0){
			pprompt.setText("*Registration not found");
		}
		else if(fee==-1)
		{
			pprompt.setText("*This registration is already paid for");
		}
	}
	
	@FXML
    private void Payment(ActionEvent event) throws IOException {
    	Parent HomeView = FXMLLoader.load(getClass().getResource("PaymentSuccessful.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Gym Management System");
		window.show();
    }
	@Override
	public void initialize(URL Location, ResourceBundle resources) {
		payNow.setVisible(false);
		payNow.setDisable(true);
		ObservableList<String> BoxInfo = FXCollections.observableArrayList("Basic", "Standard",
				"Premium");
		descBox.setItems(BoxInfo);	
	}
    
}
