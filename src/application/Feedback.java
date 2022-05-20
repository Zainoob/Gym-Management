package application;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Sr")
	private int feedbacknum;
	
	private String feedback;
	
	@Column(name="date_Added")
	@Temporal(TemporalType.DATE)
	private Date dateadded;

	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Feedback(int feedbacknum, String feedback, Date dateadded) {
		super();
		this.feedbacknum = feedbacknum;
		this.feedback = feedback;
		this.dateadded = dateadded;
	}


	public int getFeedbacknum() {
		return feedbacknum;
	}
	public void setFeedbacknum(int feedbacknum) {
		this.feedbacknum = feedbacknum;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String fb, Date da) {
		feedback = fb;
		dateadded = da;
		DBHandler ins = new DBHandler();
		ins.FeedbackDBHandler(this);
	}
	public Date getDateadded() {
		return dateadded;
	}
	public void setDateadded(Date dateadded) {
		this.dateadded = dateadded;
	}
	
	

}
