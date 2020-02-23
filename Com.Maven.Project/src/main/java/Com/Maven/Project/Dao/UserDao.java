package Com.Maven.Project.Dao;

import Com.Maven.Project.model.LoginPojo;
import Com.Maven.Project.model.User;



public interface UserDao {
public void Register(User u);
public Boolean Login (LoginPojo login);
}