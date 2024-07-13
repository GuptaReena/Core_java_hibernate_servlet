package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDmeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> todoTasks = new PriorityQueue<>();
		
		todoTasks.add("Fill Petrol");
		todoTasks.add("Visit Bank to change Phone Number");
		todoTasks.add("Give Address to Tailor");
		todoTasks.add("Have Lunch");
		
		todoTasks.forEach((eachTask)->System.out.print("<---" + eachTask));
		System.out.println();
		System.out.println("------------");
		
		todoTasks.remove();
		todoTasks.forEach((eachTask)->System.out.print("<---" + eachTask));
		System.out.println();
		System.out.println("------------");

	}

}
