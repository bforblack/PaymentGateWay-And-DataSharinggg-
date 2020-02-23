package Com.Maven.Project.Controller;




import java.util.Map;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Com.Maven.Project.Service.User_Service;
import Com.Maven.Project.model.LoginPojo;
import Com.Maven.Project.model.User;

@Controller
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	public LoginController() {
		System.out.println("Login Controller Initiated");
	if(logger.isDebugEnabled()) {
		System.out.println("Looggger with loggin Constructor Done");
	}
	}


@Autowired
@Qualifier("userService")
User_Service user_Service;


@RequestMapping(value ="/")
public ModelAndView LoginUser(ModelAndView model) throws Exception{
	model.setViewName("Login");
	model.addObject("Login", new LoginPojo());
	logger.info(model);
	return model;
	
}
@RequestMapping(value = "/LoginProcess" , method = RequestMethod.POST )
public ModelAndView LoginPr(@ModelAttribute LoginPojo login) throws Exception {

	if(user_Service.Login(login)==true) {
		return new ModelAndView("redirect:/home");
	}else {
		return new ModelAndView("redirect:/newEmployee");
	}
}

@RequestMapping(value = "/Registor", method = RequestMethod.GET)
public ModelAndView RegisterUser(HttpServletRequest request, HttpServletResponse response) {
  ModelAndView mav = new ModelAndView("Registor");
  mav.addObject("user", new User());
  return mav;
}
@RequestMapping(value = "/RegistrationProces", method = RequestMethod.POST)
public ModelAndView RegistorProcess(HttpServletRequest request, HttpServletResponse response,
@ModelAttribute("user") User user) {
user_Service.Register(user);
return new ModelAndView("redirect:/");
}



}
