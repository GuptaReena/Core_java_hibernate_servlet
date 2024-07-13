/*Write a Java program to create a class called " Dog" 
 * with a name and breed attribute. Create two instances of the 
 * "Dog" class, set their attributes using the constructor and modify 
 * the attributes using the setter methods and print the updated values.*/
package practiceOops;

class Dogs{
	private String dogName;
	private String bread;


public Dogs(String dogName,String bread) {
	
	this.dogName =  dogName;
	this.bread =  bread;
}


public String getDog() {
	return dogName;
	
}

public void setDogName(String dogName) {
	 this.dogName =  dogName;
}

public String getBread() {
	return bread;
}

public void setBread(String bread) {
	 this.bread =  bread;
}



}
public class DogsBread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dogs d1 =  new Dogs("Browni","Golden Retriver");
		Dogs d2 =  new Dogs("Alex","Labador");
		
		System.out.println("Dog Name : "+ d1.getDog() + "\n" + "Bread : " + d1.getBread());
		System.out.println("Dog Name : "+ d2.getDog() + "\n" + "Bread : " + d2.getBread());
		
		System.out.println("\nSet the new Breed of dog1 and new name of dog2: \n");
		
		d1.setDogName("Ava");
		d1.setBread("Great Dane");
		
		d2.setDogName("Oscar");
		d2.setBread("Labador");
		
		System.out.println("Dog Name : "+ d1.getDog() + "\n" + "Bread : " + d1.getBread());
		System.out.println("Dog Name : "+ d2.getDog() + "\n" + "Bread : " + d2.getBread());
		

	}

}
