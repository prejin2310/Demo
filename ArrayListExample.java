package src.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayListExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> fruit = new ArrayList<String>();
		
	
		//Adding elements
		fruit.add("apple");
		
		for(int i=0; i<2; i++) {
			System.out.print("Enter the fruit name:  ");
			String value = sc.nextLine();
			fruit.add(value);
		}
		
		//for printing using for loop 
		for(int i=0; i<fruit.size(); i++) {
			System.out.println(fruit.get(i));
		}
		
		//printing the arrayList structure
		System.out.println(fruit); //[apple, banana, kiwi]
		
		//iterating through for each
		System.out.println("----using for each-----");
		for(String i: fruit) {
			System.out.println(i);
		}
		
		//remove an element
		fruit.remove(1); //using index postion
		//fruit.remove("kiwi"); //by directly calling element also
		
		
		System.out.println("----after removing-----");
		for(String i: fruit) {
			System.out.println(i);
		}
		
		System.out.println("----check an element present in arraylist or not-----");
		//.contains("search element") it return boolean true - present // false - not present
		System.out.println(fruit.contains("kiwi")); //true
		System.out.println(fruit.contains("grapes")); //false
		
		//to sort the arraylIst 
		Collections.sort(fruit); //use Collection.sort() built in function
		System.out.println("----after sorting-----");
		for(String i: fruit) {
			System.out.println(i);
		}
		
		//to clear all the values
		fruit.clear();
		System.out.println("----after clear()-----");
		for(String i: fruit) {
			System.out.println(i);
		}

	}

}
