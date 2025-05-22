package ArrayList_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashMap {

	public static void main(String[] args) {
		//Declaration of HashMap
		HashMap<Integer, String> hm = new HashMap <Integer, String>();
		
		//Map <Integer, String> mh = new HashMap <Integer, String>();
		
		//add values in hashmap
		hm.put(100, "Sachin");
		hm.put(101, "Trupti");
		hm.put(102, "Sachit");
		
		System.out.println(hm.size()); 
		System.out.println("All avlues in HashMap: " +hm);
		
		//add values in hashmap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		//remove value from HashMap
		//hm.remove(102);
		System.out.println("All avlues in HashMap: " +hm);
		hm.replace(102, "Pimple-Gurav");
		System.out.println("All avlues in HashMap: " +hm);

	/*	//Read the values from hashmap
		for (int k : hm.keySet())
		{
			System.out.println(k + " " + hm.get(k));
		}
	*/
		// read values in HashMap using Iterator 
		
		Iterator<Entry <Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer, String> Entry = it.next();
			System.out.println(Entry.getKey() + " " + Entry.getValue());
		}

	}

}
