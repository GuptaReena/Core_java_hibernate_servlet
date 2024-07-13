package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		HashMap is a part of Java’s collection.
		This class is found in java.util package. 
		It provides the basic implementation of the Map interface of Java. 
		HashMap in Java stores the data in (Key, Value) pairs 
		*/

		Map<String,Integer> phoneBook = new HashMap<>();
		
		phoneBook.put("Will Smith", 123456789);
		phoneBook.put("Jhon Din", 1234890300);
		phoneBook.put("Emma Watson", 444444444);
		phoneBook.put("Riya", 913624300);
		phoneBook.put("Emma Watson", 222222222);
		phoneBook.put("Rupert Grint", 444444444);
		phoneBook.put("Emma Watson", 444444444);
		
		//Read
		//1
		Set<String> allKeys = phoneBook.keySet();
		for(String eachKey : allKeys) {
			Integer eachValue = phoneBook.get(eachKey);
			System.out.println(eachKey + " : " + eachValue);
		}
		System.out.println("------------------------------");
		//2
		Set<Entry<String, Integer>> allEntrySet =  phoneBook.entrySet();
		allEntrySet.forEach((eachEntry)->System.out.println(eachEntry.getKey()+ " : " + eachEntry.getValue()));
		
		System.out.println("-------------------------");
		
		//3
		
		phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("--------------------------");
		
		//update
		
		phoneBook.replace("Will Smith", 333333332);
		phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("----------------------------");
		
		//Delete
		phoneBook.remove("Rupert Grint");
		phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("----------------------------");
		
		
		
	}

}
