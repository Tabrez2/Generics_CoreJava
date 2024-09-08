package com.tab.java;
//in type parameter I can pass different type of Data
//which help me out to get rid of code duplication
public class Printer<T extends Animal> {

	 T thingToPrint;

	public Printer(T thingToPrint) {

		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		thingToPrint.eat();
		System.out.println(thingToPrint);
	}

	
    
	

}
