package Com.Maven.Project.Service;

import java.util.List;

import Com.Maven.Project.Pojos.EmpCreationVo;
import Com.Maven.Project.model.Employee;

public interface EmpService {
	void addEmployee(Employee emp);

	void deleteEmployee(Long id);

	void UpdateEmployee(Long id);

	Employee searchEmployee(Long id);

	List<Employee> empList();

	interface EmpCreationService {
		public void addEmployee(EmpCreationVo emp);

		public EmpCreationVo searchEmployee(Long id);

		public void UpdateEmployee(Long id);
	}
}
