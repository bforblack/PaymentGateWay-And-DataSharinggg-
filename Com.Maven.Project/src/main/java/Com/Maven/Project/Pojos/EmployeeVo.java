package Com.Maven.Project.Pojos;

import java.io.Serializable;

public class EmployeeVo implements Serializable {
private static final long serialVersionUID = -34654586302847L;

private String Name;
private String State ;
private Long Number;
public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}
public String getState() {
	return State;
}
public void setState(String state) {
	this.State = state;
}
public Long getNumber() {
	return Number;
}
public void setNumber(Long number) {
	this.Number = number;
}



}
