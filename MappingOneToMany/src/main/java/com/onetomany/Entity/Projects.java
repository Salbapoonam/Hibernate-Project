package com.onetomany.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Projects {
	@Id
private int pid;
private String projname;
private String projtye;
 private String procjlient;
@ManyToOne
Employee e1;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getProjname() {
	return projname;
}
public void setProjname(String projname) {
	this.projname = projname;
}
public String getProjtye() {
	return projtye;
}
public void setProjtye(String projtye) {
	this.projtye = projtye;
}
public String getProcjlient() {
	return procjlient;
}
public void setProcjlient(String procjlient) {
	this.procjlient = procjlient;
}
public Employee getE1() {
	return e1;
}
public void setE1(Employee e1) {
	this.e1 = e1;
}
@Override
public String toString() {
	return "Projects [pid=" + pid + ", projname=" + projname + ", projtye=" + projtye + ", procjlient=" + procjlient
			+ ", e1=" + e1 + "]";
}
public Projects(int pid, String projname, String projtye, String procjlient, Employee e1) {
	super();
	this.pid = pid;
	this.projname = projname;
	this.projtye = projtye;
	this.procjlient = procjlient;
	this.e1 = e1;
}
public Projects() {
	super();
	// TODO Auto-generated constructor stub
} 


}
