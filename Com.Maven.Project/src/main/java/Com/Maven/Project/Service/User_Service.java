
package Com.Maven.Project.Service;

import Com.Maven.Project.model.LoginPojo;
import Com.Maven.Project.model.User;


public interface User_Service {
	public void Register(User u);
	Boolean Login (LoginPojo login);
}
