package Com.Maven.Project.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Com.Maven.Project.Service.UploadDownloadService;

@Controller
public class UploadDownloadController {
private static final Logger logger = Logger.getLogger(UploadDownloadController.class);
public UploadDownloadController() {
	System.out.println("Upload Download Controller Initiated");
}
@Autowired
@Qualifier("uploaddownloadservice")
UploadDownloadService uploadDownloadservice;


@RequestMapping(value="/Upload")
public ModelAndView model()throws IOException, FileNotFoundException {
	
	File file = new File("F:\\Book1.xlsx");
	
	uploadDownloadservice.Upload(file);
	
	return new ModelAndView("redirect:/home");
}



}
