package com.faculty;

public class Employee extends Person {

	private String office;
	private double salary;
	private String dateHired;

	public Employee(String name, String address, String phoneNumber, String email, String office, double Salary,
			String dateHired) {
			super (name, address, phoneNumber, email);
			this.office = office;
			this.salary = salary;
			this.dateHired = dateHired;
	}

	// Getters and Setters
	
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	};
	
	// toString() method
	
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: " + salary + 
									"\nDate Hired: " + dateHired;
	}
	

}