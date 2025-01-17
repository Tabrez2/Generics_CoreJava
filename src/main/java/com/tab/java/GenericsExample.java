package com.tab.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {

		// Here we can pass multiple times different DataType in TypeParameter as Generics
		//Here we get rid of code duplications like creat different class for different typeOf Data to be printed
		//here we can print out like String,Integer,Double and any other datatype
		
//		Printer<String> printer= new Printer("Hello Tabrez");
//		printer.print();
		
		//Advance Concepts with Generics

//		List<Cat> cats = new ArrayList<>();
//		cats.add(new Cat("Tom"));
//		cats.add(new Cat("Billu"));
//		cats.add(new Cat("larsen"));
//		
//		Cat myCat = cats.get(0);
//		System.out.println(myCat.name);//Tom
//		
//		List<Dog> dogs = new ArrayList<>();
//		dogs.add(new Dog("Bolt"));
//		dogs.add(new Dog("Germi"));
//		dogs.add(new Dog("Snopy"));
//		System.out.println(dogs);
		
			
		
//		List<Cat> cats = new ArrayList<>();
//		Cat myCat = cats.get(0);
//		List<Dog> dogs = new ArrayList<>();
		
//		Printer<Cat>printer = new Printer<>(new Cat());
//		printer.print();
		
		//main method..............			
		List<Integer> intList = Arrays.asList(6,4,9,3,3,1);
		printList(intList);
		
		List<Cat> catList = new ArrayList<Cat>();
		catList.add(new Cat());
		printList(catList);	
	}
	
	//Generic method
	public static void printList(List<?>myList) {//by WIlDCard <?> we can only read the data
		//but <T> Type Parameter we can do operation or return the things
		System.out.println(myList);
	}

}



















