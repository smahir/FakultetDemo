package com.faculty;

public class Faculty extends Employee{

	private String officeHour;
	private String rank;

	public Faculty() {

	}

	public Faculty(String officeHour, String rank) {
		this.setOfficeHour(officeHour);
		this.setRank(rank);
	}

	public String getOfficeHour() {
		return officeHour;
	}

	public void setOfficeHour(String officeHour) {
		this.officeHour = officeHour;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	

}
