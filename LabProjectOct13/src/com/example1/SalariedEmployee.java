package com.example1;

public class SalariedEmployee {

	private int EmployeeID;
	private String Employeename;

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int employeeID, String employeename) {
		super();
		this.EmployeeID = employeeID;
		this.Employeename = employeename;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.EmployeeID = employeeID;
	}

	public String getEmployeename() {
		return Employeename;
	}

	public void setEmployeename(String employeename) {
		this.Employeename = employeename;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [EmployeeID=" + EmployeeID + ", Employeename=" + Employeename + "]";
	}
}
