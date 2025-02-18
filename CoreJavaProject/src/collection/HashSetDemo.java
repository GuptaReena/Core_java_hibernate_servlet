package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> allActors = new HashSet<>();
		// CRUD
		// C - Create
		allActors.add("Amitabh Bachan");
		allActors.add(null);
		allActors.add("Rajnikanth");
		allActors.add("Chiranjeevi");
		allActors.add("NTR");
		allActors.add("Rajnikanth");
		allActors.add(null);
		
		// R - Read
		// 1
		for(String eachActor: allActors) {
			System.out.println(eachActor);
		}
		System.out.println("----------------");
		// 2
		Iterator itr = allActors.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------");
		// 3
		allActors.forEach((item)->System.out.println(item));
		
		System.out.println("----------------");
		// U - Update
		// change NTR to NT Rama Rao
		// remove NTR and add NT Rama Rao
		allActors.remove("NTR");
		allActors.add("NT Rama Rao");
		allActors.forEach((item)->System.out.println(item));
		
		System.out.println("----------------");
		Set<Room> allRooms = new HashSet<>();
		
		Room room1 = new Room(200,100,50);
		Room room2 = new Room(300,200,150);
		
		// Create
		allRooms.add(room1);
		allRooms.add(room2);
		allRooms.add(new Room(200,100,50));
		
		// Read
		allRooms.forEach((eachRoom)->System.out.println(eachRoom));
	}
}

