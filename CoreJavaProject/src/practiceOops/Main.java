/*Write a Java program to create a class called "Person" 
 * with a name and age attribute. Create two instances of the 
 * "Person" class, set their attributes using the constructor, 
 * and print their name and age.*/


package practiceOops;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name =  name;
		this.age =  age;
	}
	
	public String getName() {
		return name; 
	}
	
	public int getAge() {
		return age;
	}
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person p1 =  new Person("Reena",22);
		Person p2 =  new Person("Riya" , 25);
		
		System.out.println(p1.getName() + " is " + p1.getAge() + " Year old." );
		System.out.println(p2.getName() + " is " + p2.getAge() + " Year old." );
		
		
	}

}
