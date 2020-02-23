package Com.Maven.Project.ServiceImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Com.Maven.Project.Dao.UserDao;
import Com.Maven.Project.Service.User_Service;
import Com.Maven.Project.model.LoginPojo;
import Com.Maven.Project.model.User;
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Service("userService")
@Transactional
public class UserServiceImplNew implements User_Service {
	private static final Logger logger = Logger.getLogger(UserServiceImplNew.class);
	@Autowired
	private  UserDao userdao;	
	/*@Override
		public User Login(User u) {
			
		return userdao.Login(u);
		}

		@Override
		public User Registor(User u) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Boolean LoginUnable(User u) {
			
			return userdao.LoginUnable(u);
		}*/
	@Override
	public void Register(User u) {
		userdao.Register(u);
		
	}
	@Override
	public Boolean Login(LoginPojo login) {
		
		return userdao.Login(login);
	}

}
