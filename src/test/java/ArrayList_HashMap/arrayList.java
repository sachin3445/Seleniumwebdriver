package ArrayList_HashMap;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		
		// Declaration of arraylist
		ArrayList <Object> myList = new ArrayList<Object>();
		//List myList = new ArrayList();
		
		
		// adding values in arraylist
		myList.add(100);
		myList.add(10.23);
		myList.add(true);
		myList.add("Welcome");
		myList.add('c');
		myList.add(10.23);
		myList.add(null);
		myList.add(100);
		
		// Get the size of arraylist
		System.out.println(myList.size());
		
		// get the values of array
		System.out.println("All values from ArrryList are: " + myList);
		
		// get the value at position 3
		System.out.println("Value at position 3: " + myList.get(2));
		
		// Add value at 4 position
		myList.add(4, "Java");
		System.out.println("All values from ArrryList are after adding: " + myList);
		
		//remove value from 7th position
		myList.remove(6);
		System.out.println("All values from ArrryList are after removing: " + myList);
		
		/*
		// Read the values from arraylist using for loop
		for (int i = 0; i< myList.size(); i++)
		{
			System.out.println(myList.get(i)); 
		}
		
		*/
		
		/*
		//Read the values using enhance for loop
		for (Object x : myList)
		{
			System.out.print(" " +x);
		}
		*/
		
		//using iterative loop
		
		Iterator<Object> it = myList.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList <Object> myList2 = new ArrayList<Object>();
		myList2.add("Welcome");
		myList2.add('c');
		
		myList.removeAll(myList2);
		System.out.println("All values from ArrryList are after removing: " + myList);
		
		//check the values in arraylist
		System.out.println(myList.isEmpty());
		
		//clear all values from arrayLsit
		myList.clear();
		System.out.println(myList.isEmpty());
		
	}

}
