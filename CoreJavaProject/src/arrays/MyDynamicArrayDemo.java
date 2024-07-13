package arrays;

public class MyDynamicArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDynamicArrays mda = new MyDynamicArrays();
		System.out.println("SIZE : " + mda.getSize());
		System.out.println("CAPACITY : " + mda.getCapacity());
		
		System.out.println(mda);
		
		mda.add(10);
		mda.add(20);
		mda.add(30);
		mda.add(40);
		mda.add(50);
		
		System.out.println("SIZE : " + mda.getSize());
		System.out.println("CAPACITY : " + mda.getCapacity());
		System.out.println(mda);
		
		mda.add(60);
		
		System.out.println("SIZE : " + mda.getSize());
		System.out.println("CAPACITY : " + mda.getCapacity());
		System.out.println(mda);

		mda.remove(30);
		System.out.println("SIZE : " + mda.getSize());
		System.out.println("CAPACITY : " + mda.getCapacity());
		System.out.println(mda);
		
	}

}
