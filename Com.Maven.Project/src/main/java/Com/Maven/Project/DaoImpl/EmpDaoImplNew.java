package Com.Maven.Project.DaoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.Maven.Project.Dao.EmpDao;

import Com.Maven.Project.model.Employee;
@Repository("empDao")
public class EmpDaoImplNew implements EmpDao {
	@Autowired
	private SessionFactory sessionFactory;

	private static final Logger logger = Logger.getLogger(EmpDaoImplNew.class);

	public void addEmployee(Employee emp) {
		sessionFactory.getCurrentSession().saveOrUpdate(emp);

	}

	public void deleteEmployee(Long id) {
		Employee emp = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
		if (emp != null) {
			sessionFactory.getCurrentSession().delete(emp);
		} else {
			System.out.println("Their Was no such Employee with this id foud");
		}
	}

	public void UpdateEmployee(Long id) {
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
		if (employee != null) {
			sessionFactory.getCurrentSession().update(employee);
		} else {
			System.out.println("Nothing to update");
		}
	}

	public Employee searchEmployee(Long id) {
		Employee emp = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
		return emp;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> empList() {

	List<Employee> emp = sessionFactory.getCurrentSession().createQuery("from Employee").list();
//logger.debug("this is EmpDaoimpl");
		return emp;
	}

}
