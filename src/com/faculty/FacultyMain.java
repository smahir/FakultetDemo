package com.faculty;

public class FacultyMain {

	public static void main(String[] args) {
		// Kreiranje osoba
		
		Person Mahir = new Person("Mahir", "Gracanica", "38762597620", "mahir.smajilbasic@gmail.com");
		Student Emina = new Student("Emina", "Lukavac", "38762123456", "emina@bild.org", 1);
		Employee Dejan = new Employee("Dejan", "Doboj", "38761564789", "dejan@bild.org", "Doboj", 1337, "30.02.2003");
		Faculty Jasmin = new Faculty();
		Stuff DelPiero = new Stuff();
	}
	
	
}
