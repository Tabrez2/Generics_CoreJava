package com.tab.java;

public class Dog extends Animal {

	String name;
	
	public Dog(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
	

}
