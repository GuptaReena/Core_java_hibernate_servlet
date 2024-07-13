package mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	
	static List<Student> getStudent(){
		
		//Empty List
		
		List<Student> students= new ArrayList<>();
		
		students.add(new Student("Vivek", "private", "public School"));
		students.add(new Student("Akshay", "Kumar", "DonBosco"));
		students.add(new Student("Amruta","kumari","Kurla"));
		students.add(new Student("Priyanka","kumari","Ghatkpor"));
		
		//return the list of students
		return students;
		
	}

}
