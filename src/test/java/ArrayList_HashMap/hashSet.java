package ArrayList_HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {

		// Decrlation of HashMap
		
		HashSet <Object> hs = new HashSet<Object>();
		//Set <Integer> hm = new HashSet<Integer>();
		
		hs.add(100);
		hs.add(200.36);
		hs.add('a');
		hs.add("Welcome");
		hs.add(null);
		
		System.out.println(hs.size());
		System.out.println("List of all avlues: " + hs);
		
		hs.remove(200.36);
		System.out.println("List of all avlues: " + hs);
		
		// convert set into arrayList
		ArrayList <Object> al = new ArrayList <Object> (hs);
		System.out.println("List of Array: " +al);
		
		ArrayList <Object> myList2 = new ArrayList<Object>();
		myList2.add("Welcome");
		myList2.add('c');
		al.addAll(myList2);
		System.out.println(al);
		
	/*	//Read the data from HashSet using enhance for loop
		for (Object y:hs)
		{
			System.out.println(y);
		}
	*/	
		//Read the data from HashSet Iterator
		Iterator<Object> it = hs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next()); 
		}

		System.out.println(hs.isEmpty());
		hs.clear();
		System.out.println(hs.isEmpty());
	}

}
