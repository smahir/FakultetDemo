package com.faculty;

public class Stuff extends Employee {

	private String title;
	
	public Stuff(){
		
	}
	
	public Stuff(String title){
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
