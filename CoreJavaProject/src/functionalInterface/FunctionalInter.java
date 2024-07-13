package functionalInterface;

@FunctionalInterface
interface A
{
	void show();
}

//class B implements A {
//	 public void Show() {
//		 System.out.println("in show");
//	 }
//}

public class FunctionalInter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A obj =  new A()
				{
					public void show()
					{
						System.out.println("");
					}
				};
		
		
	}

}
