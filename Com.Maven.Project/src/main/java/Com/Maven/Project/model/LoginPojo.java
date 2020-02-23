package Com.Maven.Project.model;

import org.apache.log4j.Logger;

public class LoginPojo {
private static final Logger LOGGER = Logger.getLogger(LoginPojo.class);
private String username;
private String password;

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

}
