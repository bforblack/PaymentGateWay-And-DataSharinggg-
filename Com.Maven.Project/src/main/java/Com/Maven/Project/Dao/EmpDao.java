package Com.Maven.Project.Dao;

import java.util.List;

import Com.Maven.Project.Pojos.EmployeeVo;
import Com.Maven.Project.model.Employee;

public interface EmpDao {

	void addEmployee(Employee emp);

	void deleteEmployee(Long id);

	void UpdateEmployee(Long id);

	Employee searchEmployee(Long id);
List<Employee>empList();
 interface EmpDaoVo{
	public void  addEmployeeVo(EmployeeVo employeeVo);
 }

}
