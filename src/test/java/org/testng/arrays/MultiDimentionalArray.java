package org.testng.arrays;

import org.testng.annotations.Test;

public class MultiDimentionalArray {

	@Test
	public void AnimalsArray() {
		String[][] animals=new String[5][2];

		animals[0][0]="Cat";animals[0][1]="Myaw";
		animals[1][0]="Dog";animals[1][1]="Woof";
		animals[2][0]="Cow";animals[2][1]="Moo";
		animals[3][0]="Sheep";animals[3][1]="Baa";
		animals[4][0]="Lion";animals[4][1]="Raaar";
		
		// Neighbors Dog is saying Woof
		System.out.println("Neighbors " + animals[1][0] + " is saying " + animals[1][1]);
		
		// Cats do not Baa
		System.out.println(animals[0][0] + "s do not " + animals[3][1]);
		
		// print whole arrays
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i][0] + " is " + animals[i][1] + "ing");
		}

	}
	
	@Test
	public void objectArray() {
		/** Due to Polymorphism. We can have a variable with a reference type
		* of parent class and actual object of any child classes.
		* for ex: Animal animal = new Cat();
		* Object > all other classes. public class AnyClass extends Object
		*/
		Object[][] employees = new Object[4][2];
		employees[0][0]=new String("Mike");
		employees[0][1]="mike@gmail.com";
		employees[1][0]="Steven";
		employees[1][1]="steven@gmail.com";
		employees[2][0]="Sarah";
		employees[2][1]="sarah@gmail.com";
		
		employees[3][0]="Kevin";
		employees[3][1]="Kevin@gmail.com";

		// print last element of last array
		System.out.println(employees[1][1]);
		// finding last row and finding last items
		System.out.println(employees[employees.length-1] [employees[employees.length-1].length-1]);
		
		int rows = employees.length;
		int cellsInLas = employees[rows-1].length;
		
		System.out.println(employees[rows-1][cellsInLas-1]);
		System.out.println("=======================");
		for (Object[] obj : employees) {
			System.out.println(obj[1]);
		}
		
		printEmpInfo(employees);
	}
	

	public void printEmpInfo(Object[][] multiDArray) {
		for (int i = 0; i < multiDArray.length; i++) {
			String name = (String) multiDArray[i][0];
			String email = (String) multiDArray[i][1];
			System.out.println(multiDArray[i][0] + ", " + multiDArray[i][1] + "ing");
			
			// we can call method inside the another method
			print2Strings(name, email);
		}
	}
	
	public void print2Strings(String str1, String str2) {
		System.out.println(str1 + ", " + str2);
	}

}