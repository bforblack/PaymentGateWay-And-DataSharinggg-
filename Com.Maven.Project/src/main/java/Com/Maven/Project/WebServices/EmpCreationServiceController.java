package Com.Maven.Project.WebServices;

import java.util.stream.Stream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import Com.Maven.Project.Pojos.EmpCreationVo;
import Com.Maven.Project.Service.EmpService;

@Path("/EmpCreationWebservice")
@Consumes(MediaType.APPLICATION_XML)
//@Produces(MediaType.APPLICATION_XML)
public class EmpCreationServiceController  {

	private final Logger logger = Logger.getLogger(EmpCreationServiceController.class);
	
	 public EmpCreationServiceController() {
		 System.out.println("WebService Contructor initied");
			if(logger.isDebugEnabled()){
				logger.debug("This is debug : Constructor Part is initited");
			}
			}
	
	@Autowired
	private EmpService.EmpCreationService empCreationService;

	final EmpCreationServiceResponce empCreationServiceResponce=null;
	
	
@POST
@Path("/addEmployee")
public void AddEmployee(EmpCreationVo employeeCreationVo){
empCreationService.addEmployee(employeeCreationVo);
//empCreationServiceResponce.setId();	
	
}
}
