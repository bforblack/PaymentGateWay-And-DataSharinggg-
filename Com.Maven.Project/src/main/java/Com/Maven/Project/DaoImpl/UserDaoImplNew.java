package Com.Maven.Project.DaoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.Maven.Project.Dao.UserDao;
import Com.Maven.Project.model.LoginPojo;
import Com.Maven.Project.model.User;















@Repository("userDao")
public class UserDaoImplNew implements UserDao {
	private static final Logger logger = Logger.getLogger(UserDaoImplNew.class);

	@Autowired
	private SessionFactory sessionFactory;
	// private final User user;

	/*
	 * @Override public User Login(User u) { Criteria criteria =
	 * SessionFactory.getCurrentSession().createCriteria(User.class);
	 * criteria.add(Expression.eq("Username", u.getUsername()));
	 * criteria.add(Expression.eq("Password", u.getPassword())); User user =
	 * (User)criteria.uniqueResult(); logger.debug("User is about to debug"+user);
	 * return user; return null;
	 * 
	 * }
	 */

	@Override
	public void Register(User u) {
		sessionFactory.getCurrentSession().saveOrUpdate(u);
	}

	/*
	 * @Override public Boolean Login(User u) {
	 * 
	 * return null; }
	 */
	@Override
	public Boolean Login(LoginPojo login) {
		String username = login.getUsername();
		List<User>u1=sessionFactory.getCurrentSession().createQuery("from User where username=:username").setParameter("username", username).list();
		
		//User u1 = (User) sessionFactory.getCurrentSession().createQuery(" FROM User WHERE username =:s");
		/*
		 * Criteria criteria
		 * =sessionFactory.getCurrentSession().createCriteria(User.class);
		 * criteria.add(Expression.eq("Usename", login.getUsername()));
		 * criteria.add(Expression.eq("Password",login.getPassword())); User user =
		 * (User)criteria.uniqueResult();
		 */
		//String Pass = u1.getPassword();

		logger.debug("User Query is executed sucess");
		int k =u1.size();
		if (u1.size()!=0 && u1.get(0).getPassword().equals(login.getPassword())) {
			return true;
		}
		return false;
		// return true;
	}

	

	

}
