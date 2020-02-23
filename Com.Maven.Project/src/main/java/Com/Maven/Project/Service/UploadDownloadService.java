package Com.Maven.Project.Service;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import Com.Maven.Project.Pojos.EmployeeVo;

public interface UploadDownloadService {
public void Upload(File file) throws IOException;

public void addEmployeeVo(EmployeeVo employeeVo);

}
