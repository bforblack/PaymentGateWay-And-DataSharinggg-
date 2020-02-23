package Com.Maven.Project.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Entity
@Table(name ="emp_tbl")
public class Employee implements Serializable {
private static final long serialVersionUID = -3465813074586302847L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column
private String name ;
@Column
private String State ;
@Column
private Long  number ;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public Long getNumber() {
	return number;
}
public void setNumber(Long number) {
	this.number = number;
}

}
