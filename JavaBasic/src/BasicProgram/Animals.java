package BasicProgram;

import java.util.ArrayList;
import java.util.List;

public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> animals =  new ArrayList<>();
		
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Monkey");
		animals.add("Dog");
		animals.add("Cat");
		
		
		// To access the element from an array list
		System.out.println(animals.get(3));
		
		// To set a value in an array list 
		
		animals.set(4, "Zebra");
		
		animals.add(2, "Elephant");
		System.out.println(animals);
		
		
		// To check if the ArrayList is empty or not
		System.out.println(animals.isEmpty());
		
		System.out.println("--------------------------------------------------");
		List<String> domasticAnimals = new ArrayList<>(animals);
		
		System.out.println("Is monkey exist in the list : "+animals.contains("Monkey"));
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Index of element : " + animals.indexOf("Zebra"));
		
		System.out.println("Last Index of element : " + animals.lastIndexOf("Monkey"));
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("creating an array list from another collection  \n \n"+ domasticAnimals );
	}

}
