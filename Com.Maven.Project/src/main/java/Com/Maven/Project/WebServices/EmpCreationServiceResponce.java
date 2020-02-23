package Com.Maven.Project.WebServices;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmpCreationServiceResponce {
private Long id ;
private Boolean status;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Boolean getStatus() {
	return status;
}
public void setStatus(Boolean status) {
	this.status = status;
}


}
