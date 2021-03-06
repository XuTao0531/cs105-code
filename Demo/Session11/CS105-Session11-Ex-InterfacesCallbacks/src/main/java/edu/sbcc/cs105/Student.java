package edu.sbcc.cs105;

public class Student {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Student(String firstName, String middleName, String lastName){
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	
	public String getFormattedName(NameFormatter formatter){		
		return formatter.format(this);		
	}
}
