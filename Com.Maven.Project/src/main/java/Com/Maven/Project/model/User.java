package Com.Maven.Project.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
@Table(name = "USER_TABLE")
public class User implements Serializable {
	private static final long serialVersionUID = -12389764L;
	private static final Logger logger = Logger.getLogger(User.class);
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long User_id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String username;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false,updatable = false)
	private String createdDate;
	@Column
	private String lastUpdate;
	@Column(nullable=false)
	private String emailId;
	@Column
	private String mobileNumber;
	
	
	
public User() {
	//Date d = new Date();
	if(createdDate==null) {
	this.createdDate=(new Date()).toString();
	setLastUpdate(createdDate);
	}else {
		setLastUpdate((new Date().toString()));
	}
}
	
	public Long getUser_id() {
		return User_id;
	}
	public void setUser_id(Long user_id) {
		User_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		
		
		this.lastUpdate = lastUpdate;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	

}
