package Com.Maven.Project.Pojos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="EmpCreationWebservice")
public class EmpCreationVo  {
private String name ;
private String state;
private Long number;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Long getNumber() {
	return number;
}
public void setNumber(Long number) {
	this.number = number;
}


}
