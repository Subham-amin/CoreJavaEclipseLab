package com.example1;

public class HourlyEmployee {

	private int EmployeeID;
	private String Employeename;

	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(int employeeID, String employeename) {
		super();
		EmployeeID = employeeID;
		Employeename = employeename;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getEmployeename() {
		return Employeename;
	}

	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [EmployeeID=" + EmployeeID + ", Employeename=" + Employeename + "]";
	}
}