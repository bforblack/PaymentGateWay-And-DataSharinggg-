package Com.Maven.Project.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Com.Maven.Project.Dao.EmpDao;
import Com.Maven.Project.Pojos.EmpCreationVo;
import Com.Maven.Project.Service.EmpService;
import Com.Maven.Project.model.Employee;

@Service("empService")
@Transactional

public class EmpServiceImplNew implements EmpService {
	private static final Logger logger = Logger.getLogger(EmpServiceImplNew.class); 
	@Autowired
	final EmpDao empDao =null;
	
	public void addEmployee(Employee emp) {
	empDao.addEmployee(emp);	
		
	}

	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		empDao.deleteEmployee(id);
	}

	public void UpdateEmployee(Long id) {
		// TODO Auto-generated method stub
		empDao.UpdateEmployee(id);
	}

	public Employee searchEmployee(Long id) {
		// TODO Auto-generated method stub
		return empDao.searchEmployee(id);
	}

	public List<Employee> empList() {
		return empDao.empList();
		
	}

EmpService.EmpCreationService emp1 = new EmpCreationService() {
	
	@Override
	public EmpCreationVo searchEmployee(Long id) {
		
		return null;
	}
	
	@Override
	public void addEmployee(EmpCreationVo emp) {
		// TODO Auto-generated method stub
		Employee employee = null;
		employee.setName(emp.getName());
		employee.setNumber(emp.getNumber());
		employee.setState(emp.getState());
		empDao.addEmployee(employee);
		
		//emp1.setName(empcreationVo.forEach(em->em.getName()));
	
	//emp1.setName(emp.getName());
	}
	
	@Override
	public void UpdateEmployee(Long id) {
		// TODO Auto-generated method stub
		
	}
};
	
	
}

