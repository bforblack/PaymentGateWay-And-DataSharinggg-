package Com.Maven.Project.ServiceImpl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import Com.Maven.Project.Dao.EmpDao;
import Com.Maven.Project.Pojos.EmployeeVo;
import Com.Maven.Project.Service.UploadDownloadService;
import Com.Maven.Project.model.Employee;




@Service("uploaddownloadservice")
@Transactional
public class UploadDownloadServiceImpl implements UploadDownloadService {

	Logger logger = Logger.getLogger(UploadDownloadServiceImpl.class);
	public UploadDownloadServiceImpl() {
		
		System.out.println("Upload Download has been initiated");
		// TODO Auto-generated constructor stub
	}
	
	SessionFactory Session ;
	@Override
	public void Upload(File file)throws IOException {
		Workbook workbook;
		EmployeeVo employeeVo = null;
		List<Object>ObjectList = null;
		List<String>l1 = new ArrayList<>();
		
		try {
			workbook = new XSSFWorkbook(file);
		
			System.out.println("=========================Workbook has this many Sheets "+workbook.getNumberOfSheets()+"=========================================");
			
			System.out.println("------------------------------Now the Sheets are Iterarting-----------------------------------");
			workbook.forEach(Sheet->{   
				System.out.println(Sheet.getSheetName());
			});
			
			Sheet sheet = workbook.getSheetAt(0);
			
			//Sheet sheet = (Sheet) workbook.getSheetAt(0);
			//DataFormatter dataFormatter = new DataFormatter();
		
			 for (Row row: sheet) {
		            for(Cell cell: row) {
		               // String cellValue = dataFormatter.formatCellValue(cell);
		              //  System.out.println(cell );
		     
		//l1.(cell);
		            	if(cell!=null) {
		            	ObjectList.add(cell);
		            	}else {
		            		System.out.println("Empty list");
		            	}
		            	}
		            
		            
		            }
		          //  System.out.println();
			
			 System.out.println(ObjectList.size()+" This is the size of the list");
			 
			 for(Object s : ObjectList){
	    			employeeVo.setName(s.toString());
	    		}
	    		addEmployeeVo(employeeVo);
			 System.out.println(l1.size());
			 
			// workbook.close();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Workbook workbook = WorkbookFactory.create(file);
	
		/*for(Object s : objects){
			employeeVo.setName(s.toString());
		}
		addEmployeeVo(employeeVo);
		
		*/
		
		
	}

	@Override
	public void addEmployeeVo(EmployeeVo employeeVo) {
		EmpDao empdao =null;
		Employee emp = new Employee();
		emp.setName(employeeVo.getName());
empdao.addEmployee(emp);
	}
}
