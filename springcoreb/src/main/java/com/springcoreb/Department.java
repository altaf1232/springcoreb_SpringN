package com.springcoreb;

public class Department 
{
	//this is your Bean class
   private int departmentId;
   private String departmentName;
   private  String departmentAddress;
public int getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getDepartmentAddress() {
	return departmentAddress;
}
public void setDepartmentAddress(String departmentAddress) {
	this.departmentAddress = departmentAddress;
}
public Department(int departmentId, String departmentName, String departmentAddress) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.departmentAddress = departmentAddress;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "DepartMent [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAddress="
			+ departmentAddress + "]";
}
   
   
}
