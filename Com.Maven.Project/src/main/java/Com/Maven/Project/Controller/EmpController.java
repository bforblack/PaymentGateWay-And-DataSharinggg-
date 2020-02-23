package Com.Maven.Project.Controller;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.criteria.From;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.sql.Select;
//import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import Com.Maven.Project.Service.EmpService;
import Com.Maven.Project.Service.User_Service;
import Com.Maven.Project.model.Employee;
import Com.Maven.Project.model.User;











@Controller
public class EmpController {

	

private static final Logger logger = Logger.getLogger(EmpController.class);

public EmpController() {
	
	System.out.println("Empcontroller Contructor initied");
	if(logger.isDebugEnabled()){
		logger.debug("This is debug : Constructor Part is initited");
	}
}

@Autowired
@Resource
@Qualifier("empService")
private EmpService empService;





/*@RequestMapping(value="/")
public ModelAndView LoginPage(ModelAndView model)throws IOException {
	//ModelAndView model = new ModelAndView("Login");

//model.addObject("Login",new User());
model.setViewName("Login");	

//@ModelAttribute(User user)
//userservice.LoginUnable(user);

//userservice.LoginUnable(@RequestParam(User u) User u);

System.out.println("Login Initied");	
 if(logger.isDebugEnabled()){
	logger.debug("This is debug : Constructor Part is initited");	
}

 
// return new ModelAndView("Login");
return model;
}

*/



@RequestMapping(value="/home", method = RequestMethod.GET)
public ModelAndView  listEmployee( ModelAndView model)throws IOException {
	List<Employee>listEmployee = empService.empList();
	model.addObject("listEmployee",listEmployee);
	model.setViewName("home");
	if(logger.isDebugEnabled()){	
		
		logger.debug("This is debug : Constructor Part is initited");
	}
	return model ;
}

@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
public ModelAndView newcontact(ModelAndView model)throws IOException{
	model.addObject("Employee", new Employee());
	model.setViewName("EmployeeForm");
	if(logger.isDebugEnabled()){
		logger.debug("This is debug : Constructor Part is initited");
	}
	return model;
	
}
@RequestMapping(value ="/save", method=RequestMethod.POST)
public ModelAndView saveEmployee(@ModelAttribute Employee emp) {
	if(emp.getId()!=null) {
		empService.UpdateEmployee(emp.getId());
	}else {
		empService.addEmployee(emp);
	}
	if(logger.isDebugEnabled()){
		logger.debug("This is debug : Constructor Part is initited");
	}
	return new ModelAndView("redirect:/");
	
}
@RequestMapping(value="/delete",method=RequestMethod.GET)
public ModelAndView deleteEmp(HttpServletRequest request) {
	//int id=request.getParameter("id");
	empService.deleteEmployee(Long.parseLong(request.getParameter("id")));
	
	if(logger.isDebugEnabled()){
		logger.debug("This is debug : Constructor Part is initited");
	}
	return new ModelAndView("redirect:/");
	
}
@RequestMapping(value="/editContact",method=RequestMethod.GET)
public ModelAndView editContact(HttpServletRequest  request) {
	
Long id = Long.parseLong(request.getParameter("id"));
Employee emp = empService.searchEmployee(id);	
ModelAndView mv = new ModelAndView("EmployeeForm");
mv.addObject("Employee",emp);
empService.UpdateEmployee(id);
	
	if(logger.isDebugEnabled()){
		logger.debug("This is debug : Constructor Part is initited");
	}
	return mv;
}
}
