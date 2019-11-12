package edu.sbcc.cs105;

public abstract class Animal {
	
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public abstract String speak();
	
	public String getName() {
		return name;
	}
}
