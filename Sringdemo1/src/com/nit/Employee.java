package com.nit;

public class Employee {
private int eId;
private String eName;
private String eAddr;
private String mailId;
private String phNo;
private Department department;
private Organization organitation;
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String geteAddr() {
	return eAddr;
}
public void seteAddr(String eAddr) {
	this.eAddr = eAddr;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getPhNo() {
	return phNo;
}
public void setPhNo(String phNo) {
	this.phNo = phNo;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Organization getOrganitation() {
	return organitation;
}
public void setOrganitation(Organization organitation) {
	this.organitation = organitation;
}

public String Display() {
	return "Employee [eId=" + eId + ", eName=" + eName + ", eAddr=" + eAddr + ", mailId=" + mailId + ", phNo=" + phNo
			+ ", department=" + department + ", organitation=" + organitation + "]";
}

}
